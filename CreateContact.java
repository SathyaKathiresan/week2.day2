package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		
		driver.findElement(By.id("firstNameField")).sendKeys("Sathya");
		driver.findElement(By.id("lastNameField")).sendKeys("Kathir");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Nithya");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Kathir");
		driver.findElement(By.name("departmentName")).sendKeys("ECE");
		driver.findElement(By.name("description")).sendKeys("Nothing");
		driver.findElement(By.name("primaryEmail")).sendKeys("Sathya@gmail.com");
		WebElement eleState = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select state = new Select(eleState);
		state.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();
		
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Updated");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		
		System.out.println(driver.getTitle());
		

	}

}
