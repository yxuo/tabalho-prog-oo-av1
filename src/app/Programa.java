package app;
import Entities.*;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        // Dois objetos da classe Cliente
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i<=2; i++) {
            System.out.println("Digite o nome do cliente"+i+" :");
            String nome = sc.nextLine();
            System.out.println("Digite o cpf do cliente"+i+" :");
            Integer cpf = sc.nextInt();
            System.out.println("Digite o enderço do cliente"+i+" :");
            String endereco = sc.nextLine();
            Cliente cliente = new Cliente(cpf, nome, endereco);
            System.out.println(cliente.toString());
        }
        for (int i=1;i<=3;i++){
            System.out.println("Digite o codigo "+i+" :");
            int codigo = Integer.parseInt(sc.nextLine());
            
            System.out.println("Digite o nome "+i+" :");
            String nome = sc.nextLine();
            System.out.println("Digite o preco "+i+" :");
            float preco = Float.parseFloat(sc.nextLine());
            System.out.println("Digite o preco "+i+" :");
            Integer qtdestoque = Integer.parseInt(sc.nextLine());
            Produto produto=new Produto(codigo,nome,preco,qtdestoque);
        }
        sc.close();

    }
}
