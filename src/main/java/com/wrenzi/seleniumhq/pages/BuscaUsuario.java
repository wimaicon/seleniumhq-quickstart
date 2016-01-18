package com.wrenzi.seleniumhq.pages;


import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BuscaUsuario {
	private static WebDriver driver = null;
	private static final WebDriverWait wait;
	
	static {
		wait = new WebDriverWait(driver, 30);
	}
	
	public static void pesqLogin (String login) {
		
		   wait.until(ExpectedConditions.presenceOfElementLocated(By.id("digiteDadosClientes")));
		   driver.findElement(By.id("digiteDadosClientes")).sendKeys(login);
		   Select combo = new Select(driver.findElement(By.id("buscaAvancadaSelect")));
		   combo.selectByVisibleText("Login");
		   driver.findElement(By.id("buscaAvancadaSelect")).click();
	}
	
   public static void clickPesquisar(){
	  
	    driver.findElement(By.id("pesquisar")).click();
	    wait.until(ExpectedConditions.presenceOfElementLocated(By.className("iniciarAtendimento")));
		
  }
	
	public static void clickIniciarAtend() { 
		    driver.findElement(By.className("iniciarAtendimento")).click();
		    wait.until(ExpectedConditions.presenceOfElementLocated(By.id("novaVenda1234")));
		    
		    driver.findElement(By.id("inputIndividualName"));       // -- Nome
		    driver.findElement(By.id("inputIndividualLastName"));   // -- Sobrenome
		    driver.findElement(By.id("CPF"));                       // -- CPF
		    driver.findElement(By.id("inputLoginPPZ"));             // -- LoginPPZ
		    driver.findElement(By.className("retencao"));          // -- Retenção
		    driver.findElement(By.linkText("Classificações"));           // -- Classificação
		    driver.findElement(By.id("novaVenda1234"));             // -- Nova Venda
	}
	
}
