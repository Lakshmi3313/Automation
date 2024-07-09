package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Resizeable {

	public static void main(String[] args) {
		System.setProperty("C:\\Program Files\\Java\\chromedriver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement slider=driver.findElement(By.xpath("//*[0id=\"slider\"]/span"));
		Actions act=new Actions(driver);
		act.dragAndDropBy(slider, 120, 0).perform();
		

	}

}
