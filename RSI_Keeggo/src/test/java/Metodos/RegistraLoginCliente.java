package Metodos;

import org.openqa.selenium.By;

public class RegistraLoginCliente {
	
	Metodos metodos = new Metodos();
	
	By User = By.name("username");
	By Pass = By.name("password");
	
	
	
	public void LogarClient (String nome, String senha) {
		metodos.escrever(User, nome, "preencher campo nome ");
		metodos.escrever(Pass, senha,"preencher campo senha");
	}
	

}
