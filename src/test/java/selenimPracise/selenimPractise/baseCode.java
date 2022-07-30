package selenimPracise.selenimPractise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseCode {
	WebDriver driver;
@Test
public void login() {
	WebDriverManager.chromedriver().setup();
	 driver=new ChromeDriver();
	 driver.get("https://www.orangehrm.com/");
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	String t1= driver.getCurrentUrl();
	 System.out.println(t1);
	 String title=driver.getTitle();
	 String expected="OrangeHRM HR Software | Free & Open Source HR Software | HRMS | HRIS";
	 //Assert.assertEquals(title, expected);
		/*
		 * JavascriptExecutor js=(JavascriptExecutor)driver;
		 * js.executeScript("document.getElementById", args);
		 */
	 
}
	@Test
	public void  logoVerification1() {
		WebElement wl=driver.findElement(By.xpath("//img[@class='nav-logo']"));
		System.out.println(wl.isDisplayed());
		driver.quit();
	}
	

	
	 
}



