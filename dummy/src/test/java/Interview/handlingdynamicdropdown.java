package Interview;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class handlingdynamicdropdown 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions opt=new ChromeOptions();
//		opt.addArguments("--start-maximized");
//		opt.addArguments("--incognito");
//		opt.addArguments("--headless");
		WebDriver driver = new ChromeDriver(opt);
		System.out.println("jyothi");
		
		
//		driver.get("https://corporate.spicejet.com/Default.aspx");
//		driver.manage().window().maximize();
//		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//a[@value='BLR']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']/descendant::a[@value='MAA']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']/descendant::a[.='28']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.id("ctl00_mainContent_view_date2")).click();
//		driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']/descendant::a[.='4']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//div[.='1 Adult']")).click();
//		WebElement dropdown = driver.findElement(By.id("ctl00_mainContent_ddl_Adult"));
//		Thread.sleep(2000);
//		dropdown.click();
//		Select s = new Select(dropdown);
//		Thread.sleep(2000);
//		WebElement ddp = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
//		ddp.click();
//		Thread.sleep(2000);
//		s.selectByVisibleText("INR");
//		s.selectByVisibleText("5");
		
		
		
	}

}
