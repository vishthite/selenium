package WebDrivr;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleTableNew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = null;
		int i=0;
		String expect = "Software Engineer";
		String path,path1 = null;
		WebDriver driver = null;
		WebElement ele1 = null;
		driver = new FirefoxDriver();
		url = "https://datatables.net/examples/data_sources/dom.html";
		driver.navigate().to(url);
		
		WebElement[][] data = new WebElement[10][2];
		List<WebElement> list1 = driver.findElements(By.xpath("/html/body/div[2]/div[3]/div/div[2]/table/tbody/tr/td[2]"));
		for(WebElement x:list1){
			//System.out.println(x.getText());
			data[i][0] = x;
			i++;
		}
		i=0;
		list1 = driver.findElements(By.xpath("/html/body/div[2]/div[3]/div/div[2]/table/tbody/tr/td[3]"));
		for(WebElement x:list1){
			//System.out.println(x.getText());
			data[i][1] = x;
			i++;
		}
		
		for(int j=0;j<data.length;j++){
			
			if(expect.equals(data[j][0].getText()))
				System.out.println(data[j][1].getText());
		}
				
		driver.quit();
	}

}
