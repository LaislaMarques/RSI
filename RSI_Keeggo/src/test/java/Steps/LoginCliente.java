package Steps;

import Metodos.HomePage;
import Metodos.Metodos;
import Metodos.RegistraLoginCliente;
import elementos.ElementLog;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginCliente {

	Metodos browsers = new Metodos();
	HomePage home = new HomePage();
	RegistraLoginCliente login = new RegistraLoginCliente();
	Metodos metodos = new Metodos();
	ElementLog Log = new ElementLog();
	private String assertEquals;

	@Given("que esteja no site {string}")
	public void que_esteja_no_site(String site) {
		browsers.abrirNavegador(site);

	}

	@Given("acesso o formulario de login")
	public void acesso_o_formulario_de_login() {
		home.abriFormulario();

	}

	@When("preencher campos com os dados do cliente")
	public void preencher_campos_com_os_dados_do_cliente() {
		login.LogarClient("KeeggowxA", "Teste@12345");
		metodos.screenShot("preenchendo Login", "preenchendo Login");
		home.logarportexto();

	}

	@Then("Login realizado com sucesso")
	public void login_realizado_com_sucesso() {
		assertEquals = "KeeggowxA";
		String textoEsperado = "KeeggowxA";
		System.out.println("----- O nome do usuario é -----" + textoEsperado);
		metodos.screenShot("Validando Cliente", "Cliente Logado");
		metodos.fechar();
	}

	public String getAssertEquals() {
		return assertEquals;
	}
	

}
