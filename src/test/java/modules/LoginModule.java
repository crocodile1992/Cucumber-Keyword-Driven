package modules;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginModule {
	public static void Execute(WebDriver driver, Properties OR, String username, String password) throws Exception {
		// driver.findElement(By.id(OR.getProperty("u"))).click();
		driver.findElement(By.id(OR.getProperty("username_id"))).sendKeys(username);
		driver.findElement(By.id(OR.getProperty("password_id"))).sendKeys(password);
		driver.findElement(By.xpath(OR.getProperty("login_xpath"))).click();
	}
}
