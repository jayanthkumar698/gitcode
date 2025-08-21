import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Addtocart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		String productNames = "Projector";
		additems(driver, productNames);
	}
	
	public static void additems(WebDriver driver, String productNames) {
		int j=0;
	List<WebElement> items =	driver.findElements(By.xpath("//div[@class='_25HC_u']"));
	
	
	
	for(int i=0; i< items.size(); i++)
	{
	if(productNames.contains((CharSequence) items)) {
		j++;
		
		
	}
	}
		
	}
		

	}



