package datadriven;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class links {
@Test

public void links() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\LABPC2\\Desktop\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.hdfcbank.com/");
	java.util.List<WebElement>totalnooflinks=driver.findElements(By.tagName("a"));
	System.out.print(totalnooflinks.size());
	for(int i=0;i<totalnooflinks.size();i++) {
		
		System.out.println(totalnooflinks.get(i).getText());
	}
	
	
}
}