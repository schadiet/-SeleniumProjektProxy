package de.codingsolo.examples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestfallChrome {

	public static void main(String[] args) {
		System.out.println("Test Beginnt");
		
		System.setProperty("webdriver.chrome.driver", 
				"./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://codingsolo.de");
		System.out.println(driver.getTitle());
//		driver.close();
//		driver.quit();
	}

}
