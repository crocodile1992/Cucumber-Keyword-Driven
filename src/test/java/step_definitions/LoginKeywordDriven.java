package step_definitions;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helpers.ObjectRepository;
import modules.LoginModule;

public class LoginKeywordDriven {
	public WebDriver driver;
	public Properties OR;

	public LoginKeywordDriven() throws IOException {
		driver = Hooks.driver;
		OR = ObjectRepository.ObjectRepo(System.getProperty("user.dir") + "//src//test//resources//OR.properties");

	}

	// When I go to link http://10.1.17.4:64382/
	@When("^I go to link \"(.*?)\"$")
	public void i_open_website(String arg1) throws Throwable {
		driver.get(arg1);
	}

	// Then Input Username as "ktht060618" and Password as "123456"
	@Then("^Input Username as \"(.*?)\" and Password as \"(.*?)\"$")
	public void i_login_using_credentials_and(String arg1, String arg2) throws Throwable {
		LoginModule.Execute(driver, OR, arg1, arg2);
	}

}
