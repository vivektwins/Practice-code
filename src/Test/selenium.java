package Test;

import java.io.File;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webriver.chrome.driver","/Users/vivekkumar/Downloads/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		//driver.findElement(By.className("M6CB1crr4y5c")).click();
		driver.findElement(By.className("gLFyf")).sendKeys("Lakshmi Priya");
		driver.findElement(By.className("CcAdNb")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	
		driver.quit();
		
		WebElement scroll_left = driver.findElement(By.className("gLFyf"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,250)", "");
		js.executeScript("arguments[0].scollIntoView()",scroll_left);
		
		//File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(screenshot,new File(""));
	}

}
