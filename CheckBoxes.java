package week2.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBoxes {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/checkbox.html");

		List<WebElement> eleOptions = driver.findElements(By.xpath("//label[text()='Select the languages that you know?']/following-sibling::input"));
		Thread.sleep(1000);
		eleOptions.get(0).click();
		Thread.sleep(1000);
		eleOptions.get(3).click();
		Thread.sleep(1000);
		eleOptions.get(4).click();

		boolean selected = driver.findElement(By.xpath("//label[text()='Confirm Selenium is checked']/following-sibling::input")).isSelected();
		if(selected==true)
			System.out.println("Selenium is Selected");
		else
			System.out.println("Selenium is Not Selected");


		boolean selected2 = driver.findElement(By.xpath("//label[text()='DeSelect only checked']/following-sibling::input[2]")).isSelected();
		if(selected2==true)
		{
			Thread.sleep(2000);
			driver.findElement(By.xpath("//label[text()='DeSelect only checked']/following-sibling::input[2]")).click();
			Thread.sleep(2000);
		}


		List<WebElement> eleCheck = driver.findElements(By.xpath("//label[text()='Select all below checkboxes ']/following-sibling::input"));
		int num = eleCheck.size();
		for(int i=0; i<num; i++)
		{
			eleCheck.get(i).click();
			Thread.sleep(1000);
		}


	}

}
