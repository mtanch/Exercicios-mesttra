import java.util.Scanner;
public class L1_algoritmosFixacao_E10_idadeAnosMesesSemanasDias {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o ano inicial: ");
		Integer inicial = entrada.nextInt();
		System.out.print("Digite o ano final: ");
		Integer atual = entrada.nextInt();
		
		Integer anos = atual - inicial;
		Integer meses = anos * 12;
		Integer dias = meses * 30;
		Integer semanas = meses * 4;
		
		System.out.println("\nA idade desta pessoa em");
		System.out.println("anos é: " + anos);
		System.out.println("meses é: " + meses);
		System.out.println("dias: " + dias);
		System.out.println("semanas é: " + semanas);
		
		entrada.close();
	}

}
//		10. Faça um algoritmo que receba o ano de nascimento de uma pessoa e o ano atual, calcule e mostre.
//			a) a idade dessa pessoa em anos;
//			b) a idade dessa pessoa em meses;
//			c) a idade dessa pessoa em dias; considere todos os meses com 30 dias
//			d) a idade dessa pessoa em semanas, considere que todos os meses possuem 4 semanas;