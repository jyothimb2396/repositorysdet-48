package Interview;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class moneycontrol 
{
	public static void main(String[] args) throws InterruptedException 
	{
//		ChromeOptions op=new ChromeOptions();
//		op.addArguments("--disable-notifications");
//		WebDriver driver = new ChromeDriver(op);
//		driver.get("https://www.moneycontrol.com/promo/mc_interstitial_dfp.php?size=1280x540");
//		driver.manage().window().maximize();
//		
//		driver.findElement(By.xpath("//a[@href='https://www.moneycontrol.com']")).click();
//        
//		JavascriptExecutor js= (JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(0,900)");
		
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		
		driver .get("https://www.moneycontrol.com/");
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,800)");
		WebElement frm = driver.findElement(By.xpath("//iframe[@title='Indices Chart']"));
		driver.switchTo().frame(frm);
		//String text = frm.getText();
		//System.out.println(text);
		WebElement ele=driver.findElement(By.xpath("//*[name()='path' and @fill='#a8e1ee']"));
		int width = ele.getSize().getWidth();
		System.out.println(width);
		Actions a= new Actions(driver);
				//String wdth = ele.getCssValue("width");
				//System.out.println(wdth);
				for(int i=1;i<width;i++)
				{
				a.moveToElement(ele,i,0).perform();
				//a.moveToElement(ele, -i, i).perform();
				Thread.sleep(3000);
		String text=driver.findElement(By.xpath("//*[name()='g' and @class='highcharts-tooltip']/*[name()='text']")).getText();
		System.out.println(text);
				}
	}

}
