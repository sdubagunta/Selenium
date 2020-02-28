package com.linkedin.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardAndMouseInput {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\SWATHI\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://formy-project.herokuapp.com/keypress");
		WebElement name = driver.findElement(By.id("name"));
		WebElement button = driver.findElement(By.id("button"));
		name.click();
		name.sendKeys("Swathi");
		button.click();
		driver.quit();

	}

}
