import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeOptio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions();
		options.addExtensions(new File("/path/to/extension.crx"));
		ChromeDriver driver = new ChromeDriver();
		Proxy proxy = new Proxy();
		proxy.setHttpProxy("myhttpproxy:3337");
		
		
	File src = 	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src, new File("C://Users//v-jayn//screenshot.png"))
		

	}

	private void addExtensions(File file) {
		// TODO Auto-generated method stub
		
	}

	public void addArguments(String string) {
		// TODO Auto-generated method stub
		
	}

}
