import java.util.Scanner;
public class L2_algoritmosFixacaoDecisao_E2_calcularQuantosSalariosMinimosRecebe {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double valorSalarioMinimo, salarioFuncionario, calculoSalariosMinimosGanhos;
		
		System.out.print("Digite o valor do Salário Mínimo: ");
		valorSalarioMinimo = entrada.nextDouble();
		System.out.print("Informe o Salário do Funcionário: ");
		salarioFuncionario = entrada.nextDouble();
		
		calculoSalariosMinimosGanhos = salarioFuncionario / valorSalarioMinimo;
		
		if (!(calculoSalariosMinimosGanhos < 1)) {
			System.out.printf("\nO funcionario recebe %.1f salarios minimos!", calculoSalariosMinimosGanhos);
		} else {
			System.out.print("\nO funcionário ganha menos que um salário mínimo!");
		}
		entrada.close();
	}

}
//		Faça um algoritmo que receba o valor do salário mínimo e o valor do salário de um funcionário
//		calcule e mostre a quantidade de salários mínimos que ganha esse funcionário.
//		Caso o funcionário receba menos que 1 salário mínimo deverá ser apresentado a mensagem:
//			"Funcionário ganha menos que um salário mínimo"