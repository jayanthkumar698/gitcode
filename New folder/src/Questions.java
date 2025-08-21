import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Questions {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		/*String MobileName = "Samsung Galaxy A55 5G (Awesome Iceblue, 8GB RAM, 256GB Storage) | AI | Metal Frame | 50 MP Main Camera (OIS) | Super HDR Video| Nightography | IP67 | Corning Gorilla Glass Victus+ | sAMOLED Display";
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-blink-features=AutomationControlled");
		options.addArguments("user-data-dir=/path/to/your/profile");

		

		driver.get("https://www.amazon.in/");
		WebElement raj = driver.findElement(By.id("twotabsearchtextbox"));
		raj.sendKeys("Samsung Galaxy");
		raj.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		String jjj = driver
				.findElement(By.xpath("//span[contains(text(),'" + MobileName
						+ "')]/ancestor::div[@class='puisg-col-inner']/following::span[@class='a-price-whole']"))
				.getText();
		System.out.println(jjj);
		driver.quit();

		*/
		  
		/*  driver.get("https://www.flipkart.com/"); 
		  Thread.sleep(2000);
		  WebElement item
		  =driver.findElement(By.xpath("//input[@type='text']"));
		  
	 item.sendKeys("Iphone");
	 item.sendKeys(Keys.ENTER); 
	 Thread.sleep(3000);
	 WebElement rating =	driver.findElement(By.
		  xpath("//div[text() = 'Apple iPhone 16 (White, 128 GB)']/ancestor::div[@class='col col-7-12']/descendant::span[@id='productRating_LSTMOBH4DQF849HCG6GXHBPXY_MOBH4DQF849HCG6G_']"));
		 System.out.println("rating of the product is:" +rating.getText());
		 driver.close(); */
		
		
		driver.get("");
	List<WebElement> prices =	driver.findElements(By.xpath("//div[@class='plp-fragment-wrapper']/descendant::span[@class='notranslate']"));
	
	for(WebElement price :prices) {
		
		price.getText();
	}

	}

}
