package test;

import org.testng.annotations.Test;

import utilites.BaseClass;
import utilites.CommonMethods;

public class LoginTesting extends CommonMethods {
	
	@Test(groups = {"Roman", "smoke", "regression" })
	public void loginWithValidCredentials() {
		Login(BaseClass.getProperty("testingUsername"), BaseClass.getProperty("testingPassword"));
	}
	
	@Test(groups = {"Roman", "regression" })
	public void loginWithInvalidCredentials() {
		Login(BaseClass.getProperty("invalidUsername"), BaseClass.getProperty("invalidPassword"));
	}
	
	@Test(groups = {"Roman", "regression" })
	public void loginWithValidLoginAndInvalidPassword() {
		Login(BaseClass.getProperty("testingUsername"), BaseClass.getProperty("invalidPassword"));
	}
	
	@Test(groups = {"Roman", "regression" })
	public void loginWithInvalidLoginAndEmptyPassword() {
		Login(BaseClass.getProperty("invalidUsername"), BaseClass.getProperty("testingPassword"));
	}
	
	@Test(groups = {"Roman", "regression" })
	public void loginWithEmptyFields() {
		Login("", "");
	}
	
	@Test(groups = {"Roman", "smoke", "regression" })
	public void logoutAndRelogin() {
		Login(BaseClass.getProperty("testingUsername"), BaseClass.getProperty("testingPassword"));
		click(loginPage.logOffBtn);
		verifyPageTitle(BaseClass.getProperty("accountLogoutTitle"));
		Login(BaseClass.getProperty("testingUsername"), BaseClass.getProperty("testingPassword"));
	}
	
	@Test(groups = {"Roman", "regression" })
	public void loginForgotYourPassword() {
		click(navPage.loginOrRegBtn);
		verifyPageTitle(BaseClass.getProperty("accountLoginTitle"));
		click(loginPage.forgotPassword);
		verifyPageTitle(BaseClass.getProperty("forgotPasswordTitle"));
		sendText(loginPage.forgottenLoginName, BaseClass.getProperty("testingUsername"));
		sendText(loginPage.forgottenEmail, BaseClass.getProperty("vemail"));
		waitForClickability(loginPage.continueForgotPasswordBtn);
		click(loginPage.continueForgotPasswordBtn);
		verifyElementIsDisplayed(alertPage.successMsg);
	}
	
	@Test(groups = {"Roman", "regression" })
	public void loginForgotYourLogin() {
		click(navPage.loginOrRegBtn);
		verifyPageTitle(BaseClass.getProperty("accountLoginTitle"));
		click(loginPage.forgotLogin);
		verifyPageTitle(BaseClass.getProperty("forgotLoginTitle"));
		sendText(loginPage.forgottenLastName, BaseClass.getProperty("testingUsername"));
		sendText(loginPage.forgottenEmail, BaseClass.getProperty("vemail"));
		waitForClickability(loginPage.continueForgotPasswordBtn);
		click(loginPage.continueForgotPasswordBtn);
		verifyElementIsDisplayed(alertPage.successMsg);
	}
	
	@Test(groups = {"Roman", "regression" })
	public void loginPaswordIsMasked() {
		click(navPage.loginOrRegBtn);
		verifyPageTitle(BaseClass.getProperty("accountLoginTitle"));
		sendText(loginPage.passwordTextBox, BaseClass.getProperty("testingPassword"));
		assertAttributeEquals(loginPage.passwordTextBox, "type", "password");
	}
}
