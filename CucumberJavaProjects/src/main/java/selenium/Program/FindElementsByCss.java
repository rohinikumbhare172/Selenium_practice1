package selenium.Program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsByCss {

	public static void main(String[] args) {
		
		System.out.println("This program is for find elements using CSS Selectors");
		
		WebDriver d=new ChromeDriver();
		d.get("https://demoqa.com/automation-practice-form");
		d.manage().window().maximize();
		WebElement e= d.findElement(By.id("firstName']"));
		e.click();
		e.sendKeys("Rohini");
		d.close();
		System.out.println("Browser Closed Successfully");
		
	}

}
