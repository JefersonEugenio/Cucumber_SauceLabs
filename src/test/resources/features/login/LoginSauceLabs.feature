#encoding: UTF-8
#language: pt

Funcionalidade: Login no sistema Sauce Labs

  Cenário: Login com validas
    Dado que o usuario esta na pagina de login do sistema Sauce Labs
    Quando o usuario preenche o campo "Username" com "standard_user"
    E o usuario preenche o campo "Password" com "secret_sauce"
    E o usuario clica no botao login
    Então o sistema autentica o usuario
    E redireciona para a tela principal

  Cenário: Login com campos vazios (sem username e password)
    Dado que o usuario esta na pagina de login do sistema Sauce Labs
    Quando o usuário deixa o campo "Username" em branco
    E o usuário deixa o campo "Password" em branco
    E o usuario clica no botao login
    Então o sistema exibe a mensagem "Username is required"