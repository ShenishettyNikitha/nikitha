Feature: DemoWorkShop add to cart
@invalid
  Scenario: invalid add to cart
    Given Alex is on Demoworkshop home page
    When alex searches for headphones
    And alex click on search
  	When alex clicks on shopping cart
    Then ales see his Shopping Cart is empty!
 @valid
 Scenario: Adding into cart is valid
	 	Given Alex is again on Demoworkshop home page
 		When alex searches for computer
		And he clicks on search
 		When alex selects a product and adds it into cart
		And Alex click on shopping cart again
 		Then he finds the product in the cart