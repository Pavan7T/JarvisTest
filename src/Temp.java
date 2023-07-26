import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Temp {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.gecko.driver", "D:\\MASTERS\\Selenium\\Drivers\\geckodriver.exe");
        FirefoxDriver driver = new FirefoxDriver();
	    //String UserName="admin";
	    //String PassWord="admin1";
	    
	    Thread.sleep(1000);
        
		driver.get("https://softlinkinternational.com");
		System.out.println(driver.getTitle());
		/*driver.findElement(By.linkText("Nested Frames")).click();
		driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-middle");

        System.out.println(driver.findElement(By.id("content")).getText()); */
		//Link count in entire webpage
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//Link count in footer
	    WebElement FT=driver.findElement(By.className("stm-footer"));
		System.out.println(FT.findElements(By.tagName("a")).size());
		
		//Link count in only required scode of webelement
		WebElement Aside =FT.findElement(By.id("block-18"));
		System.out.println(Aside.findElements(By.tagName("a")).size());

        //Oopen link present in wabpage and get tile of each link
		for(int i=0; i<(Aside.findElements(By.tagName("a")).size());i++)
		{
			
		String Ctrlkey=Keys.chord(Keys.CONTROL,Keys.ENTER);
		Aside.findElements(By.tagName("a")).get(i).sendKeys(Ctrlkey);
				
		}
        
	}

}
     

