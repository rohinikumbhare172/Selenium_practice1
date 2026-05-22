package seleniumsessions;

public class CustomXpath {

	
	
	// xpath:address of the element in HTML DOM
	// 1. absolute xpath:top node to the element 
	// /html/body/div[2]/div/div/div/div[3]/div/form/div[1]/div/input
	
	//2. relative xpath: Customem xpath
	
		//1. with single attr: //htmltag[@attr='value']
		//email x path --> //input[@id='input-email']
			              //input[@name='email']
						//input[@placeholder='E-Mail Address']
	
	//driver.findElement(By.xpath("//input[@placeholder='E-Mail Address']")).sendKeys("Naveen");

			//2. with multiple attribute
	//htmltag[@attr1='value'and @attr2='value']
	//input[@placeholder='E-Mail Address' and @name= 'email']
	 
	
	//10. indexing - (//a[@class='list-group-item'])[1]
	//               (//a[@class='list-group-item'])[position()=1]
	
	
}
