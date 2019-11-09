package Aplicacao;

import java.util.Locale;
import java.util.Scanner;

import Estoque.Produto;

public class ProgramaEstoque {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		Produto produto = new Produto();
		int quantidade = 0;
		System.out.println("Entrada de produtos");
		System.out.println("Entre com o nome do produto :");
		produto.nome = ler.nextLine();
		System.out.println("Entre com o preço do produto");
		produto.preco = ler.nextDouble();
		System.out.println("Entre com a quantidade em estoque do produto");
		produto.quantidade = ler.nextInt();
		//Verificação de entrada dos dados.
		System.out.println(produto.toString());
		System.out.println("Entre com a quantidade vendida :");
		quantidade = ler.nextInt();
		produto.removeProdutos(quantidade);
		System.out.println(produto.toString());
		System.out.println("Entre com a quantidade nova para o estoque");
		quantidade = ler.nextInt();
		produto.adicionaProdutos(quantidade);
		System.out.println(produto.toString());
		ler.close();
	}

}
