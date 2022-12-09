import java.util.Scanner;

public class L1_algoritmosFixacao_E2_calcularQuantosSalariosMinimosRecebe {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o valor do salário mínimo: R$ ");
		Double salarioMinimo = entrada.nextDouble();
		System.out.print("Informe o valor do salário do funcionário: R$ ");
		Double valorSalarioFuncionario = entrada.nextDouble();
		
		Double calculoSalariosMinimos = (valorSalarioFuncionario / salarioMinimo);
		
		System.out.printf("\nO funcionário recebe %.2f salários mínimos!", calculoSalariosMinimos);
		
		entrada.close();
	}

}
//		Faça um algoritmo que receba o valor do salário mínimo e o valor do salário de um funcionário
//		calcule e mostre a quantidade de salários mínimos que ganha esse funcionário.