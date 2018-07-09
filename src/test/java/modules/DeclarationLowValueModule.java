package modules;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.DataTable;

public class DeclarationLowValueModule {
	public static void OpenFrom(WebDriver driver, Properties OR) throws Exception {
		// driver.findElement(By.linkText(OR.getProperty("signin_text"))).click();
		driver.findElement(By.xpath(OR.getProperty("bt_menu_declaration_manage"))).click();
		driver.findElement(By.xpath(OR.getProperty("bt_menu_declaration_lowvalue"))).click();
	}


	public static void InputData(WebDriver driver, Properties OR, DataTable data) throws Exception {
		// driver.findElement(By.linkText(OR.getProperty("signin_text"))).click();
		// driver.findElement(By.xpath(OR.getProperty("save_declaration_lowvalue_button"))).click();
		// driver.findElement(By.xpath(OR.getProperty("menu_declaration_lowvalue"))).click();
	}

	public static void Execute(WebDriver driver, Properties OR) throws Exception {
		// driver.findElement(By.linkText(OR.getProperty("signin_text"))).click();
		driver.findElement(By.xpath(OR.getProperty("bt_save_declaration_lowvalue_button"))).click();
		// driver.findElement(By.xpath(OR.getProperty("menu_declaration_lowvalue"))).click();
	}
}
