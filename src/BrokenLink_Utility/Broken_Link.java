package BrokenLink_Utility;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import baseliberary.Baseliberary;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Broken_Link extends Baseliberary {
	
	public void brokenlink() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.testingbaba.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		List<WebElement> counts = driver.findElements(By.tagName("a"));
		System.out.println("Number of Links "+counts.size());
		ArrayList<String> urlList=new ArrayList<String>();
		for(WebElement e:counts) {
			String url = e.getAttribute("href");
			System.out.println(urlList.add(url));
			checkBrokenLink(url);
			}
		driver.quit();
		}
	public void checkBrokenLink(String urlList) {
		try {
			URL urls=new URL(urlList);
			HttpURLConnection httpcon=(HttpURLConnection)urls.openConnection();
			httpcon.setConnectTimeout(1000);
			httpcon.connect();
			if(httpcon.getResponseCode()>=100  &&  httpcon.getResponseCode()<200) {
				System.out.println(urlList+"----->"+httpcon.getResponseMessage()+"This Link is Broken with informational error");
			}
			else if(httpcon.getResponseCode()>=300  &&  httpcon.getResponseCode()<400) {
				System.out.println(urlList+"----->"+httpcon.getResponseMessage()+"This Link is Broken with Redirection error");
			}
			else if(httpcon.getResponseCode()>=400  &&  httpcon.getResponseCode()<500) {
				System.out.println(urlList+"----->"+httpcon.getResponseMessage()+"This Link is Broken with Client error");
			}
			else if(httpcon.getResponseCode()>=500  &&  httpcon.getResponseCode()<600) {
				System.out.println(urlList+"----->"+httpcon.getResponseMessage()+"This Link is Broken with Internal server error");
			}
			else {
				System.out.println(urlList+"----->"+httpcon.getResponseMessage()+"This Link is Not Broken ");
			}
		} catch (Exception e) {
			System.out.println("Issue in check broken link "+e);
		}
	}

}
