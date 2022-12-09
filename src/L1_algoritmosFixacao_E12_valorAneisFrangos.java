import java.util.Scanner;
public class L1_algoritmosFixacao_E12_valorAneisFrangos {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		Double valorAnelChip = 4.00; // um anel com chip por frango;
		Double custoAnelAlimentoPorFrango = 7.00; // dois anéis de alimento por frango (R$ 3.50 cada);
		
		System.out.print("Digite a QTDE de grangos: ");
		Integer quantidadeFrangos = entrada.nextInt();
		
		Double calculoGastoAneisPorFrango = (valorAnelChip + custoAnelAlimentoPorFrango) * quantidadeFrangos;
		
		System.out.printf("\nO valor total para identificar os frangos é: %.2f", calculoGastoAneisPorFrango); 
		
		entrada.close();
	}
}
