package ikaudasessions.qa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class seleniumday2 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\seleniumdriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		//System.setProperty("webdriver.gecko.driver", "C:\\seleniumdriver\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		//WebDriver driver =new FirefoxDriver();
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Java")).click();
		

	}

}
