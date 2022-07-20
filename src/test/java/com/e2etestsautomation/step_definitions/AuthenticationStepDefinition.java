package com.e2etestsautomation.step_definitions;

import org.junit.Assert;

import com.e2etestsautomation.page_objects.AuthenticationPage;
import com.e2etestsautomation.utils.ConfigFileReader;
import com.e2etestsautomation.utils.Setup;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AuthenticationStepDefinition {
	
	private AuthenticationPage authenticationPage;
	private ConfigFileReader configFileReader ;
	public AuthenticationStepDefinition() {
		this.authenticationPage = new AuthenticationPage();
		this.configFileReader = new ConfigFileReader();
	}
	

	@Given("Je me connecte a  l'application orangeHRM")
	public void jeMeConnecteALApplicationOrangeHRM() {
		Setup.driver.get("https://opensource-demo.orangehrmlive.com/");
		authenticationPage.goToURL();
	}

	@When("Je saisie le username {string}")
	public void jeSaisieLeUsername(String username) {
		authenticationPage.fillUserName(username);
	}

	@When("Je saisie le mot de passe {string}")
	public void jeSaisieLeMotDePasse(String password) {
		authenticationPage.fillPassword(password);
	}

	@When("Je clique sur le bouton login")
	public void jeCliqueSurLeBoutonLogin() {
		authenticationPage.clickbtnlogin();

	}

	@Then("Je me redirige vers la page home")
	public void jeMeRedirigeVersLaPageHome(String msg) {
 String message = AuthenticationPage.homePage.getText();
 Assert.assertTrue(message.contains("msg"));
	}

}
