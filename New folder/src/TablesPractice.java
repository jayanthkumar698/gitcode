import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class TablesPractice {


	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> rrr = driver.findElements(By.cssSelector("table[class=\"table-display\"] tbody tr"));
		System.out.println(rrr.size());
		
		List<WebElement> ccc =	driver.findElements(By.cssSelector("table[class=\"table-display\"] tbody tr th"));
		System.out.println(ccc.size());
		
		
		WebElement ddd=  driver.findElement(By.cssSelector("table[class='table-display'] tbody tr:nth-child(4)"));
	File file = 	ddd.getScreenshotAs(OutputType.FILE);
	FileUtils.copyDirectory(file, new File("logo.png"));
		System.out.println(ddd.getText());
		
		
	File src =	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	String timestamp = String.valueOf(System.currentTimeMillis());

			FileUtils.copyFile(src,new File("C://users//v-jayn//screenshot_" +timestamp+ ".png"));
			driver.quit();
	}
	

}
