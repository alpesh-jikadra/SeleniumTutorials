package com.selenium.tutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\idnapj\\Downloads\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://us1dcppct01.ideasdev.int:8080/cpro/");
		driver.findElement(By.id("j_user_visible")).sendKeys("businessuser");
		driver.findElement(By.id("j_password")).sendKeys("password");
		driver.findElement(By.id("j_domain")).sendKeys("ideas");
		driver.findElement(By.id("loginImg")).click();
		driver.quit();
	}

}
