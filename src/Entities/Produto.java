package Entities;


public class Produto {
    public Integer codigo;
    public String nome;
    public float preco;
    public Integer qtdestoque;

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

    public void adicionaQtdEstoque(Integer qtdestoque) {
        this.qtdestoque += qtdestoque;
    }

    public void diminuiQtdEstoque(Integer qtdestoque) {
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

    // Método toString
    public String toString() {
        return "codigo=" + codigo + ", nome=" + nome + ", preco=" + preco + ", estoque=" + qtdestoque;
    }
}
