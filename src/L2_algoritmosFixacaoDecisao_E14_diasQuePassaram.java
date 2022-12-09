import java.util.Scanner;
public class L2_algoritmosFixacaoDecisao_E14_diasQuePassaram {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int fevereiro = 28;
		int janeiro = 31, marco = 31, maio = 31, julho = 31, agosto = 31, outubro = 31;
		int abril = 30, junho = 30, setembro = 30, novembro = 30;
		
		int dia, mes, diasPassados = 0;
		
		int umMes, doisMeses, tresMeses, quatroMeses, cincoMeses, seisMeses, seteMeses, oitoMeses, noveMeses, dezMeses, onzeMeses;
		
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
		
		System.out.println("Cálculo de quantos dias passaram desde o início do ano");
		
		System.out.print("\nInforme o dia: ");
		dia = entrada.nextInt();
		System.out.print("Informe o mês: ");
		mes = entrada.nextInt();
		
		if (mes == 1 && (dia > 31 || dia < 1)) {
			System.err.print("\nImpossivel realizar o calculo! Dia e/ou meses invalidos.");
			System.exit(0);
		} else if (mes == 2 && (dia > 28 || dia < 1)) {
			System.err.print("\nImpossivel realizar o calculo! Dia e/ou meses invalidos.");
			System.exit(0);
		} else if (mes == 3 && (dia > 31 || dia < 1)) {
			System.err.print("\nImpossivel realizar o calculo! Dia e/ou meses invalidos.");
			System.exit(0);
		} else if (mes == 4 && (dia > 30 || dia < 1)) {
			System.err.print("\nImpossivel realizar o calculo! Dia e/ou meses invalidos.");
			System.exit(0);
		} else if (mes == 5 && (dia > 31 || dia < 1)) {
			System.err.print("\nImpossivel realizar o calculo! Dia e/ou meses invalidos.");
			System.exit(0);
		} else if (mes == 6 && (dia > 30 || dia < 1)) {
			System.err.print("\nImpossivel realizar o calculo! Dia e/ou meses invalidos.");
			System.exit(0);
		} else if (mes == 7 && (dia > 31 || dia < 1)) {
			System.err.print("\nImpossivel realizar o calculo! Dia e/ou meses invalidos.");
			System.exit(0);
		} else if (mes == 8 && (dia > 31 || dia < 1)) {
			System.err.print("\nImpossivel realizar o calculo! Dia e/ou meses invalidos.");
			System.exit(0);
		} else if (mes == 9 && (dia > 30 || dia < 1)) {
			System.err.print("\nImpossivel realizar o calculo! Dia e/ou meses invalidos.");
			System.exit(0);
		} else if (mes == 10 && (dia > 31 || dia < 1)) {
			System.err.print("\nImpossivel realizar o calculo! Dia e/ou meses invalidos.");
			System.exit(0);
		} else if (mes == 11 && (dia > 30 || dia < 1)) {
			System.err.print("\nImpossivel realizar o calculo! Dia e/ou meses invalidos.");
			System.exit(0);
		} else if (mes == 12 && (dia > 31 || dia < 1)) {
			System.err.print("\nImpossivel realizar o calculo! Dia e/ou meses invalidos.");
			System.exit(0);
		} else if (mes > 12) {
			System.err.print("\nImpossivel realizar o calculo! Dia e/ou meses invalidos.");
			System.exit(0);
		}
		
		if (mes == 1) {
			diasPassados = dia;
		} else if (mes == 2) {
			diasPassados = umMes + dia;
		} else if (mes == 3) {
			diasPassados = doisMeses + dia;
		} else if (mes == 4) {
			diasPassados = tresMeses + dia;			
		} else if (mes == 5) {
			diasPassados = quatroMeses + dia;			
		} else if (mes == 6) {
			diasPassados = cincoMeses + dia;			
		} else if (mes == 7) {
			diasPassados = seisMeses+ dia;			
		} else if (mes == 8) {
			diasPassados = seteMeses + dia;			
		} else if (mes == 9) {
			diasPassados = oitoMeses + dia;			
		} else if (mes == 10) {
			diasPassados = noveMeses + dia;			
		} else if (mes == 11) {
			diasPassados = dezMeses + dia;			
		} else if (mes == 12) {
			diasPassados = onzeMeses + dia;	
		}
		
		System.out.println("\nQuantidade de dias: " + diasPassados);
		
		entrada.close();
	}

}
//		Questão 14: Entrar com o dia e o mês de uma data e informar quantos dias se passaram desde o início do ano.
//		