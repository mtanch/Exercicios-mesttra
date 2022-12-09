import java.util.Scanner;
public class L2_algoritmosFixacaoDecisao_E6_calculoFerraduras {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		float quantidadeCavalos, precoFerradura = 0, ferradurasNecessarias, valorTotalFerraduras, totalFinalComDesconto;
		
		System.out.print("Informe a quantidade de cavalos: ");
		quantidadeCavalos = entrada.nextFloat();
		System.out.print("Informe o valor de cada ferradura: ");
		precoFerradura = entrada.nextFloat();
		
		ferradurasNecessarias = (quantidadeCavalos * 4);
		System.out.printf("\nA quantidade de ferraduras necessárias: %.0f\n", ferradurasNecessarias);
		valorTotalFerraduras = ferradurasNecessarias * precoFerradura;
		
		if ((valorTotalFerraduras >= 15000.01) && (valorTotalFerraduras <= 20000.00)) {
			totalFinalComDesconto = (float)(valorTotalFerraduras * 0.9);
			System.out.printf("Valor total para a compra das ferraduras: R$ %.2f", totalFinalComDesconto);
		} else if ((valorTotalFerraduras >= 20000.01) && (valorTotalFerraduras <= 25000.00)) {
			totalFinalComDesconto = (float)(valorTotalFerraduras * 0.88);
			System.out.printf("Valor total para a compra das ferraduras: R$ %.2f", totalFinalComDesconto);
		} else if ((valorTotalFerraduras >= 25000.01) && (valorTotalFerraduras <= 30000.00)) {
			totalFinalComDesconto = (float)(valorTotalFerraduras * 0.85);
			System.out.printf("Valor total para a compra das ferraduras: R$ %.2f", totalFinalComDesconto);
		} else if (valorTotalFerraduras >= 30000.01) {
			totalFinalComDesconto = (float)(valorTotalFerraduras * 0.8);
			System.out.printf("Valor total para a compra das ferraduras: R$ %.2f", totalFinalComDesconto);
		} else {
			System.out.printf("Valor total para a compra das ferraduras: R$ %.2f", valorTotalFerraduras);
		}
		
		entrada.close();
	}

}
//		calcular quantas ferraduras são necessárias para todos os cavalos de um haras;
//		Usuario tem q informar a quantidade de cavalos e o valor de cada ferradura;
//		Aplique um desconto no valor total segundo a tabela:

//			entre [15000.01] e [20000.00] [10%]
//			entre [20000.01] e [25000.00] [12%]
//			entre [25000.01] e [30000.00] [15%]
//			entre [30000.01] e [infinito] [20%]