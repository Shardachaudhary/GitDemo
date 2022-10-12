package Utils;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchURL {
public WebDriver driver;
	
	public WebDriver WebDriverManager() throws IOException
	{	
		
		System.out.println("this is inside URL");
		if(driver == null)
		{	
		System.setProperty("webdriver.chrome.driver","D:\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		//driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		}
			
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");	
		return driver;		
	}
}
