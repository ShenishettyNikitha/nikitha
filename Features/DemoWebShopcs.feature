Feature: Demo Web Shop Login
  Scenario Outline: Successfull registration
    Given User is on DemoWebShop home page
    And User chooses register on the home page
    When User chooses the "<gender>" 
    And User enters "<firstname>" and "<lastname>" and "<email>"
    And User enters "<password>" and "<confirmPassword>"
    Then User clicks on register
    And User is successfully registeres

    Examples: 
      |gender|firstname|lastname|email|password|confirmPassword|
      |female|tori| anderson | tori.anderson@gmail.com | torianderson | torianderson |
      |male| kura | adi | kura.adi@gmail.com | kuraadi | kuraadi |
