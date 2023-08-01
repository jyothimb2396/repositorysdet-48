package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class faceloginpage {
	
	@FindBy(xpath="//input[@id='email']") private WebElement usertext;
	@FindBy(xpath="//input[@id='pass']") private WebElement pawdtext;
	@FindBy(xpath="//button[@name='login']") private WebElement loginbtn;
	
	public faceloginpage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}

	public WebElement getUsertext() {
		return usertext;
	}

	public WebElement getPawdtext() {
		return pawdtext;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}
	


}
