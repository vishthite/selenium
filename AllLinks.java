package WebDrivr1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AllLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("http://toolsqa.com/selenium-webdriver/selenium-tutorial/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		List<WebElement> list1 = driver.findElements(By.tagName("a"));
		for (WebElement a:list1){
			
			System.out.println(a.getText());
		}
		
		driver.quit();
	}

}
