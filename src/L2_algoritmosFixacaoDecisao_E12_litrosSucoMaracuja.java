import java.util.Scanner;
public class L2_algoritmosFixacaoDecisao_E12_litrosSucoMaracuja {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		float aguaPercentual, sucoPercentual, somaPercentualAguaSuco, quantidadeAgua, quantidadeSuco;
		int totalLitrosSuco;
		
		System.out.print("Digite a Quantidade de Litros de suco necessária: ");
		totalLitrosSuco = entrada.nextInt();
		System.out.print("Digite o percentual (%) de concentração da água: ");
		aguaPercentual = entrada.nextFloat();
		System.out.print("Digite o percentual (%) de concentração do suco: ");
		sucoPercentual = entrada.nextFloat();
		
		somaPercentualAguaSuco = aguaPercentual + sucoPercentual;
		
		if (somaPercentualAguaSuco < 100  || somaPercentualAguaSuco > 100) {
			System.out.print("\nOs valores de concentração não totalizam 100%.\nDeseja enquadrar os valores em escala de 100% [s|n]?\n\n -> ");
			char simNao = entrada.next().charAt(0);
			if (simNao == 's') {
				aguaPercentual = (aguaPercentual/somaPercentualAguaSuco);
				sucoPercentual = (sucoPercentual/somaPercentualAguaSuco);
				System.out.printf("\nNovo percentual da água: %.2f", aguaPercentual * 100);
				System.out.printf("\nNovo percentual do suco: %.2f\n", sucoPercentual * 100);
			} else if (simNao == 'n') {
				System.err.print("\nValores de concentração incorretos. Processo finalizado!");
				System.exit(0);
			} else {
				System.err.print("\nOpção digitada inválida. Processo finalizado!");
				System.exit(0);	
			}
		}
		
		quantidadeAgua = (totalLitrosSuco * aguaPercentual);
		quantidadeSuco = (totalLitrosSuco * sucoPercentual);
		
		System.out.printf("\nSerá necessário para fazer %d Litros de Suco de Maracujá: \n", totalLitrosSuco);
		System.out.printf("\n%.2f lts de Água.", quantidadeAgua);
		System.out.printf("\n%.2f lts de Suco concentrado de Maracujá.", quantidadeSuco);
		
		entrada.close();
	}
}


//		Faça um algoritmo para calcular quantos litros de água e de suco são necessários para
//			se fazer uma certa quantidade de litros de refresco informados pelo usuário. 

//		Como a empresa fabrica o suco para várias marcas diferentes e cada marca utiliza uma determinada concentração, 
//			será necessário ler do usuário a concentração de suco e agua. 

//		Regras:
//			a) O seu algoritmo deve verificar se a somatoria do valor de concentração de suco e agua (lidos a
//				partir do usuário) é igual a 100 (percentual). Ex: Percentual de água lido: 80, Percentual de suco lido: 20, Total = 100%
//				Percentual água lido: 80, Percentual de suco lido: 15, TOTAL = 95%
//			b) Se a somatoria não der 100 o algoritmo deverá perguntar para o usuario se ele deseja
//				enquadrar os valores em percentual (100%). Se o usuário escolher "s" o algoritmo deve enquadrar
//				estes valores, exibir para o usuário os valores enquadrados e seguir com o cálculo. Ex: Percentual água lido: 80, Percentual de suco lido: 15, TOTAL = 95%
//				Enquadrando o valor de água lido: 80/(80 + 15) = 0,842105263 (Valor de percentual a ser usado)
//				Enquadrando o valor de suco lido: 15/(80 + 15) = 0,157894737 (Valor de percentual a ser usado)
//			c) Se o usuário responder "n" o algoritmo deve ser finalizado e informado a mensagem 
//				"Valores de concentração incorretos. Processo finalizado!"

//			Ex.:
//				Digite a QTDE de lts de suco necessaria: 120			|
//				Digite o percentual (%) de concentracao da agua: 80		|
//				Digite o percentual (%) de concentracao do suco: 20		|