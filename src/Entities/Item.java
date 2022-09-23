package Entities;

public class Item {
    public Integer qtd;
    public Integer sequancial;
    public Produto produto;

    public Integer getQtd() {
        return qtd;
    }

    public void setQtd(Integer qtd) {
        this.qtd = qtd;
    }

    public Integer getSequencial() {
        return sequancial;
    }

    public void setSequencial(Integer sequencial) {
        this.sequancial = sequencial;
    }

    // Construtor
    public Item(Integer qtd, Integer sequencial,Produto produto) {
        this.qtd = qtd;
        this.sequancial = sequencial;
        this.produto=produto;
        
    }

    // Construtor com sobrecarga
    public Item() {
    }

    // Método toString
    public String toString() {
        return "Item [qtd=" + qtd + ", sequencial=" + sequancial + ", produto=" + produto + "]";
    }
}
