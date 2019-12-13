package Testingdemo;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Commonfunctions 

{
	static String value;

	public static WebDriver driver;     

	public static WebDriver startBrowser() throws Throwable {
		if (Propertiesdata1.getkeyvalue("browser").equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}
		else if (Propertiesdata1.getkeyvalue("browser").equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\PC\\git\\repository5\\DemoProject\\Driversdata\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if (Propertiesdata1.getkeyvalue("browser").equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.ie.driver", "C:\\Users\\PC\\git\\repository5\\DemoProject\\Driversdata\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		else {
			System.out.println("Failed to start browser");
		}
		return driver;
	}

	public static void urlHitting(String url) throws Throwable {

		driver.get(url);
		driver.manage().window().maximize();

	}

	public static void clearingData(WebDriver driver, String locatortype, String locatorvalue) {
		if (locatortype.equalsIgnoreCase("id")) {
			driver.findElement(By.id(locatorvalue)).clear();
		}
		
	}
	public static void staticwait(WebDriver driver) throws InterruptedException {
		Thread.sleep(3000);

	}
	public static String textofElement(WebDriver driver, String locatortype, String locatorvalue) {
      
		if (locatortype.equalsIgnoreCase("id")) {

	String data1=	driver.findElement(By.id(locatorvalue)).getText();
	System.out.println(data1);
		
	}

		else if (locatortype.equalsIgnoreCase("xpath")) {

	String data1=	driver.findElement(By.id(locatorvalue)).getText();
	System.out.println(data1);
		
	}
		return locatorvalue;
	}
	public static void clickonButton(WebDriver driver, String locatortype, String locatorvalue) throws Throwable {

		if (locatortype.equalsIgnoreCase("id")) {

			driver.findElement(By.id(locatorvalue)).click();
		}
		else if (locatortype.equalsIgnoreCase("xpath")) {
		

			driver.findElement(By.id(locatorvalue)).click();
		}
	}

	public static void toastMessages() throws Throwable {

		String errormessage = new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.id(Propertiesdata1.getkeyvalue("toastid")))).getText();
		String replacevalue=errormessage.replace("×", "");
		//System.out.println(replacevalue.trim());
		if(replacevalue.contains("Successfully")) {
			System.out.println("Toast Message "+replacevalue.trim());
			System.out.println("Data Added successfully");
		}else if(replacevalue.contains("Company")){
			System.out.println("Toast Message "+replacevalue.trim());
			System.out.println("Data Adding Unsuccessful");
		}
	}

	public static String sendingData(WebDriver driver, String locatortype, String locatorvalue, String data)
			throws Throwable {

		if (locatortype.equalsIgnoreCase("id")) {
			driver.findElement(By.id(locatorvalue)).clear();

			driver.findElement(By.id(locatorvalue)).sendKeys(data);
		}
		else if (locatortype.equalsIgnoreCase("xpath")) {
			driver.findElement(By.id(locatorvalue)).clear();

			driver.findElement(By.id(locatorvalue)).sendKeys(data);
		}

		return data;
	}

	public static void explicitwait(WebDriver driver, String locatortype, String locatorvalue, String waittime) {

		WebDriverWait wait = new WebDriverWait(driver, Integer.parseInt(waittime));
		if (locatortype.equalsIgnoreCase("id")) {

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(locatorvalue)));
		} else if (locatortype.equalsIgnoreCase("name")) {

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(locatorvalue)));
		} else if (locatortype.equalsIgnoreCase("xpath")) {

			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(locatorvalue)));
		}

	}

	public static void implicitWait1(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	public static void closeBrowser(WebDriver driver) {

		driver.close();
	}

	public static void submitButton(WebDriver driver, String locatortype, String locatorvalue) {

		if (locatortype.equalsIgnoreCase("xpath")) {
			driver.findElement(By.xpath(locatorvalue)).submit();
		} else if (locatortype.equalsIgnoreCase("id")) {
			driver.findElement(By.id(locatorvalue)).submit();
		} else if (locatortype.equalsIgnoreCase("name")) {
			driver.findElement(By.name(locatorvalue)).submit();
		}
	}

	public static void alertsHandle() {
		String al = driver.switchTo().alert().getText();
		System.out.println(al);
		String str1="ok";
		String str2="cancel";
		if(str1.equalsIgnoreCase("ok")) {
		driver.switchTo().alert().accept();
		System.out.println("Alert Accepted");
	}
	else if(str2.equalsIgnoreCase("cancel")){
		
		driver.switchTo().alert().dismiss();
		System.out.println("Alert Accepted on cancel btn");
	}
	else {
		System.out.println("Alert Accept/dismiss Failed");
	}
	}
	public static void data(WebDriver driver, String loctortype, String locatorvalue) throws IOException {
		String message = "";
		if (loctortype.equalsIgnoreCase("id")) {
			message = driver.findElement(By.id(locatorvalue)).getAttribute("value");
		} else if (loctortype.equalsIgnoreCase("xpath")) {
			message = driver.findElement(By.xpath(locatorvalue)).getAttribute("value");
		} else if (loctortype.equalsIgnoreCase("name")) {
			message = driver.findElement(By.name(locatorvalue)).getAttribute("value");

		}

	}

	public static void mouseOvers() {

		Actions act = new Actions(driver);
		act.moveToElement(
				driver.findElement(By.xpath("//li[@id='mi_a_stock_items']//a[contains(text(),'Stock Items')]")));
		act.build().perform();

		act.moveToElement(driver
				.findElement(By.xpath("//li[@id='mi_a_stock_categories']//a[contains(text(),'Stock Categories')]")))
				.click().build().perform();

	}

}
