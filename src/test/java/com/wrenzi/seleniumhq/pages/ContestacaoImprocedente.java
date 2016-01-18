package com.wrenzi.seleniumhq.pages;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

/**
 * Classe de testes com cenários relacionados a página inicial
 */

public class ContestacaoImprocedente extends TestBase{

	Home home;
	Login login;
	BuscaUsuario buscausuario;
	DetalhesProduto detalhesproduto;
	
	@Parameters({ "path" })
	@BeforeClass
	public void testInit(String path) {

		// Load the page in the browser
		webDriver.get(websiteUrl + path);
		home = PageFactory.initElements(webDriver, Home.class);
	}



	@Test
	public void testeAbronarFatura() throws InterruptedException {
		
		Login.preencheLogin("msantos");
		Login.preenchePass("123Mudar!!");
		Login.clickLogar();
		
		 Home.permissaoAdm();
		 Home.abrirAbaAtend();
		 
		 Thread.sleep(5000);
		 
		
		
		 
		if (driver.findElement(By.id("formHasAttendance")).isDisplayed()) 
		     Atendimento.fecharAtend();
		 
		 
		 BuscaUsuario.pesqLogin("teste99");
			BuscaUsuario.clickPesquisar();
			Thread.sleep(3000);
			BuscaUsuario.clickIniciarAtend();
			
			Atendimento.DetalhesProd("Oi Inglês - Mensal - R$29,90");
	        DetalhesProduto.clickCobranca();
	        DetalhesProduto.clickFatura1();
	        Thread.sleep(2000);
	        DetalhesProduto.clickDetalharFat();
	     
	        
	        Thread.sleep(2000);
	        DetalhesProduto.clickContestar();
	        DetalhesProduto.flagContestar();
	        Thread.sleep(2000);
	 	    DetalhesProduto.clickSalvar();
	 	    
	 		DetalhesProduto.clickFatura1();
	 		Thread.sleep(2000);
	 		DetalhesProduto.validarContestacaoDisp();
	 	    
	 		DetalhesProduto.clickDetalharFat();
	 		Thread.sleep(2000);
	 		DetalhesProduto.clickApurarContest();
	 		Thread.sleep(2000);
	 		DetalhesProduto.flagContImpr();
	 		DetalhesProduto.clickConfirmarConst();
	 		
	 		DetalhesProduto.clickFatura1();
	 		Thread.sleep(2000);
	        DetalhesProduto.clickDetalharFat();
	        assertEquals("", driver.findElement(By.cssSelector("b")).getText());
	 		
	 		
	 		
			
	}
	

}
