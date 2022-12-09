import java.util.Scanner;

public class L1_algoritmosFixacao_E4_tabuada {
	
	public static void calculaMaisMenos (Double num, Integer n) {
		System.out.printf("%.0f + %d = %.0f\t%.0f - %d = %.0f\n", num, n, (num + n), num, n, Math.abs(num - n));
	}
	public static void calculaMultiplicacaoDivisao (Double num, Integer n) {
		System.out.printf("%.0f * %d = %.0f\t%.0f / %d = %.2f\n", num, n, (num * n), num, n, (num / n));
	}
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o número para o calculo da tabuada: ");
		Double numero = entrada.nextDouble();
		System.out.printf("\nTabuada do + e - para o %.0f: \n", numero);
		
		calculaMaisMenos(numero, 0);
		calculaMaisMenos(numero, 1);
		calculaMaisMenos(numero, 2);
		calculaMaisMenos(numero, 3);
		calculaMaisMenos(numero, 4);
		calculaMaisMenos(numero, 5);
		calculaMaisMenos(numero, 6);
		calculaMaisMenos(numero, 7);
		calculaMaisMenos(numero, 8);
		calculaMaisMenos(numero, 9);
		
		System.out.printf("\nTabuada da * e / para o número %.0f:\n", numero);
		System.out.printf("%.0f * 0 = %.0f\t%.0f /  0 = [Não existe divisão por zero!]\n", numero, (numero * 0), numero);
		calculaMultiplicacaoDivisao(numero, 1);
		calculaMultiplicacaoDivisao(numero, 2);
		calculaMultiplicacaoDivisao(numero, 3);
		calculaMultiplicacaoDivisao(numero, 4);
		calculaMultiplicacaoDivisao(numero, 5);
		calculaMultiplicacaoDivisao(numero, 6);
		calculaMultiplicacaoDivisao(numero, 7);
		calculaMultiplicacaoDivisao(numero, 8);
		calculaMultiplicacaoDivisao(numero, 9);
		
		
//		System.out.printf("%.0f + 0 = %.0f\t%.0f - 0 = ", numero, (numero + 0), numero);
//		if ((numero - 0) < 0) {
//			System.out.printf("%.0f\n", ((numero - 0) * -1));
//		} else {
//			System.out.printf("%.0f\n", (numero - 0));
//		}
//		System.out.printf("%.0f + 1 = %.0f\t%.0f - 1 = ", numero, (numero + 1), numero);
//		if ((numero - 1) < 0) {
//			System.out.printf("%.0f\n", ((numero - 1) * -1));
//		} else {
//			System.out.printf("%.0f\n", (numero - 1));
//		}
//		System.out.printf("%.0f + 2 = %.0f\t%.0f - 2 = ", numero, (numero + 2), numero);
//		if ((numero - 2) < 0) {
//			System.out.printf("%.0f\n", ((numero - 2) * -1));
//		} else {
//			System.out.printf("%.0f\n", (numero - 2));
//		}
//		System.out.printf("%.0f + 3 = %.0f\t%.0f - 3 = ", numero, (numero + 3), numero);
//		if ((numero - 3) < 0) {
//			System.out.printf("%.0f\n", ((numero - 3) * -1));
//		} else {
//			System.out.printf("%.0f\n", (numero - 3));
//		}
//		System.out.printf("%.0f + 4 = %.0f\t%.0f - 4 = ", numero, (numero + 4), numero);
//		if ((numero - 4) < 0) {
//			System.out.printf("%.0f\n", ((numero - 4) * -1));
//		} else {
//			System.out.printf("%.0f\n", (numero - 4));
//		}
//		System.out.printf("%.0f + 5 = %.0f\t%.0f - 5 = ", numero, (numero + 5), numero);
//		if ((numero - 5) < 0) {
//			System.out.printf("%.0f\n", ((numero - 5) * -1));
//		} else {
//			System.out.printf("%.0f\n", (numero - 5));
//		}
//		System.out.printf("%.0f + 6 = %.0f\t%.0f - 6 = ", numero, (numero + 6), numero);
//		if ((numero - 6) < 0) {
//			System.out.printf("%.0f\n", ((numero - 6) * -1));
//		} else {
//			System.out.printf("%.0f\n", (numero - 6));
//		}
//		System.out.printf("%.0f + 7 = %.0f\t%.0f - 7 = ", numero, (numero + 7), numero);
//		if ((numero - 7) < 0) {
//			System.out.printf("%.0f\n", ((numero - 7) * -1));
//		} else {
//			System.out.printf("%.0f\n", (numero - 7));
//		}
//		System.out.printf("%.0f + 8 = %.0f\t%.0f - 8 = ", numero, (numero + 8), numero);
//		if ((numero - 8) < 0) {
//			System.out.printf("%.0f\n", ((numero - 8) * -1));
//		} else {
//			System.out.printf("%.0f\n", (numero - 8));
//		}
//		System.out.printf("%.0f + 9 = %.0f\t%.0f - 9 = ", numero, (numero + 9), numero);
//		if ((numero - 9) < 0) {
//			System.out.printf("%.0f\n", ((numero - 9) * -1));
//		} else {
//			System.out.printf("%.0f\n", (numero - 9));
//		}
		
//		System.out.printf("\nTabuada da * e / para o número %.0f:\n", numero);
//		System.out.printf("%.0f * 0 = %.0f\t%.0f /  0 = [Não existe divisão por zero!]\n", numero, (numero * 0), numero);
//		System.out.printf("%.0f * 1 = %.0f\t%.0f / 1 = %.2f\n", numero, (numero * 1), numero, (numero / 1));
//		System.out.printf("%.0f * 2 = %.0f\t%.0f / 2 = %.2f\n", numero, (numero * 2), numero, (numero / 2));
//		System.out.printf("%.0f * 3 = %.0f\t%.0f / 3 = %.2f\n", numero, (numero * 3), numero, (numero / 3));
//		System.out.printf("%.0f * 4 = %.0f\t%.0f / 4 = %.2f\n", numero, (numero * 4), numero, (numero / 4));
//		System.out.printf("%.0f * 5 = %.0f\t%.0f / 5 = %.2f\n", numero, (numero * 5), numero, (numero / 5));
//		System.out.printf("%.0f * 6 = %.0f\t%.0f / 6 = %.2f\n", numero, (numero * 6), numero, (numero / 6));
//		System.out.printf("%.0f * 7 = %.0f\t%.0f / 7 = %.2f\n", numero, (numero * 7), numero, (numero / 7));
//		System.out.printf("%.0f * 8 = %.0f\t%.0f / 8 = %.2f\n", numero, (numero * 8), numero, (numero / 8));
//		System.out.printf("%.0f * 9 = %.0f\t%.0f / 9 = %.2f\n", numero, (numero * 9), numero, (numero / 9));
		
		entrada.close();
	}
}
//		Faça um algoritmo que calcule e mostre a tabuada de [+, -, e /] de um número digitado pelo usuário;