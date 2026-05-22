package selenium.Program;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TelusTraining_prg1 {

	public static void main(String[] args) {
		ChromeDriver d=new ChromeDriver();
		d.navigate().to("https://www.toolsqa.com/");
		d.manage().window().maximize();
		String e=d.getTitle();
		System.out.println("Title is "+e);
		System.out.println("Title extract successfully");
		//d.findElement(By.cssSelector("Selenium Training")).click();
		d.navigate().to("https://demoqa.com/checkbox");
		d.findElement(By.xpath("//span[contains(text(),'Home')]")).click();
		d.findElement(By.xpath("//span[contains(text(),'Excel File.doc')]")).click();
		System.out.println("Clicked Successfully");
		d.quit();
	}

		
	}

