package datadriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Testexecution {
	@Test(dataProvider="wordpress")
	
	public void test(String username,String password,String jdfd  ) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LABPC2\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://primusbank.qedgetech.com/");
		driver.findElement(By.xpath("//*[@id=\'txtuId\']")).sendKeys(username);
		driver.findElement(By.xpath("//*[@id=\'txtPword\']")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id=\'login\']")).click();
		
		
	}

	
	@DataProvider(name="wordpress")
	public Object[][] passdata(){
		
		ExcelDataProvider config=new ExcelDataProvider("C:\\Users\\LABPC2\\Desktop\\LOGIN.xlsx");
		int rows=config.getrows("LOGIN");
		Object[][]data=new Object[rows][2];
		for(int i=0;i<rows;i++) {
			
			data[i][0]=config.getstringdata("LOGIN", i, 0);
			data[i][1]=config.getstringdata("LOGIN", i, 0);
		}
		return data;
		
		
	}
}



