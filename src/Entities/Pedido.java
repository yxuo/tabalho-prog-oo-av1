package entities;

import java.util.*;

import enums.Situacao;

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

    public List<Item> getItens() {
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

        // Item novo adicionado na nova lista, diminui o estoque
        for (Item itemExterno : itens) {
            if (!this.getItens().contains(itemExterno)) {
                // Diminui o estoque
                itemExterno.getProduto().diminuiQtdEstoque(itemExterno.getQtd());
            }
        }

        // Item atual não existe mais na nova lista, aumenta o estoque
        for (Item itemAtual : this.itens) {
            // Aumenta o estoque
            if (!itens.contains(itemAtual)) {
                itemAtual.getProduto().adicionaQtdEstoque(itemAtual.getQtd());
            }
        }

        // System.out.print(this.getNumero() + " - " + this.getSituacao());
        // Adicionou o 1o item, muda status para APROVADO
        if (this.itens.size() == 0 && itens.size() > 0) {
            this.setSituacao(Situacao.Aprovado);
        }
        // Adicionou o 2o item, muda status para ANALISE
        if (this.itens.size() == 1 && itens.size() > 1) {
            this.setSituacao(Situacao.Atendido);
        }

        // Copia a lista de itens, ao invés de referenciar
        // ? O Java possui um garbage collector que limpa a memória automaticamente
        this.itens = new ArrayList<Item>(itens);
        // System.out.println(" - " + this.getSituacao() + " - " + this.getItens());
    }

    // Construtor
    public Pedido(Integer numero, String data, Situacao situacao, Cliente cliente) {
        this.numero = numero;
        this.data = data;
        this.situacao = situacao;
        this.valor = 0;
        this.cliente = cliente;
        this.itens = new ArrayList<Item>();
    }

    // Construtor com sobrecarga
    public Pedido() {
    }

    // Método toString
    public String toString() {
        return "data=" + data + ", numero=" + numero + ", situacao=" + situacao + ", valor=" + valor + ", cliente={"
                + cliente + "}";
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
