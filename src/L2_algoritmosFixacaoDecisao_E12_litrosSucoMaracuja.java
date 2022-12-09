import java.util.Scanner;
public class L2_algoritmosFixacaoDecisao_E12_litrosSucoMaracuja {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		float aguaPercentual, sucoPercentual, somaPercentualAguaSuco, quantidadeAgua, quantidadeSuco;
		int totalLitrosSuco;
		
		System.out.print("Digite a Quantidade de Litros de suco necess�ria: ");
		totalLitrosSuco = entrada.nextInt();
		System.out.print("Digite o percentual (%) de concentra��o da �gua: ");
		aguaPercentual = entrada.nextFloat();
		System.out.print("Digite o percentual (%) de concentra��o do suco: ");
		sucoPercentual = entrada.nextFloat();
		
		somaPercentualAguaSuco = aguaPercentual + sucoPercentual;
		
		if (somaPercentualAguaSuco < 100  || somaPercentualAguaSuco > 100) {
			System.out.print("\nOs valores de concentra��o n�o totalizam 100%.\nDeseja enquadrar os valores em escala de 100% [s|n]?\n\n -> ");
			char simNao = entrada.next().charAt(0);
			if (simNao == 's') {
				aguaPercentual = (aguaPercentual/somaPercentualAguaSuco);
				sucoPercentual = (sucoPercentual/somaPercentualAguaSuco);
				System.out.printf("\nNovo percentual da �gua: %.2f", aguaPercentual * 100);
				System.out.printf("\nNovo percentual do suco: %.2f\n", sucoPercentual * 100);
			} else if (simNao == 'n') {
				System.err.print("\nValores de concentra��o incorretos. Processo finalizado!");
				System.exit(0);
			} else {
				System.err.print("\nOp��o digitada inv�lida. Processo finalizado!");
				System.exit(0);	
			}
		}
		
		quantidadeAgua = (totalLitrosSuco * aguaPercentual);
		quantidadeSuco = (totalLitrosSuco * sucoPercentual);
		
		System.out.printf("\nSer� necess�rio para fazer %d Litros de Suco de Maracuj�: \n", totalLitrosSuco);
		System.out.printf("\n%.2f lts de �gua.", quantidadeAgua);
		System.out.printf("\n%.2f lts de Suco concentrado de Maracuj�.", quantidadeSuco);
		
		entrada.close();
	}
}


//		Fa�a um algoritmo para calcular quantos litros de �gua e de suco s�o necess�rios para
//			se fazer uma certa quantidade de litros de refresco informados pelo usu�rio. 

//		Como a empresa fabrica o suco para v�rias marcas diferentes e cada marca utiliza uma determinada concentra��o, 
//			ser� necess�rio ler do usu�rio a concentra��o de suco e agua. 

//		Regras:
//			a) O seu algoritmo deve verificar se a somatoria do valor de concentra��o de suco e agua (lidos a
//				partir do usu�rio) � igual a 100 (percentual). Ex: Percentual de �gua lido: 80, Percentual de suco lido: 20, Total = 100%
//				Percentual �gua lido: 80, Percentual de suco lido: 15, TOTAL = 95%
//			b) Se a somatoria n�o der 100 o algoritmo dever� perguntar para o usuario se ele deseja
//				enquadrar os valores em percentual (100%). Se o usu�rio escolher "s" o algoritmo deve enquadrar
//				estes valores, exibir para o usu�rio os valores enquadrados e seguir com o c�lculo. Ex: Percentual �gua lido: 80, Percentual de suco lido: 15, TOTAL = 95%
//				Enquadrando o valor de �gua lido: 80/(80 + 15) = 0,842105263 (Valor de percentual a ser usado)
//				Enquadrando o valor de suco lido: 15/(80 + 15) = 0,157894737 (Valor de percentual a ser usado)
//			c) Se o usu�rio responder "n" o algoritmo deve ser finalizado e informado a mensagem 
//				"Valores de concentra��o incorretos. Processo finalizado!"

//			Ex.:
//				Digite a QTDE de lts de suco necessaria: 120			|
//				Digite o percentual (%) de concentracao da agua: 80		|
//				Digite o percentual (%) de concentracao do suco: 20		|