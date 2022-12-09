import java.util.Scanner;
public class L2_algoritmosFixacaoDecisao_E9_racharConta {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		float conta, amigos = 3, dividindoConta, moduloConta, valorContaAndre, valorContaCarlos, valorContaJardeson;
		
		System.out.print("Informe o valor da conta: ");
		conta = entrada.nextFloat();
		
		dividindoConta = conta / amigos;
		moduloConta = conta % amigos;
		
		if ((moduloConta/3) <= 0.3) {
			valorContaCarlos = (float)Math.floor(dividindoConta);
			valorContaAndre = (float)Math.floor(dividindoConta);
			valorContaJardeson = ((float)Math.floor(dividindoConta) + moduloConta);
			System.out.printf("\nCarlos pagará: %.2f", valorContaCarlos);
			System.out.printf("\nAndré pagará: %.2f", valorContaAndre);
			System.out.printf("\nJardeson pagará: %.2f", valorContaJardeson);
		} else {
			valorContaCarlos = dividindoConta;
			valorContaAndre = dividindoConta;
			valorContaJardeson = dividindoConta;
			System.out.printf("\nCarlos pagará: %.2f", valorContaCarlos);
			System.out.printf("\nAndré pagará: %.2f", valorContaAndre);
			System.out.printf("\nJardeson pagará: %.2f", valorContaJardeson);
		}
		entrada.close();
	}

}
//		ler o total da conta e imprimir quanto cada amigo deve pagar, mas faça com q carlos e andré não pagem os centavos caso sejam menor ou igual a 30 centavos;
//		se for maior q 30 centavos, a conta deve ser dividida igualmente entre os 3;