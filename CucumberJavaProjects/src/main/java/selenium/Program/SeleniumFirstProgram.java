package selenium.Program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumFirstProgram {
	public static void main(String[] args) throws InterruptedException{
		 
		 System.out.println("Execution after setting ChromeDriver path in System Variables");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.toolsqa.com/");
		 driver.manage().window().maximize();
		
		 String title = driver.getTitle();
		 System.out.println("The page title is : " +title);
		 
		 WebElement SeleniumLink= driver.findElement(By.xpath("//div/ul[@class='navbar__links d-none d-lg-flex']//a[@href='/selenium-training?q=headers']"));
		 SeleniumLink.click();
		 driver.quit();
		 System.out.println("Execution complete");
		 
		 }

}

