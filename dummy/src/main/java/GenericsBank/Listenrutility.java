package GenericsBank;

import java.io.File;
import java.time.LocalDate;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listenrutility  implements ITestListener
{

	
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
	
	}


	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub

	}


	public void onTestFailure(ITestResult result) {
		String test = result.getMethod().getMethodName();
		TakesScreenshot tss = (TakesScreenshot) BaseclassUtility.driver;
		LocalDateTime ldate = LocalDateTime.now();
		String currentDate = ldate.toString().replaceAll(":", "_");
		File src = tss.getScreenshotAs(OutputType.FILE);
		File dest=new File("screenshot/"+test+""+currentDate+""+".png");
		try {
			FileUtils.copyFile(src, dest);
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
	}



	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	}


	public void onTestFailedWithTimeout(ITestResult result) {
		
	}


	public void onStart(ITestContext context) {
	
	}

	
	public void onFinish(ITestContext context) {
		
	}
	

}
