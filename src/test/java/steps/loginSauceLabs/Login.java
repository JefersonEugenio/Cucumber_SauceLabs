package steps.loginSauceLabs;

import framework.supports.BaseTest;
import framework.supports.ScenarioContext;
import framework.webDrivers.DriverManager;
import framework.webDrivers.Drivers;
import io.cucumber.java.Scenario;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {

    private final ScenarioContext scenarioContext;

    public Login(ScenarioContext scenarioContext) {
        this.scenarioContext = scenarioContext;
    }

    @Dado("que o usuario esta na pagina de login do sistema Sauce Labs")
    public void que_o_usuario_esta_na_pagina_de_login_do_sistema_sauce_labs() {
    }

    @Quando("o usuario preenche o campo {string} com {string}")
    public void o_usuario_preenche_o_campo_com(String campo, String string) {
        WebDriver driver = scenarioContext.getDriver();
        if (campo.equalsIgnoreCase("username")) {
            driver.findElement(By.id("user-name")).sendKeys(string);
        } else if (campo.equalsIgnoreCase("password")) {
            driver.findElement(By.id("password")).sendKeys(string);
        }
    }

    @E("o usuario clica no botao login")
    public void o_usuario_clica_no_botao_login() {
        WebDriver driver = scenarioContext.getDriver();
        driver.findElement(By.id("login-button")).click();
    }

    @Entao("o sistema autentica o usuario")
    public void o_sistema_autentica_o_usuario() {
    }

    @E("redireciona para a tela principal")
    public void redireciona_para_a_tela_principal() {
    }

}