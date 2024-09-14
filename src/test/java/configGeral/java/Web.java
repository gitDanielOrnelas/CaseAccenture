package configGeral.java;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Web {
	public static WebDriver createChrome() {
	
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\daniel.ornelas\\Drivers\\chromedriver.exe");
    
    WebDriver navegador = new ChromeDriver();
    navegador.manage().window().maximize();
    navegador.get("http://sampleapp.tricentis.com/101/app.php");
    navegador.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    return navegador;
    
	}
}
