package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilites.BaseClass;

public class SearchPage {
	
	public SearchPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
	@FindBy(xpath = "//*[@id='filter_keyword']")
	public WebElement searchBox;
	
	@FindBy(xpath = "//*[@class='fa fa-search']")
	public WebElement searchButton;
	
	@FindBy(xpath = "//div[contains(@class, 'list-inline')]")
	public WebElement searchResultItemsSection;
	
	@FindBy(xpath = "//li[@class='search-category']")
	public List<WebElement> searchCategoryDropDown;
	
	@FindBy(xpath = "//div[@class='contentpanel']/div[2]")
	public WebElement noResultsMsg;
	
	@FindBy(xpath = "//div[contains(@class, 'list-inline')]/div")
	public List<WebElement> productList;
	
	@FindBy(xpath = "//div[contains(@class, 'contentpanel')]/div[3]/div")
	public List<WebElement> searchResultList;
	
}
