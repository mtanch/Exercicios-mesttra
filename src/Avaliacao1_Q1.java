import java.util.Scanner;
import java.util.InputMismatchException;

public class Avaliacao1_Q1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int valorSacar = 0, qtdNotas100 = 0, qtdNotas50 = 0, qtdNotas20 = 0, qtdNotas10 = 0, qtdNotas5 = 0, modulo = 0;
		
		System.out.print("Digite a quantidade de dinheiro a ser sacada: ");
		
		try {
			valorSacar = entrada.nextInt();
		} catch (InputMismatchException erro) {
			System.out.println("\nO valor digitado é inválido!");
			System.exit(0);
		}		//	Tratando erros
		
		if (valorSacar <= 0) {
			System.err.print("\nO valor precisa ser maior que 0 (Zero)!");
			System.exit(0);
		}		//	Tratando de valoers menores ou iguais que zero
		
		System.out.println("\nQuantidades: ");
		
		if (valorSacar >= 100) {
			qtdNotas100 = (valorSacar / 100);				//	calculando a quantidade das notas
			modulo = valorSacar % 100;
		}
		System.out.printf("\n100 Reais: %d", qtdNotas100);
		if (modulo >= 50) {
			qtdNotas50 = (modulo / 50);						//	calculando a quantidade das notas
			modulo %= 50;
		}
		System.out.printf("\n50 Reais: %d", qtdNotas50);
		if (modulo >= 20) {
			qtdNotas20 = (modulo / 20);						//	calculando a quantidade das notas
			modulo %= 20;
		}
		System.out.printf("\n20 Reais: %d", qtdNotas20);
		if (modulo >= 10) {
			qtdNotas10 = (modulo / 10);						//	calculando a quantidade das notas
			modulo %= 10;
		}
		System.out.printf("\n10 Reais: %d", qtdNotas10);
		if (modulo >= 5) {
			qtdNotas5 = (modulo / 5);						//	calculando a quantidade das notas
		}
		System.out.printf("\n5 Reais: %d", qtdNotas5);
		
		entrada.close();
	}

}

//		Receber entrada do Usuário sobre o [VALOR EM DINHEIRO A SER SACADO];
//		Exibir a quantidade de notas de 100 Reais, 50 Reais, 20 Reais, 10 Reais e 5 Reais;
//		Dar prioridade para as maiores notas possíveis;