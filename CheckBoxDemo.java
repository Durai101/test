package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckBoxDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.leafground.com/checkbox.xhtml;jsessionid=node010nh11h82v72w1bhcqjvo6mh48158159.node0");
		List<WebElement> checkboxes=driver.findElements(By.xpath("//h5[text()='Choose your favorite language(s)']/..//span/.."));
		int i=1;
		for (WebElement checkbox : checkboxes) {
			if (i<=2) {
				checkbox.click();
			}
			i++;
			
		}

	}

}
