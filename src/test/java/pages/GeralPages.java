package pages;

import org.openqa.selenium.WebDriver;

public class GeralPages {

	private WebDriver navegador;

	public VehicleDataForm preencherVehicleData() throws InterruptedException {

		return new VehicleDataForm (navegador);
	}
	public InsurantDataForm preencherInsurantData() throws InterruptedException {

		return new InsurantDataForm (navegador);
	}
	public ProductDataForm preencherProductData() throws InterruptedException {

		return new ProductDataForm (navegador);
	}
	public PriceOptionsForm preencherPriceOptions() throws InterruptedException {

		return new PriceOptionsForm (navegador);
	}
	public SendQuoteForm preencherSendQuote() throws InterruptedException {

		return new SendQuoteForm (navegador);
	}
	public ValidaMensagemForm validaMensagem() throws InterruptedException {

		return new ValidaMensagemForm (navegador);
	}  
}


