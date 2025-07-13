package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonGetPrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Moblie");
		driver.findElement(By.id("nav-search-submit-button")).click();
		List<WebElement> allPrice=driver.findElements(By.className("a-price-whole"));
		System.out.println(allPrice.size());
		List<Long> price=new ArrayList<Long>();
		for (WebElement itr : allPrice) {
			String t=itr.getText();
			String t1=t.replaceAll(",", "");
			Long a=(long) Integer.parseInt(t1);
			price.add(a);
		}
		System.out.println(price);
	}

}
