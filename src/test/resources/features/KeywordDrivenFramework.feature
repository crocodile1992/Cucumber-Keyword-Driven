Feature: Login to Nevs website
Scenario: Login Functionality
	When	I go to link http://10.1.17.4:64382/
	Then	Input Username as "ktht060618@gmail.com" and Password as "123456"
	