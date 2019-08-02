package leaveutility;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.WorkbookUtil;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;

import leavebase.TestBase;
public class TestUtil extends TestBase {
	
	public static final String TESTDATA_SHEET_PATH = ".//Testdata//logintestdata.xlsx";


	static Workbook book;
	static Sheet sheet;


	public TestUtil() throws FileNotFoundException {

	}

	public static void implicitwait() 
	{

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}

	
	
	
	
	
	
	
	
	
	
	public static Object[][] getTestData(String sheetName) {
		FileInputStream file = null;
		try {
			file = new FileInputStream(TESTDATA_SHEET_PATH);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			book = WorkbookFactory.create(file);
		} catch (InvalidFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		org.apache.poi.ss.usermodel.Sheet sheet = book.getSheet(sheetName);
		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		// System.out.println(sheet.getLastRowNum() + "--------" +
		// sheet.getRow(0).getLastCellNum());
		for (int i = 0; i < sheet.getLastRowNum(); i++) {
			for (int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) {
				data[i][k] = sheet.getRow(i + 1).getCell(k).toString();
				// System.out.println(data[i][k]);
			}
		}
		return data;

	}


public static  Object[][] testDataGenerator() throws IOException
{
	FileInputStream file = new FileInputStream(".//TestData//logintestdata.xlsx");
	XSSFWorkbook workbook = new XSSFWorkbook(file);
	XSSFSheet loginsheet = workbook.getSheet("login");
	int numberofData = loginsheet.getPhysicalNumberOfRows();
	Object[][] testdata = new Object[numberofData][2];
	
	for (int i=0;i<numberofData;i++)
		
	{
		XSSFRow row = loginsheet.getRow(i);
	    XSSFCell username = row.getCell(0);
	    XSSFCell password = row.getCell(1);
	    testdata [i][0]=username.getStringCellValue();
	    testdata [i][1]= password.getStringCellValue();
	    
	}
	return testdata;
}

public static void takeScreenshotAtEndOfTest() throws IOException {
	File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	String currentDir = System.getProperty("user.dir");
	FileUtils.copyFile(scrFile, new File(currentDir + "/screenshots/" + System.currentTimeMillis() + ".png"));
}


}





