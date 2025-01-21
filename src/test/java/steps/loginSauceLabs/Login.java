package steps.loginSauceLabs;

import com.aventstack.extentreports.Status;
import framework.supports.ScenarioContext;
import io.cucumber.java.pt.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static framework.tools.Report.extentTest;

public class Login {

    private final ScenarioContext scenarioContext;

    public Login(ScenarioContext scenarioContext) {
        this.scenarioContext = scenarioContext;
    }

    @Dado("que o usuario esta na pagina de login do sistema Sauce Labs")
    public void que_o_usuario_esta_na_pagina_de_login_do_sistema_sauce_labs() {
        extentTest.log(Status.INFO, "A tela está pagina de login do sistema Sauce Labs");
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

    @E("o usuário deixa o campo {string} em branco")
    public void o_usuário_deixa_o_campo_password_em_branco(String campo) {
        WebDriver driver = scenarioContext.getDriver();
        if (campo.equalsIgnoreCase("username")) {
            driver.findElement(By.id("user-name")).clear();
        } else if (campo.equalsIgnoreCase("password")) {
            driver.findElement(By.id("password")).clear();
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

    @Então("o sistema exibe a mensagem {string}")
    public void o_sistema_exibe_a_mensagem(String mensagem) throws IllegalAccessException {
        WebDriver driver = scenarioContext.getDriver();
        String imprimir = driver.findElement(By.cssSelector("#login_button_container > div > form > h3 > button")).getText();
    }
}