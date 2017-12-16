package com.sepm.config;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.Properties;

public class ReadConfigFile {
	
	String result = "";
	InputStream inputStream;
	
	private Properties prop = new Properties();
	private String propFileName = "\\config\\config.properties";

	public ReadConfigFile()   {
		inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);

		if (inputStream != null) {
			try {
				prop.load(inputStream);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			try {
				throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public String getBrowser() throws IOException {
		String Browser = "";
		Browser = prop.getProperty("Browser");
		return Browser;
	}
	
	public String getChromeDriverPath() throws IOException {
		String ChromeDriverPath = "";
		ChromeDriverPath = prop.getProperty("ChromeDriverPath");
		return ChromeDriverPath;
	}
	public String getFireFoxPath() throws IOException {
		String FireFoxPath = "";
		FireFoxPath = prop.getProperty("FireFoxPath");
		return FireFoxPath;
	}
	
	public String getInternetExplorerPath() throws IOException {
		String InternetExplorerPath = "";
		InternetExplorerPath = prop.getProperty("InternetExplorerPath");
		return InternetExplorerPath;
	}
	
	public String getUserName() throws IOException {
		String UserName = "";
		UserName = prop.getProperty("UserName");
		return UserName;
	}
	
	public String getPassword() throws IOException {
		String Password = "";
		Password = prop.getProperty("Password");
		return Password;
	}
	
	public String getBaseURL() throws IOException {
		String BaseURL = "";
		BaseURL = prop.getProperty("BaseURL");
		return BaseURL;
	}
	
	public String getPathScreenshot() throws IOException {
		String PathScreenshot = "";
		PathScreenshot = prop.getProperty("PathScreenshot");
		return PathScreenshot;
	}
	
	public String getPathTestReportSheet() throws IOException {
		String PathTestReportSheet = "";
		PathTestReportSheet = prop.getProperty("PathTestReportSheet");
		return PathTestReportSheet;
	}
	
	public String getTestingType() throws IOException {
		String TestingType = "";
		TestingType = prop.getProperty("TestingType");
		return TestingType;
	}
	
	public String getProjectName() throws IOException {
		String ProjectName = "";
		ProjectName = prop.getProperty("ProjectName");
		return ProjectName;
	}
	
	public String getBuildNumber() throws IOException {
		String BuildNumber = "";
		BuildNumber = prop.getProperty("BuildNumber");
		return BuildNumber;
	}
	
	public String getPingURL() throws IOException {
		String PingURL = "";
		PingURL = prop.getProperty("PingURL");
		return PingURL;
	}
}
