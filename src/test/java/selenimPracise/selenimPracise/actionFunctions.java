package selenimPracise.selenimPracise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class actionFunctions {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://jqueryui.com/droppable/");
		dr.switchTo().frame(0);
		Actions act=new Actions(dr);
		
		act.clickAndHold(dr.findElement(By.xpath("//div[@id='draggable']"))).
		moveToElement(dr.findElement(By.xpath("//div[@id='droppable']"))).
		release().build().perform();
		
	}

}
