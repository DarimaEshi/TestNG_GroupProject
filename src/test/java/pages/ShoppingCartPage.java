package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilites.BaseClass;

public class ShoppingCartPage {

	public ShoppingCartPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}

	@FindBy(xpath = "//div[contains(@class, 'product-list')]")
	public WebElement cartListTable;

	@FindBy(xpath = "//input[@id='cart_quantity50']")
	public WebElement quantityTextBox;

	@FindBy(xpath = "//*[@id='cart_update']")
	public WebElement updateBtn;

	@FindBy(xpath = "//table[@id='totals_table']/tbody/tr[3]/td[2]/span")
	public WebElement Total;

	@FindBy(xpath = "//table[@id='totals_table']/tbody/tr[1]/td[2]/span")
	public WebElement SubTotal;

	@FindBy(xpath = "//*[@id='estimate_country']")
	public WebElement ShipCountry;

	@FindBy(xpath = "//select[@id='estimate_country_zones']")
	public WebElement ShipState;

}
