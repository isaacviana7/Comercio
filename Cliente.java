package VF.Q1;

import java.util.HashSet;
import java.util.Set;

public class Cliente {
    private int codigo;
    private String nome;
    private Set<Produto> produtos;

    public Cliente(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
        this.produtos = new HashSet<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void removerProduto(int codigoProduto) {
        produtos.removeIf(p -> p.getCodigo() == codigoProduto);
    }

    public String toString() {
        StringBuilder infoProdutos = new StringBuilder();
        for (Produto produto : produtos) {
            infoProdutos.append(produto.toString()).append("\n");
        }
        return "Código: " + codigo + ", Nome: " + nome + "\nProdutos comprados:\n" + infoProdutos.toString();
    }
}
