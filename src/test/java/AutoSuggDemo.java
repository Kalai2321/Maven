import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggDemo {
	public static void main(String[] args) throws InterruptedException {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.google.com/");
		driver.navigate().refresh();
		driver.findElement(By.name("q")).sendKeys("Chennai");

		Thread.sleep(3000);
		List<WebElement> autoSuggest = driver.findElements(By.xpath("//*[@class ='G43f7e']//li"));
		// className("G43f7e")
		int siz = autoSuggest.size();
		System.out.println(siz);
		Thread.sleep(3000);
		autoSuggest.get(siz - 1).click();
	}
}
