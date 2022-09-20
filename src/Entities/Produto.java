package Entities;

import java.util.*;

public class Produto {
    public Integer codigo;
    public String nome;
    public float preco;
    public Integer qtdestoque;
    List<Item> items;

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

    public Integer getQtdEstoque() {
        return qtdestoque;
    }

    public void setQtdEstoque(Integer qtdestoque) {
        this.qtdestoque = qtdestoque;
    }
    public List<Item> getItems() {
        return items;
    }
    public void setItems(List<Item> item) {
        this.items = item;
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

    //Funçao para atualizar a lista
    public Integer AdicionaQtdEstoque(Integer qtdestoque){
        return qtdestoque;
    }
    public Integer DiminuiQtdEstoque(Integer qtdestoque){
        return qtdestoque;
    }
   
}
