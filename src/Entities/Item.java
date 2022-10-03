package Entities;

public class Item {
    public Integer qtd;
    // public Integer sequencial;
    public Produto produto;

    public Integer getQtd() {
        return qtd;
    }

    public void setQtd(Integer qtd) {
        this.qtd = qtd;
    }

    // public Integer getSequencial() {
    //     return sequencial;
    // }

    // public void setSequencial(Integer sequencial) {
    //     this.sequencial = sequencial;
    // }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Produto getProduto() {
        return produto;
    }

    // Construtor
    public Item(Integer qtd, Produto produto) {
        this.qtd = qtd;
        this.produto=produto;
        
    }

    // Construtor com sobrecarga
    public Item() {
    }

    // Método toString
    public String toString() {
        return "qtd=" + qtd + ", produto=" + produto;
    }
}
