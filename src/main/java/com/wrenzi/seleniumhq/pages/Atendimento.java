package com.wrenzi.seleniumhq.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Atendimento {

	private static WebDriver driver = null;
	private static final WebDriverWait wait;
	
	static {
		WebDriver driver = null;
		wait = new WebDriverWait(driver, 30);
	}
	
	public static void fecharAtend() throws InterruptedException{
		Thread.sleep(3000);
    	driver.findElement(By.id("btnCloseProtocol")).click();
    	Thread.sleep(4000);
    	driver.findElement(By.id("j_idt59:j_idt66")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.id("ygtvcontentel1")).click();  //Botão Classificação
    	Thread.sleep(3000);
    	driver.findElement(By.id("attendanceEnd:endAttendanceButtonPhone")).click();  //Botão finalizar

	}
	
	public static void DetalhesProd (String nomeProd) {
		
		    driver.findElement(By.linkText(nomeProd)).click(); 
		    wait.until(ExpectedConditions.presenceOfElementLocated(By.className("statusAssinatura")));
	}
	
	
}
