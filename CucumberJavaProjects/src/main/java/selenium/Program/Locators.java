package selenium.Program;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.findElement(By.id("//input[@id=\"login-button\"]")).click();
		
		

	}

}
