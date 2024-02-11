package facebook_register;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebook_registration {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("facebook");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='btnK']")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//h3[@class='LC20lb MBeuO DKV0Md']")).click();
		driver.findElement(By.xpath("//a[text()='Log In' and @class='l']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='_97w5']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("parul");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("gupta");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9898776655");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("P3455@123");
		Thread.sleep(1000);
		Select  sel= new Select (driver.findElement(By.xpath("//select[@name='birthday_day']")));
		sel.selectByValue("28");
		Thread.sleep(1000);
		Select  sel1= new Select (driver.findElement(By.xpath("//select[@name='birthday_month']")));
		sel1.selectByVisibleText("Feb");
		Thread.sleep(1000);
		Select  sel2= new Select (driver.findElement(By.xpath("//select[@name='birthday_year']")));
		sel2.selectByValue("1996");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='radio' and @value='1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@name=\'websubmit\']")).click();
		
	}

}
