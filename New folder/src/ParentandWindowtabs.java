import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParentandWindowtabs {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		/*
		 * driver.findElement(By.linkText("Multiple Windows")).click();
		 * driver.findElement(By.linkText("Click Here")).click(); Set<String> window =
		 * driver.getWindowHandles(); Iterator<String> it = window.iterator(); String
		 * parentId = it.next(); String childId = it.next();
		 * driver.switchTo().window(childId);
		 * System.out.println(driver.findElement(By.xpath("//h3")).getText());
		 * driver.switchTo().window(parentId);
		 * System.out.println(driver.findElement(By.xpath("//h3")).getText());
		 */

		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		System.out.println("Total links are:" + allLinks.size());
		String keyboard = Keys.chord(Keys.CONTROL, Keys.ENTER);
		for (int i = 0; i < allLinks.size(); i++) {
			
			allLinks.get(i).sendKeys(keyboard);

		}
		Set<String> window = driver.getWindowHandles();
		Iterator<String> abc = window.iterator();

			while (abc.hasNext()) {
				driver.switchTo().window(abc.next());
				
				

			}
driver.quit();
		}

	}


