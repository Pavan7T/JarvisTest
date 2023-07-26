import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;

public class DateSelector {

	public static void main(String[] args) throws InterruptedException {
		
		
		//ChromeOptions co=new ChromeOptions();
		//co.addArguments("--remote-allow-origins=*");
		
		System.setProperty("webdriver.chrome.driver", "D:\\MASTERS\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String UserName="nhmodisha";
		String PassCode="nhm123";
	
		driver.manage().window().maximize();
		driver.navigate().to("http://localhost/ImagineRIS/ExternalDashboard/index/NHMDashboard");
		//driver.findElement(By.xpath("//*[@id=\'inputText\']")).click();
		driver.findElement(By.xpath("//a[@class='btn btn-primary btnNHM-CDMOLogin'][1]")).click();
		driver.findElement(By.id("LOGINNAME")).sendKeys(UserName);
		driver.findElement(By.id("PASSWORD")).sendKeys(PassCode);
		driver.findElement(By.className("select2-selection__rendered"));
		driver.findElement(By.id("MainFormLogin")).click();
		

	}

}
