import java.util.Scanner;
public class L2_algoritmosFixacaoDecisao_E2_calcularQuantosSalariosMinimosRecebe {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double valorSalarioMinimo, salarioFuncionario, calculoSalariosMinimosGanhos;
		
		System.out.print("Digite o valor do Sal�rio M�nimo: ");
		valorSalarioMinimo = entrada.nextDouble();
		System.out.print("Informe o Sal�rio do Funcion�rio: ");
		salarioFuncionario = entrada.nextDouble();
		
		calculoSalariosMinimosGanhos = salarioFuncionario / valorSalarioMinimo;
		
		if (!(calculoSalariosMinimosGanhos < 1)) {
			System.out.printf("\nO funcionario recebe %.1f salarios minimos!", calculoSalariosMinimosGanhos);
		} else {
			System.out.print("\nO funcion�rio ganha menos que um sal�rio m�nimo!");
		}
		entrada.close();
	}

}
//		Fa�a um algoritmo que receba o valor do sal�rio m�nimo e o valor do sal�rio de um funcion�rio
//		calcule e mostre a quantidade de sal�rios m�nimos que ganha esse funcion�rio.
//		Caso o funcion�rio receba menos que 1 sal�rio m�nimo dever� ser apresentado a mensagem:
//			"Funcion�rio ganha menos que um sal�rio m�nimo"