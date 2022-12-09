import java.util.Scanner;

public class L1_algoritmosFixacao_E1_areaValorTerreno {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Quantos metros o terreno possui de frente: ");
		Double frente = entrada.nextDouble();
		System.out.print("Quantos metros o terreno possui de lateral: ");
		Double lateral = entrada.nextDouble();
		System.out.println("Informe o valor do metro quadrado: ");
		Double valorMetroQuadrado = entrada.nextDouble();
		
		System.out.println("Área total do terreno de " + frente + " de frente e com " + lateral + " de lateral é: " + (frente * lateral) + " mts.");
		System.out.printf("O valor do terreno é: R$ %.2f", (valorMetroQuadrado * (frente * lateral)));
		
		entrada.close();
	}
	
}
//		Faça um algoritmo para imprimir a área do terreno e o valor de venda do mesmo.
//		Para isto será necessário o usuário informar as dimensões em metros (frente e lateral) do terreno além do valor cobrado pelo metro quadrado.