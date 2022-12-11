package com.Sep2022;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	// Main Method is the execution point of any Java Program
	public static void main(String[] args) {
		String driverExecutablePath = "C://Users//875364//drivers//chromedriver_101//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverExecutablePath);
		WebDriver driver = new ChromeDriver();
		driver.get("C://Users//875364//Sample Html//CheckBoxRadioSelect.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("chk-0")).click();

		// To Validate isSelected

		WebElement checkBox1 = driver.findElement(By.id("chk-0"));

		boolean isSelected = checkBox1.isSelected();

		// performing click operation if element is not selected

		if (isSelected == true) {

			System.out.println("CheckBox is already selected");

		} else

		{

			checkBox1.click();

		}

		driver.findElement(By.id("chk-0")).click();

		// To Validate isDisplayed

		WebElement checkBox2 = driver.findElement(By.id("chk-1"));

		boolean isDisplayed = checkBox2.isDisplayed();

		// performing click operation if element is displayed

		if (isDisplayed == true) {

			checkBox2.click();

		}

		// To Validate isEnabled

		WebElement checkBox3 = driver.findElement(By.id("chk-2"));

		boolean isEnabled = checkBox3.isEnabled();

		// performing click operation if element is enabled

		if (isEnabled == true) {

			checkBox3.click();

		} else

		{

			System.out.println("CheckBox is disabled");

		}

		driver.quit();

	}
}
