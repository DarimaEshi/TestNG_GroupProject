package utilites;

import pages.AccountPage;
import pages.AddToCartPage;
import pages.AlertsPage;
import pages.HomePage;
import pages.LoginPage;
import pages.NavigationPage;
import pages.ProductPage;
import pages.RegistrationPage;
import pages.SearchPage;
import pages.ShoppingCartPage;
import pages.SocialMediaPage;
import pages.SpecialOffersPage;

public class PageInitializer extends BaseClass {

	public static RegistrationPage regPage;
	public static AlertsPage alertPage;
	public static NavigationPage navPage;
	public static AccountPage accountPage;
	public static LoginPage loginPage;
	public static HomePage homePage;
	public static SpecialOffersPage soPage;
	public static ShoppingCartPage scPage;
	public static AddToCartPage atcPage;
	public static ProductPage productPage;
	public static SocialMediaPage smPage;
	public static SearchPage searchPage;

	public static void initialize() {

		regPage = new RegistrationPage();
		alertPage = new AlertsPage();
		navPage = new NavigationPage();
		accountPage = new AccountPage();
		loginPage = new LoginPage();
		homePage = new HomePage();
		soPage = new SpecialOffersPage();
		scPage = new ShoppingCartPage();
		atcPage = new AddToCartPage();
		productPage = new ProductPage();
		smPage = new SocialMediaPage();
		searchPage = new SearchPage();
	}
}
