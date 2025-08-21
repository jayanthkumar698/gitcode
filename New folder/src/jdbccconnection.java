import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class jdbccconnection {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		String port = "3306";
		String host = "Localhost";
		Connection con = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/qatest", "root", "root");
		
		Statement s = con.createStatement();
		ResultSet rs = s.executeQuery("select * from Employeeinfo where name ='raja'");
		while (rs.next()) {
			WebDriver driver = new ChromeDriver();
			driver.get("https://login.salesforce.com/");
			driver.findElement(By.id("username")).sendKeys(rs.getString("location"));
			driver.findElement(By.id("password")).sendKeys(rs.getString("id"));
		}

	}

}




		
