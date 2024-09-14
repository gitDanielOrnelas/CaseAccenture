package pages;

import java.time.Duration;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductDataForm {
	
	private WebDriver navegador;
	
	public ProductDataForm(WebDriver navegador) {
		this.navegador = navegador;
	}
	
	@Test
	public ProductDataForm preenchendoProduct() throws InterruptedException {

		// Criação do WebDriverWait com tempo de espera usando Duration
		WebDriverWait wait = new WebDriverWait(navegador, Duration.ofSeconds(10));
		// Aguarda até que o elemento esteja presente
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("nextselectpriceoption")));
	    
		//Campo Start Date
	    navegador.findElement(By.id("startdate")).sendKeys("12/10/2025");
	    
	    //Campo Insurance Sum [$]
		WebElement campoInsurancesum = navegador.findElement(By.id("insurancesum"));
		new Select(campoInsurancesum).selectByIndex(1);
	    
	    //Campo Merit Rating
		WebElement campoMeritrating = navegador.findElement(By.id("meritrating"));
		new Select(campoMeritrating).selectByIndex(3);
	    
	    //Campo Damage Insurance
		WebElement campoDamageinsurance = navegador.findElement(By.id("damageinsurance"));
		new Select(campoDamageinsurance).selectByIndex(2);
	    
		//Campo Optional Products
	    navegador.findElement(By.xpath(".//form[@id='insurance-form']/div/section[3]/div[5]/p/label/span")).click();
		
		//Campo Courtesy Car
		WebElement campoCourtesycar = navegador.findElement(By.id("courtesycar"));
		new Select(campoCourtesycar).selectByIndex(1);
		
	    //Campo Next
	    navegador.findElement(By.id("nextselectpriceoption")).click();  
		
        return new ProductDataForm(navegador);
		
	}

}
