package selenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.leafground.com/alert.xhtml");
		
		driver.findElement(By.xpath("//span[text()='Show']")).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
		Alert al=driver.switchTo().alert();
		System.out.println(al.getText());
		
		al.dismiss();
		
	}

}
