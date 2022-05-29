package week2.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hyperlinks {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Link.html");
		
		driver.findElement(By.linkText("Go to Home Page")).click();
		driver.navigate().back();
		
		String hrefValue = driver.findElement(By.linkText("Find where am supposed to go without clicking me?")).getAttribute("href");
		System.out.println(hrefValue);
		
		driver.findElement(By.linkText("Verify am I broken?")).click();
		if(driver.getTitle().contains("404 Not Found")) {
			System.out.println("The link is Broken");
		}
		else
			System.out.println("Link is not Broken");
		driver.navigate().back();
		
		driver.findElement(By.linkText("Go to Home Page")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//h5[text()='HyperLink']")).click();
		Thread.sleep(3000);
		
		List<WebElement> list = driver.findElements(By.xpath("//section[@class='innerblock']/div"));
		int noOfLink = list.size();
		System.out.println("No. of link in the page is " + noOfLink);

	}

}
