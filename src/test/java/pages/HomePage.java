package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilites.BaseClass;

public class HomePage {

	public HomePage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}

	@FindBy(xpath = "//div[contains(@class, 'headerstrip navbar')]")
	public WebElement header;

	@FindBy(xpath = "//div[@id='banner_slides']")
	public WebElement slider;

	@FindBy(xpath = "//div[@id='banner_slides']/div")
	public List<WebElement> bannersList;

	@FindBy(xpath = "//section[@id='featured']")
	public WebElement featuredProductSection;

	@FindBy(xpath = "//div[@id='block_frame_featured_1769']/div/div")
	public List<WebElement> featuredProductList;

	@FindBy(xpath = "//section[@id='latest']")
	public WebElement latestProductSection;

	@FindBy(xpath = "//div[@id='block_frame_latest_1770']/div/div")
	public List<WebElement> latestProductList;

	@FindBy(xpath = "//section[@id='bestseller']")
	public WebElement bestsellersProductSection;

	@FindBy(xpath = "//div[@id='block_frame_bestsellers_1771']/div/div")
	public List<WebElement> bestsellersProductList;

	@FindBy(xpath = "//section[@id='special']")
	public WebElement specialsProductSection;

	@FindBy(xpath = "//div[@id='block_frame_special_1772']/div/div")
	public List<WebElement> specialsProductList;

	@FindBy(xpath = "//div[@id='block_frame_listing_block_1774']")
	public WebElement brandListSection;

	@FindBy(xpath = "//div[@id='block_frame_listing_block_1774']/div/div[1]/ul/li")
	public List<WebElement> brandListBtns;

	@FindBy(xpath = "//*[@id='footer']/footer")
	public WebElement footer;

	@FindBy(xpath = "//*[@id='footer']/footer/section[1]/div/div[1]")
	public WebElement aboutUs;

	@FindBy(xpath = "//*[@id='footer']/footer/section[1]/div/div[2]")
	public WebElement contactUs;

	@FindBy(xpath = "//*[@id='footer']/footer/section[1]/div/div[3]")
	public WebElement testimonials;

	@FindBy(xpath = "//*[@id='footer']/footer/section[1]/div/div[4]")
	public WebElement newsLetterSignup;

	@FindBy(xpath = "//ul[@class='info_links_footer']/li")
	public List<WebElement> footerlinksBtns;
	
}
