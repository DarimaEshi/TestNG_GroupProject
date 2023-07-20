package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilites.BaseClass;

public class SocialMediaPage {
	
	public SocialMediaPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
	@FindBy(xpath = "//div[@class='header_block']/div/a")
	public List<WebElement> socialMediaLinkBtns;
	
	@FindBy(xpath = "//div[@class='css-1dbjc4n r-o96wvk']")
	public WebElement twitterLoadingPageVerificationElement;
	
}
