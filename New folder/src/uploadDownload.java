import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class uploadDownload {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		String downloadPath = System.getProperty("user.dir")+"/downloadFiles";
		HashMap<String,Object> chromePrefs = new HashMap<String, Object>();
		chromePrefs.put("profile.default_content_settings.popups", 0);
		chromePrefs.put("download.default_directory", downloadPath);
		
		
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("Prefs", chromePrefs);
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ilovepdf.com/jpg_to_pdf");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Select JPG images")).click();
		Thread.sleep(1000);
		Runtime.getRuntime().exec("C:\\executor.exe");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@id='processTask']")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("pickfiles")).click();
		Thread.sleep(1000);
		File f = new File(downloadPath);
		if (f.exists()) {
			System.out.println("file exists");
		}
		
	}
		
		
	}


