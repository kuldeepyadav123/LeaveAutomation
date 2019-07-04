package leavepages;

import java.io.FileNotFoundException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
	   
	   @FindBy (xpath = "//*[@id=\"leave\"]")    
       WebElement leavetype;
	   
	   @FindBy ( xpath ="//*[@id=\"startdate\"]")
	   WebElement selectdate;
	   
	   @FindBy (xpath ="//*[@id=\"enddate\"]")
	   WebElement enddate;
	   
	   @FindBy (xpath ="//*[@id=\"ch_st_daylengthf\"]")
	   WebElement startdurationfullday;
	   
	   @FindBy (xpath = "//*[@id=\"ch_st_daylengthh\"]")
	   WebElement startdurationhalfday;
	   
	   @FindBy (xpath = "  //*[@id=\"ch_ed_daylengthf\"]")
	   WebElement endurationfullday;
	   
	   @FindBy (xpath = "//*[@id=\"ch_ed_daylengthh\"]")
	   WebElement  enddurationhalfday;
	   
	   @FindBy (xpath="//*[@id=\"LeaveVcLeaveReason\"]" )
	   WebElement Description;
	   
	   @FindBy (xpath="//input[text()='DLF-1984-Supriya Thankappan']" )
	   WebElement ToBeApprovedBy;
	   
	   @FindBy (xpath = "//*[@id=\"disable\"]/div/div/button[1]")
	   WebElement Apply;
	   
	   @FindBy(xpath = "//*[@id=\"disable\"]/div/div/a")
	   WebElement cancel;
	   
	   @FindBy (xpath= "//*[@id=\"disable\"]/div/div/button[2]")
	   WebElement saveasdraft;
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}


