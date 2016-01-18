package com.wrenzi.seleniumhq.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {


	private static final WebDriverWait wait;
	private static WebDriver driver = null;
	
	static {
		wait = new WebDriverWait(driver, 30);
	}

	public Login() {
	}

	public static void preencheLogin (String login) {
		
		driver.findElement(By.id("form-login:name")).clear();
		driver.findElement(By.id("form-login:name")).sendKeys(login);
		
	}
	
	public static void preenchePass (String pass) {
		
		driver.findElement(By.id("form-login:password")).clear();
		driver.findElement(By.id("form-login:password")).sendKeys(pass);
	}
	
	public static void clickLogar () {
		driver.findElement(By.id("form-login:save")).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.className("atendimento ")));
	}
	
 
	
}
