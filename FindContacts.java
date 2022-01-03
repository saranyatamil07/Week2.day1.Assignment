package week2.day1.assignments;



	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
public class FindContacts
{

	public static void main(String[] args) {
		
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver() ;
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com//opentaps");
		String title=driver.getTitle();
		System.out.println(title);
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Find Contacts")).click();
		driver.findElement(By.linkText("Email")).click();
		driver.findElement(By.name("emailAddress")).sendKeys("saranya710@gmail.com");
		driver.findElement(By.id("ext-gen41")).click();
		driver.close();
		
		
		
		
	
		
		
}}
