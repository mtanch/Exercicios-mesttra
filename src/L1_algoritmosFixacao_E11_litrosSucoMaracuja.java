import java.util.Scanner;
public class L1_algoritmosFixacao_E11_litrosSucoMaracuja {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite a QTDE de lts de suco necess�ria: ");
		Double ltsSucoConsole = entrada.nextDouble();
		
		Double quantidadeAguaMineral = (ltsSucoConsole * 8) / 10;
		Double sucoMaracujaNecessario = (ltsSucoConsole * 2) / 10;
		
		System.out.println("\nSer� necess�rio para fazer " + ltsSucoConsole + " lts de suco de maracuj�: ");
		System.out.printf("%.2f lts de �gua\n", quantidadeAguaMineral);
		System.out.printf("%.2f lts de suco concentrado de maracuj�", sucoMaracujaNecessario);
		entrada.close();
	}
}
//		11. Um tonel de refresco � feito com 8 partes de �gua mineral e 2 partes de suco de maracuj�.
//		Fa�a um algoritmo para calcular quantos litros de �gua e de suco s�o necess�rios para se fazer uma certa quantidade de litros de refresco informados pelo usu�rio.