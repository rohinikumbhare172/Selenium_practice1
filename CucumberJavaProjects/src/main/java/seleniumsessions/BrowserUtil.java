package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserUtil {
	
	private WebDriver driver;
	/*
	@param browserName
	@return it returns the driver 
			*/
	public WebDriver initDriver(String browserName) {
		System.out.println("browser name:"+browserName);
		
		switch(browserName.toLowerCase().trim()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver =new FirefoxDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		case "safari":
			driver = new SafariDriver();
			break;
			default:
				System.out.println("Please choose right browser.."+browserName);
				throw new BrowserException("Invalid Browser");
		}
		return driver;
		}
	
	public void enterUrl(String url) {
		if(url== null) {
			throw new BrowserException("Invalid URL-URL can not be null");
			
		}
		if(url.indexOf("http")!=0) {
			throw new BrowserException("Invalid URL -http or https is missing in the url");
		}
		driver.get(url);
	}
	public String getPageTitle() {
		String title=driver.getTitle();
		System.out.println("PageTitle:" );
		return title;
	}

	public String getPageURL() {
		String url=driver.getCurrentUrl();
		System.out.println("Page url:"+url);
		return url;
		
	}
	public void quitBrowser() {
		driver.close();
	}

	
}
