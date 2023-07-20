package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilites.BaseClass;

public class LoginPage {
	
	public LoginPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
	@FindBy(id = "loginFrm_loginname")
	public WebElement usernameTextBox;
	
	@FindBy(id = "loginFrm_password")
	public WebElement passwordTextBox;
	
	@FindBy(xpath = "//button[@title='Login']")
	public WebElement loginBtn;
	
	@FindBy(xpath = "//ul[@class='side_account_list']/li[10]")
	public WebElement logOffBtn;
	
	@FindBy(xpath = "//form[@id='loginFrm']/fieldset/a[1]")
	public WebElement forgotPassword;
	
	@FindBy(xpath = "//form[@id='loginFrm']/fieldset/a[2]")
	public WebElement forgotLogin;
	
	@FindBy(id = "forgottenFrm_loginname")
	public WebElement forgottenLoginName;
	
	@FindBy(id = "forgottenFrm_lastname")
	public WebElement forgottenLastName;
	
	@FindBy(id = "forgottenFrm_email")
	public WebElement forgottenEmail;
	
	@FindBy(xpath = "//button[contains(@class, 'pull-right')]")
	public WebElement continueForgotPasswordBtn;
	
	public String passwordTextBoxType;

}
