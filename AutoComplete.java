package com.linkedin.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutoComplete {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\SWATHI\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://formy-project.herokuapp.com/autocomplete");

		WebElement address = driver.findElement(By.id("autocomplete"));
		address.sendKeys("800 salem church rd, Newark, DE");

		// Thread.sleep(2000);

		// implicit wait
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//WebElement addressResult = driver.findElement(By.className("pac-item"));
		

		// explicit wait

		WebDriverWait wait =  new WebDriverWait(driver, 5);
		WebElement addressResult = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("pac-item")));
		
	
		
		addressResult.click();

		driver.quit();
	}

}
