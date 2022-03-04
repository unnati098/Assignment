package jackson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Omayo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		
		//selected by id 
		driver.findElement(By.xpath("//select[@id=\"multiselect1\"]//option[@value=\"swiftx\"]")).click();
		driver.findElement(By.xpath("//select[@id=\"multiselect1\"]//option[@value=\"audix\"]")).click();
		
		//selected by class
		driver.findElement(By.xpath("//select[@class=\"combobox\"]//option[@id=\"ironman2\"]")).click();
		
		//xpath using contains
		//driver.findElement(By.xpath("//a[contains(@id,'link1')]")).click();
		
		//XPath using Logical Operators: OR 
		//driver.findElement(By.xpath("//a[contains(@href,'http://selenium143.blogspot.com/') or contains(@value,'link2')]")).click();
		
		//Xpath using Logical Operators: AND
		WebElement e1 = driver.findElement(By.xpath("//input[contains(@name,'fname') and contains(@value,'Selenium WebDriver')]"));
		e1.clear();
		e1.sendKeys("Changed text with this");
		
		//XPath using Text()
		//driver.findElement(By.xpath("//a[text()='SeleniumTutorial']")).click();
		
		//for enable button
		driver.findElement(By.xpath("//button[@contenteditable='true']")).click();
		
		//for Buttons with same name attribute values
		driver.findElement(By.xpath("//button[text()=('Submit')]")).click();
		driver.findElement(By.xpath("//button[text()=('Login')]")).click();
		driver.findElement(By.xpath("//button[text()=('Register')]")).click();
		
		//XPath using Starts-With()
		//driver.findElement(By.xpath("//input[starts-with(@value , 'ClickAfte')]")).click();
		//driver.navigate().back();
		
		//for pop_windows
		//driver.findElement(By.xpath("//a[starts-with(@href, 'JavaScript')]")).click();
		//driver.navigate().back();
		
		//for choose file
		driver.findElement(By.xpath("//input[@name=\"anyfile\"]")).sendKeys("C:\\Users\\Dell\\eclipse-workspace\\Assignment\\ASCII_Table.PNG");
		
		//Chained XPath
		driver.findElement(By.xpath("//div[@class=\"widget-content\"]//button[@onclick=\"setTimeout(myFunctionABC,3000)\"]")).click();
		
		//XPath using Following
		driver.findElement(By.xpath("//div[@class=\"widget-content\"]//following:: textarea[@id=\"ta1\"]")).sendKeys("In this case, we have first located the div tag for the Password, and then, by using the Following, we get the list of all the div tags after Password. From there, we use the input tag and then locate the input box for the Phone");
		
		driver.findElement(By.xpath("//div[@class=\"widget-content\"]//following:: textarea[@cols=\"30\"]")).sendKeys("This is the seocnd textarea");
		
		
		driver.findElement(By.xpath("//form[@name=\"form1\"]//input[1]")).sendKeys("Unnati");
		driver.findElement(By.xpath("//form[@name=\"form1\"]//input[2]")).sendKeys("Unnati123");
		
		driver.findElement(By.xpath("//form[@name=\"form1\"]//button")).click();
		
		driver.findElement(By.xpath("//form[@name=\"login\"]//input[1]")).sendKeys("Yash");
		driver.findElement(By.xpath("//form[@name=\"login\"]//input[2]")).sendKeys("jhiuhi");
		
		
		System.out.print("Testing is done! Thank you!");
		try {
			Thread.sleep(20000);
			} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
			driver.quit();
	}

}
