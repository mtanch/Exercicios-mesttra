import java.util.Scanner;
public class L2_algoritmosFixacaoDecisao_E8_calculoSalario {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		float salarioAnterior, salarioReajustado, inssAnterior, fgtsAnterior, inssNovo, fgtsNovo, irAnterior = 0, irNovo = 0, calculoIRAnterior, calculoIRNovo, somaDescontos, totalSalarioAnterior, totalNovoSalario;
		
		System.out.print("Informe o salário do funcionário: ");
		salarioAnterior = entrada.nextFloat();
		
		salarioReajustado = salarioAnterior * 1.05f;
		
		inssAnterior = salarioAnterior * 0.11f;	//	porcentagem INSS do antigo salario
		fgtsAnterior = salarioAnterior * 0.08f;	//	porcentagem FGTS do antigo salario
		inssNovo = salarioReajustado * 0.11f;	//	porcentagem INSS do novo salario
		fgtsNovo = salarioReajustado * 0.08f;	//	porcentagem FGTS do novo salario
		
		if (salarioReajustado <= 1903.98) {
			irNovo = 0.0f;
		} else if (salarioReajustado > 1903.98 && salarioReajustado <= 2826.65) {
			irNovo = 0.075f;
		} else if (salarioReajustado > 2826.65 && salarioReajustado <= 3751.05) {
			irNovo = 0.15f;
		} else if (salarioReajustado > 3751.05 && salarioReajustado <= 4664.68) {
			irNovo = 0.225f;
		} else if (salarioReajustado > 4664.68) {
			irNovo = 0.275f;
		}
		
		if (salarioAnterior <= 1903.98) {
			irAnterior = 0.0f;
		} else if (salarioAnterior > 1903.98 && salarioAnterior <= 2826.65) {
			irAnterior = 0.075f;
		} else if (salarioAnterior > 2826.65 && salarioAnterior <= 3751.05) {
			irAnterior = 0.15f;
		} else if (salarioAnterior > 3751.05 && salarioAnterior <= 4664.68) {
			irAnterior = 0.225f;
		} else if (salarioAnterior > 4664.68) {
			irAnterior = 0.275f;
		}
		
		System.out.printf("%.2f ------ %.2f", irNovo, irAnterior);
		calculoIRNovo = salarioReajustado * irNovo; 					//	calcular quanto será o IR do Novo Salário
		calculoIRAnterior = salarioAnterior * irAnterior; 				//	calcular quanto será o IR do Salário Antigo
		somaDescontos = (inssNovo + fgtsNovo + calculoIRNovo); 			//	soma dos descontos
		totalNovoSalario = (salarioReajustado - (inssNovo + fgtsNovo + calculoIRNovo));					// novo salário reajustado (com +5%) calculando todos os descontos
		totalSalarioAnterior = (salarioAnterior - (inssAnterior + fgtsAnterior + calculoIRAnterior));	// salario anterior calculando todos os descontos
		
		System.out.printf("\nSalario Inicial: %.2f", salarioAnterior);
		System.out.printf("\nSalario Reajustado: %.2f", salarioReajustado);
		System.out.printf("\nDesconto 11%% INSS: %.2f", inssNovo);
		System.out.printf("\nDesconto 8%% FGTS: %.2f", fgtsNovo);
		System.out.printf("\nDesconto IR: %.2f", calculoIRNovo);
		System.out.printf("\nTotal descontos INSS+FGTS+IR: %.2f", somaDescontos);
		System.out.printf("\nSalário Final: %.2f", totalNovoSalario);

		if (totalSalarioAnterior > totalNovoSalario) {
			System.out.println("\nO novo salário final é menor do que o salario recebido antes do aumento!");
		}
		entrada.close();
	}
	
}
//		Faça um algoritmo para ler o salário de um funcionário e aumentá-Io em 5%.
//		Após o aumento, desconte 11% de INSS e 8% de FGTS e o % do IR conforme a tabela abaixo.

//			Base de Cálculo IR (R$) 	|	Alíquota IR (%)
//			Até 1.903,98 				|	0%
//			De 1.903,99 até 2.826,65 	|	7,5%
//			De 2.826,66 até 3.751,05 	|	15%
//			De 3.751,06 até 4.664,68 	|	22,5%
//			Acima de 4.664,68 			|	27,5%

//		Imprima o salário inicial, o salário com o aumento, o salário final, o desconto do INSS, ...
//			...o desconto do FGTS, o desconto do IR e o Total de Descontos (INSS+FGTS+IR).

//		O seu algoritmo deve calcular e descobrir se o novo salário (5%) fará com que o usuário receba um salário final menor do que antes de aplicar os 5%.
