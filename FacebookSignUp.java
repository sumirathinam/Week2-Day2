package SeleniumSample;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookSignUp {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(5000);
		////div[@class='_5dbb']/input
		//driver.findElement(By.xpath("//div[text()='First name']/following::input")).sendKeys("James");
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("James");
	    driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Bond");
		Thread.sleep(5000);
		driver.findElement(By.name("reg_email__")).sendKeys("9865665432");
		
		
		driver.findElement(By.name("reg_passwd__")).sendKeys("Test@123");
		
		WebElement firstdrp=driver.findElement(By.xpath("//select[@id='day']"));
	    Select select1=new Select(firstdrp);
	    select1.selectByValue("19");
	    WebElement seconddrp=driver.findElement(By.xpath("//select[@id='month']"));
	    Select select2=new Select(seconddrp);
	    select2.selectByValue("5");
	    WebElement thirddrp=driver.findElement(By.xpath("//select[@id='year']"));
	    Select select3=new Select(thirddrp);
	    select3.selectByValue("2000");
	    Thread.sleep(5000);
	   // driver.findElement(By.xpath("//input[@id='u_4_4_At']/preceding-sibling::label")).click();
	//	driver.findElement(By.xpath("//button[@name='websubmit']")).click();
	    driver.findElement(By.xpath("//label[text()='Female']/following-sibling::input")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
	}

}
