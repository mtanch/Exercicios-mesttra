import java.util.Scanner;
public class L2_algoritmosFixacaoDecisao_E18_calculoSalario {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		float hNormalValor = 10.0f, hExtraValor = 15.0f, valorDepend = 90.0f, hTrabalhadas, hExtraQtd, qtdDepend, qtdDependFinal = 0, salarioLiq, salarioFin = 0;
		
		System.out.print("Informe quantas horas trabalhou no m�s: ");
		hTrabalhadas = entrada.nextFloat();
		System.out.print("Informe quantas horas Extras trabalhou: ");
		hExtraQtd = entrada.nextFloat();
		System.out.print("Informe quantos dependentes menores que 6 anos voc� tem: ");
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
		System.out.printf("Sal�rio L�quido (Horas Normais - Desconto): R$ %.2f\n", salarioLiq);
		
		salarioFin = salarioLiq + (qtdDependFinal * valorDepend) + (hExtraQtd * hExtraValor);
		
		System.out.printf("Sal�rio Final: R$ %.2f\n", salarioFin);
		
		if (qtdDepend > 3) {
			System.out.printf("Sal�rio calculado para apenas 3 dependentes, o(s) demais %.0f dependente(s) n�o receber�(�o) o aux�lio.", (qtdDepend - qtdDependFinal));
		}
		entrada.close();
	}
	
}

/*Quest�o 18: A empresa Hipotheticus paga  R$10,00 por hora normal trabalhada, R$15,00 por
hora extra e R$ 90 reais por cada dependente menor que 6 anos. Fa�a um algoritmo que solicite a
 quantidade de horas normais e extras trabalhadas no m�s al�m da quantidade de dependentes
menores que 6 anos. Considere que o sal�rio l�quido � igual ao sal�rio de horas normais
descontando-se 11% de impostos. O sal�rio final � o sal�rio liquido mais o valor recebido por cada
dependente mais as horas extras. A empresa paga o adicional para no m�ximo 3 filhos menores
que 6 anos. Caso o usu�rio digite uma quantidade de filhos superior a 3 dever� ser apresentado
uma mensagem informando. "Sal�rio calculado para apenas 3 dependentes, os demais X
dependentes n�o receber�o o auxilio." X � a quantidade de dependentes acima da quantidade permitida.*/