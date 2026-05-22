package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class CrossBrowserTest {
	
	static WebDriver driver; //null

	public static void main(String[] args) {
		String browser="edge";
		
		switch(browser.toLowerCase().trim()) {
		case "chrome":
			driver=new ChromeDriver();
			break;
		case "firefox":
			driver=new FirefoxDriver();
			break;
		case  "edge":
			driver=new EdgeDriver();
			break;
		case "safari":
			driver=new SafariDriver();
			break;
			
			default:
				System.out.println("please pass the right browser.."+browser);
				throw new BrowserException("INVALID BROWSER");
		}
			
		}

	}
