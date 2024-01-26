package VF.Q1;

public class Main {
    public static void main(String[] args) {
        // Criando produtos eletrônicos
        Produto p1 = new Eletronico(1, "Celular", 1000.0, "Samsung");
        Produto p2 = new Eletronico(2, "TV", 2000.0, "LG");

        // Criando clientes
        Cliente c1 = new Cliente(1, "João");
        Cliente c2 = new Cliente(2, "Maria");

        // Adicionando produtos aos clientes
        c1.adicionarProduto(p1);
        c1.adicionarProduto(p2);
        c2.adicionarProduto(p2);

        // Exibindo informações dos clientes e produtos
        System.out.println(c1.toString());
        System.out.println(c2.toString());

        // Calculando desconto de um produto
        double desconto = p1.calcularDesconto();
        System.out.println("Desconto aplicado ao " + p1.getNome() + ": R$" + String.format("%.2f", desconto));

        // Removendo um produto do cliente
        c1.removerProduto(1);

        // Exibindo informações atualizadas do cliente
        System.out.println(c1.toString());
    }
}
