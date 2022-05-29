package week2.day2;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Sathya");
		driver.findElement(By.name("lastname")).sendKeys("Kathiresan");
		driver.findElement(By.name("reg_email__")).sendKeys("1234567890");
		driver.findElement(By.id("password_step_input")).sendKeys("sathu");
		WebElement eleDay = driver.findElement(By.id("day"));
		Select birthDay = new Select(eleDay);
		birthDay.selectByValue("21");
		WebElement eleMonth = driver.findElement(By.id("month"));
		Select month = new Select(eleMonth);
		month.selectByVisibleText("Oct");
		WebElement eleYear = driver.findElement(By.id("year"));
		Select year = new Select(eleYear);
		year.selectByIndex(28);
		driver.findElement(By.xpath("//label[text()='Female']/following-sibling::input[@name='sex']")).click();
		
		
		

	}

}
