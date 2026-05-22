package seleniumsessions;

public class OpenCartTest {

	public static void main(String[] args) {
		
		BrowserUtil brUtil=new BrowserUtil();
		
		brUtil.initDriver("chrome");
		brUtil.enterUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		String actTitle = brUtil.getPageTitle();
		if(actTitle.equals("Account Login")) {
			System.out.println("Title is correct-- Pass");
		}
		else {
			System.out.println("title is not correct--FAIL");
		}
		
		String actUrl=brUtil.getPageURL();
		if(actUrl.contains("route=account/login")) {
			System.out.println("login page url is correct--PASS");
			
		}
		else{
			System.out.println("login page url is not correct--FAIL");
			
		}
		
		brUtil.quitBrowser();
		System.out.println("Program run successfully");
	}
		

	}


