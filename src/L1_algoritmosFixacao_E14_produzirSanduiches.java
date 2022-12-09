import java.util.Scanner;
public class L1_algoritmosFixacao_E14_produzirSanduiches {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de sandu�ches: ");
		Integer sanduichesQuantidade = entrada.nextInt();
		
		Integer fatiasDeQueijo = 2;
		
		Integer queijoGramas = 50 * fatiasDeQueijo; // duas fatias de queijo por sandu�che;
		Integer presuntoGramas = 50;
		Integer hamburguerGramas = 120;
		
		System.out.println("\nPara produzir " + sanduichesQuantidade + " sandu�ches ser�o necess�rios: ");
		
		Double calculoKgsQueijo = (sanduichesQuantidade * (double)queijoGramas) / 1000;
		Double calculoKgsPresunto = (sanduichesQuantidade * (double)presuntoGramas) / 1000;
		Double calculoKgsHamburguer = (sanduichesQuantidade * (double)hamburguerGramas) / 1000;
		
		System.out.printf("%.2f kgs de mussarela\n", calculoKgsQueijo);
		System.out.printf("%.2f kgs de presunto\n", calculoKgsPresunto);
		System.out.printf("%.2f kgs de hamb�rguer\n", calculoKgsHamburguer);
		
		entrada.close();
	}

}
