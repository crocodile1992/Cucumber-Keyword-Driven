package modules;

import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.DataTable;
import obj.DeclarationHighValueObj;

public class DeclarationHighValueModule {
	public static void OpenFrom(WebDriver driver, Properties OR) throws Exception {
		// driver.findElement(By.linkText(OR.getProperty("signin_text"))).click();
		driver.findElement(By.xpath(OR.getProperty("bt_menu_declaration_manage"))).click();
		driver.findElement(By.xpath(OR.getProperty("bt_menu_declaration_highvalue"))).click();
	}

	public static void InputGeneralInformation(WebDriver driver, Properties OR, DataTable data) throws Exception {
		// Initialize data table
		List<List<String>> dt = data.raw();
		DeclarationHighValueObj obj = new DeclarationHighValueObj();
		// Ma loai hinh
		obj.setMethodCode(dt.get(2).get(1));
		obj.selectMethodCode(driver, OR);
		// Co quan hai quan
		obj.setCustomCode(dt.get(3).get(1));
		obj.selectCustomCode(driver, OR);
		// Ma phuong thuc van chuyen
		obj.setTransMethdCode(dt.get(4).get(1));
		obj.selectTransMethodCode(driver, OR);
		// Phan loai ca nhan to chuc
		obj.setOrgznTypeId(dt.get(5).get(1));
		obj.selectOrgznTypeId(driver, OR);
	}

	public static void InputImportandExportInformation(WebDriver driver, Properties OR, DataTable data)
			throws Exception {
		// Initialize data table
		List<List<String>> dt = data.raw();
		DeclarationHighValueObj obj = new DeclarationHighValueObj();
		// Ten Nguoi xuat khau
		obj.setExporterName(dt.get(1).get(1));
		obj.inputExporterName(driver, OR);
		// Ma nuoc Xuat khau
		obj.setExportCtryCode(dt.get(2).get(1));
		obj.selectExportCtryCode(driver, OR);
	}

	public static void InputBillLadingInformation(WebDriver driver, Properties OR, DataTable data) throws Exception {
		// Initialize data table
		List<List<String>> dt = data.raw();
		DeclarationHighValueObj obj = new DeclarationHighValueObj();
		// Van don 1
		obj.setBillLadingData(dt.get(1).get(1));
		obj.inputBillLadingData(driver, OR, OR.getProperty("txt_bill_lading_data_1_id"));

		// Van don 2
		obj.setBillLadingData(dt.get(1).get(2));
		obj.inputBillLadingData(driver, OR, OR.getProperty("txt_bill_lading_data_2_id"));
		// So luong kien
	}

}
