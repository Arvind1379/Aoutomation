package Day23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSlocators {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		/*Css selector 

		Css - cascadng style sheets 

		tag id     tag#id
		tag class  tag.classname 
		tag attribute tag[attribute ="value"]
		tag class and attribute tag.classname[attrbute="value"]*/
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();//maximize the broweser window
		
		//Tag id 
		//driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("T-shirts"); //with tag name
		//driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("T-shirts");
		
		//tag class tag.classname 
		driver.findElement(By.cssSelector("[input[placeholder='searchstore']")).sendKeys("T-shirt");
		driver.findElement(By.cssSelector("[input[placeholder='searchstore']")).sendKeys("T-shirt");
	}

}
