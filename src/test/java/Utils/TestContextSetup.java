package Utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import PageObject.PageObjectManager;

public class TestContextSetup {
	public WebDriver driver;
	public String landingPageProductName;
	public PageObjectManager pageObjectManager;
	public LaunchURL launch;
	public GenericUtils genericUtils;

	
	public TestContextSetup() throws IOException
	{
		launch = new LaunchURL();
		pageObjectManager = new PageObjectManager(launch.WebDriverManager());
		genericUtils = new GenericUtils(launch.WebDriverManager());
	}
}
