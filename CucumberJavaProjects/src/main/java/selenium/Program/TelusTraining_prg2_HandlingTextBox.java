package selenium.Program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TelusTraining_prg2_HandlingTextBox {
	//browser/navigation commands

	public static void main(String[] args) {
		
		ChromeDriver d= new ChromeDriver();
		d.get("https://demoqa.com/text-box");
		System.out.println("Application is launched");
		
		//maximize the window
		d.manage().window().maximize();
		
		WebElement fullName= d.findElement(By.xpath("//input[@id='userName']"));
		Boolean t=fullName.isDisplayed();
		System.out.println(t);
		
		Boolean f=fullName.isEnabled();
		System.out.println(f);
		
		System.out.println("Check Full name TextBox is Visible or not: "+fullName);
		fullName.click();
		fullName.sendKeys("Rohit kumbhare");
		d.quit();
		System.out.println("Browser closed successfully");
	}

}
