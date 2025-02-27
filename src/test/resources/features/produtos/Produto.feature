#encoding: UTF-8
#language: pt

Funcionalidade: Compra produto

  Cenário: Adicionar um produto ao carrinho
    Dado que o usuário está acessar de login e preencher usuario "standard_user" e senha "secret_sauce"
    Quando o usuário escolhe um produto "Sauce Labs Bike Light"
    E o usuário clica no botão ADD TO CART
    Então o botão deverá mudar para REMOVE com cor de borda preta e o texto 'REMOVE'.
    E o sistema deverá exibir uma notificação no carrinho.

  Cenário: Remover um produto
    Dado que o usuário está acessar de login e preencher usuario "standard_user" e senha "secret_sauce"
    Quando que o usuário já adicionou um produto "Sauce Labs Bike Light" ao carrinho
    E o usuário clica no botão REMOVE
    Então o botão deverá mudar para "ADD TO CART"
    E a notificação no icone do carrinho não deverá aparecer

  Cenário: Adicionar todos os produtos ao carrinho
    Dado que o usuário está acessar de login e preencher usuario "standard_user" e senha "secret_sauce"
    Quando o usuário clica no botão "ADD TO CART" todos os produtos
    Então os botões deverão mudar para "REMOVE"
    E a notificação no icone do carrinho com quantidade que selecionado