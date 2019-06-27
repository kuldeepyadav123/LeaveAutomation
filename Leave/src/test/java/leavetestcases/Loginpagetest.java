package leavetestcases;

import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import leavebase.TestBase;
import leavepages.Loginpage;

public class Loginpagetest extends TestBase
{
	
Loginpage loginpage;
	
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

@Test(priority = 3)
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
