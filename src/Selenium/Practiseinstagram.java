package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Practiseinstagram {

	public static void main(String[] args) {
		WebDriver driver =new EdgeDriver();
		driver.get("https://www.instagram.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[1]/div/label/input")).sendKeys("sowmyapandu63@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[2]/div/label/input")).sendKeys("Sowmya@2233");
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[3]")).click();
		
		
	}

}
