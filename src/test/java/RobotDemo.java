import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RobotDemo {
public static void main(String[] args) throws AWTException {
	
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver(options);
	driver.get("https://www.amazon.in/");
	
	driver.manage().window().maximize();
	
	WebElement mob = driver.findElement(By.xpath("//*[text()='Mobiles']"));
	 Actions acc = new Actions(driver);
	 acc.contextClick(mob).perform();
	 
	 Robot r = new Robot();
	 r.keyPress(KeyEvent.VK_DOWN);
	 r.keyRelease(KeyEvent.VK_DOWN);
	 r.keyPress(KeyEvent.VK_DOWN);
	 r.keyRelease(KeyEvent.VK_DOWN);
	 r.keyPress(KeyEvent.VK_DOWN);
	 r.keyRelease(KeyEvent.VK_DOWN);
	 r.keyPress(KeyEvent.VK_DOWN);
	 r.keyRelease(KeyEvent.VK_DOWN);
	 r.keyPress(KeyEvent.VK_DOWN);
	 r.keyRelease(KeyEvent.VK_DOWN);
	 r.keyPress(KeyEvent.VK_DOWN);
	 r.keyRelease(KeyEvent.VK_DOWN);
	 

	 r.keyPress(KeyEvent.VK_ENTER);
	 r.keyRelease(KeyEvent.VK_ENTER);
}
}
