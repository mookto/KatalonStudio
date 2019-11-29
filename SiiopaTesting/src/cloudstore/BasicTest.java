package cloudstore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BasicTest {

	WebDriver driver;

	/*
	 * @Test (priority=0) public void login() {
	 * driver.findElement(By.id("gwt-uid-3")).sendKeys("60hasanmahedi@gmail.com");
	 * driver.findElement(By.id("login-pass")).sendKeys("1111");
	 * driver.findElement(By.className("v-button-caption")).click();
	 * 
	 * }
	 */

	@Test(priority = 1)
	public void createitem() {
		try {
			/*
			 * driver.findElement(By.id("gwt-uid-3")).sendKeys("60hasanmahedi@gmail.com");
			 * driver.findElement(By.id("login-pass")).sendKeys("1111");
			 * driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();
			 */
			WebElement Report = driver.findElement(By.id("gwt-uid-6"));
			Select report = new Select(Report);
			report.selectByVisibleText("Automotive");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@BeforeTest
	public void openbrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\User\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		//driver.get("http://192.168.0.110:8080/console/store");
		driver.get("https://www.amazon.com/");  //tradional dropdown works with selenium 
	}

	/*
	 * @AfterTest public void closebrowser() { driver.close(); }
	 */
}
