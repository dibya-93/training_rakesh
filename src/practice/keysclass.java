package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class keysclass {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver\\chromedriver.exe");
    ChromeDriver driver=new ChromeDriver();
    driver.get("https://demo.actitime.com/login.do");
    driver.manage().window().maximize();
    Thread.sleep(2000);
    driver.findElement(By.id("username")).sendKeys("admin",Keys.TAB,"admin",Keys.ENTER,Keys.SPACE);
	}
}
