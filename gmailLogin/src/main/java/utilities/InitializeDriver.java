package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class InitializeDriver {
	
	public static WebDriver driver;
		

public static WebDriver openBrowser(String browser){
	
	switch(browser){
	
	case "firefox":
	{
		driver=new FirefoxDriver();
		break;
	}
	
	case "Chrome":
	{
		driver=new ChromeDriver();
		break;
	}
	
	case "ie":
	{
		driver=new InternetExplorerDriver();
		break;
	}
	
	}
	return driver;
}

}

