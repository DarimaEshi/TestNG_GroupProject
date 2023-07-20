package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilites.BaseClass;

public class RegistrationPage {
	
	public RegistrationPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
	public String expectedAccountTitle = BaseClass.getProperty("accountLoginTitle");
	public String successMsg = "YOUR ACCOUNT HAS BEEN CREATED!";
	
	@FindBy(xpath = "//form[@id='accountFrm']/fieldset/button")
	public WebElement continueBtn;
	
	@FindBy(id = "AccountFrm_firstname")
	public WebElement fNameTextBox;
	
	@FindBy(id = "AccountFrm_lastname")
	public WebElement lNameTextBox;
	
	@FindBy(id = "AccountFrm_email")
	public WebElement emailTextBox;
	
	@FindBy(id = "AccountFrm_address_1")
	public WebElement address1TextBox;

	@FindBy(id = "AccountFrm_city")
	public WebElement cityTextBox;
	
	@FindBy(id = "AccountFrm_country_id")
	public WebElement countryDropdown;
	
	@FindBy(id = "AccountFrm_postcode")
	public WebElement zipCodeTextBox;
	
	@FindBy(id = "AccountFrm_zone_id")
	public WebElement regionDropdown;
	
	@FindBy(id = "AccountFrm_loginname")
	public WebElement loginNameTextBox;
	
	@FindBy(id = "AccountFrm_password")
	public WebElement passwordTextBox;
	
	@FindBy(id = "AccountFrm_confirm")
	public WebElement confirmPasswordTextBox;
	
	@FindBy(xpath = "//form[@id='AccountFrm']/div[4]/fieldset/div/div/label")
	public List<WebElement> newsRadioBtnsList;
	
	@FindBy(id = "AccountFrm_agree")
	public WebElement privacyPolicyCheckBox;
	
	@FindBy(xpath = "//button[contains(@class, 'lock-on-click')]")
	public WebElement continueRegisterBtn;

}
