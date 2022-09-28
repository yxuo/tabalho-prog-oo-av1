package Entities;

import java.util.*;

import Enums.Situacao;

public class Pedido {
    public Integer numero;
    public String data;
    public Situacao situacao;
    public float valor;
    public Cliente cliente;
    private List<Item> itens;
    

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
        return itens;
    }
    public void setItens(List<Item> itens) {
        // Atualizar o valor do pedido
        float valor = 0;
        for (Item i : itens) {
            valor += i.getProduto().getPreco() * i.getQtd();
        }
        this.valor = valor;
        
        // Atualizar estoque
        // Se algum item atual ainda não existe na lista de itens externa, adicionou no carrinho, diminui o estoque
        for (Item itemExterno : itens) {
            if(!this.itens.contains(itemExterno)) {
                // Aumenta o estoque
                itemExterno.getProduto().diminuiQtdEstoque(itemExterno.getQtd());
            }
        }
        // Se algum item externo já não exite na lista de itens atual, removeu do carrinho, aumenta o estoque
        for (Item itemAtual : this.itens) {
            if(!itens.contains(itemAtual)) {
                // Aumenta o estoque
                itemAtual.getProduto().adicionaQtdEstoque(itemAtual.getQtd());
            }
        }
        // Adicionou o 1o item, muda status para APROVADO
        if(this.itens.size() == 0 && itens.size() > 0) {
            this.setSituacao(Situacao.Aprovado);
        }
        // Adicionou o 2o item, muda status para ANALISE
        if(this.itens.size() == 1 && itens.size() > 1) {
            this.setSituacao(Situacao.Atendido);
        }
        this.itens = itens; // Substituindo a lista
    }
    // Construtor
    public Pedido(Integer numero, String data, Situacao situacao, Cliente cliente) {
        this.numero = numero;
        this.data = data;
        this.situacao = situacao;
        this.valor = 0;
        this.cliente=cliente;
        this.itens = new ArrayList<Item>();
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
        for (Item item : this.itens) {
            itens += item.toString() + " ";
        }
        return itens;
    }

}
