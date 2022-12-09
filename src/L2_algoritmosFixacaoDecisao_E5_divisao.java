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
			System.err.println("\nA opera��o n�o p�de ser realizada.");
			System.exit(0);
		} else if (segundoValor > primeiroValor && primeiroValor == 0) {
			System.err.println("\nA opera��o n�o p�de ser realizada.");
			System.exit(0);
		}
		
		if (primeiroValor > segundoValor) {
			divisao = (primeiroValor / (float)segundoValor);
			System.out.printf("\nA divis�o de %d por %d � %.1f.", primeiroValor, segundoValor, divisao);
		} else if (segundoValor > primeiroValor) {
			divisao = (segundoValor / (float)primeiroValor);
			System.out.printf("\nA divis�o de %d por %d � %.1f.", segundoValor, primeiroValor, divisao);
		}
		entrada.close();
	}
	
}
//		Fa�a um algoritmo que receba dois n�meros inteiros, calcule e mostre a divis�o do do maior n�mero pelo menor n�mero.
//		O segundo n�mero n�o pode ser zero
//		Se o usu�rio digitar 0 dever� ser exibido uma mensagem "A opera��o n�o p�de ser realizada."
