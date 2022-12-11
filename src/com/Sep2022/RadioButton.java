package com.Sep2022;

import org.openqa.selenium.By;

import org.openqa.selenium.Dimension;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	// Main Method is the execution point of any Java Program

	public static void main(String[] args) {

		String driverExecutablePath = "C://Users//875364//drivers//chromedriver_101//chromedriver.exe";

		System.setProperty("webdriver.chrome.driver", driverExecutablePath);

		WebDriver driver = new ChromeDriver();

		driver.get("C://Users//875364//Sample Html//CheckBoxRadioSelect.html");

		driver.manage().window().maximize();

		driver.findElement(By.id("radiobtn-0")).click();

		// To Validate isSelected

		WebElement radioEle = driver.findElement(By.id("radiobtn-0"));

		boolean select = radioEle.isSelected();

		if (select == true) {

			System.out.println("Radio button is already selected");

		} else

		{

			radioEle.click();

		}

		WebElement radioElem = driver.findElement(By.id("radiobtn-1"));

		boolean sel = radioElem.isDisplayed();

		// performing click operation if element is displayed

		if (sel == true) {

			radioElem.click();

		}

		WebElement radioNo = driver.findElement(By.id("radiobtn-2"));

		boolean selectNo = radioNo.isEnabled();

		// performing click operation if element is enabled

		if (selectNo == true) {

			radioNo.click();

		} else

		{
			System.out.println("Radio button is disabled");

		}

		driver.quit();

	}

}
