import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.spicejet.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        String date = "26";
        int monthNumber = 13; // 👉 You provide this as input (1 to 12)
        String month = "";
        String year = "2026";

        // ✅ Convert monthNumber to monthName using switch
        switch (monthNumber) {
            case 1:  month = "January";   break;
            case 2:  month = "February";  break;
            case 3:  month = "March";     break;
            case 4:  month = "April";     break;
            case 5:  month = "May";       break;
            case 6:  month = "June";      break;
            case 7:  month = "July";      break;
            case 8:  month = "August";    break;
            case 9:  month = "September"; break;
            case 10: month = "October";   break;
            case 11: month = "November";  break;
            case 12: month = "December";  break;
            default:
                System.out.println("Invalid month number: " + monthNumber);
                driver.quit();
                return;
        }

        // Set implicit wait and open calendar
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//div[@data-testid='departure-date-dropdown-label-test-id']")).click();
        Thread.sleep(2000);

        // ✅ Use converted month name in XPath
        String xpath = "//div[contains(@data-testid,'month-" + month + "-" + year + "')]//div[@data-testid='undefined-calendar-day-" + date + "']/div";
        System.out.println("Using XPath: " + xpath);

        driver.findElement(By.xpath(xpath)).click();

        // Optional scrolling if needed
        /*
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0, 1200)");
        */

        // Done
    }

}
