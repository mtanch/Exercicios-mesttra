import java.util.Scanner;

public class L1_algoritmosFixacao_E2_calcularQuantosSalariosMinimosRecebe {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o valor do sal�rio m�nimo: R$ ");
		Double salarioMinimo = entrada.nextDouble();
		System.out.print("Informe o valor do sal�rio do funcion�rio: R$ ");
		Double valorSalarioFuncionario = entrada.nextDouble();
		
		Double calculoSalariosMinimos = (valorSalarioFuncionario / salarioMinimo);
		
		System.out.printf("\nO funcion�rio recebe %.2f sal�rios m�nimos!", calculoSalariosMinimos);
		
		entrada.close();
	}

}
//		Fa�a um algoritmo que receba o valor do sal�rio m�nimo e o valor do sal�rio de um funcion�rio
//		calcule e mostre a quantidade de sal�rios m�nimos que ganha esse funcion�rio.