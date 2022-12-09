import java.util.Scanner;
public class L1_algoritmosFixacao_E5_divisao {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("[DIVISÃO]\n");
		System.out.print("Digite dois números: ");
		Integer n1 = entrada.nextInt();
		Integer n2 = entrada.nextInt();
		
		Float divisao = (n1/(float)n2);
		
		System.out.printf("A divisão de %d por %d é %.2f",n1 , n2, divisao);
		
		entrada.close();
	}
}
//		receba dois números inteiros, calcule e mostre a divisão do primeiro número pelo segundo;
