package Alumni;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

class UC5_EditProfile {

	// Update_Phone
	@Test
	public void TC301() throws InterruptedException {
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
		driver.manage().window().maximize();
		driver.findElement(By.id("button")).click();
		driver.findElement(By.name("Username")).click();
		driver.findElement(By.name("Username")).sendKeys("theThanayut");
		driver.findElement(By.name("Password")).click();
		driver.findElement(By.name("Password")).sendKeys("111111");
		driver.findElement(By.name("login")).click();
		driver.findElement(By.cssSelector(".dropbtn")).click();
		driver.findElement(By.linkText("เเก้ไขข้อมูลส่วนตัว")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("Tel")).click();
		Thread.sleep(1000);
		// Set variable value
		WebElement Tel = driver.findElement(By.name("Tel"));
		// Clear text
		Tel.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		// Update tel
		Tel.sendKeys("0651134910");

		Thread.sleep(1000);
		driver.findElement(By.name("submit")).click();

		Thread.sleep(1000);

		String actualString = driver.findElement(By.xpath("/html/body/div[2]/a[12]")).getText();
		// subString Example
		// System.out.println("actualString = "+actualString.substring(6,15));
		actualString = actualString.substring(6, 16);

		String expectedString = "0651134910";

		assertTrue(actualString.equals(expectedString));

		Thread.sleep(1000);

		driver.close();
	}

	// Update_Facebook
	@Test
	public void TC302() throws InterruptedException {
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
		driver.manage().window().maximize();
		driver.findElement(By.id("button")).click();
		driver.findElement(By.name("Username")).click();
		driver.findElement(By.name("Username")).sendKeys("theThanayut");
		driver.findElement(By.name("Password")).click();
		driver.findElement(By.name("Password")).sendKeys("111111");
		driver.findElement(By.name("login")).click();
		driver.findElement(By.cssSelector(".dropbtn")).click();
		driver.findElement(By.linkText("เเก้ไขข้อมูลส่วนตัว")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("Facebook")).click();
		Thread.sleep(1000);
		// Set variable value
		WebElement Tel = driver.findElement(By.name("Facebook"));
		// Clear text
		Tel.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		// Update Thanayut Samsang
		Tel.sendKeys("Thanayut Samsang");

		Thread.sleep(1000);
		driver.findElement(By.name("submit")).click();

		Thread.sleep(1000);

		String actualString = driver.findElement(By.xpath("/html/body/div[2]/a[16]")).getText();
		// subString Example
		// System.out.println("actualString = "+actualString.substring(6,22));
		actualString = actualString.substring(6, 22);

		String expectedString = "Thanayut Samsang";

		assertTrue(actualString.equals(expectedString));

		Thread.sleep(1000);

		driver.close();
	}

	// Update_Instagram
	@Test
	public void TC303() throws InterruptedException {
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
		driver.manage().window().maximize();
		driver.findElement(By.id("button")).click();
		driver.findElement(By.name("Username")).click();
		driver.findElement(By.name("Username")).sendKeys("theThanayut");
		driver.findElement(By.name("Password")).click();
		driver.findElement(By.name("Password")).sendKeys("111111");
		driver.findElement(By.name("login")).click();
		driver.findElement(By.cssSelector(".dropbtn")).click();
		driver.findElement(By.linkText("เเก้ไขข้อมูลส่วนตัว")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("Instagram")).click();
		Thread.sleep(1000);
		// Set variable value
		WebElement Tel = driver.findElement(By.name("Instagram"));
		// Clear text
		Tel.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		// Update Thanayut Samsang
		Tel.sendKeys("The.Noch");

		Thread.sleep(1000);
		driver.findElement(By.name("submit")).click();

		Thread.sleep(1000);

		String actualString = driver.findElement(By.xpath("/html/body/div[2]/a[18]")).getText();
		// subString Example
		// System.out.println("actualString = "+actualString.substring(6,22));
		actualString = actualString.substring(6,14);

		String expectedString = "The.Noch";

		assertTrue(actualString.equals(expectedString));

		Thread.sleep(1000);

		driver.close();
	}

}
