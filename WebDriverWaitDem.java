package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWaitDem {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.leafground.com/waits.xhtml;jsessionid=node010nh11h82v72w1bhcqjvo6mh48158159.node0");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[text()='Click']")).click();
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));
		Boolean b=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='I am here']"))).isDisplayed();
		
		System.out.println(b);
		
		//Boolean bl=driver.findElement(By.xpath("//span[text()='I am here']")).isDisplayed();
		//out.println(bl);

	}
}