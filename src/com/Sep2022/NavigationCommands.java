package com.Sep2022;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {

	public static void main(String[] args) throws InterruptedException {

		String driverExecutablePath = "C://Users//875364//drivers//chromedriver_101//chromedriver.exe";

		System.setProperty("webdriver.chrome.driver", driverExecutablePath);

		WebDriver driver = new ChromeDriver();

		String URL = "C://Users//875364//Sample Html//Demo.html";

		driver.manage().window().maximize();

		// navigateTo use

		driver.navigate().to(URL);

		System.out.println("Page launches successfully");

		// Delay execution for 5 seconds to view the refresh operation

		Thread.sleep(5000);

		// navigate refresh

		driver.navigate().refresh();

		System.out.println("The browser is refreshed");

		driver.findElement(By.linkText("Google")).click();

		Thread.sleep(5000);

		// navigate back

		driver.navigate().back();

		System.out.println("performed click on back browser button");

		// Delay execution for 5 seconds to view the back operation

		Thread.sleep(5000);

		// navigate forward

		driver.navigate().forward();

		System.out.println("Google website");

		// closing the browser

		driver.close();

		System.out.println("The browser is closed successfully and test is passed");

	}

}
