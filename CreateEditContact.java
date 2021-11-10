package SeleniumSample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateEditContact {

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
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Hope");
		driver.findElement(By.id("lastNameField")).sendKeys("J");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Benny");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("J");
		driver.findElement(By.xpath("//input[@name='departmentName']")).sendKeys("IT");
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Description");
		driver.findElement(By.xpath("//input[@id='createContactForm_primaryEmail']")).sendKeys("hopej@gmail.com");
		WebElement firstdrp=driver.findElement(By.xpath("//select[@id='createContactForm_generalCountryGeoId']"));
	    Select select=new Select(firstdrp);
	    select.selectByValue("IND");
	 	driver.findElement(By.xpath("//input[@name='submitButton']")).click();
	 	Thread.sleep(5000);
        driver.findElement(By.xpath("//a[@class='subMenuButton']")).click();
	    driver.findElement(By.xpath("//textarea[@name='description']")).clear();
	    driver.findElement(By.xpath("//textarea[@name='importantNote']")).sendKeys("Important");
	    driver.findElement(By.xpath("//td[@colspan='4']//input")).click();
	    Thread.sleep(5000);
	    String title = driver.getTitle();
	    System.out.println(title);
	}

}
