package Alumni;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

class UC3_Search {
	// Search_by_id
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
		driver.findElement(By.id("button")).click();

		Thread.sleep(500);

		driver.findElement(By.name("Username")).click();
		driver.findElement(By.name("Username")).sendKeys("theThanayut");

		Thread.sleep(500);

		driver.findElement(By.name("Password")).click();
		driver.findElement(By.name("Password")).sendKeys("111111");
		driver.findElement(By.name("Password")).sendKeys(Keys.ENTER);

		Thread.sleep(500);

		driver.findElement(By.xpath("/html/body/nav/div/li/a")).click();
		Thread.sleep(1000);

		driver.findElement(By.linkText("ค้นหาจากรหัสนักศึกษา")).click();
		driver.findElement(By.id("Std_ID")).click();
		driver.findElement(By.id("Std_ID")).sendKeys("114259018");

		Thread.sleep(1000);

		driver.findElement(By.cssSelector(".search")).click();

		String actualString = driver.findElement(By.cssSelector(".Name_LastName"))
				.getText();

		String expectedString = "ธนายุทธ สามสังข์";

		assertTrue(actualString.contains(expectedString));

		Thread.sleep(1000);

		driver.close();
	}

	// Search_by_name
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
		driver.findElement(By.id("button")).click();

		Thread.sleep(500);

		driver.findElement(By.name("Username")).click();
		driver.findElement(By.name("Username")).sendKeys("theThanayut");

		Thread.sleep(500);

		driver.findElement(By.name("Password")).click();
		driver.findElement(By.name("Password")).sendKeys("111111");
		driver.findElement(By.name("Password")).sendKeys(Keys.ENTER);

		Thread.sleep(500);

		driver.findElement(By.xpath("/html/body/nav/div/li/a")).click();
		Thread.sleep(1000);

		driver.findElement(By.linkText("ค้นหาจากชื่อนักศึกษา")).click();
		driver.findElement(By.id("FName_LName")).click();
		driver.findElement(By.id("FName_LName")).sendKeys("ธนายุทธ สามสังข์");

		Thread.sleep(1000);

		driver.findElement(By.cssSelector(".search")).click();

		String actualString = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[2]/td[1]/center"))
				.getText();

		String expectedString = "114259006";

		assertTrue(actualString.contains(expectedString));

		Thread.sleep(1000);

		driver.close();
	}

	// Search_by_end_year
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
		driver.findElement(By.id("button")).click();

		Thread.sleep(500);

		driver.findElement(By.name("Username")).click();
		driver.findElement(By.name("Username")).sendKeys("theThanayut");

		Thread.sleep(500);

		driver.findElement(By.name("Password")).click();
		driver.findElement(By.name("Password")).sendKeys("111111");
		driver.findElement(By.name("Password")).sendKeys(Keys.ENTER);

		Thread.sleep(500);

		driver.findElement(By.xpath("/html/body/nav/div/li/a")).click();
		Thread.sleep(1000);

		driver.findElement(By.linkText("ค้นหาจากปีที่เข้า")).click();
		driver.findElement(By.id("End_Year")).click();
		driver.findElement(By.id("End_Year")).sendKeys("2561");

		Thread.sleep(1000);

		driver.findElement(By.cssSelector(".search")).click();

		String actualString = driver.findElement(By.cssSelector(".classroom"))
				.getText();

		String expectedString = "61/100";

		assertTrue(actualString.contains(expectedString));

		Thread.sleep(1000);

		driver.close();
	}
	// Search_by_province
	@Test
	public void TC304() throws InterruptedException {
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

		driver.findElement(By.xpath("/html/body/nav/div/li/a")).click();
		Thread.sleep(1000);

		driver.findElement(By.linkText("ค้นหาจากจังหวัด")).click();
		driver.findElement(By.id("province")).click();
		driver.findElement(By.id("province")).sendKeys("สุพรรณบุรี");

		Thread.sleep(1000);

		driver.findElement(By.cssSelector(".search")).click();

		String actualString = driver.findElement(By.cssSelector(".Postal_code"))
				.getText();

		String expectedString = "72110";

		assertTrue(actualString.contains(expectedString));

		Thread.sleep(1000);

		driver.close();
	}
	// Search_by_class
	@Test
	public void TC305() throws InterruptedException {
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

		driver.findElement(By.xpath("/html/body/nav/div/li/a")).click();
		Thread.sleep(1000);

		driver.findElement(By.linkText("ค้นหาจากหมู่เรียน")).click();
		driver.findElement(By.id("classroom")).click();
		driver.findElement(By.id("classroom")).sendKeys("61/100");

		Thread.sleep(1000);

		driver.findElement(By.cssSelector(".search")).click();

		String actualString = driver.findElement(By.cssSelector(".End_Year"))
				.getText();

		String expectedString = "2561";

		assertTrue(actualString.contains(expectedString));

		Thread.sleep(1000);

		driver.close();
	}

}
