import java.util.Scanner;
public class L2_algoritmosFixacaoDecisao_E11_idadeAnosMesesDias {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int anoNascimento, mesNascimento, anoAtual, mesAtual, idadeAnos, idadeMeses, idadeDias = 0, totalAno, anoAtualMenosNascimento;
		
		int fevereiro = 28;
		int janeiro = 31, marco = 31, maio = 31, julho = 31, agosto = 31, outubro = 31, dezembro = 31;
		int abril = 30, junho = 30, setembro = 30, novembro = 30;
		
		totalAno = janeiro + fevereiro + marco + abril + maio + junho + julho + agosto + setembro + outubro + novembro + dezembro;
		
		int umMes, doisMeses, tresMeses, quatroMeses, cincoMeses, seisMeses, seteMeses, oitoMeses, noveMeses, dezMeses, onzeMeses, dozeMeses;
		
		umMes = janeiro;
		doisMeses = umMes + fevereiro;
		tresMeses = doisMeses + marco;
		quatroMeses = tresMeses + abril;
		cincoMeses = quatroMeses + maio;
		seisMeses = cincoMeses + junho;
		seteMeses = seisMeses + julho;
		oitoMeses = seteMeses + agosto;
		noveMeses = oitoMeses + setembro;
		dezMeses = noveMeses + outubro;
		onzeMeses = dezMeses + novembro;
		dozeMeses = onzeMeses + dezembro;
		
		System.out.print("Informe o ano de nascimento: ");
		anoNascimento = entrada.nextInt();
		System.out.print("Informe o mês de nascimento: ");
		mesNascimento = entrada.nextInt();
		System.out.print("Informe o ano atual: ");
		anoAtual = entrada.nextInt();
		System.out.print("Informe o mês atual: ");
		mesAtual = entrada.nextInt();
		
		if (mesAtual == 0) {
			System.err.print("\nImpossivel realizar o calculo. O mês não pode ser zero (0).");
			System.exit(0);
		} else if (mesNascimento == 0) { 
			System.err.print("\nImpossivel realizar o calculo. O mês não pode ser zero (0).");
			System.exit(0);
		} else if (mesAtual > 12 || mesAtual < 0) { 
			System.err.print("\nImpossivel realizar o calculo. Anos e/ou meses inconsistentes.");
			System.exit(0);
		} else if (mesNascimento > 12 || mesNascimento < 0) { 
			System.err.print("\nImpossivel realizar o calculo. Anos e/ou meses inconsistentes.");
			System.exit(0);
		} else if (anoNascimento > anoAtual) {
			System.err.print("\nImpossivel realizar o calculo. Anos e/ou meses inconsistentes.");
			System.exit(0);
		} else if (anoNascimento == anoAtual && mesNascimento > mesAtual) {
			System.err.print("\nImpossivel realizar o calculo. Anos e/ou meses inconsistentes.");
			System.exit(0);
		}
		
		anoAtualMenosNascimento = anoAtual - anoNascimento;
		
		// calcular os dias com if
		if (mesAtual == 1) {
			idadeDias = ((anoAtualMenosNascimento) * totalAno) + umMes;
		} else if (mesAtual == 2) {
			idadeDias = ((anoAtualMenosNascimento) * totalAno) + doisMeses;
		} else if (mesAtual == 3) {
			idadeDias = ((anoAtualMenosNascimento) * totalAno) + tresMeses;
		} else if (mesAtual == 4) {
			idadeDias = ((anoAtualMenosNascimento) * totalAno) + quatroMeses;
		} else if (mesAtual == 5) {
			idadeDias = ((anoAtualMenosNascimento) * totalAno) + cincoMeses;
		} else if (mesAtual == 6) {
			idadeDias = ((anoAtualMenosNascimento) * totalAno) + seisMeses;
		} else if (mesAtual == 7) {
			idadeDias = ((anoAtualMenosNascimento) * totalAno) + seteMeses;
		} else if (mesAtual == 8) {
			idadeDias = ((anoAtualMenosNascimento) * totalAno) + oitoMeses;
		} else if (mesAtual == 9) {
			idadeDias = ((anoAtualMenosNascimento) * totalAno) + noveMeses;
		} else if (mesAtual == 10) {
			idadeDias = ((anoAtualMenosNascimento) * totalAno) + dezMeses;
		} else if (mesAtual == 11) {
			idadeDias = ((anoAtualMenosNascimento) * totalAno) + onzeMeses;
		} else if (mesAtual == 12) {
			idadeDias = ((anoAtualMenosNascimento) * totalAno) + dozeMeses;
		}

		idadeMeses = (((anoAtualMenosNascimento * 12) - mesNascimento) + mesAtual); //calcula os meses de idade
		idadeAnos = idadeDias / 365; //calcula os anos de idade
		
		System.out.printf("\nA idade desta pessoa é:"
				+ "\n\nEm Anos: %.0f", Math.floor((float)idadeAnos));
		System.out.printf("\n\nEm Meses: %d", idadeMeses);
		System.out.printf("\n\nEm Dias: %d", idadeDias);
		
		entrada.close();
	}

}
//		Faça um algoritmo que receba o mes e ano de nascimento de uma pessoa e o mes e ano atual
//		calcule e mostre a idade desta pessoa em anos, meses e dias.
//		se o usuario digitar o ano atual menor do que o ano de nascimento, ou os meses fora do intervalo de 1 à 12, ...
//			...deverá ser exibido a mensagem "Impossivel realizar o calculo. Anos e/ou meses invalidos".
//		Considere para o mes inicial o primeiro dia e para o mes final o ultimo dia do respectivo mês.

//		Fevereiro terá sempre 28 idas (ignorar ano bissexto);
//		janeiro, marco, maio, julho, agosto, outubro e dezembro com 31 dias e;
//		abril, junho, setembro, novembro com 30 dias.