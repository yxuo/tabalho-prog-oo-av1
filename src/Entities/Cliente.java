package Entities;

import java.util.*;

public class Cliente {
    public Integer cpf;
    public String nome;
    public String endereco;
    List<Pedido> pedido;

    public Integer getCpf() {
        return cpf;
    }

    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public List<Pedido> getPedido() {
        return pedido;
    }
    public void setPedido(List<Pedido> pedido) {
        this.pedido = pedido;
    }
    // Construtor
    public Cliente(Integer cpf, String endereco, String nome) {
        this.cpf = cpf;
        this.nome = nome;
        this.endereco = endereco;
    }
    
    // Construtor com sobrecarga
    public Cliente() {
    }

}
