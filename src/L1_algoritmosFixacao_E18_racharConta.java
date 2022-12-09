import java.util.Scanner;
public class L1_algoritmosFixacao_E18_racharConta {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o valor da conta: ");
		Double conta = entrada.nextDouble();
		
		// três amigos decidiram rachar a conta igualmente;
		Double carlosPaga = Math.floor(conta / 3);
		Double andrePaga = Math.floor(conta / 3);
		Double jardesonPaga = Math.floor(conta / 3) + (conta % 3);
		
		System.out.printf("\nCarlos pagará: %.2f\n", (carlosPaga));
		System.out.printf("André pagará: %.2f\n", (andrePaga));
		System.out.printf("Jardeson pagará: %.2f\n", jardesonPaga);
		
		entrada.close();
	}
}
