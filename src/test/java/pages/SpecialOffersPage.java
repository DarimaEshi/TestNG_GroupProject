package pages;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilites.BaseClass;

public class SpecialOffersPage {

	public SpecialOffersPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}

	@FindBy(xpath = "//div[contains(@class, 'list-inline')]/div/div[1]/div/a")
	public List<WebElement> specialsList;
	
	

	
}
