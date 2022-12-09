import java.util.Scanner;
public class L1_algoritmosFixacao_E16_venderPecasParaAtingirMeta {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o valor do faturamento anterior: ");
		double faturamentoAnterior = entrada.nextDouble();
		
		double peca1Preco = 150.00;
		double peca2Preco = 220.00;
		double peca3Preco = 97.00;
		
		double metaDeFaturamentoMesSeguinte = faturamentoAnterior * 1.20;
		double aumentoEsperadoParaOProximoFaturamento = Math.abs(faturamentoAnterior - metaDeFaturamentoMesSeguinte);
		
		double quantidadeDePecas1ParaAtingirAMEta = aumentoEsperadoParaOProximoFaturamento / peca1Preco;
		double quantidadeDePecas2ParaAtingirAMEta = aumentoEsperadoParaOProximoFaturamento / peca2Preco;
		double quantidadeDePecas3ParaAtingirAMEta = aumentoEsperadoParaOProximoFaturamento / peca3Preco;
		
		System.out.printf("\nA meta para o proximo faturamento é: R$ %.2f\n", metaDeFaturamentoMesSeguinte);
		System.out.printf("Um aumento de: R$ %.2f\n", aumentoEsperadoParaOProximoFaturamento);
		System.out.println("Quantidade de peças a serem vendidas para atingirmos a meta: ");
		
		System.out.printf("\nProduto 1: %.2f", quantidadeDePecas1ParaAtingirAMEta);
		System.out.printf("\nProduto 2: %.2f", quantidadeDePecas2ParaAtingirAMEta);
		System.out.printf("\nProduto 3: %.2f", quantidadeDePecas3ParaAtingirAMEta);
		
		entrada.close();
	}

}
//		16. Uma loja de decoração precisa [aumentar o seu faturamento] para o próximo mês [em 20%].
//		Esta loja deseja atingir este objetivo [aumentando a venda de três produtos].
//		O [produto 1 custa R$ 150] o [produto 2 R$ 220,00] e o [produto 3 R$ 97.00].
//		Faça um algoritmo que receba o valor de faturamento do último mês e apresente: 
//			a) O faturamento do próximo mês para bater a meta de 20%. 
//			b) A quantidade de peças apenas do produto 1 necessárias para obter a meta desejada. 
//			c) A quantidade de peças apenas do produto 2 necessárias para obter a meta desejada. 
//			d) A quantidade de peças apenas do produto 3 necessárias para obter a meta desejada.