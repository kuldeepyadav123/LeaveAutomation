package leavepages;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.bcel.generic.ReturnaddressType;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import leavebase.TestBase;
import leaveutility.TestUtil;

public class Loginpage extends TestBase
{


public Loginpage() throws FileNotFoundException {
	PageFactory.initElements(driver, this);	

	}

@FindBy(xpath = "//*[@id=\"UserDetailEmpId\"] ")
 WebElement username;
 
 @FindBy(xpath= "//*[@id=\"UserDetailUserPassword\"]")
 WebElement password;
 
 @FindBy(xpath="//*[@id='loginemployee']/div[5]/input")
 WebElement Login;
 
 @FindBy(xpath="//*[@id='login_form']/div[1]/div/img")
 WebElement logostl;
 
 
 //iniatializing the page object
 
 
//actions
 
 public String validateloginpagetitle() 
 { 
	 
	 return driver.getTitle();
	 
	 
 }
 
 
 
 public boolean validatelogostl()
 {
	 
  return logostl.isDisplayed();
  
 }

 
 public Homepage logintest(String usr, String pswd) throws FileNotFoundException
 
 {	                 
	 username.sendKeys(usr);
	 password.sendKeys(pswd);
	 Login.click();
	 return new Homepage();
	
}
 
  
		
 

}
