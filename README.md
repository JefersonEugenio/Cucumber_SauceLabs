# Sauce Labs com Cucumber

## Descrição do projeto
O objetivo deste projeto é criar uma automação completa de testes para o site [Sauce Labs](https://www.saucedemo.com/v1/index.html). O foco é identificar cenários de teste, implementá-los e configurar relatórios detalhados de execução, aplicando boas práticas de automação.

## Índice
1. [Sobre o projeto](#sobre-o-projeto)
2. [Funcionalidades do projeto](#funcionalidades-do-projeto)
3. [Tecnologias usadas](#tecnologias-usadas)
4. [Como Executar](#como-executar)
5. [Autor](#autor)

## Sobre o projeto
Este projeto automatiza testes para o site Sauce Labs, validando funcionalidades críticas e garantindo a confiabilidade da aplicação. São abordados diferentes cenários, como login, navegação no catálogo de produtos, adição de itens ao carrinho, e finalização de compras. Além disso, os relatórios gerados permitem análise detalhada das execuções.

## Funcionalidades do projeto
1. Acessar o site Sauce Labs e realizar login com diferentes tipos de credenciais.
2. Navegar no catálogo de produtos e validar a listagem correta.
3. Adicionar itens ao carrinho e verificar os detalhes antes da compra.
4. Finalizar uma compra e validar o resumo do pedido.
5. Gerar relatórios de execução para análise de resultados.

## Tecnologias usadas
### Liguagem de programação:
* [JAVA (JDK 17)](https://www.oracle.com/java/technologies/downloads/#java17)
### Ferramenta:
* [Intellij IDEA](https://www.jetbrains.com/pt-br/idea/)
* [Maven](https://maven.apache.org/)

## Como executar
### Pré-requisitos
Antes de começar, você vai precisar ter instaladas em sua máquina as seguintes ferramentas: 
* Git
* Maven
* JDK 17
<p>Além disso, é recomendado usar uma IDE como IntelliJ IDEA para facilitar o desenvolvimento.</p>

### Passo a passo
#### 2.Executar o projeto
1. Clone o repositório:
```bash
git clone https://github.com/JefersonEugenio/Cucumber_SauceLabs.git
cd Cucumber_SauceLabs
```
2. Abra o projeto na sua IDE.
3. Instale as dependências do projeto
* Antes de executar os testes, é recomendado instalar as dependências utilizando o Maven
 `mvn install -DskipTests=true`
4. Execute os testes
* Você pode executar os testes de duas maneiras:
  VIA TERMINAL: Execute o comando abaixo na raiz do projeto:
  ``mvn test``
  VIA IDE:
  Navegue até o diretório: `src/test/java/runner/SauceLabsRunTest`.
  Clique no ícone de "Play" ao lado da classe SauceLabsRunTest.
5. Visualize os relatórios:
* Navegue até `src/main/java/resources/report/` para abrir e visualizar o relatório gerado após a execução dos testes.

## Autor
| [<img src="https://avatars.githubusercontent.com/u/122066021?v=4" width=115><br><sub>Jeferson Lopes Eugenio</sub>](https://github.com/JefersonEuenio) |
| :---: |
