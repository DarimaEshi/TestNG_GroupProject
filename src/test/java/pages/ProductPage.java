package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilites.BaseClass;

public class ProductPage {

	public ProductPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}

	@FindBy(xpath = "//ul[@class='thumbnails row']/li")
	public List<WebElement> navBarButtonSubcategories;

	@FindBy(xpath = "//div[contains(@class, 'col-md-3 col')]/div/div/a[@class='prdocutname']")
	public List<WebElement> navBarSubcategoryListedItems;

	@FindBy(xpath = "//a[@class='cart']")
	public WebElement addToCartBtn;

	@FindBy(xpath = "//ul[contains(@class, 'nav topcart')]/li/a/span[1]")
	public WebElement qtyInTopLeftShoppingCart;

	@FindBy(xpath = "//input[@name='quantity']")
	public WebElement qtyBox;

	@FindBy(xpath = "//div[contains(@class, 'info product-list')]")
	public WebElement listedItemsSectionInShoppingCart;

	@FindBy(xpath = "//div[@class='contentpanel']")
	public WebElement cartContentField;

	@FindBy(xpath = "//div[contains(@class, 'list-inline')]/div[3]/div[1]")
	public WebElement tShirt;

	@FindBy(xpath = "//div[contains(@class, 'list-inline')]/div/div[1]")
	public List<WebElement> tShirtsList;

	@FindBy(xpath = "//div[contains(@class, 'list-inline')]/div[1]/div[2]/div[3]/a")
	public WebElement skinsheenAddBtn;

	@FindBy(xpath = "//*[@id=\"block_frame_featured_1769\"]/div/div[3]/div[2]/div[3]/a/i")
	public WebElement bambaAddBtn;

}
