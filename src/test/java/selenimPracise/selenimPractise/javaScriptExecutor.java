package selenimPracise.selenimPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class javaScriptExecutor {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");
		driver.manage().window().maximize();
		JavascriptExecutor js=( JavascriptExecutor)driver;
		//js.executeScript("arguments[0].click()", driver.findElement(By.xpath("//input[@value='Show me']")));
//enter text fields
		js.executeScript("arguments[0].value='helloworld'", driver.findElement(By.cssSelector("input[name='fname']")));
		
		System.out.println("hello");
driver.quit();
	}

}
