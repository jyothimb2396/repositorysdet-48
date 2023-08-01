package Interview;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Autosuggestivedropdown 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(2000);
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(3000);
		List<WebElement> opts = driver.findElements(By.xpath("//li[@class='ui-menu-item']"));
		for(WebElement opt:opts)
		{
			if (opt.getText().equalsIgnoreCase("India")) 
			{
				opt.click();
				break;
				
			}
			
		}
		Thread.sleep(3000);
		
		
		
		
		
		
	}
	

}
