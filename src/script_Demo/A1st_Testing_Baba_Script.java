package script_Demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A1st_Testing_Baba_Script {
	
	public static void main(String[] args) {
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.testingbaba.com");
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.xpath("//*[@id=\"myModal2\"]/div/div/div[1]/button")).click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
//		driver.close();
		
	}

}
