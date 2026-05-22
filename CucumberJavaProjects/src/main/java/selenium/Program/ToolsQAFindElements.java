package selenium.Program;

import org.openqa.selenium.WebDriver;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolsQAFindElements {

	public static void main(String[] args) {
		
		WebDriver d=new ChromeDriver();
		
		d.get("https://demoqa.com/text-box");
		
		// Find elements using tag name
		List<WebElement> allInputElements = d.findElements(By.tagName("input"));
		
		   if(allInputElements.size() != 0) 
		   {
			   System.out.println(allInputElements.size() + " Elements found by TagName as input \n");
				
			   for(WebElement inputElement : allInputElements) 
			   {
				   System.out.println(inputElement.getAttribute("placeholder"));
			   }
		   }
	   }
	
	}


