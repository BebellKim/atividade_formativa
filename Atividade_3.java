package AVFormativa;

import java.util.Scanner;

public class Atividade_3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		double valor_1,valor_2, resultado=0, Adição,Subtração,Multiplicação;;
		String operação;

		System.out.println("Informe o primero valor: ");
		valor_1 = ler.nextDouble();

		System.out.println("Informe o segundo valor: ");
		valor_2 = ler.nextDouble();

		System.out.println("Selecione a operação que deseja utilizar Adição ou Subtração ou Multiplicação: ");
		operação = ler.next();



		if (operação.equals("Adição")) {
			Adição=(valor_1 + valor_2);
			System.out.println("O valor da adição é: " + Adição);
		}
		else if (operação.equals("Subtração")) {
			Subtração=(valor_1 - valor_2);
			System.out.println("O valor da subtração é: " + Subtração);
		}

		else {
			Multiplicação=(valor_1 * valor_2);
			System.out.println("O valor da multiplicação é: " + Multiplicação);

		}
	}
}


