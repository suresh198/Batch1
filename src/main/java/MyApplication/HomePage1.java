package MyApplication;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage1 extends BasePage {
	
	public  HomePage1() {
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(xpath =".//*[@id='block_top_menu']/ul/li[1]/a")
	private WebElement tabWomen;
	
	@FindBy(xpath =".//*[@id='block_top_menu']/ul/li[2]/a")
	private WebElement tabDresses;
	
	
	@FindBy(xpath =".//*[@id='block_top_menu']/ul/li[3]/a")
	private WebElement tabTshirts;
	
	
	public void clickWomen() {
		tabWomen.click();
	}
		
	public void clickDresses() {
			tabDresses.click();
	}
			
	public void clickTshirts() {
				tabTshirts.click();
	}	
		
}