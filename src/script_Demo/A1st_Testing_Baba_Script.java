package script_Demo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Excelutility.Excelutiltiy_program;

public class A1st_Testing_Baba_Script {
	
	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.testingbaba.com");
		String title = driver.getTitle();
		System.out.println(title);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("body.modal-open:nth-child(2) div.container-fluid:nth-child(14) div.modal.fade.show div.modal-dialog div.modal-content div.modal-header > button.close")).click();
//		driver.findElement(By.xpath("//*[@id=\"myModal2\"]/div/div/div[1]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"kt\"]/li[6]/a")).click();
		driver.navigate().refresh();
		driver.findElement(By.xpath("//*[@id=\"myModal2\"]/div/div/div[1]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"kt\"]/li[6]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"elements-accordion\"]/div[1]/div[1]/h2/button")).click();
		driver.findElement(By.xpath("//*[text()='text box']")).click();
		driver.findElement(By.xpath("//*[@id=\"fullname1\"]")).sendKeys("Montu");
		driver.findElement(By.xpath("//*[@id=\"fullemail1\"]")).sendKeys("Montu@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"fulladdresh1\"]")).sendKeys("Old kondli durga mandir gali");
		driver.findElement(By.xpath("//*//*[@id=\"paddresh1\"]")).sendKeys("Vilaage ballolpur noida uttar pardesh 23099987");
		driver.findElement(By.xpath("//*[@class=\"btn btn-success\"]")).click();
		List<WebElement> list = driver.findElements(By.xpath("//div[@class=\"col-md-6 mt-5\"]/label"));
		for(WebElement dd:list) {
			System.out.println(dd.getText());
		}
		for(int i=1; i<=list.size()-1; i++) {
			String data = list.get(i).getText();
			System.out.println(data);
			i++;
			
		}
		driver.findElement(By.xpath("//*[text()='check box']")).click();
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"tab_2\"]/div/iframe")));
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@onclick=\"myFunction()\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"mylaptop\"]")).click();
		String checkbox = driver.findElement(By.xpath("//*[@id=\"text\"]")).getText();
		System.out.println(checkbox);
		
		driver.findElement(By.xpath("//*[@id=\"mydesktop\"]")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//*[text()='radio buttons']")).click();
		driver.findElement(By.xpath("//*[@id=\"yes\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"impressive\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"no\"]")).click();
		driver.findElement(By.xpath("//*[text()='web tables']")).click();
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@src=\"Webtable.html\"]")));
		Thread.sleep(1000);
		
		
		
		
//		driver.close();
		
	}

} 
