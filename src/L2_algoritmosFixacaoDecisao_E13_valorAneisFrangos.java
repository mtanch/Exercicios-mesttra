import java.util.Scanner;
public class L2_algoritmosFixacaoDecisao_E13_valorAneisFrangos {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		Float frangos, valIdent, valAliment, custoIdent, custoAliment, maiorVal, diferencaSobreMaiorVal, vintePorcentoMaiorVal, qtdIdent, qtdAliment, precoFinalIdent, precoFinalAliment, calculoTotal;
		
		System.out.print("Informe quantos frangos tem na granja: ");
		frangos = entrada.nextFloat();		//quantidade de frangos
		System.out.print("Informe o valor do Chip de Alimentação: ");
		valAliment = entrada.nextFloat();	// valor dos chips de alimentação
		System.out.print("Informe o valor do Chip de Identificação: ");
		valIdent = entrada.nextFloat();		// valor dos chips de identificação
		
		qtdIdent = frangos;			//calculo da quantidade de Chips Identificação
		qtdAliment = frangos * 2;	//calculo da quantidade de Chips Alimentação
		
		custoIdent = frangos * valIdent;
		custoAliment = (frangos * valAliment) * 2;
		
		//verificando qual é o maior valor:
		if (valIdent > valAliment) {
			maiorVal = valIdent;
		} else {
			maiorVal = valAliment;
		}
		
		vintePorcentoMaiorVal = maiorVal * 0.2f;
		
		System.out.println("O valor total para identificar os frangos é: ");
		
		diferencaSobreMaiorVal = Math.abs(valIdent - valAliment);	//Diferença dividida pelo maior valor
		if (diferencaSobreMaiorVal > vintePorcentoMaiorVal) {
			
			System.out.printf("\nOs chips Alimentação custarão: R$ %.2f", custoAliment);
			System.out.printf("\nOs chips Identificação custarão: R$ %.2f", custoIdent);
			
		} else if (diferencaSobreMaiorVal <= vintePorcentoMaiorVal) {
			
			System.out.printf("\nChips Alimentação: R$ %.2f", custoAliment);
			
			if (diferencaSobreMaiorVal <= vintePorcentoMaiorVal && maiorVal==(valIdent)) {
				System.out.printf("\tAdicional 20%% = R$ %.2f", (custoAliment * 0.2));
				qtdAliment *= 1.2f;
			}
			
			System.out.printf("\nChips Identificação: R$ %.2f", custoIdent);
			
			if (diferencaSobreMaiorVal <= vintePorcentoMaiorVal && maiorVal==(valAliment)) {
				System.out.printf("\tAdicional 20%% = R$ %.2f", custoIdent);
				qtdIdent *= 1.2f;
			}
		
		}//Acrescentando 20% à quantidade do chip de menor valor
		precoFinalIdent = (qtdIdent * valIdent);
		precoFinalAliment = (qtdAliment * valAliment);
		calculoTotal = (precoFinalIdent + precoFinalAliment);
		System.out.printf("\n\nValor Total: R$ %.2f", calculoTotal);
		
		entrada.close();
	}
	
}
//		No pé direito do frango há um anel com um chip de identificação;
//		No pé esquerdo são dois anéis para indicar o tipo de alimento que ele deve consumir.
//		Calcule o gasto total da granja para marcar todos os seus frangos que deverá ser informado pelo usuário além do [valor do chip de identificação e do chip de alimentação].
//		Caso a diferença de valor dos chips for menor ou igual a 20% do chip de maior valor, deve ser adicionado mais 20% na quantidade total de chips de menor valor.

//	Exemplo 01:
//	Chip de identificação: R$ 4,50
//	Chip de Alimento: R$ 2,50
//	Diferença entre os chips R$: 2,00 (equivale a 44% do chip mais caro (Chip de Identificação))
//	Não adiciona 20% na compra de quantidade do chip mais barato (Chip de Alimento)
//	Exemplo 02:
//	Chip de identificação: R$ 4,50
//	Chip de Alimento: R$ 4,00
//	Diferença entre os chips R$: 0,50 (equivale a 11% do chip mais caro (Chip de Identificação))
//	Adiciona 20% na compra de quantidade do chip mais barato (Chip de Alimento)
//	Exemplo 02:
//	Chip de identificação: R$ 3,20
//	Chip de Alimento: R$ 3,50
//	Diferença entre os chips R$: 0,50 (equivale a 8% do chip mais caro (Chip de Alimento))
//	Adiciona 20% na compra de quantidade do chip mais barato 