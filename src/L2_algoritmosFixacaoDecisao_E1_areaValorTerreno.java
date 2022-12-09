import java.util.Scanner;
public class L2_algoritmosFixacaoDecisao_E1_areaValorTerreno {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Calculo do Valor de Terrenos\n\n"
				+ "Informe quantos metros de frente tem o terreno (em metros): ");
		double frente = entrada.nextDouble();
		System.out.print("Informe quantos metros de lateral tem o terreno (em metros): ");
		double lateral = entrada.nextDouble();
		System.out.print("Informe quanto custa o metro do Terreno: R$ ");
		double precoMetroQuadrado = entrada.nextDouble();
		
		double calculoAreaTerreno = frente * lateral;
		double totalPrecoTerreno = calculoAreaTerreno * precoMetroQuadrado;
		
		System.out.printf("\n\nArea total do terreno de %.2f mts de frente com %.2f mts de lateral �: %.2f mts.\n", frente, lateral, calculoAreaTerreno);
		
		double subtracaoFrenteLateral = Math.abs(frente - lateral);
		double dezPorcentoFrente = frente * 0.1;
		double quarentaPorcentoLateral = lateral * 0.4;
		double setentaPorcentoLateral = lateral * 0.7;
		
		if (frente < quarentaPorcentoLateral) {
			System.out.printf("O terreno recebeu um decr�scimo de 12% e custar�: %.2f", totalPrecoTerreno *= 0.88);
		} else if (subtracaoFrenteLateral < dezPorcentoFrente) {
			System.out.printf("O terreno recebeu um acr�scimo de 22% e custar�: %.2f", totalPrecoTerreno *= 1.22);
		} else if (frente > setentaPorcentoLateral) {
			System.out.printf("O terreno recebeu um decr�scimo de 15% e custar�: %.2f", totalPrecoTerreno *= 0.85);
		} else {
			System.out.printf("O terreno n�o recebeu nenhuma altera��o e custar�: %.2f", totalPrecoTerreno);
		}
		entrada.close();
	}

}
//		12% = 50,30 130,34 10,23
//		15% = 100,20 80,10 12,50
//		22% = 100,20 93,10 13,40
//		00% = 90,45 210,34 10,45


//		01. Calcular Terrenos Retangulares (frente * lateral)
//		Imprimir a �rea do terreno e o valor de venda do mesmo.
//		Informar (console) as dimens�es em metros (frente e lateral) do terreno al�m do valor cobrado pelo metro quadrado.

//		Se ((frente - lateral) < (frente * 0.1)) = acr�scimo de 22% no valor final do terreno;
//		Se (frente < (lateral * 0.4)) = desconto de 12% no valor final do terreno;
//		Se (frente > (lateral * 0.7)) = desconto de 15% no valor final;
//		Caso nenhuma condi��o se satisfa�a, o valor do terreno n�o sofrer� altera��es;