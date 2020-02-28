package com.linkedin.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\SWATHI\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://formy-project.herokuapp.com/datepicker");
		driver.manage().window().maximize();

		WebElement dateField = driver.findElement(By.id("datepicker"));
		dateField.sendKeys("02/28/2020");
		dateField.sendKeys(Keys.RETURN);

		driver.quit();

	}

}
