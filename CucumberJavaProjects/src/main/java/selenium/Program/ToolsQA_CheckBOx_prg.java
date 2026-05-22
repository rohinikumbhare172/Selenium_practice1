package selenium.Program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolsQA_CheckBOx_prg {

	public static void main(String[] args) {
		ChromeDriver d=new ChromeDriver();
		d.navigate().to("https://practicetestautomation.com/practice-test-login/");
		d.manage().window().maximize();
		
		//user name
		WebElement e= d.findElement(By.cssSelector("#username"));
		boolean isDisplayed =e.isDisplayed();
		if(isDisplayed==true) {
		e.click();
		}
		e.sendKeys("Rohini_student");

		String s= e.getAttribute("href");
		System.out.println(s);
		
		String s1 = e.getCssValue("color");
		System.out.println(s1);
		
		String s2=e.getAttribute("value");
		System.out.println(s2);
		
		e.clear();
		
		e.sendKeys("student");
		//password
		WebElement e2=d.findElement(By.id("password"));
		e2.click();
		e2.sendKeys("Password123");
		
		//login button
		d.findElement(By.id("submit")).click();
		System.out.println("Logged in successfully");
		d.quit();	
		

	}

}
