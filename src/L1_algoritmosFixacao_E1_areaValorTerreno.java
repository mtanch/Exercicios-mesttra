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
		
		System.out.println("�rea total do terreno de " + frente + " de frente e com " + lateral + " de lateral �: " + (frente * lateral) + " mts.");
		System.out.printf("O valor do terreno �: R$ %.2f", (valorMetroQuadrado * (frente * lateral)));
		
		entrada.close();
	}
	
}
//		Fa�a um algoritmo para imprimir a �rea do terreno e o valor de venda do mesmo.
//		Para isto ser� necess�rio o usu�rio informar as dimens�es em metros (frente e lateral) do terreno al�m do valor cobrado pelo metro quadrado.