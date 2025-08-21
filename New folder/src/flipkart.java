import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class flipkart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		Actions a = new Actions(driver);
		WebElement dslr1 = driver.findElement(By.xpath("//span[text()='Electronics']"));
		a.moveToElement(dslr1).perform();
		WebElement dslr = driver.findElement(By.xpath("//a[text()='Cameras & Accessories']"));
		a.moveToElement(dslr).perform();
		Thread.sleep(1000);
		WebElement dslr2  = driver.findElement(By.xpath("//a[text() = 'DSLR & Mirrorless']"));
		dslr2.click();
		List<WebElement> element = driver.findElements(By.xpath("//div[@data-id='DLLFAEWE22ZAERXG']//img"));
		System.out.println("Image Count = " + element.size());
		driver.quit();
	}

}
