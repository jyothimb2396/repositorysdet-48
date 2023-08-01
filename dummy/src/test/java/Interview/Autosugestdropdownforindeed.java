package Interview;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Autosugestdropdownforindeed 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.get("https://in.indeed.com/?r=us");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder='Job title, keywords, or company']")).sendKeys("qa");
		Thread.sleep(3000);
		List<WebElement> opts = driver.findElements(By.xpath("//li[@role='option']"));
		for (WebElement opt : opts) 
		{
			if(opt.getText().equalsIgnoreCase("qa manual testing"))
			{
				opt.click();
				break;
			}
			
		}
		Thread.sleep(3000);
		
		
	}

}
