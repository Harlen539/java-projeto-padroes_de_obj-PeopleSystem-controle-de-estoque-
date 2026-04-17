package Apps;

import PeopleSystem.Produto;

import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        String nome = scanner.nextLine();
        double preco = scanner.nextDouble();
        int quantidadeInicial = scanner.nextInt();
        int quantidadeVendida = scanner.nextInt();

        Produto produto = new Produto(nome, preco, quantidadeInicial);

        System.out.println("Produto: " + produto.getNome());
        System.out.printf("Preco: R$ %.2f%n", produto.getPreco());
        System.out.println("Estoque antes da venda: " + produto.getQuantidadeEstoque() + " unidades");

        if (produto.realizarVenda(quantidadeVendida)) {
            System.out.println("Venda realizada: " + quantidadeVendida + " unidades");
            System.out.println("Estoque atualizado: " + produto.getQuantidadeEstoque() + " unidades");
        } else {
            System.out.println("Estoque insuficiente para realizar a venda.");
        }

        scanner.close();
    }
}
