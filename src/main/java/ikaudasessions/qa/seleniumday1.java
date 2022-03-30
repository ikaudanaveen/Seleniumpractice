package ikaudasessions.qa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class seleniumday1 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\seleniumdriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		//System.setProperty("webdriver.gecko.driver", "C:\\seleniumdriver\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		//WebDriver driver =new FirefoxDriver();
		driver.get("https://www.phptravels.net/login");
		driver.findElement(By.name("email")).sendKeys("user@phptravels.com");
		driver.findElement(By.name("password")).sendKeys("demouser");
		//System.out.println(driver.findElement(By.cssSelector("p.font-size-14")).getText());
		driver.manage().window().maximize();
		//driver.manage().window().fullscreen();
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,250)", "");
		//driver.manage().timeouts().wait(20);
		//System.out.println(driver.getTitle());
		//tagname[attribute='value']
	  // driver.findElement(By.cssSelector("button.btn-block")).click();
	   //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  //JavascriptExecutor js1 = (JavascriptExecutor) driver;
		//js1.executeScript("window.scrollBy(0,250)", "");
		//driver.manage().timeouts().wait(20);
	  // driver.findElement(By.linkText("Home")).click();
		//driver.quit();
		//driver.close();
		
		

	}

}
