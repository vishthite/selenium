package WebDrivr;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.Keys;
import java.util.concurrent.TimeUnit;
//import org.openqa.selenium.htmlunit.HtmlUnitDriver;
public class SignIn {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.bin", "C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
		WebDriver driver = new FirefoxDriver();
		String baseURL = "http://www.gmail.com";
		driver.get(baseURL);
		
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//WebElement button = driver.findElement(By.linkText("Sign in"));
		//button.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement email = driver.findElement(By.id("Email"));
		email.sendKeys("vishalthite4444@gmail.com");
		email.
		driver.manage.
		driver.findElement(By.id("next")).click();
		driver.findElement(By.id("Passwd")).sendKeys("dchampshere");
		driver.findElement(By.id("signIn")).click();
		

	}

}
