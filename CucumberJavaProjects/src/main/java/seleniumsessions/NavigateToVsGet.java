package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateToVsGet {

	public static void main(String[] args) {
		
		WebDriver driver =new ChromeDriver();
		driver.navigate().to(new String("https://www.google.com"));
		System.out.println(driver.getTitle());
		

	}

}
