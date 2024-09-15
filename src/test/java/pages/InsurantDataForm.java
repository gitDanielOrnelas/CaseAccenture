package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InsurantDataForm {

	private WebDriver navegador;

	public InsurantDataForm(WebDriver navegador) {
		this.navegador = navegador;
	}

	public InsurantDataForm preenchendoInsurant() throws InterruptedException {
		
		// Criação do WebDriverWait com tempo de espera usando Duration
		WebDriverWait wait = new WebDriverWait(navegador, Duration.ofSeconds(10));
		// Aguarda até que o elemento esteja presente
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("nextenterproductdata")));
		
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

		return new InsurantDataForm(navegador);
	}
}
