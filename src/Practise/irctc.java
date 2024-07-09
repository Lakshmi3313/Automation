package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class irctc {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.irctc.co.in");
        driver.manage().window().maximize();
        
    	Select from=new Select(driver.findElement(By.xpath("//*[@id=\"origin\"]/span/input")));
    	from.selectByVisibleText("HYDERABAD DECAN-HYD(SECUNDRABAD) TELANGANA");
    	
        
        
        
    	//*[@id="origin"]/span/input
       

	}

}
