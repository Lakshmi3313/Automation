package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseactions {

	public static void main(String[] args)throws InterruptedException {
		
		WebDriver driver=new EdgeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver. manage().window().maximize();
		// context click
		Actions act=new Actions(driver);
		WebElement Right=driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
		act.contextClick(Right).perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[3]/span")).click();
		driver.switchTo().alert().accept();
		

	}

}
