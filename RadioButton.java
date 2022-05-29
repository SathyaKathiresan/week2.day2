package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButton {

	public static void main(String[] args) {
		
		
			WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/radio.html");
		
		driver.findElement(By.id("yes")).click();
		boolean selected = driver.findElement(By.xpath("//label[text()='Find default selected radio button']/following-sibling::input")).isSelected();
//		System.out.println(selected);
		if(selected==true)
		{
			System.out.println("The default selected value is Unchecked");
		}
		else
		{
			System.out.println("The default selected value is Checked");
		}
		
		boolean selected2 = driver.findElement(By.xpath("//label[contains(text(),'Select your age group')]/following-sibling::input[1]")).isSelected();
//		System.out.println(selected2);
		if(selected2==true)
		{
			System.out.println("The age is between 1 - 20 years");
				}
		else {
			boolean selected3 = driver.findElement(By.xpath("//label[contains(text(),'Select your age group')]/following-sibling::input[2]")).isSelected();
//			System.out.println(selected3);
			if(selected3==true)
				System.out.println("The age is between 21 - 40 years");
			else
				System.out.println("The age is between Above 40 years");
		}
		
	}

}
