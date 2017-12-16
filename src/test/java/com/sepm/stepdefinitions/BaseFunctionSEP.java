package com.sepm.stepdefinitions;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import com.sepm.config.ReadConfigFile;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class BaseFunctionSEP  {
	
		static WebDriver driver;
	
		ReadConfigFile readConfigFile = new ReadConfigFile();


	@SuppressWarnings("deprecation")
	@Before
	// *** Intiate Driver ***//
	public void initiateDriver() throws InterruptedException, IOException {
		System.out.println("Before Class ");

		if ("CHROME".equalsIgnoreCase(readConfigFile.getBrowser())) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\SESA430059\\eclipse-workspace\\OCP-Demo\\Drivers\\geckodriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		} else if ("IE".equalsIgnoreCase(readConfigFile.getBrowser())) {

			System.setProperty("webdriver.ie.driver",
					"C:\\Users\\SESA430059\\eclipse-workspace\\OCP-Demo\\Drivers\\IEDriverServer.exe");
			DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
			capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
			capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
			capabilities.setJavascriptEnabled(true);
			driver = new InternetExplorerDriver(capabilities);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		} else {
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
	}

	@After
	// *** Quite the Driver ***//
	public void quiteDriver() {
		System.out.println("After Class");
		//driver.close();
	}
	

}
