package com.linkedin.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollToElement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\SWATHI\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://formy-project.herokuapp.com/scroll");
		WebElement name = driver.findElement(By.id("name"));

		Actions actions = new Actions(driver);

		actions.moveToElement(name);
		name.sendKeys("Swathi Dubagunta");

		WebElement date = driver.findElement(By.id("date"));
		date.sendKeys("02/27/2020");
		
		driver.quit();
	}

}
