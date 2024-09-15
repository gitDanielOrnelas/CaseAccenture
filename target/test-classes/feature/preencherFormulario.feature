#Author: Daniel Ornelas
#Test Case for Accenture
Feature: Preencher Formulario Accenture

  # Realizar o acesso ao site "http://sampleapp.tricentis.com/101/app.php",
  # preencher os formulários e validar mensagem na tela Sending e-mail success! .
  Scenario: Acessar o Site sampleapp, preencher os formularios e validar mensagem de e-mail enviado
    Given que acesso o site sampleapp
    And preencho o formulario VehicleData
    And preencho o formulario InsurantData
    And preencho o formulario ProductData
    And preencho o formulario PriceOption
    When enviar para o email
    Then valida mensagem
	## Fim
