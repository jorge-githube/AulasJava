package Estoque;

public class Produto {
	//Atributos da Classe Produto
	public String nome;
	public double preco;
	public int quantidade;
	
	//Métodos da Classe Produto
	public double totalValorEmEstoque() {
	 return preco * quantidade;
	}
	public void adicionaProdutos(int quantidade) {
	 this.quantidade += quantidade;
	}
	public void removeProdutos(int quantidade) {
	 this.quantidade -= quantidade;
	}
	
	public String toString(){
	 return "Nome do produto : "
			 + nome
			 + " - Preço :"
			 + String.format("%.2f", preco)
			 + " - Quantidade em Estoque :"
			 + String.format("%d%n",quantidade)
			 + "Valor total em estoque :"
			 + String.format(" R$ %.2f",totalValorEmEstoque());
	}
}
