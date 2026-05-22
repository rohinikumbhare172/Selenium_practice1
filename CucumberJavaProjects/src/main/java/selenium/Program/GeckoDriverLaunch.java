package selenium.Program;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GeckoDriverLaunch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver d = new FirefoxDriver();
		d.navigate().to("https://www.Toolsqa.com");
		WebElement SeleniumLink= d.findElement(By.xpath("//div/ul[@class='navbar__links d-none d-lg-flex']//a[@href='/selenium-training?q=headers']"));
		SeleniumLink.click();
		d.navigate().forward();
		d.navigate().back();
		d.quit();
		//d.navigate().to("https://www.toolsqa.com/");
		System.out.println("Clicked on link succesfully and quit the browser");

	}

}
