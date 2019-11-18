#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@Regresion
Feature: Se realiza diligenciamiento de campos del formulario Form validation

  @CasoExitoso
  Scenario: Diligenciamento exitoso del formulario popup validation no se presenta algun
  					mensaje de validation 
  					
    Given Atentico en colorlib con usuario "demo" y contraseña "demo"
    And ingreso a la funcionalidad forms validation 
    When Diligencioformulario Popup validation
   
    | Required | Select | MultipleS1 | MultipleS1 |Url                  | Email       | Password1 | Password2 | Minsize | Maxsize | Number | IP          | Date       | Date Earlier |
		| choucair | Golf   | Tennis     | Football   |http://lcortes.com   | allal@cortes.com  | 12345     | 12345     | 123456  | 123456  | 99.99  | 200.200.5.4 | 2018-01-22 | 2012-09-12   |  
    
    Then verifico ingreso exitoso  
   
 
