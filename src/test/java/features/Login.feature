@Login
Feature: Techfios automation page set background color button functionality

Background:
     Given I am on techfios automation page      
       
     
@Scenario1
 Scenario: check setskyblue color buttons 
       Given Set Sky Blue Background button exist 
       When I click on button 
      Then background color will change to sky blue
        

@Senarion2
 Scenario:  check set white color button 
       Given Set White Background button exist       
      When User clicks on the button 
      Then The background color will change to white
        
