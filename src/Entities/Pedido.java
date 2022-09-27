package Entities;

import java.util.*;

import Enums.Situacao;

public class Pedido {
    public Integer numero;
    public String data;
    public Situacao situacao;
    public float valor;
    public Cliente cliente;
    private List<Item> item;
    

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public Situacao getSituacao() {
        return situacao;
    }

    public void setSituacao(Situacao situacao) {
        this.situacao = situacao;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }
    public List<Item> getItems() {
        return item;
    }
    public void setItems(List<Item> item) {
        this.item = item;
        // Atualizar o valor do pedido
        float valor = 0;
        for (Item i : item) {
            valor += i.getProduto().getPreco() * i.getQtd();
        }
        this.valor = valor;
    }
    // Construtor
    public Pedido(Integer numero, String data, Situacao situacao, Cliente cliente) {
        this.numero = numero;
        this.data = data;
        this.situacao = situacao;
        this.valor = 0;
        this.cliente=cliente;
        this.item = new ArrayList<Item>();
    }

    // Construtor com sobrecarga
    public Pedido() {
    }

    // Método toString
    public String toString() {
        return "data=" + data + ", numero=" + numero + ", situacao=" + situacao + ", valor=" + valor + ", cliente={" + cliente+"}";
    }

    // toString todos os itens do pedido
    public String toStringItens() {
        String itens = "";
        for (Item item : item) {
            itens += item.toString() + " ";
        }
        return itens;
    }

}
