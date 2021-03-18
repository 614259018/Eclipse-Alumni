package Alumni;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

class UC1_Register {
	// Register_pass
	@Test
	public void TC101() throws InterruptedException {
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
	    driver.findElement(By.id("buttonReg")).click();
	    driver.findElement(By.name("Std_ID")).click();
	    driver.findElement(By.name("Std_ID")).sendKeys("614159008");
	    driver.findElement(By.name("classroom")).click();
	    driver.findElement(By.name("classroom")).sendKeys("61/100");
	    driver.findElement(By.name("Name_LastName")).click();
	    driver.findElement(By.name("Name_LastName")).sendKeys("à¸?à¸?à¸²à¸¢à¸¸à¸—à¸? à¸ªà¸²à¸¡à¸ªà¸±à¸?à¸?à¹?");
	    driver.findElement(By.id("ID_Card")).click();
	    driver.findElement(By.id("ID_Card")).sendKeys("1729800227689");
	    driver.findElement(By.name("Date_Of_Birth")).click();
	    {
	      WebElement element = driver.findElement(By.name("Date_Of_Birth"));
	      Actions builder = new Actions(driver);
	      builder.doubleClick(element).perform();
	    }
	    driver.findElement(By.name("Date_Of_Birth")).sendKeys("2542-10-04");
	    driver.findElement(By.name("Sex")).click();
	    driver.findElement(By.name("Tel")).click();
	    driver.findElement(By.name("Tel")).sendKeys("0925439856");
	    driver.findElement(By.id("E-mail")).click();
	    driver.findElement(By.id("E-mail")).sendKeys("614259018@webmail.npru.ac.th");
	    driver.findElement(By.name("Facebook")).click();
	    driver.findElement(By.name("Facebook")).sendKeys("Thanayut Samsang");
	    driver.findElement(By.id("Instagram")).click();
	    driver.findElement(By.id("Instagram")).sendKeys("the.noch");
	    driver.findElement(By.cssSelector(".box2 > .input:nth-child(3) > input")).click();
	    driver.findElement(By.cssSelector(".box2 > .input:nth-child(3) > input")).sendKeys("à¸?à¸?à¸²à¸¢à¸¸à¸—à¸? à¸ªà¸²à¸¡à¸ªà¸±à¸?à¸?à¹?");
	    driver.findElement(By.name("End_Year")).click();
	    driver.findElement(By.name("End_Year")).sendKeys("2561");
	    driver.findElement(By.name("district")).click();
	    driver.findElement(By.name("district")).sendKeys("à¸?à¸²à¸?à¸•à¸²à¹€à¸–à¸£");
	    driver.findElement(By.name("canton")).click();
	    driver.findElement(By.name("canton")).sendKeys("à¸ªà¸­à¸?à¸?à¸µà¹?à¸?à¹?à¸­à¸?");
	    driver.findElement(By.name("province")).click();
	    driver.findElement(By.name("province")).sendKeys("à¸ªà¸¸à¸?à¸£à¸£à¸“à¸?à¸¸à¸£à¸µ");
	    driver.findElement(By.name("Postal_code")).click();
	    driver.findElement(By.name("Postal_code")).sendKeys("72110");
	    driver.findElement(By.name("Company_Name")).click();
	    driver.findElement(By.name("Company_Name")).sendKeys("à¸?à¸¥à¸²à¸?à¸±à¸”à¸«à¸¥à¸±à¸?à¸«à¹?à¸­à¸?");
	    driver.findElement(By.name("Company_Address")).click();
	    driver.findElement(By.name("Company_Address")).sendKeys("88/1");
	    driver.findElement(By.name("Profession")).click();
	    driver.findElement(By.name("Profession")).sendKeys("programmer");
	    driver.findElement(By.name("Rank")).click();
	    driver.findElement(By.name("Rank")).sendKeys("developer");
	    driver.findElement(By.name("Company_Tel")).click();
	    driver.findElement(By.name("Company_Tel")).sendKeys("0651134910");
	    driver.findElement(By.name("Username")).click();
	    driver.findElement(By.name("Username")).sendKeys("theThanayut");
	    driver.findElement(By.name("Password")).click();
	    driver.findElement(By.name("Password")).sendKeys("111111");
	    driver.findElement(By.name("Re_Password")).click();
	    driver.findElement(By.name("Re_Password")).sendKeys("111111");
	    driver.findElement(By.name("submit")).click();

		String actualString = driver.findElement(By.cssSelector(".p1")).getText();

		String expectedString = "à¸ªà¸²à¸?à¸²à¸§à¸´à¸¨à¸§à¸?à¸£à¸£à¸¡à¸?à¸­à¸?à¸•à¹?à¹?à¸§à¸£à¹?";

		// assertTrue(actualString.contains(expectedString));
		assertEquals(actualString, expectedString);

		Thread.sleep(500);

		driver.close();
	}

	// Register_fail
	@Test
	public void TC102() throws InterruptedException {
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
		Thread.sleep(2000);
		driver.get("http://localhost/Alumni/index.php/Alumni/index");
		driver.manage().window().maximize();
	    driver.findElement(By.id("buttonReg")).click();
	    driver.findElement(By.name("Std_ID")).click();
	    driver.findElement(By.name("Std_ID")).sendKeys("114259016");
	    driver.findElement(By.name("classroom")).click();
	    driver.findElement(By.name("classroom")).sendKeys("61/100");
	    driver.findElement(By.name("Name_LastName")).click();
	    driver.findElement(By.name("Name_LastName")).sendKeys("à¸?à¸?à¸²à¸¢à¸¸à¸—à¸? à¸ªà¸²à¸¡à¸ªà¸±à¸?à¸?à¹?");
	    driver.findElement(By.id("ID_Card")).click();
	    driver.findElement(By.id("ID_Card")).sendKeys("1729800227689");
	    driver.findElement(By.name("Date_Of_Birth")).click();
	    {
	      WebElement element = driver.findElement(By.name("Date_Of_Birth"));
	      Actions builder = new Actions(driver);
	      builder.doubleClick(element).perform();
	    }
	    driver.findElement(By.name("Date_Of_Birth")).sendKeys("2542-10-04");
	    driver.findElement(By.name("Sex")).click();
	    driver.findElement(By.name("Tel")).click();
	    driver.findElement(By.name("Tel")).sendKeys("0925439856");
	    driver.findElement(By.id("E-mail")).click();
	    driver.findElement(By.id("E-mail")).sendKeys("614259018@webmail.npru.ac.th");
	    driver.findElement(By.name("Facebook")).click();
	    driver.findElement(By.name("Facebook")).sendKeys("Thanayut Samsang");
	    driver.findElement(By.id("Instagram")).click();
	    driver.findElement(By.id("Instagram")).sendKeys("the.noch");
	    driver.findElement(By.cssSelector(".box2 > .input:nth-child(3) > input")).click();
	    driver.findElement(By.cssSelector(".box2 > .input:nth-child(3) > input")).sendKeys("à¸?à¸?à¸²à¸¢à¸¸à¸—à¸? à¸ªà¸²à¸¡à¸ªà¸±à¸?à¸?à¹?");
	    driver.findElement(By.name("End_Year")).click();
	    driver.findElement(By.name("End_Year")).sendKeys("2565");
	    driver.findElement(By.name("district")).click();
	    driver.findElement(By.name("district")).sendKeys("à¸?à¸²à¸?à¸•à¸²à¹€à¸–à¸£");
	    driver.findElement(By.name("canton")).click();
	    driver.findElement(By.name("canton")).sendKeys("à¸ªà¸­à¸?à¸?à¸µà¹?à¸?à¹?à¸­à¸?");
	    driver.findElement(By.name("province")).click();
	    driver.findElement(By.name("province")).sendKeys("à¸ªà¸¸à¸?à¸£à¸£à¸“à¸?à¸¸à¸£à¸µ");
	    driver.findElement(By.name("Postal_code")).click();
	    driver.findElement(By.name("Postal_code")).sendKeys("72110");
	    driver.findElement(By.name("Company_Name")).click();
	    driver.findElement(By.name("Company_Name")).sendKeys("à¸?à¸¥à¸²à¸?à¸±à¸”à¸«à¸¥à¸±à¸?à¸«à¹?à¸­à¸?");
	    driver.findElement(By.name("Company_Address")).click();
	    driver.findElement(By.name("Company_Address")).sendKeys("88/1");
	    driver.findElement(By.name("Profession")).click();
	    driver.findElement(By.name("Profession")).sendKeys("programmer");
	    driver.findElement(By.name("Rank")).click();
	    driver.findElement(By.name("Rank")).sendKeys("developer");
	    driver.findElement(By.name("Company_Tel")).click();
	    driver.findElement(By.name("Company_Tel")).sendKeys("0651134910");
	    driver.findElement(By.name("Username")).click();
	    driver.findElement(By.name("Username")).sendKeys("theThanayut");
	    driver.findElement(By.name("Password")).click();
	    driver.findElement(By.name("Password")).sendKeys("111111");
	    driver.findElement(By.name("Re_Password")).click();
	    driver.findElement(By.name("Re_Password")).sendKeys("111111");
	    driver.findElement(By.name("submit")).click();

		String actualString = driver.findElement(By.xpath("//*[@id=\"container\"]/h1")).getText();

		String expectedString = "A Database Error Occurred";

		// assertTrue(actualString.contains(expectedString));
		assertEquals(actualString, expectedString);

		Thread.sleep(500);

		driver.close();
	}

	// Register_fail
	@Test
	public void TC103() throws InterruptedException {
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
		Thread.sleep(1000);
		driver.get("http://localhost/Alumni/index.php/Alumni/index");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//a[contains(text(),\'Register\')]")).click();

		driver.findElement(By.name("Username")).click();
		driver.findElement(By.name("Username")).sendKeys("theNoch");

		driver.findElement(By.name("Password")).click();
		driver.findElement(By.name("Password")).sendKeys("nochee2542");

		driver.findElement(By.name("Re_Password")).click();
		driver.findElement(By.name("Re_Password")).sendKeys("nochee2542");

		driver.findElement(By.name("submit")).click();

		String actualString = driver.findElement(By.xpath("/html/body")).getText();

		String expectedString = "à¹?à¸¡à¹?à¸ªà¸²à¸¡à¸²à¸£à¸–à¹€à¸?à¸´à¹?à¸¡à¸?à¹?à¸­à¸¡à¸¹à¸¥à¹?à¸”à¹?à¸?à¹?à¸° !";

		// assertTrue(actualString.contains(expectedString));
		assertEquals(actualString, expectedString);

		driver.close();
	}
}
