Feature: Create Declaration High Values
@SmokeTest
  Scenario: Create Declaration High Values
    Given I open "http://10.1.17.4:64382" website
    And I login using credentials "ktht060618@gmail.com" and "123456"
    And Closed Notify popup
    And Goto create declaration high value menu
    
    When Enter mandatory data for General Information
| Field1				                 			| Value1              								|
| Group type 										| Sản xuất, xuất khẩu								|
| Method Code	              						| Nhập kinh doanh sản xuất hàng hóa làm thủ tục		|
| Custom		 									| "01B1","Chi cục HQ CK Sân bay quốc tế Nội Bài" 	|
| Transport MethodCode		          				| Đường bộ (Xe tải)									|
| Organization Type									| Cá nhân gửi tổ chức								|

	And Enter mandatory data for Import and Export Information
 
| Field2				                 			| Value2              								|
| Exporter Name										| Đỗ Thị Quang										|
| Country Code										| "AD","Andorra"						        	|
	
	And Enter mandatory data for Bill Lading Information
| Field3				                 			| Value 3              	| Value 4 					|
| BillLading Data									| EN057732555VN			| EN057732556VN				|
| Number Seal										| 8 					| Thùng						|
| Total Weight										| 10 					| 							|
| Date Entry										| 07/02/2018			|							|
| Place Loading										| RAS TANURA			|							|
