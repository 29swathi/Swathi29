package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com/");
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@aria-label='Search Ajio']")).sendKeys("bags"+Keys.ENTER);
		driver.findElement(By.xpath("(//input[@name='genderfilter']/following::div)[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[contains(text(),'Fashion Bags')]")).click();
		WebElement count=driver.findElement(By.xpath("//div[@class='length']"));
		System.out.println(count.getText());
		Thread.sleep(2000); //div[@class='brand']
		List<WebElement> brand=driver.findElements(By.className("brand"));
		System.out.println(brand.size());
		List<String> brandName=new ArrayList<String>();
		for (WebElement b1 : brand) {
			brandName.add(b1.getText());
		}
		System.out.println(brandName);
		Thread.sleep(2000); //div[@class='brand']
		List<WebElement> bag=driver.findElements(By.className("nameCls"));
		System.out.println(bag.size());
		List<String> bagName=new ArrayList<String>();
		for (WebElement b1 : bag) {
			bagName.add(b1.getText());
		}
		System.out.println(bagName);
	}
}
