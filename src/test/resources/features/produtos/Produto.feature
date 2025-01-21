#encoding: UTF-8
#language: pt

Funcionalidade: Compra produto

  Cenário: Adicionar um produto ao carrinho
    Dado que o usuário está acessar de login e preencher usuario "standard_user" e senha "secret_sauce"
    Quando o usuário escolhe um produto "Sauce Labs Bike Light"
    E o usuário clica no botão ADD TO CART
    Então o botão deverá mudar para REMOVE com cor de borda preta e o texto 'REMOVE'.
    E o sistema deverá exibir uma notificação no carrinho.
