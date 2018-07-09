package step_definitions;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import helpers.ObjectRepository;
import modules.DeclarationHighValueModule;
import modules.DeclarationLowValueModule;

public class CreateDeclarationsHighValue {
	public WebDriver driver;
	public Properties OR;

	public CreateDeclarationsHighValue() throws IOException {
		driver = Hooks.driver;
		OR = ObjectRepository.ObjectRepo(System.getProperty("user.dir") + "//src//test//resources//OR.properties");
	}

	// And Goto create declaration menu
	@And("^Goto create declaration high value menu$")
	public void goto_create_declaration_lowvalu_menu() throws Throwable {
		DeclarationHighValueModule.OpenFrom(driver, OR);
	}

	// When Enter mandatory data for General Information
	@When("^Enter mandatory data for General Information$")
	public void enter_mandatory_data_for_general_information(DataTable declar) throws Throwable {
		// List<List<String>> data = declar.raw();
		DeclarationHighValueModule.InputGeneralInformation(driver, OR, declar);
//		System.out.println("I input data table");
	}

	// And Enter mandatory data for Import and Export Information
	@And("^Enter mandatory data for Import and Export Information$")
	public void enter_mandatory_data_for_import_and_export_information(DataTable declar) throws Throwable {
		// List<List<String>> data = declar.raw();
		DeclarationHighValueModule.InputImportandExportInformation(driver, OR, declar);
		System.out.println("I input data table");
	}

	// And Enter mandatory data for Bill Lading Information
	@And("^Enter mandatory data for Bill Lading Information$")
	public void enter_mandatory_data_for_bill_lading_information(DataTable declar) throws Throwable {
		// List<List<String>> data = declar.raw();
		DeclarationHighValueModule.InputBillLadingInformation(driver, OR, declar);
		System.out.println("I input data table");
	}
}
