package leavepages;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import leavebase.TestBase;

public class Applyleavepage extends TestBase


{

	public Applyleavepage() throws FileNotFoundException {
		
		PageFactory.initElements(driver, this);	
			
		}
	
	   @FindBy (xpath ="//input[text()='Anuj Vats-DLF-1931']")
	   WebElement employeename;
	   
	   @FindBy (xpath ="//input[text()='HROps and Admin']")
	   WebElement employeedept;
	   
	   @FindBy( xpath= "//input[text()='Manager']")
	   WebElement employeedesg;
	   
	   @FindBy (xpath = "//select[@name=\"data[leave_code]\"]")    
       WebElement leavetype;
	   
	   @FindBy ( xpath ="//*[@id=\"startdate\"]")
	   WebElement selectstartdate;   
	  
	   
	   @FindBy (xpath="//input[@name=\"data[dt_end_date]\" and @id=\"enddate\"  ]")
	   WebElement enddate;
	
	   @FindBy (xpath ="//*[@id=\"ch_st_daylengthf\"]")
	   WebElement startdurationfullday;
	   
	   @FindBy (xpath = "//*[@id=\"ch_st_daylengthh\"]")
	   WebElement startdurationhalfday;
	   
	   @FindBy (xpath = "  //*[@id=\"ch_ed_daylengthf\"]")
	   WebElement endurationfullday;
	   
	   @FindBy (xpath = "//*[@id=\"ch_ed_daylengthh\"]")
	   WebElement  enddurationhalfday;
	   
	   @FindBy (xpath = "//*[@id=\"total_leave\"]")   
	   WebElement totalleave;
	   
	   @FindBy (xpath="//*[@id=\"LeaveVcLeaveReason\"]" )      
	   WebElement Description;
	   
	   @FindBy (xpath="//*[@id=\"TextBoxesGroup\"]/div[3]/div/div/div/div[1]/div/div" )
	   WebElement ToBeApprovedBy;
	   
	   @FindBy (xpath = "//*[@id=\"disable\"]/div/div/button[1]")
	   WebElement Apply;
	   
	
	   
	   @FindBy(xpath = "//*[@id=\"disable\"]/div/div/a")
	   WebElement cancel;
	   
	   @FindBy (xpath= "//*[@id=\"disable\"]/div/div/button[2]")
	   WebElement saveasdraft;
	   
	 
	   
	   public boolean verifyemployeename()
	    { 
		   
		  
		  return employeename.isDisplayed();
		   
		  }
	   
	   public boolean verifyempdpt()
	   {
		   return employeedept.isDisplayed();
	   }
	   
	   public boolean verifyempdesg()
	   {    
		   return employeedesg.isDisplayed();
		   
		   
		}
	   
	  public void  selectleavetypecasual()
	  {
		 
		  Select select = new Select(leavetype);
		  select.selectByVisibleText("CASUAL LEAVE");
	        
		}
	  
	  public void enterstartdate()
	 
	  {   
		 // ((JavascriptExecutor)driver).executeScript("document.getElementById('startdate').setAttribute('value','29-07-2019')");
		  

		  
		  
		  
		  
		  
		  
		 
		
		
		 selectstartdate.click();
		 Select month = new Select(driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[1]")));
		month.selectByValue("7");;
		WebElement day = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[5]/td[2]/a"));
	     day.click();
		Select year = new Select(driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[2]")));
	    year.selectByValue("2019");;
	    
	
		 
	 }
	   
	   
	   
	   
	   public void enterenddate()
	   
	  {        
			 
		  // ((JavascriptExecutor)driver).executeScript("document.getElementById('enddate').setAttribute('value','29-07-2019')");
		    enddate.click();
		      driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		     

			  Select month = new Select(driver.findElement(By.xpath("//select[contains(@class,'ui-datepicker-month')]")));
			  month.selectByValue("7");;  
			  
			  WebElement day = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[5]/td[2]/a"));
			  day.click();
			  Select year = new Select(driver.findElement(By.xpath("//select[contains(@class,'ui-datepicker-year')]")));
		     year.selectByValue("2019");
		 	
		   //*[@id="ui-datepicker-div"]/div/div/select[2]]] 
		   
		   
	   }
	   
	   
	   public void startduration()
	   {
		   startdurationfullday.click();
		   
	   }
	   
	
	   
	   public void totalleavescount()
	   
	   {
		   
		   totalleave.sendKeys("1");;
		   
		  
		   
		   
		   
		 
		   
		   
		 }
	   
	   public void descriptionfill()
	   {
		   Description.sendKeys("Testing 23424242424");
		
	   }
	   
	   
	   
	   
	   
	   public boolean Tobeapprovedusername()
	   {
		return ToBeApprovedBy.isDisplayed();
		   
		   
	}
	   
	   public void clickonApplyButton()
	   {
		  
		   Apply.click();
		   
		   
		   
		   
	   }
     
	   
	    }
	
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


