package seleniumsessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BrowserMultipleWindowHandle {
	
	public static void main(String[] args) throws InterruptedException{
		WebDriver driver = new ChromeDriver();
	driver.get("https://www.orangehrm.com/en/contact-sales");
	String parentWindowId=driver.getWindowHandle();
	System.out.println(parentWindowId);
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("CybotCookiebotBannerCloseButton")).click();

	
	Actions act = new Actions(driver);
	act.sendKeys(Keys.COMMAND).sendKeys(Keys.END).perform();
	
	WebElement fbEle= driver.findElement(By.xpath("//a[contains(@href,'facebook')]"));
	WebElement liEle= driver.findElement(By.xpath("//a[contains(@href,'linkedin')]"));
	WebElement xEle = driver.findElement(By.xpath("//a[contains(@href,'x.com')]"));
	WebElement ytEle =driver.findElement(By.xpath("//a[contains(@href,'youtube')]"));
	fbEle.click();
	liEle.click();
	xEle.click();
	ytEle.click();
	
	Set<String> handles = driver.getWindowHandles();
	Iterator<String> it= handles.iterator();
	
	while(it.hasNext()) {
		String windowId=it.next();
		driver.switchTo().window(windowId);
		System.out.println(driver.getCurrentUrl());
		
		if(!windowId.equals(parentWindowId)) {
			driver.close();
		}
	}
	
	driver.switchTo().window(parentWindowId);
	
	System.out.println("parent window title :"+driver.getTitle());
	
	} {
		// TODO Auto-generated method stub

	}

}
