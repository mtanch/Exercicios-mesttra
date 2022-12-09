import java.util.Scanner;
public class L2_algoritmosFixacaoDecisao_E19_venderPecasParaAtingitMeta {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		Float p1Valor = 150.0f, p2Valor = 220.0f, p3Valor = 97.0f, pecaEscolhida = 0f, qtdPecasParaVender;	//	valor dos produtos;
		Integer cod1 = 101, cod2 = 122, cod3 = 163, codEntrada;	//	codigo dos produtos;
		Float faturamentoAnt, proxFaturamento, valorRequeridoMeta;	//	valor do vaturamento anterior, do proximo mes e o valor requerido para atingir a meta, respectivamente.
		
		System.out.print("Digite o valor do faturamento anterior: ");
		faturamentoAnt = entrada.nextFloat();
		
		System.out.print("\n=== Código dos Produtos ==="
				+ "\nProduto 1: 101"
				+ "\nProduto 2: 122"
				+ "\nProduto 3: 163\n");
		
		System.out.print("\nDigite o código do produto que se deseja bater a meta: ");
		codEntrada = entrada.nextInt();
		
		if (codEntrada.equals(cod1)) {
			pecaEscolhida = p1Valor;
		} else if (codEntrada.equals(cod2)) {
			pecaEscolhida = p2Valor;
		} else if (codEntrada.equals(cod3)) {
			pecaEscolhida = p3Valor;
		} else {
			System.err.print("\nCódigo de produto não encontrado!");
			System.exit(0);
		}
		
		proxFaturamento = faturamentoAnt * 1.2f;
		
		System.out.printf("\nA meta para o próximo faturamento é: R$ %.2f", proxFaturamento);
		valorRequeridoMeta = faturamentoAnt * 0.2f;
		System.out.printf("\nUm aumento de: R$ %.2f", valorRequeridoMeta);
		System.out.print("\nQuantidade de peças a serem vendidas para atingirmos a meta: ");
		
		qtdPecasParaVender = valorRequeridoMeta / pecaEscolhida;
		
		if (codEntrada.equals(cod1)) {
			pecaEscolhida = p1Valor;
			System.out.printf("\n\nProduto 1: %.2f peças", qtdPecasParaVender);
		} else if (codEntrada.equals(cod2)) {
			pecaEscolhida = p2Valor;
			System.out.printf("\n\nProduto 2: %.2f peças", qtdPecasParaVender);
		} else if (codEntrada.equals(cod3)) {
			pecaEscolhida = p3Valor;
			System.out.printf("\n\nProduto 3: %.2f peças", qtdPecasParaVender);
		}
		entrada.close();
	}

}
