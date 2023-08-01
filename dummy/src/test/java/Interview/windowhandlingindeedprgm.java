package Interview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandlingindeedprgm 
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://in.indeed.com/?r=us");
		driver.findElement(By.id("EmployersPostJob")).click();
		
	}

}
