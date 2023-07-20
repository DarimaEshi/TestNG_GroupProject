package pages;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilites.BaseClass;

public class AddToCartPage {	

	public AddToCartPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);	
	}
	
	@FindBy(xpath = "//div[contains(@class, 'list-inline')]/div/div[2]/div[3]/a")
	public List<WebElement> addToCartBtnsList;
	
	@FindBy(xpath = "//div[@class='mt20 ']/ul/li/a")
	public WebElement addToCartBtn;
	
	@FindBy(xpath = "//div[@id='block_frame_featured_1769']/div/div[1]/div[2]/div[3]/a")
	public WebElement addToCartBtnHomePage;
	
	@FindBy(xpath = "//div[contains(@class, 'product-list')]/table/tbody/tr[2]/td[7]/a")
	public WebElement removeFromCartBtn;
	
	@FindBy(xpath = "//*[@id=\"product_quantity\"]")
	public WebElement quantityTextBox;
	
	@FindBy(xpath = "//div[contains(@class, 'added_to_cart')]/div[1]")
	public WebElement addedToCartBtn;
	
}
