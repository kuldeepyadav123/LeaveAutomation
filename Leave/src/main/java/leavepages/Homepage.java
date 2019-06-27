package leavepages;

import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.apache.bcel.generic.ReturnaddressType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import leavebase.TestBase;

public class Homepage extends TestBase
{

	public Homepage() throws FileNotFoundException {
		
	PageFactory.initElements(driver, this);	
		
	}
	
	@FindBy (xpath= "//li[contains(text(),'')]")
	WebElement usernamelabel;
	
	@FindBy (id = "sidebar_main_toggle")
	WebElement sidebar;
	
	@FindBy(xpath = "//*[@id=\"menu_section\"]/ul/li[4]/a/span[2]")
	WebElement leavemenu;
	
	@FindBy (xpath= " //*[@id=\"menu_section\"]/ul/li[4]/ul/li[1]/a")
	WebElement applyleave;
	

	
	
	
	 public String  verifyhomepagetitle()
	  {
		return driver.getTitle();
		 
	
		  }
	 
	 public boolean verifyusername()
	 {
		return usernamelabel.isDisplayed();
		 
	}
	 
	 public void clickonsidebar()
	 {
		 sidebar.click();
		 
		 }
	 
	 public void clickonleavemenu()
	 {
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 leavemenu.click();
		 
	 }
	 
	 public Applyleavepage  clickonapplyleavepage() throws FileNotFoundException
	 
	 {
		 applyleave.click();
		return new Applyleavepage() ;
		
		 
      }
	 
	 
	 
	
	
	
	

	
	
	

}
