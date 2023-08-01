package Interview;

import java.time.Duration;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.netty.handler.timeout.TimeoutException;

public class Handlingwindows
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions opt = new ChromeOptions();
		
//		opt.addArguments("--start-maximized");
//		opt.addArguments("--disable-notification");
//		opt.addArguments("--incognito");
//		opt.addArguments("--headless");
		
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
//		Thread.sleep(-2000);
//		driver.manage().window().minimize();
//		Thread.sleep(2000);
//		//driver.manage().window().fullscreen();
//		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(8));
//		driver.get("https://www.facebook.com");
		
		
//		Wait< WebDriver>w=new FluentWait<WebDriver>(driver)
//				.withTimeout(Duration.ofSeconds(3))
//				.pollingEvery(Duration.ofSeconds(3))
//				.ignoring(NoSuchElementException.class);
//		w.until(ExpectedConditions.alertIsPresent());
//		WebElement ele=w.until(new Function<WebDriver, WebElement>() 
//		{
//			public WebElement apply(WebDriver driver) 
//			{
//				return driver.findElement(By.xpath(""));
//			}
//			
//		});
//		Thread.sleep(2000);
//		driver.manage().window().fullscreen();
//		Thread.sleep(2000);
		
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Top Deals']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Free Access to InterviewQues/ResumeAssistance/Material']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Flight Booking']")).click();
		Thread.sleep(2000);
		//fetch all ids and url
		
		/*Set<String> ids = driver.getWindowHandles();
		for (String id : ids) 
		{
			driver.switchTo().window(id);
			String currentUrl = driver.getCurrentUrl();
			System.out.println(currentUrl);
			System.out.println(id);
			
		}*/
		
		//fetch only parent id
		
		/*String pid = driver.getWindowHandle();
		System.out.println(pid);
		String pidcurrentUrl = driver.getCurrentUrl();
		System.out.println(pidcurrentUrl);
		Thread.sleep(2000);*/
		
		
		//multiple windows are open but i want to close only 1 child browser       vimp******
		/*Set<String> ids = driver.getWindowHandles();
		for (String id : ids) 
		{
			driver.switchTo().window(id);
			String currentUrl = driver.getCurrentUrl();
			if (currentUrl.equals("https://rahulshettyacademy.com/documents-request"))
			{
				driver.close();
			}
			else
			{
				System.out.println(" this window is not present");
			}
			
		}*/
		
		
		//close only parent window
		
		/*String pid = driver.getWindowHandle();
		Set<String> ids = driver.getWindowHandles();
		for (String id : ids) 
		{
			driver.switchTo().window(id);
			if(id.equals(pid))
			{
				driver.close();
			}
			else
			{
				System.out.println("no");
			}
				
			
		}*/
		
		
		
		//close only child windows
		/*String pid = driver.getWindowHandle();
		Set<String> ids = driver.getWindowHandles();
		ids.remove(pid);
		for (String id : ids)
		{
			driver.switchTo().window(id);
			driver.close();
			
		}*/
		
		
		//switch from 1st window 4rth window
		
		Set<String> ids = driver.getWindowHandles();
		Thread.sleep(2000);
		int count = ids.size();
		System.out.println(count);
		Thread.sleep(2000);
		ArrayList<String> l = new ArrayList<String>(ids);
		String id1 = l.get(0);
		String id4 = l.get(3);
		driver.switchTo().window(id1);
		Thread.sleep(2000);
		driver.switchTo().window(id4);
		
		
		
		
		
		
		Thread.sleep(2000);
		
		
	}
	

}
