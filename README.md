Sistema de Vendas de Produtos

Bem-vindo ao Sistema de Vendas de Produtos! Este projeto é um programa em Java que simula um sistema simples de vendas, permitindo que o usuário escolha produtos, informe as quantidades desejadas e receba um recibo final da compra.
Funcionalidades

    Exibe um inventário de produtos disponíveis para compra.

    Permite ao usuário selecionar produtos pelo ID.

    Verifica se a quantidade solicitada está disponível no estoque.

    Calcula o total da compra e exibe um recibo detalhado.

Estrutura do Código
1. Product

Representa os produtos disponíveis no inventário, com:

    ID, nome, preço e estoque.

    Métodos para reduzir o estoque e exibir informações do produto.

2. Sale

Gerencia a venda de produtos, com:

    Lista de produtos comprados e suas quantidades.

    Métodos para adicionar produtos à compra, calcular o total e imprimir o recibo.

3. SaleProducts

Classe principal que:

    Exibe o menu de produtos.

    Captura as escolhas do usuário e gerencia o fluxo da compra.

    Finaliza exibindo o recibo.

Exemplo de Execução

    O sistema lista os produtos disponíveis:
    ID: 1, Nome: Celular, Preço: R$ 1200.0, Estoque: 10
    ID: 2, Nome: Notebook, Preço: R$ 3500.0, Estoque: 5
    ID: 3, Nome: Fone de Ouvido, Preço: R$ 200.0, Estoque: 20
    ID: 4, Nome: Carregador, Preço: R$ 50.0, Estoque: 30

    O usuário escolhe o produto e a quantidade:
    Digite o ID do produto que deseja comprar: 1
    Digite a quantidade desejada: 2
    Produto adicionado com sucesso!

    Ao finalizar, exibe o recibo:
    --- Recibo ---
    Celular (x2) - R$ 2400.00
    Total: R$ 2400.00

Como Executar

    Certifique-se de ter o Java instalado.

    Compile as classes:
    javac SaleProducts.java Product.java Sale.java

    Execute o programa:
    java SaleProducts

Feito com 💻 por Gustavo Passos.


