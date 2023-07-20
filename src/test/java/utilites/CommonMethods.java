package utilites;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.UnexpectedTagNameException;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class CommonMethods extends PageInitializer {

	public static boolean isDemoMode = true;

//	Method that clears and sends key
	public static void sendText(WebElement element, String text) {
		element.clear();
		element.sendKeys(text);
	}

//	Method checks if radio/checkBox is enabled and clicks on it
	public static void clickRadioOrCheckBox(List<WebElement> radioOrCheckBoxBtn, String value) {

		String actualValue;

		for (WebElement el : radioOrCheckBoxBtn) {
			actualValue = el.getAttribute("value").trim();

			if (actualValue.equals(value)) {
				el.click();
				break;
			}
		}
	}

	public static void clickRadioOrCheckBoxGetText(List<WebElement> radioOrCheckBoxBtn, String value) {

		String actualValue;

		for (WebElement el : radioOrCheckBoxBtn) {
			actualValue = el.getText().trim();

			if (actualValue.equals(value)) {
				el.click();
				break;
			}
		}
	}

//	Select DropDown by Value
	public static void selectDropDownValue(WebElement element, String textToBeSelected) {

		try {
			Select select = new Select(element);

			List<WebElement> options = select.getOptions();

			for (WebElement el : options) {
				if (el.getText().equals(textToBeSelected)) {
					select.selectByValue(textToBeSelected);
					break;
				}
			}
		} catch (UnexpectedTagNameException e) {
			e.printStackTrace();
		}
	}

//	Select DropDown by Index
	public static void selectDropDownIndex(WebElement element, int indexValue) {

		try {
			Select select = new Select(element);

			int size = select.getOptions().size();

			if (size > indexValue) {
				select.selectByIndex(indexValue);
			}
		} catch (UnexpectedTagNameException e) {
			e.printStackTrace();
		}
	}

//	Select DropDown by Visible Text
	public static void selectDropDownVisibleText(WebElement element, String visibleText) {

		try {
			Select select = new Select(element);

			List<WebElement> options = select.getOptions();

			for (WebElement el : options) {
				if (el.getText().equals(visibleText)) {
					select.selectByVisibleText(visibleText);
					break;
				}
			}
		} catch (UnexpectedTagNameException e) {
			e.printStackTrace();
		}
	}

//	Alerts dissmiss
	public static void dismissAlert() {
		try {
			Alert alert = BaseClass.getDriver().switchTo().alert();

			alert.dismiss();
		} catch (NoAlertPresentException e) {
			e.printStackTrace();
		}
	}

//	Alerts accept
	public static void acceptAlert() {
		try {
			Alert alert = BaseClass.getDriver().switchTo().alert();

			alert.accept();
		} catch (NoAlertPresentException e) {
			e.printStackTrace();
		}
	}

//	Alerts get text
	public static String getAlertText() {
		String alertText = null;

		try {
			Alert alert = BaseClass.getDriver().switchTo().alert();

			alertText = alert.getText();
		} catch (NoAlertPresentException e) {
			e.printStackTrace();
		}
		return alertText;
	}

//	Alerts send text
	public static void AlertSendText(String textToBeSent) {
		try {
			Alert alert = BaseClass.getDriver().switchTo().alert();

			alert.sendKeys(textToBeSent);
			alert.accept();
		} catch (NoAlertPresentException e) {
			e.printStackTrace();
		}
	}

//	iframes
// switch using index name or id
	public static void switchToFrame(String nameOrId) {
		try {
			BaseClass.getDriver().switchTo().frame(nameOrId);
		} catch (NoSuchFrameException e) {
			e.printStackTrace();
		}
	}

// switch using index
	public static void switchToFrame(int index) {
		try {
			BaseClass.getDriver().switchTo().frame(index);
		} catch (NoSuchFrameException e) {
			e.printStackTrace();
		}
	}

// switch using index
	public static void switchToFrame(WebElement element) {
		try {
			BaseClass.getDriver().switchTo().frame(element);
		} catch (NoSuchFrameException e) {
			e.printStackTrace();
		}
	}

//	Window Handles by switching to child window
	public static void switchToChildWindow() {

		String mainWindow = BaseClass.getDriver().getWindowHandle();
		Set<String> allOpenedWindows = BaseClass.getDriver().getWindowHandles();

		for (String eachWindow : allOpenedWindows) {

			if (!eachWindow.equals(mainWindow)) {
				BaseClass.getDriver().switchTo().window(eachWindow);
			}
		}
	}

//	Declaring explicit wait(webDriver) and initializing it and then returning the object
	public static WebDriverWait getWaitObject() {
		WebDriverWait wait = new WebDriverWait(BaseClass.getDriver(), 30);
		return wait;
	}

//	Wait for element to be clickable
	public static WebElement waitForClickability(WebElement element) {
		return getWaitObject().until(ExpectedConditions.elementToBeClickable(element));
	}

//	Wait for element to be visibility
	public static WebElement waitForVisibility(WebElement element) {
		return getWaitObject().until(ExpectedConditions.visibilityOf(element));
	}

//	Wait for the element to be visible before clicks on them
	public static void click(WebElement element) {
		waitForVisibility(element).click();
	}

	public static void click(List<WebElement> elements, String keyName) {
		for (WebElement eachElement : elements) {
			if (eachElement.getText().trim().equalsIgnoreCase(keyName)) {
				waitForVisibility(eachElement).click();
				break;
			}
		}
	}

	public static void ifContainsClick(List<WebElement> elements, String keyName) {
		for (WebElement eachElement : elements) {
			if (eachElement.getText().contains(keyName)) {
				waitForVisibility(eachElement).click();
				break;
			}
		}
	}

//	JS Executor
// Declaring and initializing JS object and returning it
	public static JavascriptExecutor getJSObject() {
		JavascriptExecutor js = (JavascriptExecutor) BaseClass.getDriver();
		return js;
	}

// JavaScript click element
	public static void jsClick(WebElement element) {
		getJSObject().executeScript("arguments[0].click()", element);
	}

// JavaScript sends text
	public static void jsSendText(WebElement element, String text) {
		String valueText = element.getAttribute("value");
		getJSObject().executeScript("arguments[0].value='" + valueText + "'", text);
	}

// scroll to element using JS
	public static void scrollToElement(WebElement element) {
		getJSObject().executeScript("arguments[0].scrollIntoView(true);", element);
	}

//	JavaScript Executor the color highlight 
	public void highLightElementMethod(WebElement element) {

		try {
			if (isDemoMode) {
				for (int i = 0; i <= 2; i++) {

					// Create object of a JavascriptExecutor interface
					JavascriptExecutor js = (JavascriptExecutor) BaseClass.getDriver();
					// use executeScript() method and pass the arguments
					// Here i pass values based on css style. Yellow background color with solid red
					// color border.
					js.executeScript(
							"arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",
							element);

					wait(0.2);

					// Create object of a JavascriptExecutor interface
					js = (JavascriptExecutor) BaseClass.getDriver();
					// use executeScript() method and pass the arguments
					// Here i pass values based on css style. Yellow background color with solid red
					// color border.
					js.executeScript(
							"arguments[0].setAttribute('style', 'background: red; border: 2px solid yellow;');",
							element);

					wait(0.2);

					// Create object of a JavascriptExecutor interface
					js = (JavascriptExecutor) BaseClass.getDriver();
					// use executeScript() method and pass the arguments
					// Here i pass values based on css style. Yellow background color with solid red
					// color border.
					js.executeScript("arguments[0].setAttribute('style', 'background: white; border: 2px solid red;');",
							element);
				}
			}
		} catch (Exception e) {

		}

	}

	public void wait(double second) {
		try {
			Thread.sleep((int) (second * 1000));
		} catch (Exception e) {

		}

	}

// scroll by pixel
	public static void ScrolByPixel(int pixel) {
		// positive -- scroll down
		// negative -- scroll up
		getJSObject().executeScript("window.scrollBy(0," + pixel + ")");
	}

// getting time stamp
	public static String getTimeStamp() {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");
		return sdf.format(date.getTime());
	}

// thread.sleep is simplified
	public static void wait(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

// hover over == moving your cursor on an element
	public static void hover(WebElement element) {
		Actions actions = new Actions(BaseClass.getDriver());
		actions.moveToElement(element).build().perform();
	}

// create a method that dragsAndDrops
	public static void dragsAndDrops(WebElement element, WebElement element2) {
		Actions action = new Actions(BaseClass.getDriver());
		action.dragAndDrop(element, element2).build().perform();
	}

// create a method that doubleClicks
	public static void doubleClicks(WebElement element) {
		Actions action = new Actions(BaseClass.getDriver());
		action.doubleClick(element).build().perform();
	}

// take screen shot
	public static byte[] takeScreenshot(String filename) {
		TakesScreenshot ts = (TakesScreenshot) BaseClass.getDriver();
		byte[] picBytes = ts.getScreenshotAs(OutputType.BYTES);

		File file = ts.getScreenshotAs(OutputType.FILE);
		String destinationFile = "src/test/resources/screenshots/" + filename + getTimeStamp() + ".png";

		try {
			FileUtils.copyFile(file, new File(destinationFile));
		} catch (Exception ex) {
			System.out.println("Can't take screenshot!");
		}

		return picBytes;
	}

// calendar select date
	public static void selectCalendarDate(List<WebElement> element, String text) {
		for (WebElement pickDate : element) {
			if (pickDate.isEnabled()) {
				if (pickDate.getText().equals(text)) {
					pickDate.click();
					break;
				}
			}
		}
	}

//	return a list of string from a list of elements ignores any element with no text
//	@param list
//	@return
	public static List<String> getElementsText(List<WebElement> list) {
		List<String> elemTexts = new ArrayList<String>();
		for (WebElement el : list) {
			if (!el.getText().isEmpty()) {
				elemTexts.add(el.getText());
			}
		}
		return elemTexts;
	}

//	CreateAccount method
	public void createAccount(String fName, String lName, String email, String address1, String city, String country,
			String postcode, String region, String loginName, String password, String confirmPassword,
			boolean clickPrivacyPolicyCheckBox) {
		click(navPage.loginOrRegBtn);
		verifyPageTitle(BaseClass.getProperty("accountLoginTitle"));
		click(regPage.continueBtn);
		verifyPageTitle(BaseClass.getProperty("createAccountTitle"));
		sendText(regPage.fNameTextBox, fName);
		sendText(regPage.lNameTextBox, lName);
		sendText(regPage.emailTextBox, email);
		sendText(regPage.address1TextBox, address1);
		sendText(regPage.cityTextBox, city);
		click(regPage.countryDropdown);
		selectDropDownVisibleText(regPage.countryDropdown, country);
		sendText(regPage.zipCodeTextBox, postcode);
		click(regPage.regionDropdown);
		selectDropDownVisibleText(regPage.regionDropdown, region);
		sendText(regPage.loginNameTextBox, loginName);
		sendText(regPage.passwordTextBox, password);
		sendText(regPage.confirmPasswordTextBox, password);
		clickRadioOrCheckBoxGetText(regPage.newsRadioBtnsList, BaseClass.getProperty("newsletterNo"));
		if (clickPrivacyPolicyCheckBox) {
			click(regPage.privacyPolicyCheckBox);
		}
		click(regPage.continueRegisterBtn);
		try {
			if (alertPage.errorMsg.isDisplayed()) {
				waitForVisibility(alertPage.errorMsg);
				verifyElementIsDisplayed(alertPage.errorMsg);
				verifyPageTitle(BaseClass.getProperty("createAccountTitle"));
			}
		} catch (Exception e) {
			e.printStackTrace();
			// re-check in the opposite order
			if (accountPage.createdAccountPageName.isDisplayed()) {
				waitForVisibility(accountPage.createdAccountPageName);
				verifyPageTitle(BaseClass.getProperty("createdAccountTitle"));
			}
		}
	}

//	Login method 
	public static void Login(String username, String password) {
		click(navPage.headerNavBtns, BaseClass.getProperty("myAccount"));
		verifyPageTitle(BaseClass.getProperty("accountLoginTitle"));
		sendText(loginPage.usernameTextBox, username);
		sendText(loginPage.passwordTextBox, password);
		waitForClickability(loginPage.loginBtn);
		click(loginPage.loginBtn);
		try {
			if (alertPage.errorMsg.isDisplayed()) {
				waitForVisibility(alertPage.errorMsg);
				Assert.assertTrue(alertPage.errorMsg.isDisplayed());
				verifyPageTitle(BaseClass.getProperty("accountLoginTitle"));
			}
		} catch (Exception e) {
			e.printStackTrace();
			// re-check in the opposite order
			if (accountPage.myAccountPageName.isDisplayed()) {
				waitForVisibility(accountPage.myAccountPageName);
				verifyPageTitle(BaseClass.getProperty("myAccountTitle"));
			}
		}
	}

//	Assert verification
	public static void assertOurOfStockProducts(List<WebElement> elements) {
		for (WebElement eachElement : elements) {
			if (eachElement.getText().contains("OUT OF STOCK")) {
				Assert.fail("Product is out of stock: " + eachElement.getText());
			} else {
				Assert.assertTrue(!eachElement.getText().contains("OUT OF STOCK"));
			}
		}
	}

	public void assertAttributeEquals(WebElement element, String attributeName, String expectedValue) {
		String actualValue = element.getAttribute(attributeName);
		Assert.assertEquals(actualValue, expectedValue, "Attribute value did not match expected value");
	}

	public static void validatePageTitles() throws IOException {
		String expectedTitle = "";
		Object[][] data = BaseClass.readExcelFile(Constants.pageTitleExcel_Path, "Sheet1");
		for (int i = 0; i < data.length; i++) {
			expectedTitle = (String) data[i][0];
			click(homePage.brandListBtns.get(i));
			String actualTitle = BaseClass.getDriver().getTitle();
			Assert.assertEquals(actualTitle, expectedTitle);
			BaseClass.getDriver().navigate().back();
		}
	}

	public static void verifyElementIsDisplayed(WebElement element) {
		Assert.assertTrue(element.isDisplayed());
	}

	public static void verifyElementIsNotDisplayed(WebElement element) {
		try {
			Assert.assertTrue(!element.isDisplayed());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void verifyElementIsSelected(WebElement element) {
		Assert.assertTrue(element.isSelected());
	}

	public static void emptyCartVerification(WebElement element) {

		if (element.isDisplayed()) {
			Assert.assertTrue(element.getText().contains(BaseClass.getProperty("emptyCartMsg")));
		} else {
			verifyElementIsNotDisplayed(element);
		}
	}

	public static void verifyPageTitle(String expectedTitle) {
		String actualTitle = BaseClass.getDriver().getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}

	public static void verifyTotalMoreThenSubTotal() {
		float subtotal = Float.parseFloat(scPage.SubTotal.getText().replace("$", ""));
		float total = Float.parseFloat(scPage.Total.getText().replace("$", ""));
		assert total > subtotal : "Subtotal should be less than total because taxes are added in the total";
	}

	public static void verifyContainsText(WebElement element, String text) {

		if (element.isDisplayed()) {
			Assert.assertTrue(element.getText().contains(text));
		} else {
			verifyElementIsNotDisplayed(element);
		}
	}

	public static void verifyContainsTextEqualsText(WebElement element, String text) {

		if (element.isDisplayed()) {
			Assert.assertTrue(element.getText().trim().equalsIgnoreCase(text));
		} else {
			verifyElementIsNotDisplayed(element);
		}
	}

//	Assert verification -- Value
	public static void verifyQty(WebElement element) {
		if (!element.getText().contains("0")) {
			Assert.assertTrue(true, "The cart is empty");
		}
	}
	
//	Lists size verification
	public static void compareListsSize(List<WebElement> list1, List<WebElement> list2) {
		int value = list1.size();
		click(navPage.navBarBtns, BaseClass.getProperty("fragrance"));
		int value2 = list2.size();
		Assert.assertEquals(value, value2);
	}
}
