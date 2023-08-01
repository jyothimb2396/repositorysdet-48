package Pract1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class demo123 {

	public static void main(String[] args) throws Throwable 
	{
		// TODO Auto-generated method stub
		
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(opt);
		driver.get("https://www.moneycontrol.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//a[@href='https://www.moneycontrol.com']")).click();
		//Thread.sleep(3000);
		//driver.findElement(By.xpath("//button[text()='No thanks']")).click();
		//System.out.println("pop up handle successfully");
		
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	
		WebElement frame=driver.findElement(By.xpath("//iframe[@title='Indices Chart']"));
		driver.switchTo().frame(frame);
		WebElement element=driver.findElement(By.xpath("//*[name()='path'and @fill='#a8e1ee']"));
				Actions a=new Actions(driver);
		for(int i=1;i<10;i++)
		{
			
			a.moveToElement(element,i,i+1).perform();
		WebElement tt = driver.findElement(By.xpath("//*[name()='div'and @id='highcharts-0']//descendant::*[name()='g' and @class='highcharts-tooltip']/*[name()='text']"));
	       System.out.println(tt.getText());
		}
	}

}
