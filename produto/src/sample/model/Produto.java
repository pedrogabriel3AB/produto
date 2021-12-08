package sample.model;

public class Produto {

    String nome;
    double preço;

    public String getnome() {
        return this.nome;
    }

    public void setnome(String nome) {
        this.nome = nome;
    }

    public double getPreço() {
        return this.preço;
    }

    public void setpreço(double preço) {
        this.preço = preço;
    }

    public String toString() {
        return "Produto: " + nome + ", $" + preço;

    }

}
