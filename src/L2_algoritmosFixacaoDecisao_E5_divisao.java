import java.util.Scanner;

public class L2_algoritmosFixacaoDecisao_E5_divisao {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int primeiroValor, segundoValor;
		float divisao = 0;
		
		System.out.print("Informe o valor 1: ");
		primeiroValor = entrada.nextInt();
		System.out.print("Informe o valor 2: ");
		segundoValor = entrada.nextInt();
		
		if (primeiroValor > segundoValor && segundoValor == 0) {
			System.err.println("\nA operação não pôde ser realizada.");
			System.exit(0);
		} else if (segundoValor > primeiroValor && primeiroValor == 0) {
			System.err.println("\nA operação não pôde ser realizada.");
			System.exit(0);
		}
		
		if (primeiroValor > segundoValor) {
			divisao = (primeiroValor / (float)segundoValor);
			System.out.printf("\nA divisão de %d por %d é %.1f.", primeiroValor, segundoValor, divisao);
		} else if (segundoValor > primeiroValor) {
			divisao = (segundoValor / (float)primeiroValor);
			System.out.printf("\nA divisão de %d por %d é %.1f.", segundoValor, primeiroValor, divisao);
		}
		entrada.close();
	}
	
}
//		Faça um algoritmo que receba dois números inteiros, calcule e mostre a divisão do do maior número pelo menor número.
//		O segundo número não pode ser zero
//		Se o usuário digitar 0 deverá ser exibido uma mensagem "A operação não pôde ser realizada."
