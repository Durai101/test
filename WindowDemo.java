package selenium;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


		driver.get("https://www.leafground.com/window.xhtml;jsessionid=node01f1qakpgs59dgsf8d20vir682157575.node0");
		System.out.println(driver.getTitle());
		String parentWindow=driver.getWindowHandle();
		//System.out.println(winId);

		driver.findElement(By.xpath("//span[text()='Open']")).click();
		Set<String> winds=driver.getWindowHandles();

		for (String win : winds) {
			System.out.println(win);
			driver.switchTo().window(win);
		}

		//Thread.sleep(5000);
		System.out.println(driver.getTitle());

		driver.switchTo().window(parentWindow);

		System.out.println(driver.getTitle());

		Boolean logo=driver.findElement(By.className("logo")).isDisplayed();
		if (logo) {
			System.out.println("Logo Present");
		} else {
			System.out.println("Logo not present");
		}

		driver.quit();

	}

}
