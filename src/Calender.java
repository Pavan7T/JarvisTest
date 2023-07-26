import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.w3c.dom.Text;

public class Calender {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "D:\\MASTERS\\Selenium\\Drivers\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();

		 driver.get("http://192.168.1.136/add_annex_his/");
		 driver.findElement(By.id("txtLoginname")).sendKeys("admin");
	     driver.findElement(By.id("txtPassword")).sendKeys("edpsoftlink");
		 Thread.sleep(500);
		 driver.manage().window().maximize();
		// driver.findElement(By.xpath("//span[@class='select2-arrow']")).click();
		//driver.findElement(By.xpath("//div[@id='s2id_BranchCode']")).click(); 
		// Thread.sleep(500);
		// driver.findElement(By.xpath("//ul[@class='select2-results']/li[2]")).click();
		
		 driver.findElement(By.id("btnSubmit")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.id("btnOPD")).click();
		 Thread.sleep(500);
		 driver.findElement(By.xpath("//table[@id='tblGrid']")).click();
		 Thread.sleep(500);
		//table[@id='tblGrid']
		 driver.findElement(By.xpath("(//h2[@class='vert-main'])[3]")).click();
		 Thread.sleep(500);
		 driver.findElement(By.xpath("  (//div[@class='col-md-2 col-xs-6 col-sm-4'])[1]")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.id("idblInvName")).sendKeys("ct");   
		 Thread.sleep(5000);
		 //1HR GCT
		 
		 List <WebElement> options1 = driver.findElements(By.xpath("//li[@class='select2-results-dept-0 0select2-result select2-result-selectable'] /div"));
		 
		 for( WebElement option : options1)
		 {
			if( option.getText().equalsIgnoreCase("1HR GCT"));
			{
				option.click();
			}
		 }
		 
		 
			
		}
	}


