# Conta Bancária em Java

Projeto de uma conta bancária em Java, praticando POO (Programação Orientada a Objetos), como classes, atributos, métodos, getters e setters.

## Estrutura do projeto

├── main.java

└── ContaBancaria.java

## Funcionalidades

O programa permite

Cadastrar o nome do titular da conta;
Definir um limite de crédito de até R$ 1.000,00

Depositar dinheiro

Sacar dinheiro utilizando o saldo e, quando necessário, o limite

Consultar o saldo atual e limite disponível

Encerrar o programa.
## Classe ContaBancaria

A classe ContaBancaria representa uma conta bancária e possui os seguintes atributos

#### atributos
titular	String

saldo	float

limite	Float

#### Métodos principais
depositar(float valor)

contaBancaria.depositar(valorDeposito);

sacar(float valor)

boolean sucesso = contaBancaria.sacar(valorSaque);

#### O método retorna

true — quando o saque é realizado;

false — quando o saldo e o limite são insuficientes ou o valor é inválido.

setLimite(Float limite) = Define o limite da conta.

O limite máximo permitido é de R$ 1.000,00.

contaBancaria.setLimite(limite);

## Como executar

versão Java = 25
biblioteca utilizada = import static java.lang.IO.

Compile os arquivos em alguma IDE (IntelliJ)

javac main.java

ContaBancaria.java


## Exemplo de utilização

Ao iniciar o programa, será solicitado o nome do titular

Qual é seu nome Nicolas

Depois, o programa solicitará o limite

Quando você quer de limite(ATE R$1000, se passar NAO TERA LIMITE!!!!!) 500

=========================================

Ola João

O que quer fazer

1 Depositar

2 Sacar

3 Consultar Saldo

0 Sair

__ 1

Quanto você quer depositar 800

Depósito realizado

Novo saldo R$ 800.0

__ 2

Quanto você quer sacar 500

Saque realizado

Saldo atual R$ 300.0


__ 3

Seu saldo atual é R$ 300.0

Seu limite é de R$ 500.0

## Observações
O limite máximo configurável é de R$ 1.000,00.

Depósitos com valor menor ou igual a zero não são realizados.

Saques com valor menor ou igual a zero não são permitidos.

O limite pode ser utilizado quando o saldo não for suficiente para realizar um saque.


Caso seja informado um limite superior a R$ 1.000,00, o programa exibe uma mensagem e não
define esse limite.

## Conceitos utilizados

Programação Orientada a Objetos (POO);

Encapsulamento;

Classes e objetos;

Atributos privados;

Getters e setters;

Construtores;

Métodos;

ifelse;

switchcase;

while;

Entrada de dados pelo usuário;

Conversão de String para float.