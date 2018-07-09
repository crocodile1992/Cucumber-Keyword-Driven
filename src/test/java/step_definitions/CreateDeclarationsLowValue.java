package step_definitions;

import java.io.IOException;
import java.util.List;
import java.util.Properties;
import helpers.ObjectRepository;

import modules.DeclarationLowValueModule;
import modules.SignInModule;
import org.openqa.selenium.WebDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateDeclarationsLowValue {
	public WebDriver driver;
	public Properties OR;

	public CreateDeclarationsLowValue() throws IOException {
		driver = Hooks.driver;
		OR = ObjectRepository.ObjectRepo(System.getProperty("user.dir") + "//src//test//resources//OR.properties");
	}

	@Given("^I open \"(.*?)\" website$")
	public void i_open_website(String arg1) throws Throwable {
		driver.get(arg1);
	}

	@And("^I login using credentials \"(.*?)\" and \"(.*?)\"$")
	public void i_login_using_credentials_and(String arg1, String arg2) throws Throwable {
		SignInModule.Execute(driver, OR, arg1, arg2);
	}

	// And Closed Notify popup
	@And("^Closed Notify popup$")
	public void close_notify_popup() throws Throwable {
		Thread.sleep(10000);
		System.out.println("I slept 6s");
		SignInModule.ClosePopup(driver, OR);
	}

	// And Goto create declaration menu
	@And("^Goto create declaration low value menu$")
	public void goto_create_declaration_lowvalu_menu() throws Throwable {
		DeclarationLowValueModule.OpenFrom(driver, OR);
	}

	// When Enter mandatory data to create Declaration LowValue
	@When("^Enter mandatory data to create Declaration LowValue$")
	public void enter_mandatory_data_to_create_declaration(DataTable declar) throws Throwable {
//		List<List<String>> data = declar.raw();
		DeclarationLowValueModule.InputData(driver, OR,declar);
		System.out.println("I input data table");
	}

	// Then Save Declaration
	@Then("^Save Declaration$")
	public void click_to_save_declaration_button() throws Throwable {
		DeclarationLowValueModule.Execute(driver, OR);
		System.out.println("I saved Declaration Successfully");
	}
}