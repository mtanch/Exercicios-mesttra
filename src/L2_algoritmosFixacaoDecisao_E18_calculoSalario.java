import java.util.Scanner;
public class L2_algoritmosFixacaoDecisao_E18_calculoSalario {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		float hNormalValor = 10.0f, hExtraValor = 15.0f, valorDepend = 90.0f, hTrabalhadas, hExtraQtd, qtdDepend, qtdDependFinal = 0, salarioLiq, salarioFin = 0;
		
		System.out.print("Informe quantas horas trabalhou no mês: ");
		hTrabalhadas = entrada.nextFloat();
		System.out.print("Informe quantas horas Extras trabalhou: ");
		hExtraQtd = entrada.nextFloat();
		System.out.print("Informe quantos dependentes menores que 6 anos você tem: ");
		qtdDepend = entrada.nextFloat();
		
		salarioLiq = (hTrabalhadas * hNormalValor) * 0.89f;
		
		System.out.printf("\nHoras Normais: R$ %.2f\n", (hNormalValor * hTrabalhadas));
		System.out.printf("Adicional de Horas Extras: R$ %.2f\n", (hExtraQtd * hExtraValor));
		
		if (qtdDepend > 3) {
			qtdDependFinal = 3;
		} else {
			qtdDependFinal = qtdDepend;
		}
		
		System.out.printf("Adicional de Dependentes: R$ %.2f\n", (qtdDependFinal * valorDepend));
		System.out.printf("Salário Líquido (Horas Normais - Desconto): R$ %.2f\n", salarioLiq);
		
		salarioFin = salarioLiq + (qtdDependFinal * valorDepend) + (hExtraQtd * hExtraValor);
		
		System.out.printf("Salário Final: R$ %.2f\n", salarioFin);
		
		if (qtdDepend > 3) {
			System.out.printf("Salário calculado para apenas 3 dependentes, o(s) demais %.0f dependente(s) não receberá(ão) o auxílio.", (qtdDepend - qtdDependFinal));
		}
		entrada.close();
	}
	
}

/*Questão 18: A empresa Hipotheticus paga  R$10,00 por hora normal trabalhada, R$15,00 por
hora extra e R$ 90 reais por cada dependente menor que 6 anos. Faça um algoritmo que solicite a
 quantidade de horas normais e extras trabalhadas no mês além da quantidade de dependentes
menores que 6 anos. Considere que o salário líquido é igual ao salário de horas normais
descontando-se 11% de impostos. O salário final é o salário liquido mais o valor recebido por cada
dependente mais as horas extras. A empresa paga o adicional para no máximo 3 filhos menores
que 6 anos. Caso o usuário digite uma quantidade de filhos superior a 3 deverá ser apresentado
uma mensagem informando. "Salário calculado para apenas 3 dependentes, os demais X
dependentes não receberão o auxilio." X é a quantidade de dependentes acima da quantidade permitida.*/