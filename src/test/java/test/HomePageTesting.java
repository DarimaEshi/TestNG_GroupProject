package test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilites.BaseClass;
import utilites.CommonMethods;
import utilites.Constants;

public class HomePageTesting extends CommonMethods {

	@Test(groups = {"Roman", "smoke", "regression"})
	public void HeaderVerification() {
		verifyElementIsDisplayed(homePage.header);
		click(navPage.navBarBtns, BaseClass.getProperty("fragrance"));
		verifyPageTitle(BaseClass.getProperty("fragrancePageTitle"));
		verifyElementIsDisplayed(homePage.header);
		click(navPage.headerNavBtns, BaseClass.getProperty("specials"));
		verifyPageTitle(BaseClass.getProperty("specialsPageTitle"));
		verifyElementIsDisplayed(homePage.header);
	}

	@Test(groups = {"Roman", "smoke", "regression"})
	public void NavBarVerification() {
		verifyElementIsDisplayed(navPage.navBar);
		click(navPage.navBarBtns, BaseClass.getProperty("a&a"));
		verifyPageTitle(BaseClass.getProperty("a&aPageTitle"));
		verifyElementIsDisplayed(navPage.navBar);
		click(navPage.navBarBtns, BaseClass.getProperty("makeUp"));
		verifyPageTitle(BaseClass.getProperty("makeUpPageTitle"));
		verifyElementIsDisplayed(navPage.navBar);
		click(navPage.navBarBtns, BaseClass.getProperty("skinCare"));
		verifyPageTitle(BaseClass.getProperty("skinCarePageTitle"));
		verifyElementIsDisplayed(navPage.navBar);
		click(navPage.navBarBtns, BaseClass.getProperty("fragrance"));
		verifyPageTitle(BaseClass.getProperty("fragrancePageTitle"));
		verifyElementIsDisplayed(navPage.navBar);
		click(navPage.navBarBtns, BaseClass.getProperty("men"));
		verifyPageTitle(BaseClass.getProperty("menPageTitle"));
		verifyElementIsDisplayed(navPage.navBar);
		click(navPage.navBarBtns, BaseClass.getProperty("hairCare"));
		verifyPageTitle(BaseClass.getProperty("hairCarePageTitle"));
		verifyElementIsDisplayed(navPage.navBar);
		click(navPage.navBarBtns, BaseClass.getProperty("books"));
		verifyPageTitle(BaseClass.getProperty("booksPageTitle"));
		verifyElementIsDisplayed(navPage.navBar);
		click(navPage.navBarBtns, BaseClass.getProperty("home"));
		verifyPageTitle(BaseClass.getProperty("homePageTitle"));
		verifyElementIsDisplayed(navPage.navBar);
	}

	@Test(groups = {"Roman", "regression"})
	public void SliderVerification() {
		verifyElementIsDisplayed(homePage.slider);
		Assert.assertEquals(Constants.sliderAmmount, homePage.bannersList.size());
	}

	@Test(groups = {"Roman", "regression"})
	public void FeaturedProductsSectionVerification() {
		verifyElementIsDisplayed(homePage.featuredProductSection);
		assertOurOfStockProducts(homePage.featuredProductList);
	}

	@Test(groups = {"Roman", "regression"})
	public void LatestProductsSectionVerification() {
		verifyElementIsDisplayed(homePage.latestProductSection);
		assertOurOfStockProducts(homePage.latestProductList);
	}

	@Test(groups = {"Roman", "regression"})
	public void BestsellersProductsSectionVerification() {
		verifyElementIsDisplayed(homePage.bestsellersProductSection);
		assertOurOfStockProducts(homePage.bestsellersProductList);
	}

	@Test(groups = {"Roman", "regression"})
	public void SpecialsProductsSectionVerification() {
		verifyElementIsDisplayed(homePage.specialsProductSection);
		assertOurOfStockProducts(homePage.specialsProductList);
	}
	
	@Test(groups = {"Roman", "smoke", "regression"})
	public void BrandListVerification() throws IOException {
		verifyElementIsDisplayed(homePage.brandListSection);
		validatePageTitles();
	}
	
	@Test(groups = {"Shrinkhala", "smoke", "regression"})
	public void FooterPageVerification() {
		verifyElementIsDisplayed(homePage.aboutUs);
		verifyElementIsDisplayed(homePage.contactUs);
		verifyElementIsDisplayed(homePage.testimonials);
		verifyElementIsDisplayed(homePage.newsLetterSignup);
		verifyElementIsDisplayed(homePage.footer);
	}
	
	@Test(groups = {"Shrinkhala", "smoke", "regression"})
	public void FooterButtonVerification() {
		verifyElementIsDisplayed(homePage.footer);
		click(homePage.footerlinksBtns, BaseClass.getProperty("aboutUs"));
		verifyPageTitle(BaseClass.getProperty("aboutUsPageTitle"));
		verifyElementIsDisplayed(homePage.footer);
		click(homePage.footerlinksBtns, BaseClass.getProperty("privacypolicy"));
		verifyPageTitle(BaseClass.getProperty("privacypolicyPageTitle"));
		verifyElementIsDisplayed(homePage.footer);
		click(homePage.footerlinksBtns, BaseClass.getProperty("ReturnPolicy"));
		verifyPageTitle(BaseClass.getProperty("ReturnPolicyPageTitle"));
		verifyElementIsDisplayed(homePage.footer);
		click(homePage.footerlinksBtns, BaseClass.getProperty("Shipping"));
		verifyPageTitle(BaseClass.getProperty("ShippingPageTitle"));
		verifyElementIsDisplayed(homePage.footer);
		click(homePage.footerlinksBtns, BaseClass.getProperty("ContactUs"));
		verifyPageTitle(BaseClass.getProperty("ContactUsPageTitle"));
		verifyElementIsDisplayed(homePage.footer);
		click(homePage.footerlinksBtns, BaseClass.getProperty("SiteMap"));
		verifyPageTitle(BaseClass.getProperty("SiteMapPageTitle"));
		verifyElementIsDisplayed(homePage.footer);
		click(homePage.footerlinksBtns, BaseClass.getProperty("Login"));
		verifyPageTitle(BaseClass.getProperty("LoginPageTitle"));	
	}
	
}
