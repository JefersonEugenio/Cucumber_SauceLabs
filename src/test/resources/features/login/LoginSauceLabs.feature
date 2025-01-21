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

  Cenário: Login com campo vazio (sem password)
    Dado que o usuario esta na pagina de login do sistema Sauce Labs
    Quando o usuario preenche o campo "Username" com "standard_user"
    E o usuário deixa o campo "Password" em branco
    E o usuario clica no botao login
    Então o sistema exibe a mensagem "Password is required"

  Cenário: Login com campo vazio (sem username)
    Dado que o usuario esta na pagina de login do sistema Sauce Labs
    Quando o usuário deixa o campo "Username" em branco
    E o usuario preenche o campo "Password" com "secret_sauce"
    E o usuario clica no botao login
    Então o sistema exibe a mensagem "Username is required"

  Cenário: Login com invalida (username incorreto)
    Dado que o usuario esta na pagina de login do sistema Sauce Labs
    Quando o usuario preenche o campo "Username" com "qwert"
    E o usuario preenche o campo "Password" com "secret_sauce"
    E o usuario clica no botao login
    Então o sistema exibe a mensagem "Username and password do not match any user in this service"

  Cenário: Login com invalida (password incorreto)
    Dado que o usuario esta na pagina de login do sistema Sauce Labs
    Quando o usuario preenche o campo "Username" com "standard_user"
    E o usuario preenche o campo "Password" com "1234567890"
    E o usuario clica no botao login
    Então o sistema exibe a mensagem "Username and password do not match any user in this service"

  Cenário: Login com invalida (username e password incorreto)
    Dado que o usuario esta na pagina de login do sistema Sauce Labs
    Quando o usuario preenche o campo "Username" com "qwert"
    E o usuario preenche o campo "Password" com "1234567890"
    E o usuario clica no botao login
    Então o sistema exibe a mensagem "Username and password do not match any user in this service"

  Cenário: Login com usuário bloqueado
    Dado que o usuario esta na pagina de login do sistema Sauce Labs
    Quando o usuario preenche o campo "Username" com "locked_out_user"
    E o usuario preenche o campo "Password" com "secret_sauce"
    E o usuario clica no botao login
    Então o sistema exibe a mensagem "Sorry, this user has been locked out."

  Cenário: Login com válida (usuário problemático)
    Dado que o usuario esta na pagina de login do sistema Sauce Labs
    Quando o usuario preenche o campo "Username" com "problem_user"
    E o usuario preenche o campo "Password" com "secret_sauce"
    E o usuario clica no botao login
    Então o sistema autentica o usuario
    E redireciona para a tela principal