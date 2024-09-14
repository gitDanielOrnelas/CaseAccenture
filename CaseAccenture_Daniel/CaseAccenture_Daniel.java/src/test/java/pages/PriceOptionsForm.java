package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PriceOptionsForm {
	
	private WebDriver navegador;
	
	public PriceOptionsForm(WebDriver navegador) {
		this.navegador = navegador;
	}
	
	public PriceOptionsForm preenchendoPrice() throws InterruptedException {
	    
		new WebDriverWait(navegador, 10)
	    .until(ExpectedConditions.presenceOfElementLocated(By.id("nextsendquote")));
		
		//Selecionando a opção GOLD
	    navegador.findElement(By.xpath(".//table[@id='priceTable']/tfoot/tr/th[2]/label[2]/span")).click();
		
		//Campo Next
	    navegador.findElement(By.id("nextsendquote")).click(); 
		        
	    return new PriceOptionsForm(navegador);	
	}
}
