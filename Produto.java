package VF.Q1;

public abstract class Produto {
    private int codigo;
    private String nome;
    private double preco;

    public Produto(int codigo, String nome, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
    }

    public abstract double calcularDesconto();

    public double getPreco() {
        return preco;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String toString() {
        return "Código: " + codigo + ", Nome: " + nome + ", Preço: R$" + String.format("%.2f", preco);
    }
}
