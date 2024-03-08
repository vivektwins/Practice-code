package Test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;

import java.time.Duration;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class selenium {
	
	
	public static List<WebElement> hit(List<WebElement> s,int n, WebDriver driver)
	{
		
		
	      int size = s.size();
	      for(int i =0; i<size ; i++){
	         String options = s.get(i).getText();
	         System.out.println(options);
	      }
		return s;
	}

	
	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub

		System.setProperty("webriver.chrome.driver","/Users/vivekkumar/Downloads/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.freshworks.com/demo/");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		//driver.findElement(By.className("M6CB1crr4y5c")).click();
		//driver.findElement(By.className("gLFyf")).sendKeys("Lakshmi Priya");
		driver.get("http://the-internet.herokuapp.com/dropdown");
        WebElement dropdownList = driver.findElement(By.id("dropdown"));
        List<WebElement> options = dropdownList.findElements(By.tagName("option"));
        List<String> s = new LinkedList<String>();
		s.add("a");
		s.add("u");
		s.add("e");
		s.add("i");
		s.add("o");
		
       
        int n=2;
        for (int i = 0; i < options.size(); i++) {
        	for(int j=0;j<n;j++)
        	{
        	System.out.println(options.get(i));
        	
        	}
        	break;
        }
	      
		//driver.quit();
		
//		WebDriverWait w = new WebDriverWait(driver, 10);
//		w.until(ExpectedConditions.elementToBeClickable(By.xpath("")));
		
//		driver.switchTo().alert().accept();
//		driver.switchTo().alert().dismiss();
//		driver.switchTo().alert().getText();
//		
		
//		Actions action = new Actions(driver);
//		Action act = action.doubleClick().build();
//		
//		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		//FileUtils.copyFile(src,new File(""));
//		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		
//		Robot robot = new Robot();
//		robot.keyPress(KeyEvent.VK_CONTROL);
//		robot.keyPress(KeyEvent.VK_MINUS);
//		robot.keyRelease(KeyEvent.VK_CONTROL);
//		robot.keyRelease(KeyEvent.VK_MINUS);
//		
//		
//
//		
//		WebElement html = driver.findElement(By.tagName("html"));
//		html.sendKeys(Keys.chord(Keys.CONTROL, Keys.ADD));
//		html.sendKeys(Keys.chord(Keys.CONTROL, Keys.SUBTRACT));
//
//	
//		//driver.quit();
//		
//		WebElement scroll_left = driver.findElement(By.className("gLFyf"));
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(0,250)", "");
//		js.executeScript("arguments[0].scollIntoView()",scroll_left);
		
		//File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(screenshot,new File(""));
	}

}
