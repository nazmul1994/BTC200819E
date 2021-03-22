package Com.bit.test;



import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class EndToEndStepDefinetion {
	WebDriver driver;
	@Given("^Open Browser$")
	public void open_Browser(DataTable arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		List<List<String>>browsers=arg1.raw();
		String browser=browsers.get(0).get(0);
	if (browser.equals("chrom")) {
		driver=new ChromeDriver();
	}else if (browser.equals("firefox")) {
		driver=new FirefoxDriver();
	}
		
	    throw new PendingException();
	}

	@Given("^Nevigate to URL$")
	public void nevigate_to_URL() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.get("Http://www.express.com");
	    throw new PendingException();
	}

	@When("^user click in MenMenu$")
	public void user_click_in_MenMenu() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.id("value of men link")).click();
		throw new PendingException();
	}

	@When("^user click in ShirtOption$")
	public void user_click_in_ShirtOption() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 driver.findElement(By.id("value ofshirt option")).click();
		throw new PendingException();
	}

	@When("^user select first product$")
	public void user_select_first_product() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 driver.findElement(By.id("value of first link")).click();
		throw new PendingException();
	}

	@When("^user Select acolor and size$")
	public void user_Select_acolor_and_size(DataTable arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
	   List<Map<String,String>>values= arg1.asMaps(String.class, String.class);
	   throw new PendingException();
	}

	@When("^user add product into the cart$")
	public void user_add_product_into_the_cart() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^user proced for checkout$")
	public void user_proced_for_checkout() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}



}
