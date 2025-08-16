# Calculadora Binária em Java

Este projeto é uma calculadora simples em Java para realizar operações de soma, subtração, e multiplicação com números binários. Ele foi construído para demonstrar a lógica por trás das operações aritméticas em um sistema de numeração binário, usando apenas a lógica de programação, sem depender das funcionalidades de conversão nativas do Java.

---

## 📖 Sobre o Projeto

O projeto consiste em duas abordagens para resolver o problema da calculadora binária:

1.  **Abordagem Lógica (`CalculadoraSoma_SubtracaoB` e `CalculadoraMultiplicacaoB`):** Esta abordagem implementa a lógica de soma e subtração binária manualmente. A classe `Soma` executa a soma bit a bit, gerenciando o "vai um" (`sobe`) para os cálculos. A subtração é realizada usando o método do complemento de dois, onde o segundo número é invertido e somado a 1. A classe `Multiplica` utiliza a classe `Soma` para realizar a multiplicação através de somas repetidas, seguindo a lógica binária.
2.  **Abordagem de Conversão (`MultiplicacaoTeste`):** Esta segunda abordagem, mais simples, demonstra como realizar as mesmas operações de forma mais direta, convertendo os números binários para decimais, realizando a operação e depois convertendo o resultado de volta para binário. Isso mostra uma alternativa mais concisa usando a matemática decimal intermediária.

### Funcionalidades Principais

* **Soma Binária:** Implementa a lógica de soma bit a bit, simulando o "vai um" do sistema binário.
* **Subtração Binária:** Realiza a subtração utilizando o método do complemento de dois.
* **Multiplicação Binária:** Executa a multiplicação através de somas repetidas.
* **Conversão de Bases:** Inclui métodos para converter números entre as bases binária e decimal.
* **Interação com o Usuário:** Usa `JOptionPane` e `Scanner` para obter os números de entrada e a operação desejada.

---

## 🚀 Tecnologias Utilizadas

* **Java:** Linguagem de programação.
* **`javax.swing.JOptionPane`:** Para criar janelas de diálogo simples e interativas.
* **`java.util.Scanner`:** Para ler a entrada do usuário via console.

---

## ⚙️ Como Rodar a Aplicação

Siga os passos abaixo para compilar e executar o projeto:

1.  **Pré-requisitos:** Certifique-se de ter o **JDK** (versão 8 ou superior) instalado em sua máquina.
2.  **Clone o repositório:**
    ```bash
    git clone [URL_DO_SEU_REPOSITORIO]
    cd [NOME_DO_SEU_PROJETO]
    ```
3.  **Compilar as classes:**
    Abra um terminal na pasta raiz do projeto e compile os arquivos `.java`.
    ```bash
    javac -d . CalculadoraSoma_SubtracaoB/*.java CalculadoraMultiplicacaoB/*.java
    ```
4.  **Executar a aplicação:**
    Execute a classe `Programa` de sua escolha para testar.

    * **Soma e Subtração (`CalculadoraSoma_SubtracaoB`):**
        ```bash
        java CalculadoraSoma_SubtracaoB.Programa
        ```
    * **Multiplicação (`CalculadoraMultiplicacaoB`):**
        ```bash
        java CalculadoraMultiplicacaoB.Programa
        ```
    * **Abordagem com Conversão (`CalculadoraMultiplicacaoB`):**
        ```bash
        java CalculadoraMultiplicacaoB.MultiplicacaoTeste
        ```

    Dependendo da classe que você executar, a interação com o usuário será via janelas de diálogo ou via terminal, onde você poderá inserir os números binários e ver o resultado.