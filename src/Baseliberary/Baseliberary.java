package Baseliberary;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseliberary {
	
   public void lounchdriver(String url) {
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agio13\\eclipse-workspace\\10Aug_Automation_for_beginers\\chromedriver.exe");
	   WebDriver driver=new ChromeDriver();
	   driver.get(url);
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   
	   
	   
	   
   }

}
