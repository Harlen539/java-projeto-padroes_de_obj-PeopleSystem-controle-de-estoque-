# Controle de Estoque em Java

Projeto de console desenvolvido em Java para cadastrar um produto, processar uma venda e exibir o estoque atualizado.

## Funcionalidades

- Leitura do nome do produto
- Leitura do preco do produto
- Leitura da quantidade inicial em estoque
- Leitura da quantidade vendida
- Validacao de estoque antes da venda
- Exibicao dos dados antes e depois da venda

## Estrutura

```text
src/
|-- Apps/
|   `-- Application.java
`-- PeopleSystem/
    `-- Produto.java
```

## Como executar

Compile:

```bash
javac src/PeopleSystem/Produto.java src/Apps/Application.java
```

Execute:

```bash
java -cp src Apps.Application
```

## Print de execucao

Exemplo de entrada:

```text
Notebook
3500.00
5
2
```

Saida registrada no projeto:

```text
Produto: Notebook
Preco: R$ 3500.00
Estoque antes da venda: 5 unidades
Venda realizada: 2 unidades
Estoque atualizado: 3 unidades
```

Print real da execucao:

![Print de execucao](assets/execucao-ide.png)

## Regra de negocio

Se a quantidade vendida for maior que o estoque disponivel, o programa exibe:

```text
Estoque insuficiente para realizar a venda.
```

Nesse caso, o estoque nao e alterado.
