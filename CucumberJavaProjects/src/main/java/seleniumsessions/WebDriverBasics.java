package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		
		WebDriver d=new ChromeDriver();
		d.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		d.manage().window().maximize();
		String title = d.getTitle();
		System.out.println("title=" +title);
		d.findElement(By.id("123")).sendKeys(args);
		//verification point/checkpoint/assertion: exp vs act
		if(title.equals("Account Login")) {
			System.out.println("title is correct");
		}
		
		else {
			System.out.println("Title is incorrect");
		}
			
		System.out.println("Title loop executed successfully");
		//Automation Steps + verification(assertions) = Automation Testing
		
		String url= d.getCurrentUrl();
		System.out.println("url:" +url);
		
		if(url.contains("account/login")) {
			System.out.println("url is correct --Pass");
		}else {
			System.out.println("url is not correct --FAIL");
		}
		
		System.out.println("url extracted successfully");
		d.quit();
		
		System.out.println("Browser closed successfully");

	}

}
