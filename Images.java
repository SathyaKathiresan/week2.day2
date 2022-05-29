package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Images {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Image.html");
		String page1 = driver.getTitle();
//		System.out.println(page1);
		
		driver.findElement(By.xpath("//label[text()='Click on this image to go home page']/following-sibling::img")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		
		driver.findElement(By.xpath("//label[text()='Am I Broken Image?']/following-sibling::img")).click();
		Thread.sleep(3000);
		String page2 = driver.getTitle();
//		System.out.println(page2);
		if(page2.equals(page1))
			System.out.println("Is a Broken Image");
		else
			System.out.println("Is Not a Broken Image");
		
		driver.findElement(By.xpath("//label[text()='Click me using Keyboard or Mouse']/following-sibling::img")).click();
		
		

	}

}
