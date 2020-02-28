package com.linkedin.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\SWATHI\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://formy-project.herokuapp.com/dragdrop");
		driver.manage().window().maximize();

		WebElement box = driver.findElement(By.id("box"));
		WebElement image = driver.findElement(By.id("image"));
		
		Actions actions = new Actions(driver);
		actions.dragAndDrop(image, box).build().perform();
		
		
		
	}

}
