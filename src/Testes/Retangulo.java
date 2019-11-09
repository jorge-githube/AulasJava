package Testes;

public class Retangulo {
 double altura;
 double largura;
 
 public double areaRetangulo(){
	 return this.altura * this.largura;
 }
 
 public double perimetroRetangulo(){
	 return 2*(this.altura + this.largura);
 }
 
 public double diagonalTriangulo(){
	 return Math.sqrt(Math.pow(this.altura, 2) + Math.pow(this.largura, 2));
 }
 
 public String toString(){
	 return "Área do triangulo : "
			 + String.format("%.2f",areaRetangulo())
			 + " perimetro :"
			 + String.format("%.2f", perimetroRetangulo())
	         + " diagonal :"
	         + String.format("%.2f", diagonalTriangulo());
 }
}
