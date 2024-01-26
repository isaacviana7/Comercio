package VF.Q1;

public class Eletronico extends Produto {
    private String marca;

    public Eletronico(int codigo, String nome, double preco, String marca) {
        super(codigo, nome, preco);
        this.marca = marca;
    }

    public double calcularDesconto() {
        return getPreco() * 0.1;
    }

    public String toString() {
        return "Código: " + getCodigo() + ", Nome: " + getNome() + ", Marca: " + marca + ", Preço: R$" + String.format("%.2f", getPreco());
    }
}
