package test;

import org.testng.annotations.Test;
import utilites.BaseClass;
import utilites.CommonMethods;

public class ShoppingCartTesting extends CommonMethods {

	@Test(groups = {"Darima", "smoke", "regression"})
	public void AddProductsToCart() {
		click(navPage.headerNavBtns, BaseClass.getProperty("specials"));
		verifyPageTitle(BaseClass.getProperty("specialsPageTitle"));
		click(soPage.specialsList, BaseClass.getProperty("brunetteItem"));
		verifyPageTitle(BaseClass.getProperty("brunettePageTitle"));
		click(atcPage.addToCartBtn);
		click(navPage.headerNavBtns, BaseClass.getProperty("specials"));
		verifyPageTitle(BaseClass.getProperty("specialsPageTitle"));
		click(soPage.specialsList, BaseClass.getProperty("absolueItem"));
		verifyPageTitle(BaseClass.getProperty("absoluePageItem"));
		click(atcPage.addToCartBtn);
	}

	@Test(groups = {"Darima", "regression"})
	public void RemoveProductsFromCart() {
		click(navPage.headerNavBtns, BaseClass.getProperty("specials"));
		verifyPageTitle(BaseClass.getProperty("specialsPageTitle"));
		click(soPage.specialsList, BaseClass.getProperty("brunetteItem"));
		verifyPageTitle(BaseClass.getProperty("brunettePageTitle"));
		click(atcPage.addToCartBtn);
		verifyElementIsDisplayed(scPage.cartListTable);
		verifyPageTitle(BaseClass.getProperty("cartPageTitle"));
		click(atcPage.removeFromCartBtn);
		verifyElementIsNotDisplayed(scPage.cartListTable);
	}

	@Test(groups = {"Darima", "regression"})
	public void UpdateCartWithInvalidQuantityPage() {
		hover(navPage.ApparelAccessoriesBtn);
		click(navPage.tShirtsBtn);
		verifyPageTitle(BaseClass.getProperty("tShirtsTitle"));
		click(productPage.tShirtsList, BaseClass.getProperty("shirtItem"));
		verifyPageTitle(BaseClass.getProperty("shirtItemTitel"));
		sendText(atcPage.quantityTextBox, BaseClass.getProperty("invQuantity"));
		click(atcPage.addToCartBtn);
		verifyElementIsDisplayed(alertPage.invQuantMsg);
	}

	@Test(groups = {"Darima", "regression"})
	public void TestAddToCartBtnAddsItemToCart() {
		hover(navPage.MakeUpBtn);
		click(navPage.CheeksBtn);
		verifyPageTitle(BaseClass.getProperty("cheeksTitle"));
		click(atcPage.addToCartBtnsList.get(0));
		verifyElementIsDisplayed(atcPage.addedToCartBtn);
		click(atcPage.addToCartBtnsList.get(1));
		verifyElementIsDisplayed(atcPage.addedToCartBtn);
	}

	@Test(groups = {"Darima", "smoke", "regression"})
	public void VerifyTotalIsAlwaysMoreSubTotal() {
		click(atcPage.addToCartBtnHomePage);
		click(navPage.headerNavBtns, BaseClass.getProperty("cart"));
		verifyPageTitle(BaseClass.getProperty("cartPageTitle"));
		verifyTotalMoreThenSubTotal();
		sendText(scPage.quantityTextBox, BaseClass.getProperty("invQuantity1"));
		click(scPage.updateBtn);
		verifyTotalMoreThenSubTotal();
	}

	@Test(groups = {"Darima", "smoke", "regression"})
	public void VerifyShippingCountryAndState() {
		click(atcPage.addToCartBtnHomePage);
		click(navPage.headerNavBtns, BaseClass.getProperty("cart"));
		verifyPageTitle(BaseClass.getProperty("cartPageTitle"));
		click(scPage.ShipCountry);
		selectDropDownVisibleText(scPage.ShipCountry, BaseClass.getProperty("shipCountry"));
		click(scPage.ShipState);
		selectDropDownVisibleText(scPage.ShipState, BaseClass.getProperty("shipState"));
		click(scPage.updateBtn);
		verifyContainsTextEqualsText(scPage.ShipCountry, BaseClass.getProperty("shipCountry"));
		verifyContainsTextEqualsText(scPage.ShipState, BaseClass.getProperty("shipState"));
	}

}
