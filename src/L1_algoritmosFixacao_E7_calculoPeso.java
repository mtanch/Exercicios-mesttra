import java.util.Scanner;

public class L1_algoritmosFixacao_E7_calculoPeso {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o peso em KG: ");
		Double peso = entrada.nextDouble();
		
		Double mais15PorcentoDoPeso = (peso * 1.15);
		Double menos20PorcentoDoPeso = (peso * 0.8);
		
		System.out.printf("\nCaso a pessoa engorde 15%% ficará com: %.2f KG", mais15PorcentoDoPeso);
		System.out.printf("\nCaso a pessoa emagreça 20%% ficará com: %.2f KG", menos20PorcentoDoPeso);
		
		entrada.close();
	}

}
//		Faça um algoritmo que receba o peso de uma pessoa, calcule e mostre:
//			a) o novo peso se a pessoa engordar 15% sobre o peso digitado.
//			b) o novo peso se a pessoa emagrecer 20% sobre o peso digitado.