import java.util.Scanner;
public class L1_algoritmosFixacao_E13_quantidadeLitrosVentidos {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		Integer lata350ml, garrafa600ml, garrafa2lts;
		
		System.out.print("Digite a quantidade de latas de 350ml: ");
		Integer quantidade350ml = entrada.nextInt();
		System.out.print("Digite a quantidade de garrafas 600ml: ");
		Integer quantidade600ml = entrada.nextInt();
		System.out.print("Digite a quantidade de garrafas de 2lts: ");
		Integer quantidade2lts = entrada.nextInt();
		
		lata350ml = 350;
		garrafa600ml = 600;
		garrafa2lts = 2000;
		
		Double totalEmLitros = ((lata350ml * quantidade350ml) + (garrafa600ml * quantidade600ml) + (garrafa2lts * (double)quantidade2lts)) / 1000;
		
		System.out.printf("\nA quantidade total de litros �: %.0f", totalEmLitros);
		
		
		
		entrada.close();
	}
}
//		13. A fábrica de refrigerantes Meia-Cola vende seu produto em três formatos:
//			- lata de 350 lm;
//			- garrafa de 600 ml;
//			- garrafa de 2 litros;
//		Se um comerciante compra uma determinada quantidade de cada formato, faça um algoritmo para calcular quantos litros de refrigerante ele comprou.