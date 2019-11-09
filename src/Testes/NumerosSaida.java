package Testes;

import java.util.Scanner;

public class NumerosSaida {

	public static void main(String[] args) {
		//Instânciando a variável ler com a Classe Scanner.
		Scanner ler = new Scanner(System.in);
		double vel = 0;
		double velMs = 0;
		String objeto = "";
		
		System.out.println("Cálculo da velovidade de um objeto");
		System.out.println("em metros por segundo");
		System.out.println("Entre com o tipo de objeto");
		objeto = ler.nextLine();
		System.out.println("Entre com a velocidade do objeto");
		System.out.println("Em KM/h...");
		vel = ler.nextDouble();
		//Cálculo do objeto em metros por segundo.
		velMs = vel / 3.6;
		
		//Saída formatada dos dados.
		System.out.printf("A velocidade do %s é de %.2f metros por segundo", objeto,velMs);
		
		//Fechando o objeto ler.
		ler.close();

	}

}
