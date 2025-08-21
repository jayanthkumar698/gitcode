import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class WiproHandsOn {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--password-manager-enabled=false");
		options.addArguments("--disable-save-password-bubble");
		options.addArguments("--disable-features=PasswordManagerOnboarding,PasswordLeakDetection");
		WebDriver driver = new ChromeDriver(options);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://petstore.octoperf.com/actions/Catalog.action");
		driver.findElement(By.xpath("//div[@id='MenuContent']/descendant::a[text()='Sign In']")).click();
		driver.findElement(By.name("username")).sendKeys("test4321");
		WebElement passWord = driver.findElement(By.name("password"));
		passWord.sendKeys(Keys.CONTROL + "a");
		passWord.sendKeys(Keys.DELETE);
		passWord.sendKeys("Richmond@1");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Thread.sleep(2000);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='SidebarContent']/a[2]")));
		driver.findElement(By.xpath("//div[@id='SidebarContent']/a[2]")).click();
		driver.findElement(By.xpath("//div[@id='Catalog']/table/tbody/tr[4]/td/a")).click();
		driver.findElement(By.xpath("//div[@id='Catalog']/table/tbody/tr[3]/td[5]/a")).click();
		String item = driver.findElement(By.xpath("//div[@id='Cart']/descendant::tr/td[3]")).getText();
		Assert.assertEquals(item, "Spotted Adult Female Dalmation");
		String price=driver.findElement(By.xpath("//div[@id='Cart']/descendant::tr/td[7]")).getText();
		System.out.println();
		Assert.assertEquals(price, "$18.50");
		driver.findElement(By.xpath("//div[@id='MenuContent']/a[2]")).click();
		driver.quit();
	}
}
