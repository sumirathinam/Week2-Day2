package SeleniumSample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForceSignUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='UserFirstName']")).sendKeys("Henry");
		driver.findElement(By.xpath("//input[@name='UserLastName']")).sendKeys("Paul");
		driver.findElement(By.xpath("//input[@name='UserEmail']")).sendKeys("henry.paul@gmail.com");
		driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys("InfoTech");
		driver.findElement(By.xpath("//input[@name='UserPhone']")).sendKeys("9876543213");
		WebElement firstdrp=driver.findElement(By.xpath("//select[@name='UserTitle']"));
	    Select select1=new Select(firstdrp);
	    select1.selectByValue("IT_Manager_AP");
	    WebElement seconddrp=driver.findElement(By.xpath("//select[@name='CompanyEmployees']"));
	    Select select2=new Select(seconddrp);
	    select2.selectByValue("1600");
	    WebElement companyCountry = driver.findElement(By.name("CompanyCountry")); 
	    new Select(companyCountry).selectByValue("IN"); 
	    driver.findElement(By.xpath("//input[@class='sr-only']/following-sibling::div")).click();
	    driver.close();
	 	}

}
