import java.util.Scanner;
public class L2_algoritmosFixacaoDecisao_E17_produzirSanduiches {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		float queijoGramas = 0.05f * 2, presuntoGramas = 0.05f, hamburguerGramas = 0.12f, mortadelaGramas = 0.07f, qtdPedido, kgQueijo, kgPresunto, kgHamburguer, presuntoDisponivel, qtdSanduichesPossiveis, mortadelaNecessaria, qtdSanduichesComMortadela, sobraPresunto;
		
		System.out.print("Informe a quantidade de Sandu�ches: ");
		qtdPedido = entrada.nextFloat();
		
		kgQueijo = qtdPedido * queijoGramas;
		kgPresunto= qtdPedido * presuntoGramas;
		kgHamburguer = qtdPedido * hamburguerGramas;
		
		System.out.printf("\nPara produzir 45 sandu�ches ser�o necess�rios: \n"
				+ "\n%.3f Kgs de Queijo"
				+ "\n%.3f Kgs de Presunto"
				+ "\n%.3f Kgs de Hambueguer", kgQueijo, kgPresunto, kgHamburguer);
		
		System.out.print("\n\nInforme a Quantidade em Kgs de Presunto dispon�vel: ");
		presuntoDisponivel = entrada.nextFloat();
		
		qtdSanduichesPossiveis = Math.round(presuntoDisponivel / presuntoGramas);
		qtdSanduichesComMortadela = Math.abs(qtdSanduichesPossiveis - qtdPedido);
		mortadelaNecessaria = (mortadelaGramas * qtdSanduichesComMortadela);
		sobraPresunto = Math.abs((qtdSanduichesPossiveis * presuntoGramas) - presuntoDisponivel);
		
		if (kgPresunto > presuntoDisponivel) {
			System.out.printf("\nSer� poss�vel produzir apenas %.0f sandu�che(s) com presunto.", qtdSanduichesPossiveis);
			System.out.printf("\nSer� necess�rio %.3f kgs de mortadela para produzir %.0f sandu�ches restantes.",mortadelaNecessaria , qtdSanduichesComMortadela);
			System.out.printf("\nDa quantidade de presunto dispon�vel sobrar� %.3f kgs", sobraPresunto);
			
		}
		entrada.close();
	}

}
//		Recheio do Sandu�che = 2 Fatias de Queijo, 1 Fatia de presunto e 1 Rodela de Hamb�rguer;

//		Queijo e Presunto = 50g; Rodela de Hamb�rguer = 120g;

//		Fa�a um algoritmo em que o dono forne�a a quantidade de sandu�ches a fazer, ...
//			...e a m�quina informe as quantidades (em quilos) de queijo, presunto e carne necess�rios para compra.