package WebDrivr;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = null;
		String expect = "Software Engineer";
		String path,path1 = null;
		WebDriver driver = null;
		WebElement ele1 = null;
		driver = new FirefoxDriver();
		url = "https://datatables.net/examples/data_sources/dom.html";
		driver.navigate().to(url);
		
		/*String output = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/table/tbody/tr[3]/td[2]")).getText();
		System.out.println(output);*/
		
		for(int i=1;i<11;i++){
					
			path = "/html/body/div[2]/div[3]/div/div[2]/table/tbody/tr["+i+"]/td[2]";
			path1 = "/html/body/div[2]/div[3]/div/div[2]/table/tbody/tr["+i+"]/td[1]";
			ele1 = driver.findElement(By.xpath(path));
			if(expect.equals(ele1.getText())){
				System.out.println(driver.findElement(By.xpath(path1)).getText());
			}
		}
		
		driver.quit();
	}

}
