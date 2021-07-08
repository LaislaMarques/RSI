package Steps;

import Metodos.Browsers;
import Metodos.HomePage;
import Metodos.Metodos;
import Metodos.RegistraNovoClientePage;
import elementos.Elementos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegistraNovoCliente {
	Elementos ele = new Elementos();
	Browsers browser = new Browsers();
	HomePage home = new HomePage();
	RegistraNovoClientePage registra = new RegistraNovoClientePage();
	Metodos metodos = new Metodos();

	String nome;

	@Given("que entre no site {string}")
	public void que_entre_no_site(String site) {
		browser.abrirNavegador(site);

	}

	@Given("acesso o formulario de abertura de conta")
	public void acesso_o_formulario_de_abertura_de_conta() {
		home.formularioRegistrarCliente();

	}

	@When("preencher os campos obrigatorios")
	public void preencher_os_campos_obrigatorios() {
		this.nome = metodos.getNome("Keeggo");
		registra.registrarCliente(this.nome, metodos.getEmail(), "Teste@12345", "Teste@12345");
		metodos.screenShot("preenchendoFormulario", "cadastrando o novo cliente");
		home.conditios();
		home.Register();

	}

	@Then("cadastro realizado com sucesso")
	public void cadastro_realizado_com_sucesso() {
		metodos.validarTexto(ele.getClienteOK(), this.nome, metodos.getNome("Keeggo"));
		String textoEsperado = this.nome;
		System.out.println("----- O nome do usuario é -----" + textoEsperado);
		metodos.screenShot("Cadastro de novo cliente", "Validando casdastro");
		metodos.fechar();
	}

}
