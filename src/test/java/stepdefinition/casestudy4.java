package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class casestudy4 {
	WebDriver dweb;
	@Given("Alex is on Demoworkshop home page")
	public void alex_is_on_Demoworkshop_home_page() {
		System.setProperty("webdriver.chrome.driver","C:\\MyDrivers\\chromedriver_win32\\chromedriver.exe");
		dweb = new ChromeDriver();
		dweb.get("http://demowebshop.tricentis.com/");
	
	}

	@When("alex searches for headphones")
	public void alex_searches_for_headphones() {
		dweb.findElement(By.xpath("//input[@value='Search store']")).sendKeys("computer");
	    
	}

	@When("alex click on search")
	public void alex_click_on_search() {
		dweb.findElement(By.xpath("//input[@value='Search']")).click();
	    
	}

	@When("alex clicks on shopping cart")
	public void alex_clicks_on_shopping_cart() {
	dweb.findElement(By.linkText("Shopping cart")).click();
	    
	}

	@Then("ales see his Shopping Cart is empty!")
	public void ales_see_his_Shopping_Cart_is_empty() {
		String a="Your Shopping Cart is empty!";
	    String e=dweb.findElement(By.className("order-summary-content")).getText();
	    Assert.assertEquals(e,a);
	    System.out.println("Your Shopping Cart is empty!");
	}
	
	@Given("Alex is again on Demoworkshop home page")
	public void alex_is_again_on_Demoworkshop_home_page() {
		System.setProperty("webdriver.chrome.driver","C:\\MyDrivers\\chromedriver_win32\\chromedriver.exe");
		dweb = new ChromeDriver();
		dweb.get("http://demowebshop.tricentis.com/");
	}

	@When("alex searches for computer")
	public void alex_searches_for_computer() {
		dweb.findElement(By.xpath("//input[@value='Search store']")).sendKeys("computer");
	}

	@When("he clicks on search")
	public void he_clicks_on_search() {
		dweb.findElement(By.xpath("//input[@value='Search']")).click();
	}

	@When("alex selects a product and adds it into cart")
	public void alex_selects_a_product_and_adds_it_into_cart() {
	 dweb.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[3]/div[1]/div[1]/div/div[2]/div[3]/div[2]/input")).click();
	 dweb.findElement(By.xpath("//input[@data-productid='74']")).click();
	}

	@When("Alex click on shopping cart again")
	public void alex_click_on_shopping_cart_again() {
		dweb.findElement(By.linkText("Shopping cart")).click();
	}

	@Then("he finds the product in the cart")
	public void he_finds_the_product_in_the_cart() {
		Assert(dweb.findElement(By.name("checkout")).isEnabled());
	    System.out.println("gcfju");
	}

	private void Assert(boolean enabled) {
		// TODO Auto-generated method stub
		
	}


}
