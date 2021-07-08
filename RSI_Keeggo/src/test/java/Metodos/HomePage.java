package Metodos;

import elementos.Elementos;

public class HomePage {

	Metodos metodos = new Metodos();
	Elementos ele = new Elementos();

	public void formularioRegistrarCliente() {

		metodos.clicar(ele.getMenuUser(), "Menu User");
		metodos.clicarPorTexto("a", "CREATE NEW ACCOUNT", "formulario para abrir conta");
	}

	public void conditios() {
		metodos.clicar(ele.getConditions(), "Aceitar Condicoes");

	}

	public void Register() {
		metodos.clicar(ele.getRegistro(), "Registrar Usuario");
	}

	public void validaCliente() {
		metodos.validarTexto(ele.getClienteOK(), "nome do cliente ", null);
	}

	public void abriFormulario() {
		metodos.clicar(ele.getMenuUser(), "Menu User");
		
	}
	
		public void logarportexto () {
		
		metodos.clicarPorTexto("button", "SIGN IN", "Formulario de login");

	}

}
