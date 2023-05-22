package Commonactions;

import org.openqa.selenium.By;

import Base.BaseClass;

public class HomepageActions extends BaseClass {
	
   //Locators
	  String FromInputField  =  "//input[@class='ng-tns-c57-8 ui-inputtext "
	  		+ "ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted']";
	  String ToInputField = "//input[@class='ng-tns-c57-9 ui-inputtext ui-widget ui-state-default"
	  		+ " ui-corner-all ui-autocomplete-input ng-star-inserted']";
	
	 String Date = "//input[@class='ng-tns-c58-10 ui-inputtext ui-widget ui-state-default ui-corner-all ng-star-inserted']";
	
	//Methods
	public  void clickFromInputField()
	{
		driver.findElement(By.xpath(FromInputField));
		 
	}
	public void clickToInputField()
	{
		driver.findElement(By.xpath(ToInputField));
	}
	
	public void  clickToData() {
		driver.findElement(By.xpath(Date));
	}
	
}
