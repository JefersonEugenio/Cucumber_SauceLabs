#encoding: UTF-8
#language: pt

Funcionalidade:  Ações do menu

  Cenário: Opção do menu 'All Items'
    Dado que o usuário está acessar de login e preencher usuario "standard_user" e senha "secret_sauce"
    Quando o usuário clica no ícone ou símbolo de três linhas
    E aparece uma lista de opções: All Items, About, Logout, Reset App State e X
    E o usuário clica "All Items"
    Então o sistema deverá redirecionar para a tela principal com a lista de produtos

  Cenário: Opção do menu 'About'
    Dado que o usuário está acessar de login e preencher usuario "standard_user" e senha "secret_sauce"
    Quando o usuário clica no ícone ou símbolo de três linhas
    E aparece uma lista de opções: All Items, About, Logout, Reset App State e X
    E o usuário clica "About"
    Então o sistema deverá redirecionar para site de SauceLabs

  Cenário: Opção do menu 'Logout'
    Dado que o usuário está acessar de login e preencher usuario "standard_user" e senha "secret_sauce"
    Quando o usuário clica no ícone ou símbolo de três linhas
    E aparece uma lista de opções: All Items, About, Logout, Reset App State e X
    E o usuário clica "Logout"
    Então o sistema deverá redirecionar para a tela de login, deslogando o usuário

  Cenário: Opção do menu 'X'
    Dado que o usuário está acessar de login e preencher usuario "standard_user" e senha "secret_sauce"
    Quando o usuário clica no ícone ou símbolo de três linhas
    E aparece uma lista de opções: All Items, About, Logout, Reset App State e X
    E o usuário clica "X"
    Então o menu deverá fechar