package MyApplication;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DressPageObject extends HomePageObjects {
	
	public  DressPageObject() {
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(xpath =".//*[@id='block_top_menu']/ul/li[2]/a")
	private WebElement tabDresses;
	
	public  void clickDresses() {
    tabDresses.click();
		
}
	
	@FindBy(xpath =".//*[@id=\"ul_layered_id_attribute_group_1\"]/li[1]/label/a")
	private WebElement tabsizeS;
	
	
	@FindBy(xpath =".//*[@id=\"ul_layered_id_attribute_group_1\"]/li[2]/label/a")
	private WebElement tabsizeM;
	
	@FindBy(xpath =".//*[@id=\"ul_layered_id_attribute_group_1\"]/li[3]/label/a/span")
	private WebElement tabsizeL;

	} 


