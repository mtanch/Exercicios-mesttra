import java.util.Scanner;
public class L1_algoritmosFixacao_E11_litrosSucoMaracuja {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite a QTDE de lts de suco necessária: ");
		Double ltsSucoConsole = entrada.nextDouble();
		
		Double quantidadeAguaMineral = (ltsSucoConsole * 8) / 10;
		Double sucoMaracujaNecessario = (ltsSucoConsole * 2) / 10;
		
		System.out.println("\nSerá necessário para fazer " + ltsSucoConsole + " lts de suco de maracujá: ");
		System.out.printf("%.2f lts de água\n", quantidadeAguaMineral);
		System.out.printf("%.2f lts de suco concentrado de maracujá", sucoMaracujaNecessario);
		entrada.close();
	}
}
//		11. Um tonel de refresco é feito com 8 partes de água mineral e 2 partes de suco de maracujá.
//		Faça um algoritmo para calcular quantos litros de água e de suco são necessários para se fazer uma certa quantidade de litros de refresco informados pelo usuário.