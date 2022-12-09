import java.util.Scanner;
public class L2_algoritmosFixacaoDecisao_E17_produzirSanduiches {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		float queijoGramas = 0.05f * 2, presuntoGramas = 0.05f, hamburguerGramas = 0.12f, mortadelaGramas = 0.07f, qtdPedido, kgQueijo, kgPresunto, kgHamburguer, presuntoDisponivel, qtdSanduichesPossiveis, mortadelaNecessaria, qtdSanduichesComMortadela, sobraPresunto;
		
		System.out.print("Informe a quantidade de Sanduíches: ");
		qtdPedido = entrada.nextFloat();
		
		kgQueijo = qtdPedido * queijoGramas;
		kgPresunto= qtdPedido * presuntoGramas;
		kgHamburguer = qtdPedido * hamburguerGramas;
		
		System.out.printf("\nPara produzir 45 sanduíches serão necessários: \n"
				+ "\n%.3f Kgs de Queijo"
				+ "\n%.3f Kgs de Presunto"
				+ "\n%.3f Kgs de Hambueguer", kgQueijo, kgPresunto, kgHamburguer);
		
		System.out.print("\n\nInforme a Quantidade em Kgs de Presunto disponível: ");
		presuntoDisponivel = entrada.nextFloat();
		
		qtdSanduichesPossiveis = Math.round(presuntoDisponivel / presuntoGramas);
		qtdSanduichesComMortadela = Math.abs(qtdSanduichesPossiveis - qtdPedido);
		mortadelaNecessaria = (mortadelaGramas * qtdSanduichesComMortadela);
		sobraPresunto = Math.abs((qtdSanduichesPossiveis * presuntoGramas) - presuntoDisponivel);
		
		if (kgPresunto > presuntoDisponivel) {
			System.out.printf("\nSerá possível produzir apenas %.0f sanduíche(s) com presunto.", qtdSanduichesPossiveis);
			System.out.printf("\nSerá necessário %.3f kgs de mortadela para produzir %.0f sanduíches restantes.",mortadelaNecessaria , qtdSanduichesComMortadela);
			System.out.printf("\nDa quantidade de presunto disponível sobrará %.3f kgs", sobraPresunto);
			
		}
		entrada.close();
	}

}
//		Recheio do Sanduíche = 2 Fatias de Queijo, 1 Fatia de presunto e 1 Rodela de Hambúrguer;

//		Queijo e Presunto = 50g; Rodela de Hambúrguer = 120g;

//		Faça um algoritmo em que o dono forneça a quantidade de sanduíches a fazer, ...
//			...e a máquina informe as quantidades (em quilos) de queijo, presunto e carne necessários para compra.