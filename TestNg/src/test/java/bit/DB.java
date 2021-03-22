package bit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DB {
	WebDriver dr;
	@Test(dataProvider = "login")
	public void test2(Object user,Object pass) {
		System.out.println(user.toString());
		System.out.println(pass.toString());
		//dr.findElement(By.xpath("")).sendKeys(user);
		//dr.findElement(By.xpath("")).sendKeys(pass);
	}
	 @DataProvider(name="login")
   	public Object [][] getData(){
    	Object[][] o=new Object[2][2];
    	o[0][1]="user1";
    	o[0][1]="ds345";
    	o[1][0]="user2";
    	o[1][1]="u801";
    	return o;
     }
}
