package Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
 
import java.util.Properties;

 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static String URL = "https://www.speedtest.net/";
	public static WebDriver driver;
	public static  Actions act;
	public static WebDriverWait wait;
	public static String chromeDriverPath ="/Users/SE20464095/Downloads/chromedriver_mac_arm64/chromedriver";
     
	@BeforeTest
	public static void start() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		act = new Actions(driver);
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		
		// To maximize the window

		// driver.manage().window().maximize();

		// explicit
		//wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		
		//Implicit wait
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		driver.navigate().to(URL);
		//driver.get("https://www.google.com");

	}
	
    @AfterTest
	public static void End() {
		 driver.quit();
	}
    public static String GetDataFromPropFile(String key) throws IOException {

		// location
		String LocationFile = "/Users/SE20464095/eclipse-workspace/Guru99/src/main/java/parameterization/PropFile.properties";

		// passing string location to the File class
		File fileCon = new File(LocationFile);

		// Reading the data inside the file
		FileInputStream fis = new FileInputStream(fileCon);

		// creating property object and loads the properties data
		Properties pro = new Properties();
		pro.load(fis);

		String data = pro.getProperty(key);
		
		return data;
		

	}
    
    
     

}
