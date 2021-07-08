package Metodos;

import static org.junit.Assert.assertEquals;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Metodos extends Browsers {

	/**
	 * Metodo para clicar em um elemento
	 * 
	 * @author laisl
	 * @param elemento
	 * @param passo
	 */

	public void clicar(By elemento, String passo) {
		try {
			driver.findElement(elemento).click();
		} catch (Exception e) {
			System.err.println("-------Erro ao Clicar no passo-------" + passo + e.getMessage());
		}

	}

	public void clicarPorTexto() {

	}

	/**
	 * Metodo para clicar informando um texto especifico e uma tag
	 * 
	 * @author laisl
	 * @param texto
	 * @param tag
	 * @param passo
	 */
	public void clicarPorTexto(String tag, String texto, String passo) {
		try {
			Thread.sleep(3000);
			driver.findElement(By.xpath("// " + tag + " [text() =\"" + texto + "\"]")).click();
			;

		} catch (Exception e) {
			System.err.println("-------Erro ao Clicar por texto-------" + passo + e.getMessage());
		}
	}

	/**
	 * Metodo para escrever
	 * 
	 * @author laisl
	 */

	public void escrever(By elemento, String texto, String passo) {
		try {
			driver.findElement(elemento).sendKeys(texto);

		} catch (Exception e) {
			System.err.println("-------Erro ao escrever-------" + passo + e.getMessage());

		}
	}

	/**
	 * Gerador de nomes com e mais 3 letras aleatorias
	 * 
	 * @author laisl
	 */

	public String getNome(String nome) {

		String geradorNome = RandomStringUtils.randomAlphabetic(3);
		return nome + geradorNome;

	}

	/**
	 * Gerador de email e com e mais 3 letras aleatorias
	 * 
	 * @author laisl
	 */

	public String getEmail() {
		String geradorEmail = RandomStringUtils.randomAlphabetic(3);
		return geradorEmail + "@Keeggo.com";
	}
	

	/**
	 * Metodo para tirar screenshot da tela
	 * 
	 * @author escrever o seu nome aqui
	 * @param nome
	 */
	public void screenShot(String nome, String passo) {
		try {
			TakesScreenshot scrShot = ((TakesScreenshot) driver);
			File scrFile = scrShot.getScreenshotAs(OutputType.FILE);
			File destFile = new File("./Evidencias/" + nome + ".png");
			FileUtils.copyFile(scrFile, destFile);
		} catch (Exception e) {
			System.out.println("----- error no screenShot -----" + passo + " " + e.getMessage());
		}

	}

	/**
	 * Metodo para validar se dois textos são iguais
	 * @param elemento
	 * @param textoEsperado
	 * @param passo
	 */
	public void validarTexto(By elemento, String textoEsperado, String passo) {
		try {
			Thread.sleep(3000);
			String textoCapturado = driver.findElement(elemento).getText();
			assertEquals(textoEsperado, textoCapturado);
		} catch (Exception e) {
			System.err.println("-------- error ao validar texto -------" + passo + " " + e.getMessage());
		}
		

		}

	/**
	 * Metodo fechar todas as abas
	 * 
	 * @author Thinkss
	 */
	public void fechar() {
		try {
			driver.quit();
		} catch (Exception e) {
			System.out.println("-------  error ao fechar todas as abas  -------" + e.getMessage());
	}
	}

	public void validarTexto(By menuCliente, Object logarClient) {
		// TODO Auto-generated method stub
		
	}
}

