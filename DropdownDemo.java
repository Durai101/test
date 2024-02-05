package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.leafground.com/select.xhtml");
		
		Select sl=new Select(driver.findElement(By.xpath("//h5[contains(text(),'UI Automation tool')]/..//select")));
		
		List<WebElement> li=sl.getOptions();
		
		for (WebElement wb : li) {
			System.out.println(wb.getText());
		}
		
		sl.selectByVisibleText("Puppeteer");
	}

}
