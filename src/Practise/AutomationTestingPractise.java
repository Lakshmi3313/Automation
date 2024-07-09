package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutomationTestingPractise {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("name")).sendKeys("sowmya");
        driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
        driver.findElement(By.id("phone")).sendKeys("9876543210");
        driver.findElement(By.id("textarea")).sendKeys("hyderabad");
        driver.findElement(By.id("female")).click();
        driver.findElement(By.id("thursday")).click();
        Select country=new Select(driver.findElement(By.id("country")));
    	country.selectByVisibleText("India");
    	Select colour=new Select(driver.findElement(By.id("colors")));
    	colour.selectByVisibleText("Blue");
    	driver.findElement(By.id("Wikipedia1_wikipedia-search-input")).sendKeys("www.amazon.com");
    	driver.findElement(By.className("wikipedia-search-button")).click();
    	
    	
    	
        }

}
