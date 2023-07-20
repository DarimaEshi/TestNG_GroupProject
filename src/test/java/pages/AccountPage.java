package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilites.BaseClass;

public class AccountPage {
	
	public AccountPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
	@FindBy(xpath = "//h1[@class='heading1']")
	public WebElement myAccountPageName;
	
	@FindBy(xpath = "//h1[@class='heading1']")
	public WebElement createdAccountPageName;
	
	@FindBy(xpath = "//*[@id=\"categorymenu\"]/nav/ul/li[7]/a")
	public WebElement HairCareProductMenuBarHightLight;
	
	@FindBy(xpath = "//*[@id=\"maincontainer\"]//div[3]/div[4]/div[1]/div/a") 
	public WebElement ShampooScrollHaircarePage;
	
	@FindBy(xpath = "//*[@id=\"maincontainer\"]//div[3]/div[4]/div[2]/a/img") 
	public WebElement HairCarePageShampooHightLight;
	
	@FindBy(xpath = "//*[@class='prdocutname']") 
	public List<WebElement>  ProductListProductPage;
	
	@FindBy(xpath = "//*[@id=\"maincontainer\"]/div/div[1]/div/div") 
	public WebElement AddWishListHomePageHairCareProduct;
	
	@FindBy(xpath = "//*[@id=\"categorymenu\"]/nav/ul/li[8]/a")
	public WebElement ProductMenuListHighLight;
	
	@FindBy(xpath = "//*[@id=\"maincontainer\"]/div/div/div/div/div[3]/div[1]/div[2]/a/img") 
	public WebElement BookImagesHightLight; 
	
	@FindBy(xpath = "//*[@id=\"maincontainer\"]/div/div/div/div/div[3]/div[1]/div[2]/a/img") 
	public WebElement ProductMenuListShamPooHighLight; 
	
	@FindBy(xpath = "//*[@class='prdocutname']")	
	public List<WebElement> ImagesBookProductPage;
	
	@FindBy(xpath = "//*[@class='wishlist_add btn btn-large']")
	public WebElement AddWishList;
	
	@FindBy(xpath = "//div[@id='customernav']/ul/li/a")
	public WebElement HoveOverWelcomeBatton;
	
	@FindBy(xpath = "//*[@id=\"customer_menu_top\"]/li/a/div")
	public WebElement AddWihsListOfWellcomeDropDownHightLight;   

	@FindBy(xpath = "//div[@id='customernav']/ul/li/ul/li") 
	public List<WebElement> AddWihsListWellcomeDropDown;   
	
	@FindBy(xpath = "//*[@id='maincontainer']/div[1]//table") 
	public WebElement  WhishListIsDisplayTable;
	
	@FindBy(xpath = "//*[@id=\"maincontainer\"]/div/div[1]/div/div")
	public WebElement EmptyItemMyWishList;

	@FindBy(xpath="//*[@id=\"product\"]//div[5]/a[1]")		
	public WebElement  removeItemFromeWhishList;
	
	@FindBy(xpath="//*[@id='maincontainer']/div/div[1]/div/div/div/table/tbody/tr[2]/td[2]/a")		
	public WebElement ItemInWishListTable;
	
	@FindBy(xpath="//*[@id='maincontainer']/div/div[1]/div/div/div/table/tbody/tr[2]/td[2]/a")		
	public WebElement ItemInWishListPageBookTable;
	
	@FindBy(xpath="//*[@class='btn btn-sm btn-default btn-remove']")		
	public WebElement  MyWishListPageTrashBin;
		
	@FindBy(xpath="//*[@id=\"maincontainer\"]//ul/li[8]")		  
	public List<WebElement>  AudioMegaphoneIcon;
	
	@FindBy(xpath="//*[@id=\"maincontainer\"]/div/div[1]//ul/li[8]/a")		
	public WebElement  AudioMegaphoneIcon2;
	
	@FindBy(xpath="//*[@id=\"imFrm\"]/div/table/tbody/tr[1]")		
	public WebElement  NotificationCheckBoxHighLight;
	
	@FindBy(xpath="//*[@type='checkbox']")		
	public List<WebElement>  NotificationCheckBox; 
	
	@FindBy(xpath="//*[@id='imFrm_settingsnewsletteremail']")		
	public WebElement  NotificationCheckBoxList; 
	
	@FindBy(xpath="//*[@title='Continue']")		
	public WebElement  ContinueButton; 
	
	@FindBy(xpath="//*[@id=\"maincontainer\"]/div/div[1]//ul/li[2]/a")		
	public WebElement ChangePasswor1;
	
	@FindBy(xpath=" //*[@name='current_password']")		
	public WebElement CurrentPassword;
	
	@FindBy(xpath="//*[@id='PasswordFrm_password']")		
	public WebElement NewPassword;
	
	@FindBy(xpath="//*[@id='PasswordFrm_confirm']")		
	public WebElement NewPasswordConfirm;		
	
	@FindBy(xpath="//*[@title='Back']")		
	public WebElement BackButton;	
	
	@FindBy(xpath="//*[@class='myaccountbox']/ul/li")		
	public List<WebElement> ChangePasswordMyAccountDashBoard;  
	
	@FindBy(xpath="//*[@class='myaccountbox']/ul/li")		
	public List<WebElement> NotificationsMyAccountDashBoard;  
	
	@FindBy(xpath="//*[@id='filter_keyword']")		
	public WebElement HightLight1;
	
	@FindBy(xpath="//*[@id=\"maincontainer\"]/div/div[2]/div[1]/div/ul/li[1]/a")		
	public WebElement MyAccountDashBoardHighLight;
	
	@FindBy(xpath="//*[@id=\"maincontainer\"]/div/div[2]/div[1]/div/ul/li[4]/a")		
	public WebElement MyAccountChangePasswordHighLight;
	
	@FindBy(xpath="//*[@id=\"maincontainer\"]/div/div[2]/div[1]/div/ul/li[4]/a")		
	public WebElement MyAccountNotificationdHighLight;

}
