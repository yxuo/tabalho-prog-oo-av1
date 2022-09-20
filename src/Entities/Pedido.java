package Entities;

import Enums.Situacao;

public class Pedido {
    public Integer numero;
    public String data;
    public Situacao situacao;
    public float valor;

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

    // Construtor
    public Pedido(Integer numero, String data, Situacao situacao, float valor) {
        this.numero = numero;
        this.data = data;
        this.situacao = situacao;
        this.valor = valor;
    }

    // Construtor com sobrecarga
    public Pedido() {
    }

}
