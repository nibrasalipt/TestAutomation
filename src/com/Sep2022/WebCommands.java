package com.Sep2022;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class WebCommands {

	public static void main(String[] args) {
		
		String driverExecutablePath = "C://Users//875364//drivers//chromedriver_101//chromedriver.exe";
		// Configuring the system properties of chrome driver
		System.setProperty("webdriver.chrome.driver", driverExecutablePath);

		WebDriver driver = new ChromeDriver();

		// Storing the Url in the String variable

		String url = "https://testpages.herokuapp.com/styled/index.html";

		driver.manage().window().maximize();

		// Launch the URL

		driver.get(url);

		// Storing Title name in the String variable

		String title = driver.getTitle();

		// Storing Title length in the Int variable

		int titleLength = driver.getTitle().length();

		// Printing Title & Title length in the Console window

		System.out.println("Title of the page is : " + title);

		System.out.println("Length of the title is : " + titleLength);

		// Storing URL in String variable

		String actualUrl = driver.getCurrentUrl();

		if (actualUrl.equals(url))

		{

			System.out.println("Verification Successful - The correct Url is opened.");

		}

		else

		{

			System.out.println("Verification Failed - An incorrect Url is opened.");

			// In case of Fail, you like to print the actual and expected URL for the record
			// purpose

			System.out.println("Actual URL is : " + actualUrl);

			System.out.println("Expected URL is : " + url);

		}

		// Storing Page Source in String variable

		String pageSource = driver.getPageSource();

		// Closing browser

		driver.close();

	}

}
