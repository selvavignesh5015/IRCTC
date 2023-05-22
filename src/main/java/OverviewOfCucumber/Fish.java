package OverviewOfCucumber;

import org.openqa.selenium.By;
 

public class Fish {
	
	 
	
	public static void clickOnFish() {
		
		Hooks.driver.findElement(By.xpath("//div[@id='SidebarContent']//a[1]/img")).click();
	}
	
	public static void ProID() {
		
		Hooks.driver.findElement(By.xpath("//a[normalize-space()='FI-SW-01']")).click();
	}
	
	public static void addtocart() {
		Hooks.driver.findElement(By.xpath("//tbody/tr[2]/td[5]/a[1]")).click();
		
	}
	public static void proceedToCheckout() {
		
		Hooks.driver.findElement(By.xpath("//*[@id=\"Cart\"]/a")).click();
		
	}
	
	
	public static void ContinueBtn() {
		Hooks.driver.findElement(By.xpath("//input[@value='Continue']")).click();
	}
	
	public static void ConfirmBtn() {
		Hooks.driver.findElement(By.xpath("//a[text()='Confirm']")).click();
	}
	

}
