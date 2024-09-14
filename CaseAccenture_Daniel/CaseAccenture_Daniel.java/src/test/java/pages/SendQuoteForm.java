package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SendQuoteForm {
	
	private WebDriver navegador;
	
	public SendQuoteForm(WebDriver navegador) {
		this.navegador = navegador;
	}
	
	public SendQuoteForm preenchendoSend() throws InterruptedException {
		
	    new WebDriverWait(navegador, 10)
	    .until(ExpectedConditions.presenceOfElementLocated(By.id("sendemail")));
	    
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
		
        
        return new SendQuoteForm(navegador);
		
	}

}
