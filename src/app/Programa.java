package app;

import Entities.*;
import Enums.Situacao;

import java.text.SimpleDateFormat;
import java.util.*;

import java.util.Scanner;

public class Programa {

    // Print bonitinho do produto
    public static void printProdutos(List<Produto> produtos) {
        System.out.println("Produtos cadastrados:");
        for (int i = 1; i <= produtos.size(); i++) {
            System.out.println("Produto " + i + " " + produtos.get(i - 1));
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // 8.a Dois objetos da classe Cliente
        Scanner sc = new Scanner(System.in);
        // Lista de Cliente
        List<Cliente> clientes = new ArrayList<Cliente>();
        // Cliente cliente;
        for (int i = 1; i <= 2; i++) {
            // System.out.println("Digite o cpf " + i + ":");
            // Integer cpf = sc.nextInt();
            // sc.nextLine(); // É o mesmo que parseInt+nextLine
            // System.out.println("Digite o nome " + i + ":");
            // String nome = sc.nextLine();
            // System.out.println("Digite o endereço " + i + ":");
            // String endereco = sc.nextLine();
            // clientes.add(new Cliente(cpf, nome, endereco));
            // Print do cliente
            // System.out.println(clientes.get(i-1));
            clientes.add(new Cliente(123, "nome" + i, "endereco" + i));
        }

        // Print bonitinho do cliente
        System.out.println("Clientes cadastrados:");
        for (int i = 1; i <= clientes.size(); i++) {
            System.out.println("Cliente " + i + " " + clientes.get(i - 1));
        }
        System.out.println();

        // 8.c Dois objetos da classe Pedido
        // Lista de Pedido
        List<Pedido> pedidos = new ArrayList<Pedido>();
        for (int i = 1; i <= 2; i++) {
            // System.out.println("Pedido " + i + ":");
            // System.out.println("Digite o número do pedido:");
            // Integer numero = sc.nextInt();
            // sc.nextLine(); // É o mesmo que parseInt+nextLine

            // Data now para String formatado
            Date now = new Date();
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            String data = formatter.format(now);

            // Situação
            Situacao situacao = Situacao.Analise;

            // Pedido
            // pedidos.add(new Pedido(numero, data, situacao, clientes.get(i-1)));
            // Pedido automatico
            pedidos.add(new Pedido(i, data, situacao, clientes.get(i - 1)));
        }

        // Print bonitinho do pedido
        System.out.println("Pedido cadastrados:");
        for (int i = 1; i <= pedidos.size(); i++) {
            System.out.println("Pedido " + i + " " + pedidos.get(i - 1));
        }
        System.out.println();

        // 8.d Dois objetos da classe Item

        // Produtos para Item
        List<Produto> produtos = new ArrayList<Produto>();
        for (int i = 1; i <= 5; i++) {
            // System.out.println("Produto " + i + ":");
            // System.out.println("Digite o código do produto:");
            // Integer codigo = sc.nextInt();
            // sc.nextLine();
            // System.out.println("Digite o nome do produto: ");
            // String nome = sc.nextLine();
            // System.out.println("Digite o preço do produto: ");
            // Float preco = sc.nextFloat();
            // System.out.println("Digite a quantidade em estoque do produto: ");
            // Integer qtdestoque = sc.nextInt();
            // sc.nextLine();

            // Produto
            // produtos.add(new Produto(codigo, nome, preco, qtdestoque));
            produtos.add(new Produto(i, "nome" + i, i, 10));
        }

        // Print bonitinho do produto
        printProdutos(produtos);
        System.out.println();

        // Lista de Item
        Integer produtoSelecionado;
        Integer qtd;

        // Print bonitinho do novo pedido
        System.out.println("Novo pedido:");

        // Para cada pedido
        for (int pedido = 1; pedido <= pedidos.size(); pedido++) {
            System.out.println("Pedido " + pedido + ":");
            Situacao situacao = Situacao.Analise;
            List<Item> itens = new ArrayList<Item>();

            // Adiciona dois itens para cada 1 pedido
            for (int item = 1; item <= 2; item++) {
                System.out.println("Item " + item + ":");

                // Escolher produto
                while (true) {
                    System.out.println("Escolha o produto [1-" + produtos.size() + "]:");

                    // Imprimir lista de produtos
                    for (int j = 1; j <= produtos.size(); j++) {
                        System.out.println("Produto " + j + ": " + produtos.get(j - 1));
                    }
                    System.out.print("Produto escolhido: ");
                    produtoSelecionado = sc.nextInt();
                    sc.nextLine();
                    // exit java
                    // Erros
                    if (produtoSelecionado < 1 || produtoSelecionado > produtos.size()) {
                        System.out.println("Produto inválido!");
                    } else
                        break;
                }

                // Quantidade
                while (true) {
                    System.out.println("Digite a quantidade do Item (" + produtos.get(produtoSelecionado - 1) + ")");
                    System.out.print("Quantidade escolhida: ");
                    qtd = sc.nextInt();
                    sc.nextLine();

                    // Erros
                    // ? Obtém o produto do índice `produtoSelecionado` da lista de produtos
                    if (qtd < 1 || qtd > produtos.get(produtoSelecionado - 1).getQtdEstoque()) {
                        System.out.println("Quantidade inválida!");
                    }

                    // Item selecionado, sai do loop para o próximo item
                    else {
                        // Item
                        itens.add(new Item(qtd, produtos.get(produtoSelecionado - 1)));

                        // atualizar a quantidade em estoque do produto via pedido
                        System.out.print("Estoque do produto " + produtoSelecionado + " '"
                                + produtos.get(produtoSelecionado - 1).getNome()
                        + "' atualizado: " + produtos.get(produtoSelecionado - 1).getQtdEstoque());
                        pedidos.get(pedido - 1).setItens(itens); // Insere/atualiza itens no pedido
                        System.out.println(" -> " + produtos.get(produtoSelecionado - 1).getQtdEstoque());

                        // Informar se o status do pedido mudou
                        if (pedidos.get(pedido - 1).getSituacao() != situacao) {
                            System.out.println("Status do pedido " + pedido + " mudou de " + situacao + " para "
                                    + pedidos.get(pedido - 1).getSituacao());
                            situacao = pedidos.get(pedido - 1).getSituacao();
                        }
                        System.out.println("");
                        break;
                    }
                }
            }

            // Adiciona os itens ao pedido
            pedidos.get(pedido - 1).setItens(itens);
        }

        // Print do novo estoque dos produtos
        System.out.println("Novo estoque dos produtos:");
        printProdutos(produtos);
        System.out.println();

        sc.close();

    }

}
