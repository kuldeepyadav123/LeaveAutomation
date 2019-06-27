package leaveutility;
import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import leavebase.TestBase;
public class TestUtil extends TestBase {
	
	public TestUtil() throws FileNotFoundException {

	}

	public static void implicitwait() 
	{

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}





}
