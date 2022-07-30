package selenimPracise.selenimPracise;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class brokenlinkImages {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://google.com");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
List<WebElement> lst=driver.findElements(By.tagName("a"));
for(int i=0;i<lst.size();i++) {
	
}
	}

}
