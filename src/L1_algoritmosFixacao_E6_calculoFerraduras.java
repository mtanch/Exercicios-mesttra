import java.util.Scanner;
public class L1_algoritmosFixacao_E6_calculoFerraduras {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		Integer ferraduraPorCavalo = 4; 
		Integer numeroCavalos;
		Double precoFerraduras;
		
		System.out.print("Informe quantidade de cavalos: ");
		numeroCavalos = entrada.nextInt();
		System.out.print("Informe o valor de cada ferradura R$: ");
		precoFerraduras = entrada.nextDouble();
		Integer quantidadeTotalFerraduras = ferraduraPorCavalo * numeroCavalos;
		Double valorTotalFerraduras = quantidadeTotalFerraduras * precoFerraduras;
		
		System.out.println("\nA quantidade de ferraduras necessárias: " + quantidadeTotalFerraduras);
		System.out.printf("Valor total para a compra das ferraduras: %.2f", valorTotalFerraduras);
		
		entrada.close();
	}
}
//		calcular quantas ferraduras são necessárias para equipar todos os cavalos comprados para um haras.
//		O usuário devera informar a quantidade de cavalos adquiridos.