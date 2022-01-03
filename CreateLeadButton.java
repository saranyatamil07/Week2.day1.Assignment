package week2.day1.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLeadButton {
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
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Saranya");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Tamil");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("7/5/93");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Automation");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Information Technology");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("500000");
		
		WebElement curr=driver.findElement(By.id("createLeadForm_currencyUomId"));
		Select dropdown=new Select(curr);
		dropdown.selectByValue("SGD");
		
		WebElement indus=driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select dropdown1=new Select(indus);
		dropdown1.selectByValue("IND_SOFTWARE");
		
		//contact information
		
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).clear();
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("+91");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("91234");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("+91");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Saranya");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("Saranya710@gmail.com");
		
		//primary information
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Saranya");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("south street");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("pattewaram");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("kum");
		
		WebElement state=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dropdown2=new Select(state);
		dropdown2.selectByValue("IN");
		
		driver.findElement(By.className("smallSubmit")).click();
		//driver.close();
		
	}
}
