import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalendarDemo {
	public static void main(String[] args) {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(options);
		driver = new ChromeDriver(options);
		driver.get("https://www.redbus.in/");

		String mon = "Nov";
		String yr = "2023";
		String date = "15";

		WebElement calBtn = driver.findElement(By.xpath("//*[@id='onward_cal']"));
		calBtn.click();

		while (true) {

			WebElement monthYear = driver.findElement(By.className("monthTitle"));
			String mYrText = monthYear.getText();
			String arr[] = mYrText.split(" ");

			String month = arr[0];
			String year = arr[1];

			if (mon.equalsIgnoreCase(month) && yr.equals(year)) {
				break;
			} else {
				driver.findElement(By.xpath("//button[text()='>']")).click();
			}
		}
		List<WebElement> date1 = driver.findElements(By.xpath("//*[@id='rb-calendar_onward_cal']//td"));

		for (WebElement d : date1) {
			String d1 = d.getText();
			if (d1.equals(date)) {
				d.click();
				break;
			}

		}

	}
}
