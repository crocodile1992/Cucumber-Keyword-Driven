Feature: Create Declaration LowValues
  Scenario: Create Declaration Low Values
    Given I open "http://10.1.17.4:64382" website
    And I login using credentials "ktht060618@gmail.com" and "123456"
    And Closed Notify popup
    And Goto create declaration low value menu
    When Enter mandatory data to create Declaration LowValue

| Fields				                 			| Values              										|
| Organization Type 								| Tổ chức gửi tổ chức 										|
| Method Code	              						| Nhập kinh doanh tiêu dùng hàng hóa làm thủ tục			|
| Transport MethodCode		          				| Đường bộ													|
| Custom		 									| Chi cục HQ CK Sân bay quốc tế Nội Bài						|
| Website											| hafintech.com										        |
| Country Code										| Antigua & Barbuda							                |
| BillLading Data									| EN057732555VN												|
| Waiting Storage Place Code						| CTY TNHH ALIM HA NOI 										|
| Number Seal										| 5															|
| Total Weight										| 102														|
| Transportation Code								| Đường sông												|
| Date Entry										| 07/02/2018												|
| Place Loading										| RAS TANURA												|
| Place Unloading									| CT KIM THUY PHUC											|
| Total Price										| 452425													|
| Bill Currency Code								| Đô-la Hồng Kông											|
 
 Then Save Declaration