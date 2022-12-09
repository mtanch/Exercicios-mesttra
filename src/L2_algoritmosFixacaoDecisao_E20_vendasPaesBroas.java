import java.util.Scanner;
public class L2_algoritmosFixacaoDecisao_E20_vendasPaesBroas {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		float paoValor = 0.12f, broaValor = 1.50f, valorReforma, paesVendidos, broasVendidas, quantiaArrecadada, depositar, terminarReformaEm120Dias;
		int qtdPaesVendidos, qtdBroasVendidas, diasReforma;
		
		System.out.print("Informe a quantidade de Pães vendidos no dia: ");
		qtdPaesVendidos = entrada.nextInt();
		System.out.print("Informe a quantidade de Broas vendidas no dia: ");
		qtdBroasVendidas = entrada.nextInt();		
		System.out.print("Informe o valor da reforma: ");
		valorReforma = entrada.nextFloat();
		
		paesVendidos = qtdPaesVendidos * paoValor;
		broasVendidas = qtdBroasVendidas * broaValor;
		quantiaArrecadada = paesVendidos + broasVendidas;
		depositar = quantiaArrecadada * 0.1f;
		diasReforma = (int)(valorReforma / depositar);
		terminarReformaEm120Dias = valorReforma / 120;
		
		System.out.printf("\nValor arrecadado das vendas de Pães: R$ %.2f", paesVendidos);
		System.out.printf("\nValor arrecadado das vendas de Broas: R$ %.2f", broasVendidas);
		System.out.printf("\nQuantia total arrecadada de Pães e Broas: R$ %.2f", quantiaArrecadada);
		System.out.printf("\nValor do depósito na poupança: R$ %.2f", depositar);
		System.out.printf("\nDias necessários para custear a Reforma: %d Dias", diasReforma);
		
		if (diasReforma > 120) {
			System.out.printf("\n\nPara realizar a reforma em 120 dias será necessário depositar diariamente: R$ %.2f", terminarReformaEm120Dias);
		}
		
		entrada.close();
	}

}
//		pao = 0,12 Reais
//		broa = 1,50 Reais

//		Quanto arrecadou das vendas de paes e broas juntos;
//		10% disso para a poupança para realizar uma reforma;

// ler qtd paes e broas >> 
//		valor da reforma >> 
//			calcular valor arrecadado >> 
//				calcular o valor para depositar (10%) >> 
//					quantos dias necessarios para custear a reforma (caso mantenha o mesmo faturamento) 