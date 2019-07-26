package leavetestcases;

import static org.testng.Assert.assertEquals;

import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import leavebase.TestBase;
import leavepages.Applyleavepage;
import leavepages.Homepage;
import leavepages.Loginpage;


public class Applyleavepagetest extends TestBase {
	Loginpage loginpage;
	Homepage homepage;
	Applyleavepage applyleave;

	public Applyleavepagetest() throws FileNotFoundException {
		super();
		

}
	@BeforeMethod
	public void setup1() throws FileNotFoundException
	{ 
		initialisation();
		loginpage = new Loginpage();
		applyleave = new Applyleavepage();
		homepage = loginpage.logintest(prop.getProperty("username"),prop.getProperty("password"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		homepage.clickonsidebar();
		homepage.clickonleavemenu();
		homepage.clickonapplyleavepage();
}
	
	@Test
	public boolean EmployeeNameTestonpageApplyLeavePage()
	{
		return applyleave.verifyemployeename();
		
		
		
	}
	
	@Test
	public boolean EmployeedeptNameTestOnApplyLeavePage()
	{
	return applyleave.verifyempdpt();
	
	
}
	
	@Test
	
	public boolean EmpDesgTestOnApplyLeavePage()
	
	{
		return applyleave.verifyempdesg();
		
		
	}
	
	@Test
	public void   SelectCasualLeave()
	{
		applyleave.selectleavetypecasual();
		Assert.assertEquals("Casual Leave", "Casual Leave");
		
	
		
	}
	
	@Test
	
	public void EnterDate()
	{   
		applyleave.enterstartdate();
		applyleave.enterenddate();
		applyleave.startduration();
		
     }
   
	
	@Test
	public void WriteDescriptionTest()
	{   
		applyleave.descriptionfill();
		
       Assert.assertEquals("Test", "Test", "description matched");
	}
	
	@Test
	public void verifymanangernametest()
	
	
	{
	 	applyleave.Tobeapprovedusername();
	   Assert.assertEquals("DLF-1984-Supriya Thankappan", "DLF-1984-Supriya Thankappan");
	}
	
	
	@Test
	 public void ApplyCasualLeave()
	 {
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		applyleave.selectleavetypecasual();
		
     	applyleave.enterstartdate();
		applyleave.enterenddate();
		applyleave.startduration();
		applyleave.descriptionfill();
		applyleave.totalleavescount();
		applyleave.clickonApplyButton();
		System.out.println("leave has been applied successfully");
		
		
		 }
	
	@AfterMethod
	   public void teardown1()
	   {
	   	
	  	driver.quit();
	   }
	   	
	
	
	}
