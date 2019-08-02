package leavepages;

import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.apache.bcel.generic.ReturnaddressType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import leavebase.TestBase;
import leaveutility.TestUtil;

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
		
		 WebDriverWait wait = new WebDriverWait(driver,30);
		 wait.until(ExpectedConditions.visibilityOf( leavemenu));
		 driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		 leavemenu.click();
		 
	 }
	 
	 public Applyleavepage  clickonapplyleavepage() throws FileNotFoundException
	 
	 {
		 WebDriverWait wait = new WebDriverWait(driver,30);
		 wait.until(ExpectedConditions.visibilityOf( applyleave));
		 applyleave.click();
		return new Applyleavepage() ;
		
		 
      }
	 
	 
	 
	
	
	
	

	
	
	

}
