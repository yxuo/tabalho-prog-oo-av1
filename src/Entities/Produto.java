package Entities;

import java.util.*;

public class Produto {
    public Integer codigo;
    public String nome;
    public float preco;
    public Integer qtdestoque;
    List<Item> itens;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Estoque
    public Integer getQtdEstoque() {
        return qtdestoque;
    }

    public void setQtdEstoque(Integer qtdestoque) {
        this.qtdestoque = qtdestoque;
    }

    public void adicionaQtdEstoque() {
        this.qtdestoque += qtdestoque;
    }

    public void diminuiQtdEstoque() {
        this.qtdestoque -= qtdestoque;
    }

    // Construtor
    public Produto(Integer codigo, String nome, float preco, Integer qtdestoque) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.qtdestoque = qtdestoque;
    }

    // Construtor com sobrecarga
    public Produto() {
    }

    // Funçao para atualizar a lista
    public Integer AdicionaQtdEstoque(Integer qtdestoque) {
        return qtdestoque;
    }

    public Integer DiminuiQtdEstoque(Integer qtdestoque) {
        return qtdestoque;
    }

    // Método toString
    public String toString() {
        return "codigo=" + codigo + ", nome=" + nome + ", preco=" + preco + ", estoque=" + qtdestoque;
    }

    // toString para a lista de itens
    public String toStringItens() {
        String strItens = "";
        for (Item item : itens) {
            strItens += item.toString() + " ";
        }
        return strItens;
    }



}
