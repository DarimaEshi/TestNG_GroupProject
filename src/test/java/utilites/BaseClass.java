package utilites;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

//	declare variables
	public static WebDriver driver;
	public static Properties configFile;

//	driver instantiating function
	@BeforeMethod(alwaysRun = true)
	public static WebDriver getDriver() {

		if (driver == null) {

			switch (BaseClass.getProperty("browser")) {
			case "chrome":
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				break;

			case "crome-headless":
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver(new ChromeOptions().setHeadless(true));
				break;

			case "firefox":
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				break;

			case "firefox-headless":
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver(new FirefoxOptions().setHeadless(true));
				break;

			case "opera":
				WebDriverManager.operadriver().setup();
				driver = new OperaDriver();
				break;

			case "edge":
				if (!System.getProperty("os.name").toLowerCase().contains("windows")) {
					throw new WebDriverException("Your OS doesn't support EDGE");
				}
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
				break;

			case "safari":
				if (!System.getProperty("os.name").toLowerCase().contains("mac")) {
					throw new WebDriverException("Your OS doesn't support SAFARI");
				}
				WebDriverManager.safaridriver().setup();
				driver = new SafariDriver();
				break;
			}

			driver.get(BaseClass.getProperty("url"));
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Constants.implicitWait_time, TimeUnit.SECONDS);
			PageInitializer.initialize();
		}

		return driver;
	}

// driver close function
	@AfterMethod(alwaysRun = true)
	public static void closeDriver() {
		if (driver != null) {
			driver.quit();
			driver = null;
		}
	}

	static {
		try {
			String filePath = Constants.config_filePath;
			FileInputStream input = new FileInputStream(filePath);

			configFile = new Properties();
			configFile.load(input);

			input.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static String getProperty(String keyName) {
		return configFile.getProperty(keyName);
	}

	// method to read excel
	public static Object[][] readExcelFile(String filename, String sheetname) throws IOException {

		FileInputStream inputStream = new FileInputStream(filename);
		Workbook workbook = WorkbookFactory.create(inputStream);
		Sheet sheet = workbook.getSheet(sheetname);

		int rowCount = sheet.getLastRowNum() - sheet.getFirstRowNum() + 1;
		int colCount = sheet.getRow(0).getLastCellNum();

		Object[][] data = new Object[rowCount][colCount];
		for (int i = 0; i < rowCount; i++) {
			Row row = sheet.getRow(i);
			for (int j = 0; j < colCount; j++) {
				Cell cell = row.getCell(j);
				switch (cell.getCellType()) {
				case STRING:
					data[i][j] = cell.getStringCellValue();
					break;
				case NUMERIC:
					data[i][j] = cell.getNumericCellValue();
					break;
				case BOOLEAN:
					data[i][j] = cell.getBooleanCellValue();
					break;
				default:
					data[i][j] = null;
					break;
				}
			}
		}
		workbook.close();
		inputStream.close();
		return data;
	}

	// method to write excel
	public static void writeExcelFile(String filename, String sheetname, Object[][] data) throws IOException {

		Workbook workbook = WorkbookFactory.create(true);
		Sheet sheet = workbook.createSheet(sheetname);
		for (int i = 0; i < data.length; i++) {
			Row row = sheet.createRow(i);
			for (int j = 0; j < data[i].length; j++) {
				Cell cell = row.createCell(j);
				if (data[i][j] instanceof String) {
					cell.setCellValue((String) data[i][j]);
				} else if (data[i][j] instanceof Double) {
					cell.setCellValue((Double) data[i][j]);
				} else if (data[i][j] instanceof Boolean) {
					cell.setCellValue((Boolean) data[i][j]);
				} else {
					cell.setCellValue((String) null);
				}
			}
		}
		FileOutputStream outputStream = new FileOutputStream(filename);
		workbook.write(outputStream);
		workbook.close();
		outputStream.close();
	}
}
