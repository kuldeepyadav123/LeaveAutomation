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
	
	@FindBy (xpath= "//li[contains(text(),'Welcome, Anuj Vats')] ")
	WebElement usernamelabel;
	
	@FindBy (xpath = "//*[@id=\"sidebar_main_toggle\"]")
	WebElement sidebar;
	
	@FindBy(xpath="//span[contains(text(),'Leave System')]")
	WebElement leavemenu;
	
	@FindBy (xpath="//a[contains(text(),'Apply Leave')]")
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
		 driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		 leavemenu.click();
		 
	 }
	 
	 public Applyleavepage  clickonapplyleavepage() throws FileNotFoundException
	 
	 {
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 applyleave.click();
		return new Applyleavepage() ;
		
		 
      }
	 
	 
	 
	
	
	
	

	
	
	

}
