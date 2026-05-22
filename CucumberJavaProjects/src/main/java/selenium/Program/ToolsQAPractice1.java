package selenium.Program;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ToolsQAPractice1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver d= new ChromeDriver();
		String appUrl = "https://www.toolsqa.com";
		d.get("https://www.toolsqa.com");
		d.manage().window().maximize();
		WebElement s= d.findElement(By.xpath("//input[@class=\"navbar__search--input\"]"));
		boolean t= s.isDisplayed();
		System.out.println(t);
		s.click();
		 s.sendKeys("abc");
		 s.clear();
		 d.navigate().back();
		 d.navigate().forward();
		 d.navigate().to(appUrl);
		 d.navigate().refresh();
		
		 System.out.println("Program runs succesfully");
		 
		// Storing Page Source in String variable
		 String pageSource =d.getPageSource();
		 System.out.println("Display Page Source "+pageSource);
		 
		 //Length of page source
		 int pageLength= d.getPageSource().length();
		 System.out.println("Lenght of pageSource"+pageLength);
		 
		 d.close();
		 
		
		
		

	}

}



/*Practice Exercise
Launch new Browser
Open DemoQA.com website
Click on Registration link using "driver.findElement(By.xpath(".//[@id='menu-item-374']/a")).click();"*
Come back to Home page (Use 'Back' command)
Again go back to Registration page (This time use 'Forward' command)
Again come back to Home page (This time use 'To' command)
Refresh the Browser (Use 'Refresh' command)
Close the Browser */
