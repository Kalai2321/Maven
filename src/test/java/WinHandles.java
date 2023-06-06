import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WinHandles {
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();

		// To print ParentwindowId
		String parentWindowId = driver.getWindowHandle();
		System.out.println(parentWindowId);

		WebElement newbtn = driver.findElement(By.id("newWindowBtn"));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", newbtn);

		// To print Child Window ID

		Set<String> childWindowsId = driver.getWindowHandles();
		System.out.println(childWindowsId);

		for (String childWindows : childWindowsId) {
			if (!childWindows.equals(parentWindowId)) {
				driver.switchTo().window(childWindows);
				WebElement fName = driver.findElement(By.id("firstName"));
				WebElement lName = driver.findElement(By.id("lastName"));
				js.executeScript("arguments[0].setAttribute('value', 'Hello World')", fName);
				js.executeScript("arguments[0].setAttribute('value', 'password')", lName);
				//driver.close();
			}

			driver.switchTo().window(parentWindowId);
			driver.findElement(By.id("name")).sendKeys("Hello Java");
		}

	}
}
