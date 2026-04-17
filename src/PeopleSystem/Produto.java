package PeopleSystem;

public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEstoque;

    public Produto(String nome, double preco, int quantidadeEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public boolean realizarVenda(int quantidadeVendida) {
        if (quantidadeVendida <= 0 || quantidadeVendida > quantidadeEstoque) {
            return false;
        }

        quantidadeEstoque -= quantidadeVendida;
        return true;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }
}
