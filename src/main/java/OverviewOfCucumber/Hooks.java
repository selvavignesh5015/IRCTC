package OverviewOfCucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;



public class Hooks {
	
	public static String URL = "https://petstore.octoperf.com/actions/Catalog.action";
	public static WebDriver driver;
	public static  Actions act;
	public static WebDriverWait wait;
	
	@Before
	public static void start() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		act = new Actions(driver);
		
		driver.navigate().to(URL);
		
	}
	
	 @After
		public static void End() {
			 driver.quit();
		}
	
	
	

}
