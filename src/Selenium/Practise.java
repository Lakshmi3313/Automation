package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Practise {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("http://demo.seleniumeasy.com/");
		driver.manage().window().maximize();
		
	}

}
