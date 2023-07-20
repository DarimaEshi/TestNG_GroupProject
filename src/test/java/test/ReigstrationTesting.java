package test;

import org.testng.annotations.Test;

import utilites.BaseClass;
import utilites.CommonMethods;

public class ReigstrationTesting extends CommonMethods {

	@Test(groups = {"Roman", "smoke", "regression"})
	public void CreateAccountWithValidCredentials() {
		createAccount(BaseClass.getProperty("fName"), BaseClass.getProperty("lName"), BaseClass.getProperty("vemail"),
				BaseClass.getProperty("address1"), BaseClass.getProperty("city"), BaseClass.getProperty("country"),
				BaseClass.getProperty("postcode"), BaseClass.getProperty("region"), BaseClass.getProperty("loginName"),
				BaseClass.getProperty("password"), BaseClass.getProperty("password"), true);
	}

	@Test(groups = {"Roman", "regression" })
	public void CreateAccountWithInvalidCredentialsEmailValidation() {
		createAccount(BaseClass.getProperty("fName"), BaseClass.getProperty("lName"), BaseClass.getProperty("invemail"),
				BaseClass.getProperty("address1"), BaseClass.getProperty("city"), BaseClass.getProperty("country"),
				BaseClass.getProperty("postcode"), BaseClass.getProperty("region"), BaseClass.getProperty("loginName"),
				BaseClass.getProperty("password"), BaseClass.getProperty("password"), true);
	}

	@Test(groups = {"Roman", "regression" })
	public void CreateAccountWithInvalidCredentialsPasswordMustMatchValidation() {
		createAccount(BaseClass.getProperty("fName"), BaseClass.getProperty("lName"), BaseClass.getProperty("vemail"),
				BaseClass.getProperty("address1"), BaseClass.getProperty("city"), BaseClass.getProperty("country"),
				BaseClass.getProperty("postcode"), BaseClass.getProperty("region"), BaseClass.getProperty("loginName"),
				BaseClass.getProperty("password"), BaseClass.getProperty("confirmPassword"), true);
	}

	@Test(groups = {"Roman", "regression" })
	public void CreateAccountWithEmptyFileds() {
		createAccount("", "", "", "", "", "", "", "", "", "", "", true);
	}

	@Test(groups = {"Roman", "regression" })
	public void CreateAccountWithValidCredentialsUncheckPrivacyPolicy() {
		createAccount(BaseClass.getProperty("fName"), BaseClass.getProperty("lName"), BaseClass.getProperty("vemail"),
				BaseClass.getProperty("address1"), BaseClass.getProperty("city"), BaseClass.getProperty("country"),
				BaseClass.getProperty("postcode"), BaseClass.getProperty("region"), BaseClass.getProperty("loginName"),
				BaseClass.getProperty("password"), BaseClass.getProperty("password"), false);
	}

}
