package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VehicleDataForm {
	
	private final WebDriver navegador;
	
	public VehicleDataForm(WebDriver navegador) {
		this.navegador = navegador;
	}
	
	public VehicleDataForm preenchendoVehicle() throws InterruptedException {
		
  		// Criação do WebDriverWait com tempo de espera usando Duration
		WebDriverWait wait = new WebDriverWait(navegador, Duration.ofSeconds(10));
		// Aguarda até que o elemento esteja presente
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("nextenterinsurantdata")));
	    
		//Campo Make
		WebElement campomake = navegador.findElement(By.id("make"));
		new Select(campomake).selectByVisibleText("Audi");
		
		//Campo Model
		WebElement campomodel = navegador.findElement(By.id("model"));
		new Select(campomodel).selectByVisibleText("Motorcycle");
		
		//Campo Cylinder Capacity [ccm]
        navegador.findElement(By.id("cylindercapacity")).sendKeys("100");
        
        //Campo Engine Performance [kW]
        navegador.findElement(By.id("engineperformance")).sendKeys("100"); 
        
		//Campo Date of Manufacture
        navegador.findElement(By.id("dateofmanufacture")).sendKeys("12/10/1993");
        
        //Campo Number of Seats
		WebElement camposeatscar = navegador.findElement(By.id("numberofseats"));
		new Select(camposeatscar).selectByVisibleText("1");
		
		//Campo Right Hand Drive (campo sumiu)
		//navegador.findElement(By.xpath(".=//form[@id='insurance-form']/div/section[2]/div[4]/p/label/span")).click();
        
		//Campo Number of Seats
		WebElement camposeatsmotorcycle = navegador.findElement(By.id("numberofseatsmotorcycle"));
		new Select(camposeatsmotorcycle).selectByVisibleText("1");
        
		//Campo Fuel Type
		WebElement campofuel = navegador.findElement(By.id("fuel"));
		new Select(campofuel).selectByVisibleText("Petrol");
        
		//Campo Payload [kg]
        navegador.findElement(By.id("payload")).sendKeys("1");
        
		//Campo Total Weight [kg]
        navegador.findElement(By.id("totalweight")).sendKeys("100");
        
		//Campo List Price [$]
        navegador.findElement(By.id("listprice")).sendKeys("10000");
        
		//Campo License Plate Number
        navegador.findElement(By.id("licenseplatenumber")).sendKeys("1");
        
		//Campo Annual Mileage [mi]
        navegador.findElement(By.id("annualmileage")).sendKeys("5500");
        
        //Campo Next
        navegador.findElement(By.id("nextenterinsurantdata")).click();
        
        
        return new VehicleDataForm(navegador);
		
	}

}
