package com.wrenzi.seleniumhq.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;

public class DetalhesProduto {
	
	private static WebDriver driver = null;
	private static final WebDriverWait wait;
	
	static {
		wait = new WebDriverWait(driver, 50);
	}
	
	
	public static void clickCobranca(){
		 driver.findElement(By.className("cobranca")).click();
		 wait.until(ExpectedConditions.presenceOfElementLocated(By.id("historico_fatura")));
    
	}
	
	public static void clickFatura1 () {
		 wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[starts-with(@id,'lista_remessas:j_idt')]")));
		 driver.findElement(By.xpath("//*[starts-with(@id,'lista_remessas:j_idt')]")).click();
		 wait.until(ExpectedConditions.presenceOfElementLocated(By.id("conta-fatura")));
	}
	
	public static void clickDetalharFat(){
		 driver.findElement(By.xpath("//*[@id='tableResultados_row_0']/td[1]/span")).click();
	}
 
	public static void clickContestar(){
		driver.findElement(By.xpath("//*[@id='tableResultados:0:btContestar1']/span")).click();
	  
	}
	
	public static void flagContestar (){
		wait.until(ExpectedConditions.presenceOfElementLocated(By.className("checkboxContestar")));
		driver.findElement(By.className("checkboxContestar")).click();
	}
	
	public static void clickSalvar(){
		driver.findElement(By.id("botaoAction")).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("refundButtonsForm")));
	}
	
	public static void apurarContest(){
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("box")));
		driver.findElement(By.cssSelector("#tableResultados\3a 0\3a btApurar"));
		
	}
	
	public static void validarContestacaoDisp(){
		assertEquals("Em disputa", driver.findElement(By.cssSelector("b")).getText());       
		
	}
	
	public static void flagContImpr(){
		driver.findElement(By.xpath("//*[@id='itensInvestigateContestation:0:j_idt360:0']")).isSelected();
	}
	
	public static void clickConfirmarConst(){
		driver.findElement(By.id("investigateConfirmar")).click();
	}
	
	public static void clickApurarContest(){
		driver.findElement(By.id("tableResultados:0:btApurar")).click();
	}
}
