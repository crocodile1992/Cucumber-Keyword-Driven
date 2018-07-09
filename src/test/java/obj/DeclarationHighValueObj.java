package obj;

import java.util.Properties;

import javax.management.DescriptorKey;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class DeclarationHighValueObj {

	private String tempDeclarId;
	private String methodCode;
	private String productCCodeID;
	private String customCode;
	private String orgznTypeId;
	private String declDateTime;
	private String processDeptId;
	private String reExportExpire;
	private String transMethdCode;
	private String importerCode;
	private String importerName;
	private String importAddress;
	private String importPhoneNo;
	private String deputyImptCode;
	private String deputyImptName;
	private String exporterCode;
	private String exporterName;
	private String exportZipCode;
	private String exportZipAddr;
	private String exportCtryCode;
	private String deputyExptCode;
	private String customsDclCode;
	private String billLadingData;
	private String numberSeal;
	private String sealUnitCode;
	private String totalWeight;
	private String weightUnitCode;
	private String waitStgPlcCode;
	private String numberPackage;
	private String transportCode;
	private String dateEntry;
	private String plUnloadingId;
	private String countryCode;
	private String containerCount;
	private String resultId;
	private String DocummentData;
	private String impLicenceData;
	private String invoiceTypeId;
	private String receivedInvNo;
	private String billNumber;
	private String dateReleased;
	private String methodPaid;
	private String invceValTypeId;
	private String ivvConditionId;
	private String totalPrice;
	private String blCurrencyCode;
	private String invoiceValueId;
	private String valReceivedNo;
	private String dclCurrcyCode;
	private String basicPrice;
	private String adjustmentData;
	private String transFeeCodeId;
	private String transCurcyCode;
	private String transFeeValue;
	private String insurFeeCodeId;
	private String insurCurcyCode;
	private String insurFeeValue;
	private String numberInsur;
	private String valueDclDetail;
	private String valueDistTotal;
	private String taxPayer;
	private String guarReasonId;
	private String colltBankId;
	private String colltDateIssue;
	private String colltLimDocSig;
	private String colltLimDocNo;
	private String taxExpirId;
	private String guarBankId;
	private String guarDateIssue;
	private String guarLimDocSig;
	private String guarLimDocNo;
	private String fileAttachs;
	private String invoiceAttID;
	private String invoiceAttCode;
	private String invoiceAttName;
	private String firstVISDate;
	private String departureDate;
	private String transInfoData;
	private String destTransPlace;
	private String contractNumber;
	private String contractDate;
	private String expiryDate;
	private String note;
	private String intenalBMNo;

	// set value for So to khai tam nhap tai xuat
	public void setTempDeclarId(String tempDeclarId) {
		this.tempDeclarId = tempDeclarId;
	}

	// input value to so to khai tam nhap tai xuat
	public void inputTempDeclarId(WebDriver driver, Properties OR) {
		driver.findElement(By.id(OR.getProperty("txt_temporary_declaration_code_id"))).sendKeys(tempDeclarId);
		;

	}

	// set value for Ma loai hinh
	public void setMethodCode(String methodCode) {
		this.methodCode = methodCode;
	}

	// select value for Ma loai hinh
	public void selectMethodCode(WebDriver driver, Properties OR) {
		Select dropbox = new Select(driver.findElement(By.id(OR.getProperty("db_method_code_id"))));
		dropbox.selectByVisibleText(methodCode);

	}

	// set value for Ma phan loai hang hoa
	public void setProductCCodeID(String productCCodeID) {
		this.productCCodeID = productCCodeID;
	}

	// select value for Ma phan loai hang hoa
	public void selectProductCCode(WebDriver driver, Properties OR) {
		Select dropbox = new Select(driver.findElement(By.id(OR.getProperty("db_product_classification_code_id"))));
		dropbox.selectByVisibleText(productCCodeID);

	}

	// set value for Co quan hai quan
	public void setCustomCode(String customcode) {
		this.customCode = customcode + ");\']";
	}

	// select value Co quan hai quan
	public void selectCustomCode(WebDriver driver, Properties OR) throws InterruptedException {
		driver.findElement(By.xpath(OR.getProperty("bt_db_custom_xpath"))).click();
		String xpath = OR.getProperty("sl_custom_code_xpath") + customCode;
		Thread.sleep(3000);
		driver.findElement(By.xpath(xpath)).click();

	}

	// set value for Phan loai ca nhan to chuc
	public void setOrgznTypeId(String orgznTypeId) {
		this.orgznTypeId = orgznTypeId;
	}

	// select value for Phan loai ca nhan to chuc
	public void selectOrgznTypeId(WebDriver driver, Properties OR) {
		Select dropbox = new Select(driver.findElement(By.id(OR.getProperty("db_organization_type_id"))));
		dropbox.selectByVisibleText(orgznTypeId);

	}

	public void setDeclDateTime(String declDateTime) {
		this.declDateTime = declDateTime;
	}

	public void setProcessDeptId(String processDeptId) {
		this.processDeptId = processDeptId;
	}

	public void setReExportExpire(String reExportExpire) {
		this.reExportExpire = reExportExpire;
	}

	public void setTransMethdCode(String transMethdCode) {
		this.transMethdCode = transMethdCode;
	}

	public void selectTransMethodCode(WebDriver driver, Properties OR) {
		Select dropbox = new Select(driver.findElement(By.id(OR.getProperty("db_transport_method_code_id"))));
		dropbox.selectByVisibleText(transMethdCode);

		// dropbox.selectByValue(productCCodeID);

	}

	public void setImporterCode(String importerCode) {
		this.importerCode = importerCode;
	}

	public void setImporterName(String importerName) {
		this.importerName = importerName;
	}

	public void setImportAddress(String importAddress) {
		this.importAddress = importAddress;
	}

	public void setImportPhoneNo(String importPhoneNo) {
		this.importPhoneNo = importPhoneNo;
	}

	public void setDeputyImptCode(String deputyImptCode) {
		this.deputyImptCode = deputyImptCode;
	}

	public void setDeputyImptName(String deputyImptName) {
		this.deputyImptName = deputyImptName;
	}

	public void setExporterCode(String exporterCode) {
		this.exporterCode = exporterCode;
	}

	// Ten nguoi xuat khau
	public void setExporterName(String exporterName) {

		this.exporterName = exporterName;
	}

	// input value for Ten nguoi xuat khau
	public void inputExporterName(WebDriver driver, Properties OR) {
		driver.findElement(By.id(OR.getProperty("txt_exporter_name_id"))).sendKeys(exporterName);

	}

	public void setExportZipCode(String exportZipCode) {
		this.exportZipCode = exportZipCode;
	}

	public void setExportZipAddr(String exportZipAddr) {
		this.exportZipAddr = exportZipAddr;
	}

	public void setExportCtryCode(String exportCtryCode) {
		this.exportCtryCode = exportCtryCode + ");\']";
	}

	public void selectExportCtryCode(WebDriver driver, Properties OR) throws InterruptedException {
		driver.findElement(By.xpath(OR.getProperty("bt_db_exportd_country_code_xpath"))).click();
		String xpath = OR.getProperty("bt_select_country_xpath") + exportCtryCode;
		Thread.sleep(3000);
		driver.findElement(By.xpath(xpath)).click();

	}

	public void setDeputyExptCode(String deputyExptCode) {
		this.deputyExptCode = deputyExptCode;
	}

	public void setCustomsDclCode(String customsDclCode) {
		this.customsDclCode = customsDclCode;
	}

	// set value for Van don
	public void setBillLadingData(String billLadingData) {
		this.billLadingData = billLadingData;
	}

	//
	public void inputBillLadingData(WebDriver driver, Properties OR, String id) {
		driver.findElement(By.id(id)).sendKeys(billLadingData);

	}

	public void setNumberSeal(String numberSeal) {
		this.numberSeal = numberSeal;
	}

	public void setSealUnitCode(String sealUnitCode) {
		this.sealUnitCode = sealUnitCode;
	}

	public void setTotalWeight(String totalWeight) {
		this.totalWeight = totalWeight;
	}

	public void setWeightUnitCode(String weightUnitCode) {
		this.weightUnitCode = weightUnitCode;
	}

	public void setWaitStgPlcCode(String waitStgPlcCode) {
		this.waitStgPlcCode = waitStgPlcCode;
	}

	public void setNumberPackage(String numberPackage) {
		this.numberPackage = numberPackage;
	}

	public void setTransportCode(String transportCode) {
		this.transportCode = transportCode;
	}

	public void setDateEntry(String dateEntry) {
		this.dateEntry = dateEntry;
	}

	public void setPlUnloadingId(String plUnloadingId) {
		this.plUnloadingId = plUnloadingId;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public void setContainerCount(String containerCount) {
		this.containerCount = containerCount;
	}

	public void setResultId(String resultId) {
		this.resultId = resultId;
	}

	public void setDocummentData(String docummentData) {
		DocummentData = docummentData;
	}

	public void setImpLicenceData(String impLicenceData) {
		this.impLicenceData = impLicenceData;
	}

	public void setInvoiceTypeId(String invoiceTypeId) {
		this.invoiceTypeId = invoiceTypeId;
	}

	public void setReceivedInvNo(String receivedInvNo) {
		this.receivedInvNo = receivedInvNo;
	}

	public void setBillNumber(String billNumber) {
		this.billNumber = billNumber;
	}

	public void setDateReleased(String dateReleased) {
		this.dateReleased = dateReleased;
	}

	public void setMethodPaid(String methodPaid) {
		this.methodPaid = methodPaid;
	}

	public void setInvceValTypeId(String invceValTypeId) {
		this.invceValTypeId = invceValTypeId;
	}

	public void setIvvConditionId(String ivvConditionId) {
		this.ivvConditionId = ivvConditionId;
	}

	public void setTotalPrice(String totalPrice) {
		this.totalPrice = totalPrice;
	}

	public void setBlCurrencyCode(String blCurrencyCode) {
		this.blCurrencyCode = blCurrencyCode;
	}

	public void setInvoiceValueId(String invoiceValueId) {
		this.invoiceValueId = invoiceValueId;
	}

	public void setValReceivedNo(String valReceivedNo) {
		this.valReceivedNo = valReceivedNo;
	}

	public void setDclCurrcyCode(String dclCurrcyCode) {
		this.dclCurrcyCode = dclCurrcyCode;
	}

	public void setBasicPrice(String basicPrice) {
		this.basicPrice = basicPrice;
	}

	public void setAdjustmentData(String adjustmentData) {
		this.adjustmentData = adjustmentData;
	}

	public void setTransFeeCodeId(String transFeeCodeId) {
		this.transFeeCodeId = transFeeCodeId;
	}

	public void setTransCurcyCode(String transCurcyCode) {
		this.transCurcyCode = transCurcyCode;
	}

	public void setTransFeeValue(String transFeeValue) {
		this.transFeeValue = transFeeValue;
	}

	public void setInsurFeeCodeId(String insurFeeCodeId) {
		this.insurFeeCodeId = insurFeeCodeId;
	}

	public void setInsurCurcyCode(String insurCurcyCode) {
		this.insurCurcyCode = insurCurcyCode;
	}

	public void setInsurFeeValue(String insurFeeValue) {
		this.insurFeeValue = insurFeeValue;
	}

	public void setNumberInsur(String numberInsur) {
		this.numberInsur = numberInsur;
	}

	public void setValueDclDetail(String valueDclDetail) {
		this.valueDclDetail = valueDclDetail;
	}

	public void setValueDistTotal(String valueDistTotal) {
		this.valueDistTotal = valueDistTotal;
	}

	public void setTaxPayer(String taxPayer) {
		this.taxPayer = taxPayer;
	}

	public void setGuarReasonId(String guarReasonId) {
		this.guarReasonId = guarReasonId;
	}

	public void setColltBankId(String colltBankId) {
		this.colltBankId = colltBankId;
	}

	public void setColltDateIssue(String colltDateIssue) {
		this.colltDateIssue = colltDateIssue;
	}

	public void setColltLimDocSig(String colltLimDocSig) {
		this.colltLimDocSig = colltLimDocSig;
	}

	public void setColltLimDocNo(String colltLimDocNo) {
		this.colltLimDocNo = colltLimDocNo;
	}

	public void setTaxExpirId(String taxExpirId) {
		this.taxExpirId = taxExpirId;
	}

	public void setGuarBankId(String guarBankId) {
		this.guarBankId = guarBankId;
	}

	public void setGuarDateIssue(String guarDateIssue) {
		this.guarDateIssue = guarDateIssue;
	}

	public void setGuarLimDocSig(String guarLimDocSig) {
		this.guarLimDocSig = guarLimDocSig;
	}

	public void setGuarLimDocNo(String guarLimDocNo) {
		this.guarLimDocNo = guarLimDocNo;
	}

	public void setFileAttachs(String fileAttachs) {
		this.fileAttachs = fileAttachs;
	}

	public void setInvoiceAttID(String invoiceAttID) {
		this.invoiceAttID = invoiceAttID;
	}

	public void setInvoiceAttCode(String invoiceAttCode) {
		this.invoiceAttCode = invoiceAttCode;
	}

	public void setInvoiceAttName(String invoiceAttName) {
		this.invoiceAttName = invoiceAttName;
	}

	public void setFirstVISDate(String firstVISDate) {
		this.firstVISDate = firstVISDate;
	}

	public void setDepartureDate(String departureDate) {
		this.departureDate = departureDate;
	}

	public void setTransInfoData(String transInfoData) {
		this.transInfoData = transInfoData;
	}

	public void setDestTransPlace(String destTransPlace) {
		this.destTransPlace = destTransPlace;
	}

	public void setContractNumber(String contractNumber) {
		this.contractNumber = contractNumber;
	}

	public void setContractDate(String contractDate) {
		this.contractDate = contractDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public void setIntenalBMNo(String intenalBMNo) {
		this.intenalBMNo = intenalBMNo;
	}

}
