Feature: Login to Haiquan & Hateco website
	In order to ensure Login Functionality works,
	I want to run the cucumber test to verify it is working


Scenario: Login Functionality
	Given	User navigates to haiquan.hafintech.com
	when	User logs in using Username as "hafintech_hq" and Password as "123456"
	Then 	Login should be successful


Scenario: Login Functionality
	Given	User navigates to kho.hafintech.com
	when	User logs in using Username as "hafintech_hq" and Password as "123456"
	Then 	Error message should be throw
