package de.codingsolo.examples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestfallChrome2 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Test Beginnt");
		
		System.setProperty("webdriver.chrome.driver", 
				"./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		driver.get("http://localhost:8080/");
		System.out.println(driver.getTitle());
		System.out.println(driver.findElement(By.cssSelector("p.lead")));
		//System.out.println(driver.findElement(By.id("OXk2_GzW7")));
//		driver.close();
		driver.quit();
	}

}
