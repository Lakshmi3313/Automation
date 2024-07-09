package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboardactions {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://text-compare.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("text1")).sendKeys("selenium java");
		Actions ACT=new Actions(driver);
		ACT.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		ACT.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
		ACT.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		ACT.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
		driver.findElement(By.xpath("//*[@id=\"compareButtton\"]/div[1]")).click();
		driver.findElement(By.xpath("//*[@id=\\\"textCompareForm\\\"]/div/table/tbody/tr/td[3]/button")).click();
		
		
		

	}

}
