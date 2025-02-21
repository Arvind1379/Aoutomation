package day24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathDemo {
	
	public static void main(String[] args ) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		// //Xpath with single attribute 
		//driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Tshirts");
		
		// Xpath with multiple attribute 
		//driver.findElement(By.xpath("//input[@name='search'][@placeholder='Search']")).sendKeys("Tshirt");
		//xpath with and or oprrators 
		
		//driver.findElement(By.xpath("//input[@name='search']and[@placeholder='Search']")).sendKeys("tshirt");
		//driver.findElement(By.xpath("//input[@name='search']or[@placeholder='Search']")).sendKeys("Tshirt");
		
		
		/*//xpath with text()-Inner test 
		//driver.findElement(By.xpath("//*text()='MacBook']")).click();
		boolean displaystatus=driver.findElement(By.xpath("//h3[text()='featured']")).isDisplayed();
		System.out.println(displaystatus);
		String value=driver.findElement(By.xpath("//h3[text()='featured']")).getText();
		
		
		
		System.out.println(value);*/
		
		//x-path with contains 
		
		// search 
		//driver.findElement(By.xpath("//input[contains@placeholder,'sea')]")).sendKeys();
		// XPATH START WITH ()
		driver.findElement(By.xpath("//input start-with@placeholder,'sea')]")).sendKeys("tshirt");
		//chained path 
		
		
		
		
		
		
	}

}
