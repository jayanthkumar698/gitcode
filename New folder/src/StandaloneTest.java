import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import graphql.Assert;

public class StandaloneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String productName = "IPHONE 13 PRO";

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/client/#/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("userEmail")).sendKeys("jay123@gmail.com");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Jay@3939");
		driver.findElement(By.id("login")).click();
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".mb-3")));
		List<WebElement> products = driver.findElements(By.cssSelector(".mb-3"));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div h5 b")));
		
		
		for (WebElement product : products) {

			WebElement prod = product.findElement(By.cssSelector("div h5 b"));
			if (prod.getText().equals(productName)) {

				product.findElement(By.xpath(".//button[2]")).click();
				break;
			}

		}
		
		w.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("#toast-container")));
		driver.findElement(By.xpath("(//li//button)[3]")).click();
		List<WebElement> items = driver.findElements(By.cssSelector(".cartSection h3"));
		for(WebElement item :items)
		{
			if(item.getText().contains(productName))
			{
				Assert.assertTrue(true);
			}
		}
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,2000)");
		
		driver.findElement(By.xpath("//li/button[@type='button']")).click();
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Select Country']")));
		
		driver.findElement(By.xpath("//input[@placeholder='Select Country']")).sendKeys("ar");
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".ta-results")));	
	List<WebElement> countries = 	driver.findElements(By.cssSelector(".ta-item"));
	for(WebElement country :countries) {
		if(country.getText().contains("Aruba")) {
			country.click();
			break;
	}
		
	}
		driver.findElement(By.cssSelector(".btnn.action__submit.ng-star-inserted")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("tbody h1")));
		String orderText = driver.findElement(By.cssSelector("tbody h1")).getText();
		System.out.println(orderText);
		
		
		
		

	}

}
