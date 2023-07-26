
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PatientDeleteTask {

	WebDriver driver = null;

	@Test
	public void driversetup() throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver", "D:D:\\\\MASTERS\\\\Selenium\\\\Drivers\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.navigate().to("http://localhost/Add_Annex_his");
		driver.findElement(By.id("txtLoginname")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("edpsoftlink");
		driver.findElement(By.id("btnSubmit")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("btnOPD")).click();
		driver.findElement(By.id("btnAdd")).click();
		driver.findElement(By.id("MRN")).sendKeys("AAHC00091408");
		driver.findElement(By.id("btnSave")).click();
		
	}

	/*@Test
	public void login() {

	}

	@AfterTest
	public void end() {
		System.out.println("Test completed successfully");
	}*/

}
