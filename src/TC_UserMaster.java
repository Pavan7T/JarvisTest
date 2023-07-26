import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_UserMaster {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\MASTERS\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://localhost/Add_Annex_his");
		TC_UserMaster UM= new TC_UserMaster();
		UM.userMaster(driver);
		userMaster(driver);

	};

	public static void userMaster(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String UserName = "Sweet Shweta lenka";
		String LoginName = "sslenka";
		String Email = "sslenka@gmail.com";
		String passWord = "sslenka123";

		driver.findElement(By.id("txtLoginname")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("edpsoftlink");
		driver.findElement(By.id("btnSubmit")).click();

		driver.findElement(By.xpath("//*[@id='HorizontalNavBar']/ul/li[11]/a")).click();
		driver.findElement(By.xpath("//*[@id='HorizontalNavBar\']/ul/li[11]/ul/li[2]/a")).click();
		driver.findElement(By.id("btnAdd")).click();
		driver.findElement(By.id("txtUserName")).sendKeys(UserName);
		driver.findElement(By.id("txtLoginName")).sendKeys(LoginName);

		driver.findElement(By.id("s2id_autogen2")).click();
		driver.findElement(By.className("select2-result-label")).click();

		driver.findElement(By.id("txtEmail")).sendKeys(Email);

		driver.findElement(By.id("s2id_ddlProfile")).click();

		driver.findElement(By.cssSelector("#select2-result-label-19")).click();
		//driver.findElement(By.text("RECEPTIONIST")).click();
		driver.findElement(By.id("txtPassword")).sendKeys(passWord);
		driver.findElement(By.id("btnSave")).click();

		String temp = driver.findElement(By.id("MessageModalText")).getText();
		System.out.println(temp);

		if (temp == "Record not saved!") {

			System.out.println("Test Fail");
		} else {
			System.out.println("Test Passed");
		}
	}

}
