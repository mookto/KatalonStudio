
package cloudstore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {

	WebDriver sadhin;
 
	@BeforeTest
	public void testbrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\User\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		sadhin = new ChromeDriver();
		sadhin.manage().deleteAllCookies();
		sadhin.manage().window().maximize();

	}

	@Test(priority = 0)
	public void searchitem() {
		sadhin.get("https://siiopa.com/console/store");
		sadhin.findElement(By.id("gwt-uid-3")).sendKeys("32hasanmahedi@gmail.com");
		sadhin.findElement(By.id("login-pass")).sendKeys("1111");
		sadhin.findElement(By.className("v-button-caption")).click();

	}

	@Test(priority = 10)
	public void asserttest() {

		String title = sadhin.getTitle();
		Assert.assertEquals(title, "Siiopa backoffice console");
		System.out.println("The title of page " + title);
		
	}
}