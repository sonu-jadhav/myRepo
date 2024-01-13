package actionsClassStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		
		//findout the locators where you  find the elements by using
		// actions class & Store in Reference variables.
		
		
	 WebElement loginbutton = driver.findElement(By.name("login"));
	 
	 //creat object of Actions class which will pass driver object as a parameter
	 
	 
	 Actions act=new Actions(driver);
	 
	 //using one actions methods perform one an action
		
	 act.click(loginbutton).perform();
	 
	 
	 //differenct ways of  click method by using selenium ?
	 
	//---> by using webelement method or actions class
	 
		
	}

}
