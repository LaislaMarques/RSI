package Metodos;

import org.openqa.selenium.By;

public class RegistraNovoClientePage {
	
	Metodos metodos = new Metodos();
	
	By username = By.name("usernameRegisterPage");
	By email = By.name("emailRegisterPage");
	By senha = By.name("passwordRegisterPage");
	By confirmarsenha = By.name("confirm_passwordRegisterPage");
	
	public void registrarCliente (String nome, String email, String senha, String confirmasenha) {
		metodos.escrever(username,nome, "preencher campo nome ");
		metodos.escrever(this.email, email, "preencher campo email ");
		metodos.escrever(this.senha,senha, "preencher campo senha ");
		metodos.escrever(this.confirmarsenha,confirmasenha, "preencher confirma senha ");
		
		
	}

}
