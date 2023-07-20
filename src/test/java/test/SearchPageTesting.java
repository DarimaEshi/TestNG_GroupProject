package test;

import org.testng.annotations.Test;

import utilites.BaseClass;
import utilites.CommonMethods;

public class SearchPageTesting extends CommonMethods {
	
	// TC1
	@Test(groups = {"Hannah", "smoke", "regression"})
	public void searchWithValidKeyword() {
		sendText(searchPage.searchBox, "shoes");
		click(searchPage.searchButton);
		verifyElementIsDisplayed(searchPage.searchResultItemsSection);
	}
	
	// TC2
	@Test(groups = {"Hannah", "regression"})
	public void searchWithInvalidKeyword() {
		sendText(searchPage.searchBox, "sh0es");
		click(searchPage.searchButton);
		verifyElementIsDisplayed(searchPage.noResultsMsg);
	}
	
	// TC3
	@Test(groups = {"Hannah", "regression"})
	public void searchValidKeywordWithMatchingCategory() {
		click(searchPage.searchBox);
		click(searchPage.searchCategoryDropDown, BaseClass.getProperty("fragranceDM"));
		sendText(searchPage.searchBox, "perfume");
		click(searchPage.searchButton);
		compareListsSize(searchPage.searchResultList, searchPage.productList);
	}
	
	// TC4
	@Test(groups = {"Hannah", "regression"})
	public void searchValidKeywordWithMismatchingCategory() {
		click(searchPage.searchBox);
		click(searchPage.searchCategoryDropDown, BaseClass.getProperty("a&aDM")); // a&aDM = Apparel & accessories
		sendText(searchPage.searchBox, "perfume");
		click(searchPage.searchButton);
		verifyElementIsDisplayed(searchPage.noResultsMsg);
	}
	
}
