package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EnableSelected {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


		driver.get("https://www.leafground.com/button.xhtml;jsessionid=node0w2fdxve4juvnretve7zfjmh157916.node0");
		Boolean disButton=driver.findElement(By.xpath("//span[text()='Disabled']/..")).isEnabled();
		if (!disButton) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}

		driver.get("https://www.leafground.com/checkbox.xhtml;jsessionid=node0w2fdxve4juvnretve7zfjmh157916.node0");
		Boolean sele=driver.findElement(By.xpath("//span[text()='Basic']/..//input")).isSelected();

		System.out.println(sele);

		driver.findElement(By.xpath("//span[text()='Basic']/../div[contains(@class,'ui-chkbox')]")).click();

		Boolean sele1=driver.findElement(By.xpath("//span[text()='Basic']/..//input")).isSelected();

		System.out.println(sele1);
	}

}
