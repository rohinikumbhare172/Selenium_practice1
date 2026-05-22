package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ElementUtil {

	private WebDriver driver;
	private Actions act;
	public ElementUtil(WebDriver driver) {
		this.driver=driver;
		act=new Actions(driver);
	}
	
	public void doClick(By locator) {
		getElement(locator).click();
	}
	
	public void doSendKeys(By locator,String value) {
		getElement(locator).sendKeys(values);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
