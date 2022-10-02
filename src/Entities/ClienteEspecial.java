package entities;
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
        super();
        this.cpf = cpf;
        this.nome = nome;
        this.endereco = endereco;
        this.area = area;
    }

    // Construtor com sobrecarga
    public ClienteEspecial() {
        super();
        this.cpf = 0;
        this.nome = "João";
        this.endereco = "Rua V, número 300";
        this.area = "VIP";
    }

    // Método toString
    public String toString() {
        return "ClienteEspecial [area=" + area + ", cpf=" + cpf + ", endereco=" + endereco + ", nome=" + nome + "]";
    }
}
