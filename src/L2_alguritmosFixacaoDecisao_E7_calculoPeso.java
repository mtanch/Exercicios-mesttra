import java.util.Scanner;
public class L2_alguritmosFixacaoDecisao_E7_calculoPeso {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		float peso, engordar15Porcento, engordar20Porcento, diferencaAcrescimos;
		
		System.out.print("Informe o peso em KG: ");
		peso = entrada.nextFloat();
		
		engordar15Porcento = (float)(peso * 1.15);
		engordar20Porcento = (float)(peso * 1.20);
		diferencaAcrescimos = Math.abs(engordar15Porcento - engordar20Porcento);
		
		System.out.printf("\nCaso a pessoa engorde 15%% ficará com: %.2f\n", engordar15Porcento);
		System.out.printf("Caso a pessoa engorde 20%% ficará com: %.2f", engordar20Porcento);
		
		if (diferencaAcrescimos >= 4.5) {
			System.out.println("\nVocê deve procurar uma nutricionista!");
		}
		entrada.close();
	}

}
//		Questão 07: Faça um algoritmo que receba o peso de uma pessoa, calcule e mostre:
//			a) o novo peso se a pessoa engordar 15% sobre o peso digitado;
//			b) o novo peso se a pessoa emagrecer 20% sobre o peso digitado.
//			c) Uma mensagem "Você deve procurar uma nutricionista" 
//				se a diferença de acréscimo de peso (15%) entre o acréscimo de peso (20%) for maior ou igual a 4,5 kgs.
