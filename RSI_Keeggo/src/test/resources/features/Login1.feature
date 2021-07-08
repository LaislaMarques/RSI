#Author: laisla_marques@outlook.com

Feature: Novo Login 
 Eu Como usuario quero realizar login para fazer compras

	Background: Realizar Login
 	 Given que esteja no site "http://advantageonlineshopping.com/#/"

  Scenario: Realizar Login
    And acesso o formulario de login
    When preencher campos com os dados do cliente 
    Then Login realizado com sucesso
