import java.util.Scanner;
public class L1_algoritmosFixacao_E15_calculoSalarioII {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite a quantidade total de horas normais: ");
		Integer horasNormais= entrada.nextInt();
		System.out.print("Digite a quantidade total de horas extras: ");
		Integer horasExtras = entrada.nextInt();
		System.out.print("Digite a quantidade total de dependentes menores que 6 anos: ");
		Integer dependentesMenoresQ6Anos = entrada.nextInt();
		
		Double valorHorasNormais = horasNormais * 10.00;
		Double valorPorHoraExtra = horasExtras * 15.00;
		Double receberPorCadaDependente = dependentesMenoresQ6Anos * 90.00;
		Double salarioLiquido = valorHorasNormais * 0.89;
		Double salarioFinal = salarioLiquido + receberPorCadaDependente + valorPorHoraExtra;
		
		System.out.println("\nHoras normais: " + valorHorasNormais);
		System.out.println("Adicional de Horas Extras: " + valorPorHoraExtra);
		System.out.println("Adicional de Dependentes: " + receberPorCadaDependente);
		System.out.println("Salário Líquido: " + salarioLiquido);
		System.out.println("Salario final: " + salarioFinal);
		
		
		
		
		
		
		
		
		
		
		
		entrada.close();
	}

}
//		15. A empresa Hipotheticus paga: 
//			- R$10,00 por hora normal trabalhada, 
//			- R$15,00 por hora extra e 
//			- R$ 90 reais por cada dependente menor que 6 anos.
//		Faça um algoritmo que solicite: 
//			- a quantidade de horas normais e extras trabalhadas no mês 
//			- além da quantidade de dependentes menores que 6 anos.
//		Considere que o salário líquido é igual ao salário de horas normais descontando-se 11% de impostos.
//		O salário final é o salário liquido mais o valor recebido por cada dependente mais as horas extras.