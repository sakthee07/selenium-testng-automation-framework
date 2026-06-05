package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.WaitUntils;

public class LoginPage {
	
	WebDriver driver;
	
	
	
	By userName = By.name("username");
	By passWord = By.name("password");
	By buttonClick = By.xpath("//button[text()=' Login ']");
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//Action
	
	public void enterUserName(String user) {
		WaitUntils.waitForElementVisible(driver, userName).sendKeys("user");
		//driver.findElement(userName).sendKeys(user);
	}
	
	public void enterPassWord(String pwd) {
		
		WaitUntils.waitForElementVisible(driver, passWord).sendKeys(pwd);
		//driver.findElement(passWord).sendKeys(pwd);
	}
	public void clickTheButton() {
		
		WaitUntils.waitForElementClickable(driver, buttonClick);
		//driver.findElement(buttonClick).click();
	}
	

}
