package leavebase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase 
{
	
public static WebDriver driver;
public static Properties prop;

public TestBase() throws FileNotFoundException
{
	
	
try
{
		prop = new Properties();
        FileInputStream file = new FileInputStream("C:\\Users\\Kuldeep Yadav\\git\\LeaveAutomation\\Leave\\src\\main\\java\\leaveconfig\\config.properties");
        prop.load(file);
	}
	
	catch(FileNotFoundException e)
	{
		e.printStackTrace();
	}
	catch(IOException e)
	{
		e.printStackTrace();
	
	}



		
}

 public static void initialisation()
 
 {
	String browsername = prop.getProperty("browser");
	if(browsername.equals("chrome"))
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kuldeep Yadav\\git\\LeaveAutomation\\Leave\\Driver\\chromedriver.exe");
	driver = new ChromeDriver();
 }
	
	else if(browsername.equals("firefox"))
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Kuldeep Yadav\\git\\LeaveAutomation\\Leave\\Driver\\geckodriver.exe");
		driver = new FirefoxDriver();
	}
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get(prop.getProperty("url"));
	
}
	
	
	
	
	

}
