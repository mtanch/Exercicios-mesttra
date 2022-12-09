import java.util.Scanner;
public class L1_algoritmosFixacao_E8_calculoSalario {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o salário: ");
		Double salario = entrada.nextDouble();
		
		Double reajuste15PorCentoNoSalario = salario * 1.15;
		Double desconto11PorcentoINSS = reajuste15PorCentoNoSalario * 0.11;
		Double fgtsDesconto = reajuste15PorCentoNoSalario * 0.08;
		Double somaDosDescontos = desconto11PorcentoINSS + fgtsDesconto;
		Double totalSalarioFinal = reajuste15PorCentoNoSalario - somaDosDescontos;
		
		System.out.printf("\nSalario Inicial: %.2f\n", salario);
		System.out.printf("Salario Reajustado: %.2f\n", reajuste15PorCentoNoSalario);
		System.out.printf("Desconto 11%% INSS: %.2f\n", desconto11PorcentoINSS);
		System.out.printf("Desconto 8%% FGTS: %.2f\n", fgtsDesconto);
		System.out.printf("Total Descontos INSS+FGTS: %.2f\n", (somaDosDescontos));
		System.out.printf("Salario Final: %.2f", totalSalarioFinal);
		
		entrada.close();
	}

}
//		8. Faça um algoritmo para ler o salário de um funcionário e aumentá-lo em 15%.
//		Após o aumento, desconte 11% de INSS e 8% de FGTS.
//		Imprima o salário inicial, o salário com o aumento, o salário final, o desconto do INSS, o desconto do FGTS e o Total de Descontos (INSS+FGTS).