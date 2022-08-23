package script_Demo;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.google.common.io.Files;

import baseliberary.Baseliberary;

public class A2nd_Important_Code extends Baseliberary {
	
	public void getscreenshot() {
		try {
			TakesScreenshot ts=(TakesScreenshot)driver;
			File src=ts.getScreenshotAs(OutputType.FILE);
			String screenshotName=null;
			File dest=new File("./screenshot"+screenshotName+"./png");
			Files.copy(src, dest);
			
		} catch (Exception e) {
			System.out.println("Issue in take screenshot "+e);
		}
	}

}
