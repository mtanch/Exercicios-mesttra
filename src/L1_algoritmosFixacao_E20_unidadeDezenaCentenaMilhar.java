import java.util.Scanner;
public class L1_algoritmosFixacao_E20_unidadeDezenaCentenaMilhar {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um número de 4 dígitos: ");
		Integer numero = entrada.nextInt();
		
		Double unidade = (double)numero % 10;
		Double dezena = ((double)numero / 10) % 10;
		Double centena = (((double)numero / 10) / 10) % 10;
		Double milhares = ((((double)numero / 10) / 10) / 10) % 10;
		
		System.out.printf("\nMILHARES: %.0f\n", milhares);
		System.out.printf("CENTENA: %.0f\n", centena);
		System.out.printf("DEZENA: %.0f\n", dezena);
		System.out.printf("UNIDADE: %.0f", unidade);
		
		entrada.close();
	}

}
//		20. Ler um número inteiro com até quatro dígitos e imprimir a saída da seguinte forma:
//			MILHARES = x
//			CENTENA = x
//			DEZENA = x
//			UNIDADE = x