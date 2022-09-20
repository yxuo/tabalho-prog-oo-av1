package Entities;
// import entities.Cliente;

public class ClienteEspecial extends Cliente {
    public String area;

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    // Construtor
    public ClienteEspecial(Integer cpf, String endereco, String nome, String area) {
        this.cpf = cpf;
        this.nome = nome;
        this.endereco = endereco;
        this.area = area;
    }

    // Construtor com sobrecarga
    public ClienteEspecial() {
    }
}
