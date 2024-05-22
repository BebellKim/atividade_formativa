package AVFormativa;

import java.util.Scanner;

public class Atividade_2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double Lado, area_total;
		
		System.out.println("Cite o valor do lado do quadrado: ");
		Lado = ler.nextDouble();
		
		area_total =(Lado*Lado);
		
		System.out.println("A área total do quadrado equivale a: " +area_total);
		

	}

}
