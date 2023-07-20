package test;

import org.testng.annotations.Test;

import utilites.BaseClass;
import utilites.CommonMethods;

public class SocialMediaSubscriptionTesting extends CommonMethods {

	@Test(groups = "Shrinkhala")
	public void FacebookSubscriptionVerification() {
		click(smPage.socialMediaLinkBtns, BaseClass.getProperty("facebook"));
		switchToChildWindow();
		verifyPageTitle(BaseClass.getProperty("facebookLoginPageTitle"));
	}

	@Test(groups = "Shrinkhala")
	public void TwitterSubscriptionVerification() {
		click(smPage.socialMediaLinkBtns, BaseClass.getProperty("twitter"));
		switchToChildWindow();
		waitForVisibility(smPage.twitterLoadingPageVerificationElement);
		verifyPageTitle(BaseClass.getProperty("TwitterPageTitle"));
	}

	@Test(groups = "Shrinkhala")
	public void LinkedinSubscriptionVerification() {
		click(smPage.socialMediaLinkBtns, BaseClass.getProperty("linkedin"));
		verifyPageTitle(BaseClass.getProperty("LinkedInPageTitle"));
	}
}
