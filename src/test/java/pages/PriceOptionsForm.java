package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PriceOptionsForm {
	
	private final WebDriver navegador;
	
	public PriceOptionsForm(WebDriver navegador) {
		this.navegador = navegador;
	}
	
	public PriceOptionsForm preenchendoPrice() throws InterruptedException {

		// Criação do WebDriverWait com tempo de espera usando Duration
		WebDriverWait wait = new WebDriverWait(navegador, Duration.ofSeconds(10));
		// Aguarda até que o elemento esteja presente
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("nextsendquote")));
		
		//Selecionando a op��o GOLD
	    navegador.findElement(By.xpath(".//table[@id='priceTable']/tfoot/tr/th[2]/label[2]/span")).click();
		
		//Campo Next
	    navegador.findElement(By.id("nextsendquote")).click(); 
		        
	    return new PriceOptionsForm(navegador);	
	}
}
