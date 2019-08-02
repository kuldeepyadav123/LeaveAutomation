package leavetestcases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import leavebase.TestBase;
import leavepages.Loginpage;
import leaveutility.TestUtil;

public class Loginpagetest extends TestBase
{
	
Loginpage loginpage;
String sheetName = "login";
public Loginpagetest() throws FileNotFoundException
{
	super();
	
}


@BeforeMethod
public void setup() throws FileNotFoundException
{ 
	initialisation();
	loginpage = new Loginpage();
	
}





@Test(priority = 1)
public void loginpagetitletest()
{
String title =loginpage.validateloginpagetitle();

	Assert.assertEquals("Sterling Tools Limited", "Sterling Tools Limited");
}
@Test(priority = 2)
public void stllogoimagetest()
{
	
boolean flag	=loginpage.validatelogostl();
Assert.assertTrue(flag);
	
}

@DataProvider
public Object[][] getsheetdata()
{
	
	Object data[][] = TestUtil.getTestData(sheetName);
	return data;
	

}

@Test (priority = 3)
public void logintest() throws FileNotFoundException
{  
	loginpage.logintest(prop.getProperty("username"),prop.getProperty("password"));
	

}


@AfterMethod
public void teardown()
{
	
	driver.quit();
}
	
	
	
	

}
