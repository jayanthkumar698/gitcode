
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlipkartE2E {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.get("https://www.flipkart.com/");
            driver.manage().window().maximize();

            // Search for "Samsung"
            WebElement searchBox = driver.findElement(By.xpath("//input[@type='text']"));
           
            searchBox.sendKeys("Samsung");
            
            searchBox.sendKeys(Keys.ENTER);

            // Wait for suggestions to load
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            List<WebElement> suggestions = wait.until(
                ExpectedConditions.visibilityOfAllElementsLocatedBy(
                    By.cssSelector("ul[class*='_2x2Mmc'] li"))
            );

            // Click on the desired suggestion
            for (WebElement suggestion : suggestions) {
                if (suggestion.getText().trim().equalsIgnoreCase("Samsung S24 Ultra")) {
                    suggestion.click();
                    break;
                }
            }

       
        
	}
}
      


