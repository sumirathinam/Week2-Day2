package SeleniumSample;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneCountryCode']")).clear();
		driver.findElement(By.xpath("//input[@name='phoneCountryCode']")).sendKeys("91");
		driver.findElement(By.xpath("//input[@name='phoneAreaCode']")).sendKeys("44");
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("87890987656");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[@class='subMenuButtonDangerous']")).click();
        Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		Thread.sleep(5000);
        driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneCountryCode']")).sendKeys("91");
		driver.findElement(By.xpath("//input[@name='phoneAreaCode']")).sendKeys("44");
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("87890987656");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
        Thread.sleep(5000);       
        //driver.findElement(By.xpath("//div[text()='No records to display']")).isDisplayed();
		
		boolean lead=driver.findElement(By.xpath("//div[text()='No records to display']")).isDisplayed();
		System.out.println(lead);
        }	
		
	}


