package WebDrivr;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.naukri.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		for(String x:driver.getWindowHandles()){
			driver.switchTo().window(x);
			driver.manage().window().maximize();
			System.out.println(driver.getTitle());
		}
		{
			driver.quit();
		}
	}

}
