package com.linkedin.selenium;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Form {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\SWATHI\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://formy-project.herokuapp.com/form");

		submitForm(driver);

		waitForAlertBanner(driver);

		assertEquals("The form was successfully submitted!", getAlertBannerText(driver));

		driver.quit();
	}

	public static void submitForm(WebDriver driver) {

		driver.findElement(By.id("first-name")).sendKeys("Will");

		driver.findElement(By.id("last-name")).sendKeys("Smith");

		driver.findElement(By.id("job-title")).sendKeys("Actor");

		driver.findElement(By.cssSelector("#radio-button-2")).click();

		driver.findElement((By.cssSelector("#checkbox-2"))).click();

		WebElement experience = driver.findElement(By.id("select-menu"));
		Select exp = new Select(experience);
		exp.selectByVisibleText("5-9");

		WebElement date = driver.findElement(By.id("datepicker"));
		date.click();
		date.sendKeys("02/27/2020");
		date.sendKeys(Keys.RETURN);

		driver.findElement(By.linkText("Submit")).click();

	}

	public static void waitForAlertBanner(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("alert")));

	}

	public static String getAlertBannerText(WebDriver driver) {
		return driver.findElement(By.className("alert")).getText();
	}

}
