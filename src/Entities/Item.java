package Entities;

public class Item {
    public Integer qtd;
    public Integer sequancial;

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
    public Item(Integer qtd, Integer sequencial) {
        this.qtd = qtd;
        this.sequancial = sequencial;
    }

    // Construtor com sobrecarga
    public Item() {
    }
}
