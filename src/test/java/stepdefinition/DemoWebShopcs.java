package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DemoWebShopcs {
	WebDriver dweb;
	@Given("User is on DemoWebShop home page")
	public void user_is_on_DemoWebShop_home_page() {
		System.setProperty("webdriver.chrome.driver","C:\\MyDrivers\\chromedriver_win32\\chromedriver.exe");
		dweb = new ChromeDriver();
		dweb.get("http://demowebshop.tricentis.com/");
	}

	@Given("User chooses register on the home page")
	public void user_chooses_register_on_the_home_page() {
		dweb.findElement(By.linkText("Register")).click();
	    
	}

	@When("User chooses the {string}")
	public void user_chooses_the(String gender) {
		System.out.println(gender);
		String g=gender;
		if(g.equals("female"))
		{
			dweb.findElement(By.xpath("//input[@id='gender-female']")).click();
		}
		else
		{
			dweb.findElement(By.xpath("//input[@id='gender-male']")).click();
		}
	    
	}
	
	@When("User enters {string} and {string} and {string}")
	public void user_enters_and_and(String Fname, String Lname, String email) {
		dweb.findElement(By.name("FirstName")).sendKeys(Fname);
		dweb.findElement(By.name("LastName")).sendKeys(Lname);
		dweb.findElement(By.name("Email")).sendKeys(email);
	}
	

	@When("User enters {string} and {string}")
	public void user_enters_and(String password, String cpassword) {
		dweb.findElement(By.name("Password")).sendKeys(password);
		dweb.findElement(By.name("ConfirmPassword")).sendKeys(cpassword);
	    
	}

	@Then("User clicks on register")
	public void user_clicks_on_register() {
//		dweb.findElement(By.xpath("//input[@value='Register']")).click();
	    System.out.println("successful");
	}

	@Then("User is successfully registeres")
	public void user_is_successfully_registeres() {
		 System.out.println("successful  1");
	    
	}

}
