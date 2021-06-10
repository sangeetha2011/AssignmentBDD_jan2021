@NewAccount
Feature: Techfios bank and cash New Account Functionality

Background:
	Given User is on the techfios login page 
	

Scenario Outline: User should be able to login with valid credentials and open a new account
 	
	When user enter the "<username>" and "<password>"      
	And user clicks on the signin button    
   When user should land on Dashboard page  
	Then User clicks on bank and cash   
	When User clicks on new account  
	When User fill up the form entering "<accountTitle>"and"<description>"and"<initialBalance>"and"<accountNumber>"and"<contactPerson>"and"<phone>"and"<internetBankingUrl>"and clicks submit 
	Then User should be able to see validate 
	Examples:
  |username         |password|	|accountTitle|description|initialBalance|accountNumber|contactPerson|phone|internetBankingUrl|
  |demo@techfios.com|abc123  |  |Savings Account|opening New Account|$50,000|172843|john|263848|www.bofa.com|
   
	