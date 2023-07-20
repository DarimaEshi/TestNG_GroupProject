package test;

import org.testng.annotations.Test;

import utilites.BaseClass;
import utilites.CommonMethods;

public class MyAccountTesting extends CommonMethods {

	@Test(groups = {"Juret", "regression"})
	public void AddItemToWhishList() {

		Login(BaseClass.getProperty("testingUsername"), BaseClass.getProperty("testingPassword"));
		highLightElementMethod(accountPage.HairCareProductMenuBarHightLight);
		click(navPage.navBarBtns, BaseClass.getProperty("hairCare"));
		verifyPageTitle(BaseClass.getProperty("hairCarePageTitle"));
		scrollToElement(accountPage.ShampooScrollHaircarePage);
		highLightElementMethod(accountPage.HairCarePageShampooHightLight);
		click(accountPage.ProductListProductPage, BaseClass.getProperty("Shampoo"));
		verifyPageTitle(BaseClass.getProperty("ShampooTitle"));
		highLightElementMethod(accountPage.AddWishList);
		click(accountPage.AddWishList);
		waitForClickability(accountPage.removeItemFromeWhishList);
		verifyElementIsDisplayed(accountPage.removeItemFromeWhishList);
		highLightElementMethod(accountPage.HoveOverWelcomeBatton);
		hover(accountPage.HoveOverWelcomeBatton);
		highLightElementMethod(accountPage.AddWihsListOfWellcomeDropDownHightLight);
		click(accountPage.AddWihsListWellcomeDropDown, BaseClass.getProperty("AddWihsListWellcomeDropDown"));
		verifyElementIsDisplayed(accountPage.WhishListIsDisplayTable);
		verifyElementIsDisplayed(accountPage.ItemInWishListTable);
		highLightElementMethod(accountPage.WhishListIsDisplayTable);
		click(accountPage.MyWishListPageTrashBin);
	}

	@Test(groups = {"Juret", "regression"})
	public void unAuthorisedUser() {

		highLightElementMethod(accountPage.ProductMenuListHighLight);
		click(navPage.navBarBtns, BaseClass.getProperty("bookButtonFromeMenuBar"));
		verifyPageTitle(BaseClass.getProperty("bookProductPage"));
		scrollToElement(accountPage.BookImagesHightLight);
		highLightElementMethod(accountPage.BookImagesHightLight);
		click(accountPage.ImagesBookProductPage, BaseClass.getProperty("booksTitle"));
		verifyPageTitle(BaseClass.getProperty("booksTitle"));
		verifyElementIsNotDisplayed(accountPage.AddWishList);
	}

	@Test(groups = {"Juret", "regression"})
	public void RemoveItemFromProductPage() {

		Login(BaseClass.getProperty("testingUsername"), BaseClass.getProperty("testingPassword"));
		highLightElementMethod(accountPage.ProductMenuListHighLight);
		click(navPage.navBarBtns, BaseClass.getProperty("bookButtonFromeMenuBar"));
		verifyPageTitle(BaseClass.getProperty("bookProductPage"));
		scrollToElement(accountPage.BookImagesHightLight);
		highLightElementMethod(accountPage.BookImagesHightLight);
		click(accountPage.ProductListProductPage, BaseClass.getProperty("booksNamProductPage"));
		verifyPageTitle(BaseClass.getProperty("booksTitle"));
		highLightElementMethod(accountPage.AddWishList);
		click(accountPage.AddWishList);
		waitForClickability(accountPage.removeItemFromeWhishList);
		verifyElementIsDisplayed(accountPage.removeItemFromeWhishList);
		highLightElementMethod(accountPage.HoveOverWelcomeBatton);
		hover(accountPage.HoveOverWelcomeBatton);
		highLightElementMethod(accountPage.AddWihsListOfWellcomeDropDownHightLight);
		click(accountPage.AddWihsListWellcomeDropDown, BaseClass.getProperty("AddWihsListWellcomeDropDown"));
		verifyElementIsDisplayed(accountPage.ItemInWishListTable);
		verifyElementIsDisplayed(accountPage.WhishListIsDisplayTable);
		highLightElementMethod(accountPage.WhishListIsDisplayTable);
		click(accountPage.ItemInWishListPageBookTable);
		verifyPageTitle(BaseClass.getProperty("booksTitle"));
		highLightElementMethod(accountPage.removeItemFromeWhishList);
		click(accountPage.removeItemFromeWhishList);
		waitForClickability(accountPage.AddWishList);
		highLightElementMethod(accountPage.AddWishList);
		verifyElementIsDisplayed(accountPage.AddWishList);
		highLightElementMethod(accountPage.HoveOverWelcomeBatton);
		hover(accountPage.HoveOverWelcomeBatton);
		highLightElementMethod(accountPage.HoveOverWelcomeBatton);
		click(accountPage.AddWihsListWellcomeDropDown, BaseClass.getProperty("AddWihsListWellcomeDropDown"));
		verifyPageTitle(BaseClass.getProperty("AddWihsListWellcomeDropDown"));
		highLightElementMethod(accountPage.EmptyItemMyWishList);
		verifyElementIsDisplayed(accountPage.EmptyItemMyWishList);

	}

	@Test(groups = {"Juret", "regression"})
	public void removeItemFromeMyWishListPage() {

		Login(BaseClass.getProperty("testingUsername"), BaseClass.getProperty("testingPassword"));
		highLightElementMethod(accountPage.ProductMenuListHighLight);
		click(navPage.navBarBtns, BaseClass.getProperty("bookButtonFromeMenuBar"));
		verifyPageTitle(BaseClass.getProperty("bookProductPage"));
		scrollToElement(accountPage.BookImagesHightLight);
		highLightElementMethod(accountPage.BookImagesHightLight);
		click(accountPage.ImagesBookProductPage, BaseClass.getProperty("booksNamProductPage"));
		verifyPageTitle(BaseClass.getProperty("booksTitle"));
		highLightElementMethod(accountPage.AddWishList);
		click(accountPage.AddWishList);
		waitForClickability(accountPage.removeItemFromeWhishList);
		verifyElementIsDisplayed(accountPage.removeItemFromeWhishList);
		verifyPageTitle(BaseClass.getProperty("booksTitle"));
		highLightElementMethod(accountPage.HoveOverWelcomeBatton);
		hover(accountPage.HoveOverWelcomeBatton);
		highLightElementMethod(accountPage.AddWihsListOfWellcomeDropDownHightLight);
		click(accountPage.AddWihsListWellcomeDropDown, BaseClass.getProperty("AddWihsListWellcomeDropDown"));
		verifyElementIsDisplayed(accountPage.ItemInWishListTable);
		highLightElementMethod(accountPage.MyWishListPageTrashBin);
		click(accountPage.MyWishListPageTrashBin);
		highLightElementMethod(accountPage.WhishListIsDisplayTable);
		highLightElementMethod(accountPage.ProductMenuListHighLight);
		click(navPage.navBarBtns, BaseClass.getProperty("books"));
		verifyPageTitle(BaseClass.getProperty("bookProductPage"));
		scrollToElement(accountPage.BookImagesHightLight);
		highLightElementMethod(accountPage.BookImagesHightLight);
		click(accountPage.ImagesBookProductPage, BaseClass.getProperty("booksNamProductPage"));
		verifyPageTitle(BaseClass.getProperty("booksTitle"));
		highLightElementMethod(accountPage.AddWishList);
		verifyElementIsDisplayed(accountPage.AddWishList);
	}

	@Test(groups = {"Juret", "regression"})
	public void EnableTheNotification() {

		Login(BaseClass.getProperty("testingUsername"), BaseClass.getProperty("testingPassword"));
		highLightElementMethod(accountPage.AudioMegaphoneIcon2);
		click(accountPage.AudioMegaphoneIcon2);
		verifyPageTitle(BaseClass.getProperty("NotificationsTitle"));
		highLightElementMethod(accountPage.BackButton);
		click(accountPage.BackButton);
		highLightElementMethod(accountPage.MyAccountDashBoardHighLight);
		highLightElementMethod(accountPage.MyAccountNotificationdHighLight);
		verifyPageTitle(BaseClass.getProperty("MyAccount"));
		click(accountPage.NotificationsMyAccountDashBoard, BaseClass.getProperty("NotificationsButton"));
		highLightElementMethod(accountPage.NotificationCheckBoxHighLight);
		clickRadioOrCheckBox(accountPage.NotificationCheckBox, BaseClass.getProperty("CheckBoxNotificationPage"));
		verifyPageTitle(BaseClass.getProperty("NotificationsTitle"));
		highLightElementMethod(accountPage.ContinueButton);
		verifyElementIsSelected(accountPage.NotificationCheckBoxList);
		clickRadioOrCheckBox(accountPage.NotificationCheckBox, BaseClass.getProperty("CheckBoxNotificationPage"));
		click(accountPage.ContinueButton);
		verifyPageTitle(BaseClass.getProperty("MyAccount"));
		highLightElementMethod(alertPage.successMsg);
		verifyElementIsDisplayed(alertPage.successMsg);

	}

	@Test(groups = {"Juret", "regression"})
	public void ChangePasswordReusingCurrentPassword() {

		Login(BaseClass.getProperty("testingUsername"), BaseClass.getProperty("testingPassword"));
		highLightElementMethod(accountPage.ChangePasswor1);
		click(accountPage.ChangePasswor1);
		verifyPageTitle(BaseClass.getProperty("ChangePasswordPageTitle"));
		highLightElementMethod(accountPage.BackButton);
		click(accountPage.BackButton);
		verifyPageTitle(BaseClass.getProperty("MyAccount"));
		highLightElementMethod(accountPage.MyAccountDashBoardHighLight);
		highLightElementMethod(accountPage.MyAccountChangePasswordHighLight);
		click(accountPage.ChangePasswordMyAccountDashBoard, BaseClass.getProperty("ChangePassworButton"));
		verifyPageTitle(BaseClass.getProperty("ChangePasswordPageTitle"));
		highLightElementMethod(accountPage.CurrentPassword);
		sendText(accountPage.CurrentPassword, BaseClass.getProperty("testingPassword"));
		highLightElementMethod(accountPage.NewPassword);
		sendText(accountPage.NewPassword, BaseClass.getProperty("testingPassword"));
		highLightElementMethod(accountPage.NewPasswordConfirm);
		sendText(accountPage.NewPasswordConfirm, BaseClass.getProperty("testingPassword"));
		highLightElementMethod(accountPage.ContinueButton);
		click(accountPage.ContinueButton);
		verifyPageTitle(BaseClass.getProperty("MyAccount"));
		verifyElementIsDisplayed(alertPage.successMsg);
		highLightElementMethod(alertPage.successMsg);
	}

	@Test(groups = {"Juret", "regression"})
	public void ChangePassworWithEmptySpace() {

		Login(BaseClass.getProperty("testingUsername"), BaseClass.getProperty("testingPassword"));
		highLightElementMethod(accountPage.ChangePasswor1);
		click(accountPage.ChangePasswor1);
		verifyPageTitle(BaseClass.getProperty("ChangePasswordPageTitle"));
		highLightElementMethod(accountPage.BackButton);
		click(accountPage.BackButton);
		verifyPageTitle(BaseClass.getProperty("MyAccount"));
		highLightElementMethod(accountPage.MyAccountDashBoardHighLight);
		highLightElementMethod(accountPage.MyAccountChangePasswordHighLight);
		click(accountPage.ChangePasswordMyAccountDashBoard, BaseClass.getProperty("ChangePassworButton"));
		verifyPageTitle(BaseClass.getProperty("ChangePasswordPageTitle"));
		highLightElementMethod(accountPage.CurrentPassword);
		sendText(accountPage.CurrentPassword, BaseClass.getProperty("testingPassword"));
		highLightElementMethod(accountPage.NewPassword);
		highLightElementMethod(accountPage.NewPasswordConfirm);
		highLightElementMethod(accountPage.ContinueButton);
		click(accountPage.ContinueButton);
		highLightElementMethod(alertPage.errorMsg);
		verifyElementIsDisplayed(alertPage.errorMsg);
	}

}
