package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilites.BaseClass;

public class NavigationPage {

	public NavigationPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}

	@FindBy(xpath = "//div[@id='customernav']/ul/li/a")
	public WebElement loginOrRegBtn;

	@FindBy(xpath = "//div[contains(@class, 'topnavbar')]/ul/li")
	public List<WebElement> headerNavBtns;

	@FindBy(xpath = "//section[@id='categorymenu']/nav/ul/li")
	public List<WebElement> navBarBtns;

	@FindBy(xpath = "//section[@id='categorymenu']")
	public WebElement navBar;

	@FindBy(xpath = "//ul[@class='nav-pills categorymenu']/li[2]")
	public WebElement ApparelAccessoriesBtn;

	@FindBy(xpath = "//ul[@class='nav-pills categorymenu']/li[2]/div/ul[1]/li[2]")
	public WebElement tShirtsBtn;

	@FindBy(xpath = "//section[@id='categorymenu']/nav/ul/li[3]")
	public WebElement MakeUpBtn;

	@FindBy(xpath = "//section[@id='categorymenu']/nav/ul/li[3]/div/ul[1]/li[1]")
	public WebElement CheeksBtn;

}
