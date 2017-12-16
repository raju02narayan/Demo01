package com.sepm.stepdefinitions;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.sepm.config.ReadConfigFile;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class SEPLoginStepDefinition{
	//WebDriver driver;
	ReadConfigFile readConfigFile = new ReadConfigFile();
	BaseFunctionSEP base = new BaseFunctionSEP();
	

	//@SuppressWarnings("deprecation")
	//@Before
	// *** Intiate Driver ***//
	/*public void initiateDriver() throws InterruptedException, IOException {
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
	}*/

	//@After
	// *** Quite the Driver ***//
	/*public void quiteDriver() {
		System.out.println("After Class");
		//driver.close();
	}
*/
	@Given("^Open the SEP application$")
	public void Open_the_SEP_application() throws Throwable {
		// driver.get("https:/spiceportal-uat.dev.schneider-electric.com");
		base.driver.get(readConfigFile.getBaseURL());
	}

	@When("^Enter valid \\\"(.*?)\\\" and valid \\\"(.*?)\\\"$")
	public void enter_valid_username_and_valid_password(String uname, String pass) throws Throwable {
		Thread.sleep(5000);
		String titleOfPage = base.driver.getTitle();
		System.out.println("Title Of Page: "+titleOfPage);
		if(titleOfPage.equalsIgnoreCase(readConfigFile.getPingURL())) {
			base.driver.findElement(By.id("username")).sendKeys(uname);
			base.driver.findElement(By.id("password")).sendKeys(pass);
			//driver.findElement(By.xpath("//a[@title=\"Sign On\"]")).click();
			Thread.sleep(2000);
				
		}else {
			System.out.println("No need to login");
		}
		}
		
	@Then("^User should be able to login successful$")
	public void user_should_be_able_to_login_successful() throws Throwable {
		base.driver.getTitle();
		System.out.println("Second "+base.driver.getTitle());
		//Assert.assertEquals("Home - Employee Portal", driver.getTitle());
	}
}
