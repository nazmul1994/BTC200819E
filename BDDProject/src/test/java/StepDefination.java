import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefination {
	WebDriver dr;
	@Before//this two call cucumber husks
	public void start() {
		System.out.println("cxcute before every single scenario");
		}
	@After
	public void end() {
		System.out.println("cxcute after every single scenario");
	
	}
	
	@Before
	public void start1() {
		System.out.println("cxcute before every single scenario");
		}
	@After("@ui")
	public void end2() {
		System.out.println("cxcute after every single scenario");
	
	}
	@Given("^open browser$")
	public void open_browser() throws Throwable {
	   dr=new ChromeDriver();
	   
	}

	@Given("^nevigate to url$")
	public void nevigate_to_url() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    dr.get("http://www.facebook.com");
	}

	@When("^user type email in userTest box$")
	public void user_type_email_in_userTest_box() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   dr.findElement(By.id("email")).sendKeys("youremail");
	}

	@When("^user type password in userTest box$")
	public void user_type_password_in_userTest_box() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		dr.findElement(By.id("pASS")).sendKeys("yourpass");
	}

	@When("^user click login button$")
	public void user_click_login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	 dr.findElement(By.id("u_0_2")).click();;
	}

	@Then("^user should see his profile page$")
	public void user_should_see_his_profile_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	boolean r=	dr.findElement(By.id("logo")).isDisplayed();
		if(r) {
		System.out.println("logged in perfectly");
		}else
			System.out.println("not logged in");
	}
	@When("^user type user(\\d+) in userTest box$")
	public void user_type_user_in_userTest_box(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	

	@Then("^user should not see his profile page$")
	public void user_should_not_see_his_profile_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions


	}


	



}
