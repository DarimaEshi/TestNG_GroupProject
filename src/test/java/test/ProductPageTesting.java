package test;

import org.testng.annotations.Test;

import utilites.BaseClass;
import utilites.CommonMethods;

public class ProductPageTesting extends CommonMethods {

	// TC5
	@Test(groups = {"Hannah", "regression"})
	public void addAnItemToCart() {
		click(navPage.navBarBtns, BaseClass.getProperty("makeUp")); // makeUp = MAKEUP
		click(productPage.navBarButtonSubcategories, BaseClass.getProperty("lipsNBS")); // lipsNBS = Lips
		ifContainsClick(productPage.navBarSubcategoryListedItems, BaseClass.getProperty("lips3")); // lips3 = VIVA GLAM
																									// LIPSTICK
		click(productPage.addToCartBtn);
		verifyQty(productPage.qtyInTopLeftShoppingCart);
	}

	// TC6
	@Test(groups = {"Hannah", "regression"})
	public void largeValueToQtyBox() {
		click(navPage.navBarBtns, BaseClass.getProperty("makeUp")); // makeUp = MAKEUP
		click(productPage.navBarButtonSubcategories, BaseClass.getProperty("lipsNBS")); // lipsNBS = Lips
		ifContainsClick(productPage.navBarSubcategoryListedItems, BaseClass.getProperty("lips3")); // lips3 = VIVA GLAM
																									// LIPSTICK
		assertAttributeEquals(productPage.qtyBox, "maxlength", "8");
	}

	// TC7
	@Test(groups = {"Hannah", "regression"})
	public void lettersToQtyBox() {
		click(navPage.navBarBtns, BaseClass.getProperty("makeUp")); // makeUp = MAKEUP
		click(productPage.navBarButtonSubcategories, BaseClass.getProperty("lipsNBS")); // lipsNBS = Lips
		ifContainsClick(productPage.navBarSubcategoryListedItems, BaseClass.getProperty("lips3")); // lips3 = VIVA GLAM
																									// LIPSTICK
		assertAttributeEquals(productPage.qtyBox, "type", "number");
	}

}
