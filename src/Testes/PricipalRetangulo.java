package Testes;

import java.util.Locale;
import java.util.Scanner;

public class PricipalRetangulo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		Retangulo retangulo = new Retangulo();
		
		System.out.println("Cálculo da área, perimetro e diagonal de um retângulo.");
		System.out.println("Entre com a altura :");
		retangulo.altura = ler.nextDouble();
		System.out.println("Entre com a largula :");
		retangulo.largura = ler.nextDouble();
		System.out.println(retangulo.toString());
		ler.close();
	}

}
