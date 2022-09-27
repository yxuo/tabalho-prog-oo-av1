package app;

import Entities.*;
import Enums.Situacao;

import java.text.SimpleDateFormat;
import java.util.*;

import java.util.Scanner;

import javax.swing.text.DateFormatter;

public class Programa {
    public static void main(String[] args) {
        // 8.a Dois objetos da classe Cliente
        Scanner sc = new Scanner(System.in);
        // Lista de Cliente
        List<Cliente> clientes = new ArrayList<Cliente>();
        // Cliente cliente;
        for (int i = 1; i <= 2; i++) {
            // System.out.println("Digite o cpf " + i + " :");
            // Integer cpf = sc.nextInt();
            // sc.nextLine(); // É o mesmo que parseInt+nextLine
            // System.out.println("Digite o nome " + i + " :");
            // String nome = sc.nextLine();
            // System.out.println("Digite o endereço " + i + " :");
            // String endereco = sc.nextLine();
            // clientes.add(new Cliente(cpf, nome, endereco));
            // Print do cliente
            // System.out.println(clientes.get(i-1));
            clientes.add(new Cliente(123, "nome" + i, "endereco" + 1));
        }
        for (int i = 1; i <= clientes.size(); i++) {
            System.out.println("Cliente " + i + " " + clientes.get(i - 1));
        }

        // 8.c Três objetos da classe Pedido
        // Lista de Pedido
        List<Pedido> pedidos = new ArrayList<Pedido>();
        for (int i = 1; i <= 2; i++) {
            // System.out.println("Pedido " + i + " :");
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
        for (int i = 1; i <= pedidos.size(); i++) {
            System.out.println("Pedido " + i + " " + pedidos.get(i - 1));
        }

        // 8.d Dois objetos da classe Item
        // Lista de Item
        List<Item> itens = new ArrayList<Item>();
        // Para cada pedido
        for (int i = 1; i <= pedidos.size(); i++) {
            // Dois itens para cada 1 pedido
            for (int j = 1; j <= 2; j++) {
                System.out.println("Item " + i + " :");
                System.out.println("Digite a quantidade do Item:");
                Integer qtd = sc.nextInt();
                sc.nextLine(); // É o mesmo que parseInt+nextLine

                // Data now para String formatado
                Date now = new Date();
                SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
                String data = formatter.format(now);

                // Situação
                Situacao situacao = Situacao.Analise;

                // Item
                itens.add(new Item(qtd, data, situacao, pedidos.get(i - 1)));

                // Print do Item
                // System.out.println("Item " + i + ": " + itens.get(i-1));
            }
        }
        for (int i = 1; i <= itens.size(); i++) {
            System.out.println("Item " + i + " " + itens.get(i - 1));
        }

        sc.close();

    }
}
