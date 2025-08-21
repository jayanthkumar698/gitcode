import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import graphql.Assert;

public class Spicejet {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.manage().window().maximize();

		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-zso239'])[2]")).click();

		w.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//div[@data-testid='to-testID-origin'] //input[@type='text']")));

		driver.findElement(By.xpath("//div[@data-testid='to-testID-origin'] //input[@type='text']")).click();

		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='HYD']")));
		driver.findElement(By.xpath("//div[text()='HYD']")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[@class='css-1dbjc4n r-1awozwy r-1loqt21 r-18u37iz r-1wtj0ep r-b5h31w r-rnv2vh r-5njf8e r-1otgn73']//div[contains(text(),'MAA')]")));
		driver.findElement(By.xpath(
				"//div[@class='css-1dbjc4n r-1awozwy r-1loqt21 r-18u37iz r-1wtj0ep r-b5h31w r-rnv2vh r-5njf8e r-1otgn73']//div[contains(text(),'MAA')]"))
				.click();
		driver.findElement(By.xpath("//div[@class='css-76zvg2 r-jwli3a r-ubezar r-16dba41']")).click();
		driver.findElement(By.xpath("//div[@class='css-76zvg2 r-jwli3a r-ubezar r-16dba41']")).click();

		driver.findElement(By.xpath("//div[contains(text(),'1 Adult')]")).click();

		for (int i = 1; i < 4; i++) {
			driver.findElement(By.xpath("//div[@data-testid = 'Adult-testID-plus-one-cta']")).click();

		}

		Thread.sleep(2000);
		// w.until(ExpectedConditions.elementToBeClickable(By.xpath("css-1dbjc4n
		// r-1awozwy r-19m6qjp r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-d9fdf6 r-1w50u8q
		// r-ah5dr5 r-1otgn73']")));

		WebElement element = driver.findElement(By.xpath(
				"//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-d9fdf6 r-1w50u8q r-ah5dr5 r-1otgn73']"));
		element.click();

		driver.findElement(By.xpath("(//div[contains(text(),'Armed Forces')])[2]")).click();
		Assert.assertTrue(driver.findElement(By.xpath("(//div[contains(text(),'Armed Forces')])[2]")).isEnabled());
		driver.findElement(By.xpath(
				"//div[@class='css-1dbjc4n r-1awozwy r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-d9fdf6 r-1w50u8q r-ah5dr5 r-1otgn73']"))
				.click();

	}

}
