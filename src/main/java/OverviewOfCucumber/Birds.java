package OverviewOfCucumber;

import org.openqa.selenium.By;
 
public class Birds {
 
	
public static void clickOnBird() {
		
		Hooks.driver.findElement(By.xpath("//div[@id='SidebarContent']//a[5]/img")).click();
		
	}
	
	public static void ProID() {
		Hooks.driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a")).click();
	}
	
	public static void addtocart() {
		Hooks.driver.findElement(By.xpath("//a[@class='Button']")).click();
		
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
