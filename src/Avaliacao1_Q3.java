import java.util.Scanner;
import java.util.InputMismatchException;

public class Avaliacao1_Q3 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String nome1, nome2, nome3;
		Integer idade1 = 0, idade2 = 0, idade3 = 0, totalCriancas = 0, totalAdolescentes = 0, totalAdultos = 0, totalMelhorIdade = 0, maiorIdade = 0;
		Character sexo1, sexo2, sexo3;
		
		System.out.print("Informe o Nome da primeira pessoa: ");
		nome1 = entrada.nextLine();				//	recebendo nome da pessoa 1
		
		System.out.print("Informe a Idade da primeira pessoa: ");
		
		try {
			idade1 = entrada.nextInt();			//	recebendo idade da pessoa 1
		} catch (InputMismatchException erro) {
			System.err.print("A idade informada é inválida!");
		}
		
		System.out.print("Informe o Sexo da primeira pessoa: ");
		sexo1 = entrada.next().charAt(0);		//	recebendo o sexo da pessoa 1
		
		if (sexo1 == 'M' || sexo1 == 'm' || sexo1 == 'F' || sexo1 == 'f') {
			
		} else {
			System.err.print("Sexo informado inválido!");
			System.exit(0);
		}
		
		if (idade1 >= 0 && idade1 <= 13) {
			totalCriancas++;
			System.out.printf("%s é criança.", nome1);			//	verificando se a pessoa 3 é criança
		} else if (idade1 > 13 && idade1 <= 20) {
			totalAdolescentes++;
			System.out.printf("%s é adolescente.", nome1);		//	verificando se a pessoa 3 é adolescente
		} else if (idade1 > 20 && idade1 <= 50) {
			totalAdultos++;
			System.out.printf("%s é adulto.", nome1);			//	verificando se a pessoa 3 é adulto
		} else if (idade1 > 50 && idade1 < 120) {
			totalMelhorIdade++;
			System.out.printf("%s é da melhor idade.", nome1);	//	verificando se a pessoa 3 está na melhor idade
		} else {
			System.err.print("\nA idade informada é inválida!");
			System.exit(0);
		}
		
/*==============================================================================*/
		
		System.out.print("\n\nInforme o Nome da segunda pessoa: ");
		entrada.nextLine();						//	Limpeza de Buffer
		nome2 = entrada.nextLine();				//	recebendo nome da pessoa 2
		
		System.out.print("Informe a Idade da segunda pessoa: ");
		
		try {
			idade2 = entrada.nextInt();			//	recebendo idade da pessoa 2
		} catch (InputMismatchException erro) {
			System.err.print("A idade informada é inválida!");
		}

		System.out.print("Informe o Sexo da segunda pessoa: ");
		sexo2 = entrada.next().charAt(0);		//	recebendo o sexo da pessoa 2
		
		if (sexo2 == 'M' || sexo2 == 'm' || sexo2 == 'F' || sexo2 == 'f') {
			
		} else {
			System.err.print("Sexo informado inválido!");
			System.exit(0);
		}
		
		if (idade2 >= 0 && idade2 <= 13) {
			totalCriancas++;
			System.out.printf("%s é criança.", nome2);			//	verificando se a pessoa 3 é criança
		} else if (idade2 > 13 && idade2 <= 20) {
			totalAdolescentes++;
			System.out.printf("%s é adolescente.", nome2);		//	verificando se a pessoa 3 é adolescente
		} else if (idade2 > 20 && idade2 <= 50) {
			totalAdultos++;
			System.out.printf("%s é adulto.", nome2);			//	verificando se a pessoa 3 é adulto
		} else if (idade2 > 50 && idade2 < 120) {
			totalMelhorIdade++;
			System.out.printf("%s é da melhor idade.", nome2);	//	verificando se a pessoa 3 está na melhor idade
		} else {
			System.err.print("\nA idade informada é inválida!");
			System.exit(0);
		}
		
/*==============================================================================*/
		
		System.out.print("\n\nInforme o Nome da terceira pessoa: ");
		entrada.nextLine();						//	Limpeza de Buffer
		nome3 = entrada.nextLine();				//	recebendo nome da pessoa 3
		
		System.out.print("Informe a Idade da terceira pessoa: ");
		
		try {
			idade3 = entrada.nextInt();			//	recebendo idade da pessoa 3
		} catch (InputMismatchException erro) {
			System.err.print("A idade informada é inválida!");
		}
		
		System.out.print("Informe o Sexo da terceira pessoa: ");
		sexo3 = entrada.next().charAt(0);		//	recebendo o sexo da pessoa 3
		
		if (sexo3 == 'M' || sexo3 == 'm' || sexo3 == 'F' || sexo3 == 'f') {
			
		} else {
			System.err.print("Sexo informado inválido!");
			System.exit(0);
		}
		
		if (idade3 >= 0 && idade3 <= 13) {
			totalCriancas++;
			System.out.printf("%s é criança.", nome3);			//	verificando se a pessoa 3 é criança
		} else if (idade3 > 13 && idade3 <= 20) {
			totalAdolescentes++;
			System.out.printf("%s é adolescente.", nome3);		//	verificando se a pessoa 3 é adolescente
		} else if (idade3 > 20 && idade3 <= 50) {
			totalAdultos++;
			System.out.printf("%s é adulto.", nome3);			//	verificando se a pessoa 3 é adulto
		} else if (idade3 > 50 && idade3 < 120) {
			totalMelhorIdade++;
			System.out.printf("%s é da melhor idade.", nome3);	//	verificando se a pessoa 3 está na melhor idade
		} else {
			System.err.print("\nA idade informada é inválida!");
			System.exit(0);
		}
		
/*==============================================================================*/		
		
		System.out.printf("\n\nTotal de crianças: %d", totalCriancas);
		System.out.printf("\nTotal de adolescentes: %d", totalAdolescentes);
		System.out.printf("\nTotal de adultos: %d", totalAdultos);
		System.out.printf("\nTotal de melhor idade: %d\n", totalMelhorIdade);
		
		if (idade1 > idade2) {			//	Verificando qual é a maior idade
			maiorIdade = idade1;		//	Verificando qual é a maior idade
			if (maiorIdade < idade3) {	//	Verificando qual é a maior idade
				maiorIdade = idade3;	//	Verificando qual é a maior idade
			}
		} else {						//	Verificando qual é a maior idade
			maiorIdade = idade2;		//	Verificando qual é a maior idade
			if (idade2 < idade3) {		//	Verificando qual é a maior idade
				maiorIdade = idade3;	//	Verificando qual é a maior idade
			}
		}
		
		if (idade1.equals(idade2) && idade1 > idade3) {
			System.out.printf("\nOs indivíduos %s e %s são ambos os mais velhos.", nome1, nome2);
		} else if (idade1.equals(idade3) && idade1 > idade2) {	
			System.out.printf("\nOs indivíduos %s e %s são ambos os mais velhos.", nome1, nome3);
		} else if (idade2.equals(idade3) && idade2 > idade1) {
			System.out.printf("\nOs indivíduos %s e %s são ambos os mais velhos.", nome2, nome3);
		} else if (idade1.equals(idade2) &&  idade2.equals(idade3)) {
			System.out.print("\nTodos os indivíduos tem a mesma idade.");
		} else {
			if (maiorIdade == idade1) {
				System.out.printf("\nO nome do indivíduo mais velho é: %s", nome1);
			} else if (maiorIdade == idade2) {
				System.out.printf("\nO nome do indivíduo mais velho é: %s", nome2);
			} else if (maiorIdade == idade3) {
				System.out.printf("\nO nome do indivíduo mais velho é: %s", nome3);
			}
		}
		
		entrada.close();
	}

}
//	ler o NOME, IDADE e SEXO de 3 pessoas
//		imprimir quem é CRIANÇA, ADOLESCENTE, ADULTO e MELHOR IDADE
//			<= 13 é CRIANÇA; entre 13 e 20 anos é ADOLESCENTE; é ADULTO se for até 50 anos; e é da MELHOR IDADE se for maior que 50 anos;
//				deve informar o nome do indivíduo;
//					no caso do sexo, o usuário deve digitar F ou f para feminino e M ou m para masculino
//						ao final, imprimir a quantidade de pessoas que são criança, adolescente, adulto e melhor idade
//							deve informar o nome do indivíduo mais velho;