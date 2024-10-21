package pack1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.orangehrm.com/");
		String url =driver.getCurrentUrl();
		System.out.println(url);
		
		String title =driver.getTitle();
		System.out.println(title);
		
		String pageSource = driver.getPageSource();
		//System.out.println(pageSource);
		
		
		String windowhandle = driver.getWindowHandle();
		//System.out.println(windowhandle);
		
     	Thread.sleep(15000);
		
		driver.findElements(By.xpath("//a[@href='http://www.orangehrm.com']")).click();
		
		Set<String> windowhandles =driver.getWindowHandles();
		
		for(String window1 : windowhandles) {
			System.out.println(window1);
		}
		driver.quit();
		
	}
}
