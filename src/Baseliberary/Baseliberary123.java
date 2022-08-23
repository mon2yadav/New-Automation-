package Baseliberary;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;


public class Baseliberary123 {
	
   public void lounchdriver(String url) {
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agio13\\eclipse-workspace\\10Aug_Automation_for_beginers\\chromedriver.exe");
	   WebDriverManager.chromedriver().setup();
	   ChromeDriver driver = new ChromeDriver();
	   driver.get(url);
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   
	  
	   
	   
	   
	   
   }

}
