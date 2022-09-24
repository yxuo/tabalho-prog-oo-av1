package app;
import Entities.*;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        // Dois objetos da classe Cliente
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i<2; i++) {
            System.out.println("Digite o nome, cpf e endereço do cliente " + (i+1));
            String nome = sc.nextLine();
            Integer cpf = sc.nextInt();
            String telefone = sc.nextLine();
            Cliente cliente = new Cliente(cpf, nome, telefone);
            System.out.println(cliente.toString());
        }
        sc.close();

    }
}
