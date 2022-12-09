import java.util.Scanner;
public class L2_algoritmosFixacaoDecisao_E16_unidadeDezenaCentenaMilhar {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		float numero, milhar, centena, dezena, unidade;
		
		System.out.print("Digite um número de até 4 dígitos: ");
		numero = entrada.nextInt();
		if (numero > 9999 || numero < 0) {
			
			System.err.print("\nNúmero Inválido!");
			System.exit(0);
			
		} else if (numero >= 1000) {
			
			unidade = (numero % 10);
				numero = (float)Math.floor(numero / 10);
			dezena = (numero % 10);
				numero = (float)Math.floor(numero / 10);
			centena = (numero % 10);
				numero = (float)Math.floor(numero / 10);
			milhar = (numero % 10);
			
			System.out.printf ("\nMILHARES = %.0f", milhar);
			System.out.printf ("\nCENTENA = %.0f", centena);
			System.out.printf ("\nDEZENA = %.0f", dezena);
			System.out.printf ("\nUNIDADE = %.0f", unidade);
			
		} else if (numero < 1000 && numero >= 100) {
			
			unidade = (numero % 10);
				numero = (float)Math.floor(numero / 10);
			dezena = (numero % 10);
				numero = (float)Math.floor(numero / 10);
			centena = (numero % 10);
			
			System.out.printf ("\nCENTENA = %.0f", centena);
			System.out.printf ("\nDEZENA = %.0f", dezena);
			System.out.printf ("\nUNIDADE = %.0f", unidade);
			
		} else if (numero < 100 && numero >= 10) {
			
			unidade = (numero % 10);
				numero = (float)Math.floor(numero / 10);
			dezena = (numero % 10);
			
			System.out.printf ("\nDEZENA = %.0f", dezena);
			System.out.printf ("\nUNIDADE = %.0f", unidade);
			
		} else if (numero < 10 && numero >= 0) {
			
			System.out.printf ("\nUNIDADE: %.0f", numero);
			
		}
		entrada.close();
	}

}
//		Questão 16: Ler um número inteiro positivo de 1, 2, 3 ou 4 dígitos e imprimir a saída da seguinte forma:
//			MILHARES = x
//			CENTENA = x
//			DEZENA = x
//			UNIDADE = x
//		Validar o número digitado e se este número estiver fora do intervalo definido, 
//			apresentar uma mensagem de erro "Numero invalido!" e finalizar o algoritmo sem nenhuma cálculo.