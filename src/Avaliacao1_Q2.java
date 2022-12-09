import java.util.Scanner;
import java.util.InputMismatchException;

public class Avaliacao1_Q2 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		Integer voto1 = 0, voto2 = 0, voto3 = 0, voto4 = 0, voto5 = 0;
		Integer votosValidos = 0, percentVotosValidos, votoA = 0, votoB = 0, votoC = 0, percentA = 0, percentB = 0, percentC = 0, maiorQtdVotos = 0;
		String c1 =  "Candidato 1", c2 = "Candidato 2", c3 = "Candidato 3";
		
		System.out.print("=========== Menu de Votação ===========\n"
				+ "\n[1] - Candidato A"
				+ "\n[2] - Candidato B"
				+ "\n[3] - Candidato C"
				+ "\n[4] - Voto Nulo\n\n");
		
		System.out.println("Digite o código do candidato para o primeiro voto: ");
		try {
			voto1 = entrada.nextInt();	//	Recebendo os votos
		} catch (InputMismatchException erro1) {
			System.err.println("\nOpção inválida! O voto [1] não será computado.\n");
			voto1 = 4;					//	Anulando o voto
		}
		
		if (voto1 > 4 || voto1 < 1) {
			System.err.println("\nOpção inválida! O voto não será computado.\n");	//	Tratando de opções maiores/menores que as solicitadas
			voto1 = 4;					//	Anulando o voto
		}
		
		System.out.println("Digite o código do candidato para o segundo voto: ");
		try {
			entrada.nextLine();			//	Limpeza de Buffer
			voto2 = entrada.nextInt();	//	Recebendo os votos
		} catch (InputMismatchException erro2) {
			System.err.println("\nOpção inválida! O voto [2] não será computado.\n");
			voto2 = 4;					//	Anulando o voto
		}
		
		if (voto2 > 4 || voto2 < 1) {
			System.err.println("\nOpção inválida! O voto não será computado.\n");	//	Tratando de opções maiores/menores que as solicitadas
			voto2 = 4;					//	Anulando o voto
		}
		
		System.out.println("Digite o código do candidato para o terceiro voto: ");
		try {
			entrada.nextLine();			//	Limpeza de Buffer
			voto3 = entrada.nextInt();	//	Recebendo os votos
		} catch (InputMismatchException erro3) {
			System.err.println("\nOpção inválida! O voto [3] não será computado.\n");
			voto3 = 4;					//	Anulando o voto
		}
		
		if (voto3 > 4 || voto3 < 1) {
			System.err.println("\nOpção inválida! O voto não será computado.\n");	//	Tratando de opções maiores/menores que as solicitadas
			voto3 = 4;					//	Anulando o voto
		}
		
		System.out.println("Digite o código do candidato para o quarto voto: ");
		try {
			entrada.nextLine();			//	Limpeza de Buffer
			voto4 = entrada.nextInt();	//	Recebendo os votos
		} catch (InputMismatchException erro4) {
			System.err.println("\nOpção inválida! O voto [4] não será computado.\n");
			voto4 = 4;					//	Anulando o voto
		}
		
		if (voto4 > 4 || voto4 < 1) {
			System.err.println("\nOpção inválida! O voto não será computado.\n");	//	Tratando de opções maiores/menores que as solicitadas
			voto4 = 4;					//	Anulando o voto
		}
		
		System.out.println("Digite o código do candidato para o quinto voto: ");
		try {
			entrada.nextLine();			//	Limpeza de Buffer
			voto5 = entrada.nextInt();	//	Recebendo os votos
		} catch (InputMismatchException erro5) {
			System.err.println("\nOpção inválida! O voto [5] não será computado.\n");
			voto5 = 4;					//	Anulando o voto
		}
		
		if (voto5 > 4 || voto5 < 1) {
			System.err.println("\nOpção inválida! O voto não será computado.\n");	//	Tratando de opções maiores/menores que as solicitadas
			voto5 = 4;					//	Anulando o voto
		}
		
		
		
		if (voto1 != 4) {
			votosValidos++;	//	Somando os votos válidos;
		}
		if (voto2 != 4) {
			votosValidos++;	//	Somando os votos válidos;
		}
		if (voto3 != 4) {
			votosValidos++;	//	Somando os votos válidos;
		}
		if (voto4 != 4) {
			votosValidos++;	//	Somando os votos válidos;
		}
		if (voto5 != 4) {
			votosValidos++;	//	Somando os votos válidos;
		}
		
		percentVotosValidos = 100 * votosValidos / 5;	//	Percentual de votos válidos
		
		if (voto1 == 1) {			//	Atribuição de votos ao Cantidado A
			votoA++;
		} else if (voto1 == 2) {	//	Atribuição de votos ao Cantidado B
			votoB++;
		} else if (voto1 == 3) {	//	Atribuição de votos ao Cantidado C
			votoC++;
		}
		if (voto2 == 1) {			//	Atribuição de votos ao Cantidado A
			votoA++;
		} else if (voto2 == 2) {	//	Atribuição de votos ao Cantidado B
			votoB++;
		} else if (voto2 == 3) {	//	Atribuição de votos ao Cantidado C
			votoC++;
		}
		if (voto3 == 1) {			//	Atribuição de votos ao Cantidado A
			votoA++;
		} else if (voto3 == 2) {	//	Atribuição de votos ao Cantidado B
			votoB++;
		} else if (voto3 == 3) {	//	Atribuição de votos ao Cantidado C
			votoC++;
		}
		if (voto4 == 1) {			//	Atribuição de votos ao Cantidado A
			votoA++;
		} else if (voto4 == 2) {	//	Atribuição de votos ao Cantidado B
			votoB++;
		} else if (voto4 == 3) {	//	Atribuição de votos ao Cantidado C
			votoC++;
		}
		if (voto5 == 1) {			//	Atribuição de votos ao Cantidado A
			votoA++;
		} else if (voto5 == 2) {	//	Atribuição de votos ao Cantidado B
			votoB++;
		} else if (voto5 == 3) {	//	Atribuição de votos ao Cantidado C
			votoC++;
		}
		
		percentA = (100 * votoA) / 5;	//	Percentual de votos do Candidato A
		percentB = (100 * votoB) / 5;	//	Percentual de votos do Candidato B
		percentC = (100 * votoC) / 5;	//	Percentual de votos do Candidato C
		
		System.out.printf("\nPercentual de Votos Válidos: %d%%\n", percentVotosValidos);
		System.out.printf("\nPercentual de Votos Candidato 1: %d%%", percentA);
		System.out.printf("\nPercentual de Votos Candidato 2: %d%%", percentB);
		System.out.printf("\nPercentual de Votos Candidato 3: %d%%", percentC);
		
		if (votoA > votoB) {
			maiorQtdVotos = votoA;
			if (maiorQtdVotos < votoC) {
				maiorQtdVotos = votoC;
			}
		} else if (votoB > votoA) {
			maiorQtdVotos = votoB;
			if (maiorQtdVotos < votoC) {
				maiorQtdVotos = votoC;
			}
		}		//	Decidindo o maior percentual;
		
		if (votoA.equals(votoB) && votoA.equals(votoC)) {
			System.out.println("\n\nTodos os candidatos EMPATARAM!");				//	Verificando empates
		} else if (votoA.equals(votoB) && votoA > votoC) {
			System.out.println("\n\nO Candidato A EMPATOU com o Candidato B!");		//	Verificando empates
		} else if (votoA.equals(votoC) && votoC > votoB) {
			System.out.println("(\n\nO Candidato A EMPATOU com o Candidato C!");	//	Verificando empates
		} else if (votoB.equals(votoC) && votoB > votoA) {
			System.out.println("\n\nO Candidato B EMPATOU com o Candidato C!");		//	Verificando empates
		} else {
			
			if (maiorQtdVotos.equals(votoA)) {
				System.out.printf("\n\nCandidato vencedor: %s", c1);	//	Declarando candidato vencedor;
			} else if (maiorQtdVotos.equals(votoB)) {
				System.out.printf("\n\nCandidato vencedor: %s", c2);	//	Declarando candidato vencedor;
			} else if (maiorQtdVotos.equals(votoC)) {
				System.out.printf("\n\nCandidato vencedor: %s", c3);	//	Declarando candidato vencedor;
			}
			
		}
		entrada.close();
	}

}
//	Criar uma votação;
//		Receber 5 votos dos usuários;
//			Candidatos = Candidato A, Candidato B e Candidato C;
//				Exibir as opções: "1 - Candidato A", "2 - Candidato B", "3 - Candidato C", "4 - Voto Nulo"
//					Apresentar a quantidade percentual de votos válidos (desconsiderando votos nulos)
//						Ao final, apresentar o candidato vencedor;