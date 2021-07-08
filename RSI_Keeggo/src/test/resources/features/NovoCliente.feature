#Author: Laisla_marques@outlook.com
@geekoo
Feature: Cadastrar um novo usuario
  Como usuario quero realizar o cadastro para efetuar compras

	Background: Acessar o sistema 
 	 Given que entre no site "http://advantageonlineshopping.com/#/"

  Scenario: Cadastrar um novo usuario
    And acesso o formulario de abertura de conta
    When preencher os campos obrigatorios
    Then cadastro realizado com sucesso

