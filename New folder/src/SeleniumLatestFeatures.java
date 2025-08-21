import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLatestFeatures {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.switchTo().newWindow(WindowType.TAB);
		Set<String> window1 = driver.getWindowHandles();
		Iterator<String> tab = window1.iterator();
		String ParentId = tab.next();
		String ChildId = tab.next();
		driver.switchTo().window(ChildId);
		driver.get("https://rahulshettyacademy.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1800)");
		String jjj = driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']")).get(1)
				.getText();
		driver.switchTo().window(ParentId);
		WebElement name = driver.findElement(By.cssSelector("[name='name']"));
		name.sendKeys(jjj);
	File file =	name.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(file, new File("logo.png"));
	
	System.out.println(name.getRect().getHeight());
	System.out.println(name.getRect().getWidth());
	driver.quit();
	}

}
