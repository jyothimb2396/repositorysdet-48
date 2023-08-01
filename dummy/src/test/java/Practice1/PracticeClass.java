package Practice1;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import GenericsBank.BaseclassUtility;
import GenericsBank.FileUtility;
import GenericsBank.Listenrutility;
@Listeners(Listenrutility.class)
public class PracticeClass extends BaseclassUtility {
	@Test
	public void script_() {
		
		FileUtility flib = new FileUtility();
		
		//faceloginpage fpag = new faceloginpage();
		//faceloginpage flog = new faceloginpage();
		driver.get("http://www.facebook.com/");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("hdfskjdx");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("daugshj");
		Assert.fail();
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
		
	}
	
	
	

}
