package leavetestcases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import leavebase.TestBase;
import leavepages.Homepage;
import leavepages.Loginpage;
import leaveutility.TestUtil;


public class Homepagetest extends TestBase
{
	Loginpage loginpage;
	Homepage homepage;

	public Homepagetest() throws FileNotFoundException {
		super();
		
	}
	
	@BeforeMethod
	public void setup() throws FileNotFoundException
	{ 
		initialisation();
		loginpage = new Loginpage();
		homepage = loginpage.logintest(prop.getProperty("username"),prop.getProperty("password"));

	}
	@Test
	public void verifyhomepagetitletest()
	{
	String title= homepage.verifyhomepagetitle();
	assertEquals("STL(Sterling Tools Limited)","STL(Sterling Tools Limited)");
		
	}
	@Test
	public void verifyusernametest()
	{
		
	Assert.assertTrue("name matched",homepage.verifyusername());
	
	}
	

	
   @Test
	public void  clickapplyleavepagetest() throws FileNotFoundException
	{
	   
	   homepage.clickonsidebar();
	   driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	    
	   homepage.clickonleavemenu();
	   homepage.clickonapplyleavepage();
	   
		
		
	}
	
   
 @AfterMethod
   public void teardown()
   {
   	
  	driver.quit();
   }
   	
	
	
		
		
		
	

}
