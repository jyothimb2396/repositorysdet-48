package Interview;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Spicejetprogram
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://in.indeed.com/?r=us");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		Actions a = new Actions(driver);
		WebElement what = driver.findElement(By.id("text-input-what"));
		Thread.sleep(2000);
//		what.click();
		//a.click().sendKeys("qa");
		//a.moveToElement(what);
		a.moveToElement(what).click().sendKeys("qa").perform();
		Thread.sleep(2000);
//		WebElement where = driver.findElement(By.id("text-input-where"));
//		Thread.sleep(2000);
//		a.click().sendKeys("bangalore").build().perform();
//		Thread.sleep(2000);
		//a.moveToElement(findElement(By.xpath("//span[@aria-label='qa manual testing']"))).click().build().perform();
		WebElement ele = findElement(By.xpath("//span[@aria-label='qa manual testing']"));
		a.moveToElement(what).click().sendKeys(ele).perform();
		Thread.sleep(3000);
		
		
		
	}

	private static WebElement findElement(By xpath) {
		// TODO Auto-generated method stub
		return null;
	}

}
