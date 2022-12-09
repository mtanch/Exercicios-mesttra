import java.util.Scanner;

public class L1_algoritmosFixacao_E3_mediaPonderadaNotas {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a nota 1: ");
		Double nota1 = entrada.nextDouble();
		System.out.print("Informe a nota 2: ");
		Double nota2 = entrada.nextDouble();
		System.out.print("Informe a nota 3: ");
		Double nota3 = entrada.nextDouble();
		
		Integer peso1 = 1;
		Integer peso2 = 2;
		Integer peso3 = 3;		
		
		Integer somaDosPesos = peso1 + peso2 + peso3;
		
		Double mediaPonderada = (((peso1 * nota1) + (peso2 * nota2) + (peso3 * nota3)) / somaDosPesos);
		
		System.out.printf("\nA m�dia ponderada das notas %.1f, %.1f, %.1f �: %.2f", nota1, nota2, nota3, mediaPonderada);
		
		
		
		entrada.close();
	}

}
//		Fa�a um algoritmo para ler tr�s notas de um aluno em uma disciplina e imprimir a sua m�dia ponderada (as notas tem pesos respectivos de 1, 2 e 3).