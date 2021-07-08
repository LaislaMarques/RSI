package elementos;

import org.openqa.selenium.By;

public class Elementos {
	
	private By menuUser = By.id("menuUser");
	private By Conditions = By.name("i_agree");
	private By registro = By.id("register_btnundefined");
	private By ClienteOK = By.cssSelector("#menuUserLink > span");

	public By getMenuUser() {
		return menuUser;
	}

	public By getConditions() {
		return Conditions;
	}

	public By getRegistro() {
		return registro;
	}

	public By getClienteOK() {
		return ClienteOK;
	}


}
