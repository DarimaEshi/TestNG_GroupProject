package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilites.BaseClass;

public class AlertsPage {
	
	public AlertsPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
	@FindBy(xpath = "//div[contains(@class, 'alert-error')]")
	public WebElement errorMsg;
	
	@FindBy(xpath = "//div[contains(@class, 'alert-success')]")
	public WebElement successMsg;
	
	@FindBy(xpath = "//*[@id=\"maincontainer\"]/div/div/div/div/strong")
	public WebElement invQuantMsg;

}
