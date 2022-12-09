import java.util.Scanner;
public class L1_algoritmosFixacao_E19_quantosDiasPassaramNoAno {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o dia: ");
		Integer dia = entrada.nextInt();
		System.out.print("Digite o mês: ");		
		Integer mes = entrada.nextInt();
		
		Integer diasQPassaramDoAno = (mes - 1) * 30 + dia;
		
		System.out.println("A quantidade de dias que se passaram foi: " + diasQPassaramDoAno + " dias");
		
		entrada.close();
	}

}
