package selenimPracise.selenimPracise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test1 {

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://maven.apache.org/download.cgi");
	WebElement el=driver.findElement(By.xpath("//select[@name='Preferred']"));
	Select sl=new Select(el);
	sl.selectByVisibleText("https://dlcdn.apache.org/ (backup)");
	System.out.println("hello");

	}

}
