package configGeral.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Web {
	public static WebDriver createChrome() {
	
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\OneDrive\\Documentos\\Automação\\chromedriver-win64");
    
    final WebDriver navegador = new ChromeDriver();
    navegador.manage().window().maximize();
    navegador.get("http://sampleapp.tricentis.com/101/app.php");
    navegador.manage().timeouts(); 

    return navegador;
    
	}
}
