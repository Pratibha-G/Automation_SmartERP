package newpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BonusperDeal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.get("https://dev.smarterp.411reports.com");
		driver.findElement(By.id("app_login_type_username")).sendKeys("m.ivanov");
	driver.findElement(By.id("app_login_type_password")).sendKeys("m.ivanov");
	driver.findElement(By.xpath("//div[.=\"Sign In\"]")).click();
	WebElement ele = driver.findElement(By.xpath("//span[.='Organization']"));
	Actions act=new Actions(driver);
	//Perform mouse hover action
	act.moveToElement(ele).perform();
	driver.findElement(By.xpath("//a[.='Bonus per Deal']")).click();
	driver.findElement(By.xpath("//a[.='New']")).click();
	driver.findElement(By.id("bonus_deal_group_name")).sendKeys("test@3");
	driver.findElement(By.xpath("//button[.='Save']")).click();       
	}     
	

}
