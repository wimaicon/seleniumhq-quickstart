package com.wrenzi.seleniumhq.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Home extends Page {


	private static final WebDriverWait wait;
	private static WebDriver driver = null;
	
	static {
		wait = new WebDriverWait(driver, 30);
	}
	
	public Home(WebDriver webDriver) {
		super(webDriver);
	}

     // ---------------- DAR MANUTENÇÃO COM TODAS AS ABAS ----------------
    
    public static void permissaoAdm () {
    	
    	driver.findElement(By.className("atendimento "));   // -- Atendimento
     
    }
    
    public static void abrirAbaAtend () throws InterruptedException {
    	driver.findElement(By.className("atendimento ")).click();
    	
    }
    
    
    
}
