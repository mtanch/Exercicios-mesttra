import java.util.Scanner;
import java.util.InputMismatchException;

public class Avaliacao1_Q4 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		float valor1 = 0, CodPagamento1 = 0;	//	variáveis da compra 1
		float valor2 = 0, CodPagamento2 = 0;	//	variáveis da compra 2
		float valor3 = 0, CodPagamento3 = 0;	//	variáveis da compra 3
		float valor4 = 0, CodPagamento4 = 0;	//	variáveis da compra 4
		float valor5 = 0, CodPagamento5 = 0;	//	variáveis da compra 5
		float totalAVista = 0, totalParcelado = 0;		//	total de compras à vista e parcelado
		float totalDescontos = 0, totalJuros = 0;		//	total de descontos e de juros em reais
		
		System.out.println("Compra 1: ");
		System.out.print("\nDigite o valor total: ");
		
		try {
			
			valor1 = entrada.nextFloat();			// Valor da compra 1
			
			System.out.println("\nDigite a forma de pagamento: \n"
					+ "\n[1] - À vista, com 8% de desconto"
					+ "\n[2] - À vista no cartão, 4% de desconto"
					+ "\n[3] - Em 2x sem juros"
					+ "\n[4] - Em 4x, preço acrescido de 8%");
			
			CodPagamento1 = entrada.nextFloat();			//	Selecionando forma de pagamento
			
			if (CodPagamento1 == 1) {			//	Definindo o desconto/juros e printando o valor final
				totalDescontos += valor1 * 0.08f;
				valor1 *= 0.92f;
				System.out.println("Desconto de 8%");
				System.out.printf("Valor final: %.2f", valor1);
				totalAVista += valor1;
			} else if (CodPagamento1 == 2) {	//	Definindo o desconto/juros e printando o valor final
				totalDescontos += valor1 * 0.04f;
				valor1 *= 0.96f;
				System.out.println("Desconto de 4%");
				System.out.printf("Valor final: %.2f", valor1);
				totalAVista += valor1;
			} else if (CodPagamento1 == 3) {	//	Definindo o desconto/juros e printando o valor final
				System.out.printf("Em 2x de %.2f", valor1 / 2);
				System.out.printf("Valor final: %.2f", valor1);
				totalParcelado += valor1;
			} else if (CodPagamento1 == 4) {	//	Definindo o desconto/juros e printando o valor final
				System.out.printf("Em 4x de %.2f", (valor1 * 1.08f) / 4);
				totalJuros += valor1 * 0.08f;
				valor1 *= 1.08f;
				System.out.printf("\nValor final: %.2f", valor1);
				totalParcelado += valor1;
			} else {
				System.err.print("\nOpção inválida! A compra não será processada.");
				valor1 = 0;
			}
		} catch (InputMismatchException erro) {		//	Tratamento de possíveis erros
			System.err.println("\nOpção inválida! A compra não será processada.");
			valor1 = 0;
		}
		
/*------------------------------------------------------------------------------------*/
		
		System.out.println("\nCompra 2: ");
		System.out.println("\nDigite o valor total: ");
		
		try {
			
			entrada.nextLine();			//	Limpeza de Buffer
			valor2 = entrada.nextFloat();			// Valor da compra 2
			
			System.out.println("\nDigite a forma de pagamento: \n"
					+ "\n[1] - À vista, com 8% de desconto"
					+ "\n[2] - À vista no cartão, 4% de desconto"
					+ "\n[3] - Em 2x sem juros"
					+ "\n[4] - Em 4x, preço acrescido de 8%");
			
			CodPagamento2 = entrada.nextFloat();			//	Selecionando forma de pagamento

			if (CodPagamento2 == 1) {			//	Definindo o desconto/juros e printando o valor final
				totalDescontos += valor2 * 0.08f;
				valor2 *= 0.92f;
				System.out.println("Desconto de 8%");
				System.out.printf("Valor final: %.2f", valor2);
				totalAVista += valor2;
			} else if (CodPagamento2 == 2) {	//	Definindo o desconto/juros e printando o valor final
				totalDescontos += valor2 * 0.04f;
				valor2 *= 0.96f;
				System.out.println("Desconto de 4%");
				System.out.printf("Valor final: %.2f", valor2);
				totalAVista += valor2;
			} else if (CodPagamento2 == 3) {	//	Definindo o desconto/juros e printando o valor final
				System.out.printf("Em 2x de %.2f", valor2 / 2);
				System.out.printf("\nValor final: %.2f", valor2);
				totalParcelado += valor2;
			} else if (CodPagamento2 == 4) {	//	Definindo o desconto/juros e printando o valor final
				System.out.printf("Em 4x de %.2f", (valor2 * 1.08f) / 4);
				totalJuros += valor2 * 0.08f;
				valor2 *= 1.08f;
				System.out.printf("\nValor final: %.2f", valor2);
				totalParcelado += valor2;
			} else {
				System.err.println("\nOpção inválida! A compra não será processada.");
				valor2 = 0;
			}
			
		} catch (InputMismatchException erro) {		//	Tratamento de possíveis erros
			System.err.print("\nOpção inválida! A compra não será processada.\n");
			valor2 = 0;
		}
		
/*------------------------------------------------------------------------------------*/
		
		System.out.println("\n\nCompra 3: ");
		System.out.print("\nDigite o valor total: ");
		
		try {
			
			entrada.nextLine();			//	Limpeza de Buffer
			valor3 = entrada.nextFloat();			// Valor da compra 3
			
			System.out.println("\nDigite a forma de pagamento: \n"
					+ "\n[1] - À vista, com 8% de desconto"
					+ "\n[2] - À vista no cartão, 4% de desconto"
					+ "\n[3] - Em 2x sem juros"
					+ "\n[4] - Em 4x, preço acrescido de 8%");
			
			CodPagamento3 = entrada.nextFloat();			//	Selecionando forma de pagamento
			
			if (CodPagamento3 == 1) {			//	Definindo o desconto/juros e printando o valor final
				totalDescontos += valor3 * 0.08f;
				valor3 *= 0.92f;
				System.out.println("Desconto de 8%");
				System.out.printf("Valor final: %.2f", valor2);
				totalAVista += valor3;
			} else if (CodPagamento3 == 2) {	//	Definindo o desconto/juros e printando o valor final
				totalDescontos += valor3 * 0.04f;
				valor3 *= 0.96f;
				System.out.println("Desconto de 4%");
				System.out.printf("Valor final: %.2f", valor3);
				totalAVista += valor3;
			} else if (CodPagamento3 == 3) {	//	Definindo o desconto/juros e printando o valor final
				System.out.printf("Em 2x de %.2f", valor3 / 2);
				System.out.printf("Valor final: %.2f", valor3);
				totalParcelado += valor3;
			} else if (CodPagamento3 == 4) {	//	Definindo o desconto/juros e printando o valor final
				System.out.printf("Em 4x de %.2f", (valor3 * 1.08f) / 4);
				totalJuros += valor3 * 0.08f;
				valor3 *= 1.08f;
				System.out.printf("\nValor final: %.2f", valor3);
				totalParcelado += valor3;
			} else {
				System.err.print("\nOpção inválida! A compra não será processada.");
				valor3 = 0;
			}
			
		} catch (InputMismatchException erro) {		//	Tratamento de possíveis erros
			System.err.print("\nOpção inválida! A compra não será processada.\n");
			valor3 = 0;
		}
		
/*------------------------------------------------------------------------------------*/
		
		System.out.println("\n\nCompra 4: ");
		System.out.print("\nDigite o valor total: ");
		
		try {
			
			entrada.nextLine();			//	Limpeza de Buffer
			valor4 = entrada.nextFloat();			// Valor da compra 4
			
			System.out.println("\nDigite a forma de pagamento: \n"
					+ "\n[1] - À vista, com 8% de desconto"
					+ "\n[2] - À vista no cartão, 4% de desconto"
					+ "\n[3] - Em 2x sem juros"
					+ "\n[4] - Em 4x, preço acrescido de 8%");
			
			CodPagamento4 = entrada.nextFloat();			//	Selecionando forma de pagamento
			
			if (CodPagamento4 == 1) {			//	Definindo o desconto/juros e printando o valor final
				totalDescontos += valor4 * 0.08f;
				valor4 *= 0.92f;
				System.out.println("Desconto de 8%");
				System.out.printf("Valor final: %.2f", valor4);
				totalAVista += valor4;
			} else if (CodPagamento4 == 2) {	//	Definindo o desconto/juros e printando o valor final
				totalDescontos += valor4 * 0.04f;
				valor4 *= 0.96f;
				System.out.println("Desconto de 4%");
				System.out.printf("Valor final: %.2f", valor4);
				totalAVista += valor4;
			} else if (CodPagamento4 == 3) {	//	Definindo o desconto/juros e printando o valor final
				System.out.printf("Em 2x de %.2f", valor4 / 2);
				System.out.printf("\nValor final: %.2f", valor4);
				totalParcelado += valor4;
			} else if (CodPagamento4 == 4) {	//	Definindo o desconto/juros e printando o valor final
				System.out.printf("Em 4x de %.2f", (valor4 * 1.08f) / 4);
				totalJuros += valor4 * 0.08f;
				valor4 *= 1.08f;
				System.out.printf("\nValor final: %.2f", valor4);
				totalParcelado += valor4;
			} else {
				System.err.print("\nOpção inválida! A compra não será processada.");
				valor4 = 0;
			}
			
		} catch (InputMismatchException erro) {		//	Tratamento de possíveis erros
			System.err.print("\nOpção inválida! A compra não será processada.\n");
			valor4 = 0;
		}
		
/*------------------------------------------------------------------------------------*/
		
		System.out.println("\n\nCompra 5: ");
		System.out.print("\nDigite o valor total: ");
		
		try {
			
			entrada.nextLine();			//	Limpeza de Buffer
			valor5 = entrada.nextFloat();			// Valor da compra 5
			
			System.out.println("\nDigite a forma de pagamento: \n"
					+ "\n[1] - À vista, com 8% de desconto"
					+ "\n[2] - À vista no cartão, 4% de desconto"
					+ "\n[3] - Em 2x sem juros"
					+ "\n[4] - Em 4x, preço acrescido de 8%");
			
			CodPagamento5 = entrada.nextFloat();			//	Selecionando forma de pagamento
			
			if (CodPagamento5 == 1) {			//	Definindo o desconto/juros e printando o valor final
				totalDescontos += valor5 * 0.08f;
				valor5 *= 0.92f;
				System.out.println("Desconto de 8%");
				System.out.printf("Valor final: %.2f", valor5);
				totalAVista += valor5;
			} else if (CodPagamento5 == 2) {	//	Definindo o desconto/juros e printando o valor final
				totalDescontos += valor5 * 0.04f;
				valor5 *= 0.96f;
				System.out.println("Desconto de 4%");
				System.out.printf("Valor final: %.2f", valor5);
				totalAVista += valor5;
			} else if (CodPagamento5 == 3) {	//	Definindo o desconto/juros e printando o valor final
				System.out.printf("Em 2x de %.2f", valor5 / 2);
				System.out.printf("\nValor final: %.2f", valor5);
				totalParcelado += valor5;
			} else if (CodPagamento5 == 4) {	//	Definindo o desconto/juros e printando o valor final
				System.out.printf("Em 4x de %.2f", (valor5 * 1.08f) / 4);
				totalJuros += valor5 * 0.08f;
				valor5 *= 1.08f;
				System.out.printf("\nValor final: %.2f", valor5);
				totalParcelado += valor5;
			} else {
				System.err.print("\nOpção inválida! A compra não será processada.");
				valor5 = 0;
			}
			
		} catch (InputMismatchException erro) {		//	Tratamento de possíveis erros
			System.err.print("\nOpção inválida! A compra não será processada.\n");
			valor4 = 0;
		}
		
/*------------------------------------------------------------------------------------*/
		
		System.out.printf("\n\nTotal de compras \"À vista\": R$ %.2f", totalAVista);
		System.out.printf("\nTotal de compras \"Parceladas\": R$ %.2f", totalParcelado);
		System.out.printf("\n\nTotal de descontos: R$ %.2f", totalDescontos);
		System.out.printf("\nTotal de juros: R$ %.2f", totalJuros);
		
		entrada.close();
	}

}
//	ler 5 compras de clientes
//		para cada compra deve ser informado o valor da compra e o código da forma de pagamento
//			com base no código, o algoritmo deverá calcular e imprimir o valor a pagar final, a forma de pagamento e o valor de cada parcela, se for o caso.
//				O algoritmo deve também exibir a soma de todas as compras "À vista" e "Parceladas". 
//					Deve ser impresso também o total de descontos e o total de juros.

//				Código Classificação
//				1 À vista, com 8% de desconto
//				2 À vista no cartão, 4% de desconto
//				3 Em 2x, preço normal sem juros
//				4 Em 4x, preço acrescido de 8%
//				Qualquer outro código: Opção inválida
