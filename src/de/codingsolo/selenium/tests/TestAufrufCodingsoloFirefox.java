package de.codingsolo.selenium.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.firefox.FirefoxDriver;

class TestAufrufCodingsoloFirefox {
	
	WebDriver driver;
	
	@BeforeEach
	void initTests() {
		System.out.println("initialisiere Webdriver");
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		Proxy proxy = new Proxy();

		proxy.setHttpProxy("127.0.0.1:3128");

		proxy.setSslProxy("127.0.0.1:3128");

		DesiredCapabilities desiredCaps = DesiredCapabilities.chrome();

		desiredCaps.setCapability("proxy", proxy);
		driver = new FirefoxDriver(desiredCaps);
		driver.get("https://codingsolo.de");
	}
	
	@AfterEach
	void afterTests() {
		System.out.println("Test abgeschlossen. - Aufräumen");
		driver.close();
	}

	@Test
	void testTitle() {
		String expect ="coding blog - Coding Solo | programmierblog | tutorials | Videos";
		assertEquals(expect, driver.getTitle());
	}

}
