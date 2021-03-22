package com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class smoketest {
  WebDriver dr;
	 @Test(groups= {"smoke"})
	  public void buyshart() {
		 System.out.println("test1");
		 dr=new FirefoxDriver();
	  }
	 @Test(groups= {"unit"})
	  public void buyjence() {
		 System.out.println("test1");
	dr=new ChromeDriver();
	 }
}
	
/*	 @Test
	  public void login() {
		 System.out.println("login");
		 
		 
	 }
	 @Test
	  public void logout() {
		 System.out.println("logout");
	 }
	 @Parameters({"browser"})
	 @Test
	  public void openbrowser(String b) {
		 System.out.println("b");
		 if (b.equals("firefox")) {
			 System.out.println("open firefox");
			
		}else if(b.equals("chrome")) {
			System.out.println("open chrome");
	 }
		 
	 }} 
		 
		 */
		 
