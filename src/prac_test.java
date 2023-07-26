import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class prac_test {

	
	WebDriver driver=null;
	
	
	@Test
	public void setup() // First test case.
	{
		System.setProperty("webdriver.chrome.driver", "D:\\MASTERS\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	
	@Test
	public void test2() throws InterruptedException // Second test case.
	{
		driver.navigate().to("http://localhost/Add_Annex_his");
		driver.findElement(By.id("txtLoginname")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("edpsoftlink");
		driver.findElement(By.id("btnSubmit")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("btnOPD")).click();
		driver.findElement(By.id("btnAdd")).click();
		driver.findElement(By.id("MRN")).sendKeys("AAHC00091407");
		driver.findElement(By.id("btnSave")).click();
		driver.close();
		driver.quit();
	}

	// System.setProperty("webdriver.chrome.driver",
	// "D:\\MASTERS\\Selenium\\chromedriver_win32\\chromedriver.exe");
	// WebDriver driver = new ChromeDriver();

}