package selenimPracise.selenimPracise;

import java.io.File;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class chromeOptions {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions ch=new ChromeOptions();
		ch.addExtensions(new File("path"));
        ch.setAcceptInsecureCerts(true); 
        DesiredCapabilities ds=new DesiredCapabilities();
        ds.setAcceptInsecureCerts(true);
        ch.merge(ds);
        
        
	}

}
