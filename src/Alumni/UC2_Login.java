package Alumni;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

class UC2_Login {

	// Login_pass
	@Test
	public void TC201() throws InterruptedException {
		WebDriver driver = null;
		String browser = "chrome";

		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\user\\OneDrive\\Desktop\\Webdriver\\chromedriver.exe");
			driver = new ChromeDriver();
		}

		else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\user\\OneDrive\\Desktop\\Webdriver\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.get("http://localhost/Alumni/index.php/Alumni/index");
		driver.findElement(By.id("button")).click();

		Thread.sleep(500);

		driver.findElement(By.name("Username")).click();
		driver.findElement(By.name("Username")).sendKeys("theThanayut");

		Thread.sleep(500);

		driver.findElement(By.name("Password")).click();
		driver.findElement(By.name("Password")).sendKeys("111111");
		driver.findElement(By.name("Password")).sendKeys(Keys.ENTER);

		Thread.sleep(500);

		driver.findElement(By.cssSelector(".dropbtn")).click();
		driver.findElement(By.linkText("ดูโปรไฟล์")).click();

		String actualString = driver.findElement(By.xpath("//html/body/div[2]/a[2]")).getText();
		// subString Example
		// System.out.println("actualString = "+actualString.substring(6,15));
		actualString = actualString.substring(6, 15);

		String expectedString = "114259018";

		assertTrue(actualString.equals(expectedString));

		driver.close();
	}

	// Login_fail_(Wrong username or password !)
	@Test
	public void TC202() throws InterruptedException {
		WebDriver driver = null;
		String browser = "chrome";

		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\user\\OneDrive\\Desktop\\Webdriver\\chromedriver.exe");
			driver = new ChromeDriver();
		}

		else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\user\\OneDrive\\Desktop\\Webdriver\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.get("http://localhost/Alumni/index.php/Alumni/index");
		driver.findElement(By.id("button")).click();

		Thread.sleep(500);

		driver.findElement(By.name("Username")).click();
		driver.findElement(By.name("Username")).sendKeys("yutthana");

		Thread.sleep(500);

		driver.findElement(By.name("Password")).click();
		driver.findElement(By.name("Password")).sendKeys("1212312121");
		driver.findElement(By.name("Password")).sendKeys(Keys.ENTER);

		// Switching to Alert
		Alert alert = driver.switchTo().alert();

		// Capturing alert message.
		String alertMessage = driver.switchTo().alert().getText();

		// Displaying alert message
		System.out.println(alertMessage);
		Thread.sleep(1000);

		String expectedString = "กรุณาสมัครสมาชิกก่อนค่ะ!";

		assertTrue(alertMessage.equals(expectedString));

		// Accepting alert
		alert.accept();

		driver.close();
	}

	// Login_fail_(No username or password was entered. !)
	@Test
	public void TC203() throws InterruptedException {
		WebDriver driver = null;
		String browser = "chrome";

		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\user\\OneDrive\\Desktop\\Webdriver\\chromedriver.exe");
			driver = new ChromeDriver();
		}

		else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\user\\OneDrive\\Desktop\\Webdriver\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.get("http://localhost/Alumni/index.php/Alumni/index");
		driver.findElement(By.id("button")).click();

		Thread.sleep(500);

		driver.findElement(By.name("Username")).click();
		driver.findElement(By.name("Username")).sendKeys("yutthana");

		Thread.sleep(500);

		driver.findElement(By.name("Password")).sendKeys(Keys.ENTER);

		// Switching to Alert
		Alert alert = driver.switchTo().alert();

		// Capturing alert message.
		String alertMessage = driver.switchTo().alert().getText();

		// Displaying alert message
		System.out.println(alertMessage);
		Thread.sleep(1000);

		String expectedString = "กรุณาสมัครสมาชิกก่อนค่ะ!";

		assertTrue(alertMessage.equals(expectedString));

		// Accepting alert
		alert.accept();

		driver.close();
	}
}
