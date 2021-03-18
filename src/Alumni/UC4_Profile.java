package Alumni;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

class UC4_Profile {
	// Check_id
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
		Thread.sleep(1000);
		driver.findElement(By.name("Password")).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".dropbtn")).click();
		driver.findElement(By.linkText("¥Ÿ‚ª√‰ø≈Ï")).click();

		Thread.sleep(1000);

		String actualString = driver.findElement(By.xpath("/html/body/div[2]/a[2]")).getText();
		// subString Example
		// System.out.println("actualString = "+actualString.substring(6,15));
		actualString = actualString.substring(6, 15);

		String expectedString = "114259018";

		assertTrue(actualString.equals(expectedString));

		Thread.sleep(1000);

		driver.close();
	}

	// Check_name
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
		Thread.sleep(1000);
		driver.findElement(By.name("Password")).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".dropbtn")).click();
		driver.findElement(By.linkText("¥Ÿ‚ª√‰ø≈Ï")).click();

		Thread.sleep(1000);

		String actualString = driver.findElement(By.xpath("/html/body/div[2]/a[4]")).getText();
		// subString Example
		// System.out.println("actualString = "+actualString.substring(6,15));
		actualString = actualString.substring(6, 22);

		String expectedString = "∏π“¬ÿ∑∏  “¡ —ß¢Ï";

		assertTrue(actualString.equals(expectedString));

		Thread.sleep(1000);

		driver.close();
	}

	// Check_classroom
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
		Thread.sleep(1000);
		driver.findElement(By.name("Password")).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".dropbtn")).click();
		driver.findElement(By.linkText("¥Ÿ‚ª√‰ø≈Ï")).click();

		Thread.sleep(1000);

		String actualString = driver.findElement(By.xpath("/html/body/div[2]/a[6]")).getText();
		// subString Example
		// System.out.println("actualString = "+actualString.substring(6,15));
		actualString = actualString.substring(6, 12);

		String expectedString = "61/100";

		assertTrue(actualString.equals(expectedString));

		Thread.sleep(1000);

		driver.close();
	}

}
