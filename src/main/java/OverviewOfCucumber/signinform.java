package OverviewOfCucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class signinform  {
	
	 
	
	 public static  void button() {
		WebElement signinbutton = Hooks.driver.findElement(By.xpath("//a[text()='Sign In']"));
		signinbutton.click();
		 
	 }
	 
	 public static void  login(String uname) {
		WebElement username = Hooks.driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys(uname); 
	 }
	 
	 public static void loginbutton() {
		 WebElement clickbtn = Hooks.driver.findElement(By.name("signon"));
		 clickbtn.click();
	 }

}
