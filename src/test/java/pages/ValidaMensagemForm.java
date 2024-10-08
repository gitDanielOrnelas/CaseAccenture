package pages;

import static org.junit.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ValidaMensagemForm {
	
	private WebDriver navegador;
	
	public ValidaMensagemForm(WebDriver navegador) {
		this.navegador = navegador;
	}
	
	public ValidaMensagemForm validaMensagem() throws InterruptedException {
		WebElement telaFinal = navegador.findElement(By.xpath("/html/body/div[4]/h2[contains(text(),'Sending e-mail success!')]"));
	    String validaEnvio = telaFinal.getText();
	    assertEquals("Sending e-mail success!",validaEnvio);   //Mensagem OK
	    //assertEquals("Mensagem errada!",validaEnvio); //Mensagem Fail
	
     return new ValidaMensagemForm(navegador);

	}
}

