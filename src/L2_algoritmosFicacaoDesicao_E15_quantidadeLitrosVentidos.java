import java.util.Scanner;
public class L2_algoritmosFicacaoDesicao_E15_quantidadeLitrosVentidos {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		float lata350 = 350, garrafa600 = 600, garrafa2l = 2000, qtd350, qtd600, qtd2l, totalLitros, total350, total600, total2l, margem350, margem600, calculoEquivalencia;
		
		System.out.print("Informe as Latas de 350ml adquiridas: ");
		qtd350 = entrada.nextFloat();
		System.out.print("Informe as Garrafas de 600ml adquiridas: ");
		qtd600 = entrada.nextFloat();
		System.out.print("Informe as Garrafas de 2L adquiridas: ");
		qtd2l = entrada.nextFloat();
		
		total350 = lata350 * qtd350;
		total600 = garrafa600 * qtd600;
		total2l = garrafa2l * qtd2l;
		
		totalLitros = (total350 + total600 + total2l) / 1000;
		System.out.print("\nQuantidade total vendida de refrigerantes em Litros é: " + totalLitros);
		
		margem350 = total350 * 0.15f;
		margem600 = total600 * 0.09f;
		
		calculoEquivalencia = qtd350 * (lata350 / garrafa600);
		
		if (margem600 >= margem350) {
			System.out.printf("\n\nConsidere substituir a compra de %.0f latas de 350 ml por %.0f garrafas de 600ml e oferecer uma promoção.", qtd350, calculoEquivalencia);
		}
		
		entrada.close();
		}
}

// 15: A fábrica de refrigerantes Meia-Cola vende seu produto em três formatos: 

//lata de 350 ml;
//garrafa de 600 ml e;
//garrafa de 2 litros.

//	Se um comerciante compra uma determinada quantidade de cada formato, faça um algoritmo para calcular quantos litros de refrigerante ele comprou.
//	Regra: Se a margem de lucro do total da compra de garrafas de 600ml for maior ou igual a margem de lucro do total de compra das latas de 350ml, 
//		apresentar uma mensagem: "Considere substituir a compra de X latas de 350 ml por Y garrafas de 600ml e oferecer uma promoção". 
//	A  sugestão da quantidade de garrafas de 600ml a serem compradas deve equivaler a mesma quantidade de mls que seriam comprados para as latas de 350ml. 

//Produto	¦   Margem por unidade

//Lata		¦   350ml 15%

//Garra		¦   600ml 9%
