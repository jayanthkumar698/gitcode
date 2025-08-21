import java.time.Duration;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PractiseSession {
	public static void main(String[] args) throws InterruptedException {
		
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.snapdeal.com/");
	driver.manage().window().maximize();
	
	driver.findElement(By.id("pushAllow")).click();
	Thread.sleep(1000);
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--disable-notifications");

	
	driver.findElement(By.id("inputValEnter")).sendKeys("watches");
	
	WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(5));
	w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".suggestionList_menuitem.unstructuredList")));
	
	List<WebElement> doptions = driver.findElements(By.cssSelector(".suggestionList_menuitem.unstructuredList"));
	
	for(WebElement option :doptions) {
		
		if(option.getText().contains("Branded Watches")) {
			
			option.click();
			break;
		}
	}
	
	
	}

}