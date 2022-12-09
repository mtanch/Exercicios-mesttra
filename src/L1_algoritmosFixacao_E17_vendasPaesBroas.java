import java.util.Scanner;
public class L1_algoritmosFixacao_E17_vendasPaesBroas {

	public static void main(String[] args) {	
	 	Scanner entrada = new Scanner(System.in);
	 	
	 	Double precoPaoFrances = 0.12;
	 	Double precoBroa = 1.60;
	 	
	 	System.out.print("Digite a quantidade de pães vendidos: ");
	 	Integer paesVendidosNoDia = entrada.nextInt();
	 	System.out.print("Digite a quantidade de broas vendidos: ");
	 	Integer broasVendidasNoDia = entrada.nextInt();
	 	System.out.print("Digite o valor da reforma: ");
	 	Double valorDaReforma = entrada.nextDouble();
	 	
	 	Double totalValorPaesVendidos = paesVendidosNoDia * precoPaoFrances;
	 	Double totalValorBroasVendidas = broasVendidasNoDia * precoBroa;
	 	Double somaBroasEPaesVendidos = totalValorBroasVendidas + totalValorPaesVendidos;
	 	Double valorDeposito = somaBroasEPaesVendidos * 0.1;
	 	Double diasAproximadosParaAReforma = valorDaReforma / valorDeposito;
	 	
	 	System.out.printf("\nFaturamento com a venda de broas: %.2f\n", totalValorBroasVendidas);
	 	System.out.printf("Faturamento com a venda de pães: %.2f\n", totalValorPaesVendidos);
	 	System.out.printf("Faturamento diário (pães + broas): %.2f\n", somaBroasEPaesVendidos);
	 	System.out.printf("Valor do deposito na poupança: %.2f\n", valorDeposito);
	 	System.out.printf("Para pagar a reforma serão necessários: %.0f dias\n", Math.ceil(diasAproximadosParaAReforma));
		
		entrada.close();
	}

}
//		soma das vendas de pão e broa do dia
//		10% do faturamento para pôr na poupança