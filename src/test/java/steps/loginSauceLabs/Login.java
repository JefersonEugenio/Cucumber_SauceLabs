package steps.loginSauceLabs;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static framework.webDrivers.DriverManager.getDriver;

public class Login {

    WebDriver driver = getDriver();

    @Dado("que o usuario esta na pagina de login do sistema Sauce Labs")
    public void que_o_usuario_esta_na_pagina_de_login_do_sistema_sauce_labs() {
        System.out.println("A tela está pagina de login do sistema Sauce Labs");
    }

    @Quando("o usuario preenche o campo {string} com {string}")
    public void o_usuario_preenche_o_campo_com(String campo, String string) {
        if (campo.equalsIgnoreCase("username")) {
            driver.findElement(By.id("user-name")).sendKeys(string);
            System.out.println("Preenche do usuario: " + string);
        } else if (campo.equalsIgnoreCase("password")) {
            driver.findElement(By.id("password")).sendKeys(string);
            System.out.println("Preenche a senha do usuario: " + string);
        }
    }
//
//    @E("o usuario clica no botao login")
//    public void o_usuario_clica_no_botao_login() {
//        driver.findElement(By.id("login-button")).click();
//    }
//
//    @Entao("o sistema autentica o usuario")
//    public void o_sistema_autentica_o_usuario() {
//        System.out.println("Entrando autentica");
//    }
//
//    @E("redireciona para a tela principal")
//    public void redireciona_para_a_tela_principal() {
//        System.out.println("A tela está principal a página do sistema Sauce Labs");
//    }

}