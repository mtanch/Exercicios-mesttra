import java.util.Scanner;
public class L1_algoritmosFixacao_E5_divisao {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("[DIVIS�O]\n");
		System.out.print("Digite dois n�meros: ");
		Integer n1 = entrada.nextInt();
		Integer n2 = entrada.nextInt();
		
		Float divisao = (n1/(float)n2);
		
		System.out.printf("A divis�o de %d por %d � %.2f",n1 , n2, divisao);
		
		entrada.close();
	}
}
//		receba dois n�meros inteiros, calcule e mostre a divis�o do primeiro n�mero pelo segundo;
