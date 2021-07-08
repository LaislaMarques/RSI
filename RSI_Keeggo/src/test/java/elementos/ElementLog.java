package elementos;

import org.openqa.selenium.By;

public class ElementLog {

	private By menuUser = By.id("menuUser");
	private By UserName = By.name("username");
	private By PassWord = By.name("password");
	private By MenuCliente = By.id("menuUserLink");

	public By getMenuUser() {
		return menuUser;
	}

	public By getUserName() {
		return UserName;
	}

	public By getPassWord() {
		return PassWord;
	}

	public By getMenuCliente() {
		return MenuCliente;
	}

}
