package Entities;

public class Item {
    public Integer qtd;
    public Integer sequencial;
    public Produto produto;

    public Integer getQtd() {
        return qtd;
    }

    public void setQtd(Integer qtd) {
        this.qtd = qtd;
    }

    public Integer getSequencial() {
        return sequencial;
    }

    public void setSequencial(Integer sequencial) {
        this.sequencial = sequencial;
    }

    // Construtor
    public Item(Integer qtd, Integer sequencial,Produto produto) {
        this.qtd = qtd;
        this.sequencial = sequencial;
        this.produto=produto;
        
    }

    // Construtor com sobrecarga
    public Item() {
    }

    // Método toString
    public String toString() {
        return "Item [qtd=" + qtd + ", sequencial=" + sequencial + ", produto=" + produto + "]";
    }
}
