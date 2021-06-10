@login
Feature: validate Techfios website login functionality 

Background: 
	Given User is on the techfioslogin page 
@logintest
Scenario Outline: User should be able to login with the valid credentials 
	When user enters the "<username>" and "<password>"    
    And user click on the signin button  
   Then User should land on the Dashboard page  
   
	Examples:
	|username         |password|
	|demo@techfios.com|abc123  |
	
	
	
	
