package Interview;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actionclassprogram 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(2000);
		Actions a = new Actions(driver);
		
		//mouse hover action on help,sign in majortab
		WebElement move = driver.findElement(By.id("nav-link-accountList"));
        Thread.sleep(3000);
        

        // to move to search text field and send "hello" in capital letter
        a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello");
        Thread.sleep(2000);
        
        //to perform right click action 
        a.moveToElement(move).contextClick().build().perform();
        Thread.sleep(2000);
        
		
		
	}

	

}
