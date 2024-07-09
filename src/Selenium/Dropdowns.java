package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {

	public static void main(String[] args) {
		
	WebDriver driver=new EdgeDriver();
	driver.get("https://demo.guru99.com/insurance/v1/register.php");
	driver.manage().window().maximize();
	Select title=new Select(driver.findElement(By.id("user_title")));
	title.selectByIndex(10);
	driver.findElement(By.name("firstname")).sendKeys("Lakshmi");
	driver.findElement(By.name("lastname")).sendKeys("Sowmya");
	driver.findElement(By.name("phone")).sendKeys("9876543210");
	Select year=new Select(driver.findElement(By.name("year")));
	year.selectByVisibleText("1964");
	Select month=new Select(driver.findElement(By.name("month")));
	month.selectByVisibleText("November");
	Select date=new Select(driver.findElement(By.name("date")));
	date.selectByVisibleText("10");
	driver.findElement(By.id("licencetype_f")).click();
	Select license=new Select(driver.findElement(By.name("licenceperiod")));
	license.selectByVisibleText("2");
	Select occupation=new Select(driver.findElement(By.id("user_occupation_id")));
	occupation.selectByIndex(3);
	driver.findElement(By.name("street")).sendKeys("ameerpet");
	driver.findElement(By.name("city")).sendKeys("Hyderabad");
	driver.findElement(By.name("county")).sendKeys("India");
	driver.findElement(By.name("post_code")).sendKeys("500058");
	driver.findElement(By.name("email")).sendKeys("abcd@gmail.com");
	driver.findElement(By.name("password")).sendKeys("klmn@23");
	driver.findElement(By.name("c_password")).sendKeys("klmn@23");
	driver.findElement(By.name("submit")).click();
	driver.findElement(By.name("email")).sendKeys("abcd@gmail.com");
	driver.findElement(By.name("password")).sendKeys("klmn@23");
	driver.findElement(By.name("submit")).click();
	
	
	
	
	
	
	
	
	}

}
