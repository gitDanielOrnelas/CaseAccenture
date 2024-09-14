package webdriver.java;
//
//USADO PARA TESTES JUNIT
//DESCONSIDERAR
//
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import configGeral.java.Web;

public class HomePageUnit {
	
    private WebDriver navegador;

	@Before
	public void setUp() throws Exception {

		navegador = Web.createChrome();
	    }	

	@Test
	public void test() throws InterruptedException {

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

/////////////////////////////////////////////////////////////////////////////
        
		//Campo First Name        
        navegador.findElement(By.id("firstname")).sendKeys("Daniel");
        
        //Campo Last Name
        navegador.findElement(By.id("lastname")).sendKeys("Ornelas");
        
        //Campo Date of Birth
        navegador.findElement(By.id("birthdate")).sendKeys("12/10/1993");
        
        //Campo Country
		WebElement campoCountry = navegador.findElement(By.id("country"));
		new Select(campoCountry).selectByVisibleText("Brazil");
        
        //Campo Zip Code
        navegador.findElement(By.id("zipcode")).sendKeys("02311110");
        
        //Campo Occupation
		WebElement campoOccupation = navegador.findElement(By.id("occupation"));
		new Select(campoOccupation).selectByVisibleText("Farmer");
        
        //Campo Hobbies
        navegador.findElement(By.xpath(".//form[@id='insurance-form']/div/section[2]/div[10]/p/label/span")).click();
        
        //Campo Next
        navegador.findElement(By.id("nextenterproductdata")).click(); 
        
///////////////////////////////////////////////////////////////////////
        
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
        
///////////////////////////////////////////////////////////////////////
        
        //Selecionando a op��o GOLD
	    navegador.findElement(By.xpath(".//table[@id='priceTable']/tfoot/tr/th[2]/label[2]/span")).click();
		
		//Campo Next
	    navegador.findElement(By.id("nextsendquote")).click(); 

///////////////////////////////////////////////////////////////////////
	    
	  //Campo E-mail
        navegador.findElement(By.id("email")).sendKeys("ornelas.daniel@outlook.com");        
        
        //Campo Phone
        navegador.findElement(By.id("phone")).sendKeys("11947904770");        
        
        //Campo username
        navegador.findElement(By.id("username")).sendKeys("DanielAccenture");        
        
        //Campo Password
        navegador.findElement(By.id("password")).sendKeys("1234@Daniel");        
        
        //Campo Confirm Password
        navegador.findElement(By.id("confirmpassword")).sendKeys("1234@Daniel");
        
        //Campo Comments
        navegador.findElement(By.id("Comments")).sendKeys("Teste de envio ao E-mail");
        
        //Campo Send email
        navegador.findElement(By.id("sendemail")).click(); 
        
///////////////////////////////////////////////////////////////////////
        
		WebElement telaFinal = navegador.findElement(By.xpath(".//h2[contains(.,'Sending e-mail success!')]"));
	    String validaEnvio = telaFinal.getText();
	    assertEquals("Sending e-mail success!",validaEnvio);
	    
	    
		//navegador.quit();
		
	}
}
