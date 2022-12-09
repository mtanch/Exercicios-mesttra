import java.util.Scanner;
public class L2_algoritmosFixacaoDecisao_E3_mediaPonderadaNotas {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double primeiraNota, segundaNota, terceiraNota, calculo1, calculo2, calculo3, mediaPonderada;
		int peso1 = 1, peso2 = 2, peso3 = 3, somaPesos = peso1+peso2+peso3;
		
		System.out.print("Informe o valor da primeira nota: ");
		primeiraNota = entrada.nextDouble();
		System.out.print("Informe o valor da primeira nota: ");
		segundaNota = entrada.nextDouble();
		System.out.print("Informe o valor da primeira nota: ");
		terceiraNota = entrada.nextDouble();
		
		calculo1 = primeiraNota * peso1;
		calculo2 = segundaNota * peso2;
		calculo3 = terceiraNota * peso3;
		
		mediaPonderada = (primeiraNota * peso1 + segundaNota * peso2 + terceiraNota * peso3) / somaPesos;
		System.out.printf("\nA media ponderada das notas %.2f, %.2f e %.2f é %.2f.\n", primeiraNota, segundaNota, terceiraNota, mediaPonderada);
		
		if (calculo1 > calculo2 && calculo3 > calculo2 && calculo1 == calculo3) {
			System.out.printf("\nAs notas 1 (%.2f) e 3 (%.2f) foram as maiores nota após o cálculo do peso 1 (%.2f) e peso 3 (%.2f)", primeiraNota, terceiraNota, calculo1, calculo3);
		} else if (calculo1 > calculo3 &&  calculo2 > calculo3 && calculo1 == calculo2) {
			System.out.printf("\nAs notas 1 (%.2f) e 2 (%.2f) foram as maiores nota após o cálculo do peso 1 (%.2f) e peso 2 (%.2f)", primeiraNota, segundaNota, calculo1, calculo2);
		} else if (calculo2 > calculo1 && calculo3 > calculo1 && calculo2 == calculo3) {
			System.out.printf("\nAs notas 2 (%.2f) e 3 (%.2f) foram as maiores nota após o cálculo do peso 2 (%.2f) e peso 3 (%.2f)", segundaNota, terceiraNota, calculo2, calculo3);
		} else if (calculo1 > calculo2 && calculo1 > calculo3) {
			System.out.printf("\nA nota 1 (%.2f) é a maior nota após o cálculo do peso 1 (%.2f)", primeiraNota, calculo1);
		} else if (calculo2 > calculo1 && calculo2 > calculo3) {
			System.out.printf("\nA nota 2 (%.2f) é a maior nota após o cálculo do peso 2 (%.2f)", segundaNota, calculo2);
		} else if (calculo3 > calculo1 && calculo3 > calculo2) {
			System.out.printf("\nA nota 3 (%.2f) é a maior nota após o cálculo do peso 3 (%.2f)", terceiraNota, calculo3);
		} else {
			System.out.print("\nAs tres notas foram iguais");
		}
		entrada.close();
	}

}