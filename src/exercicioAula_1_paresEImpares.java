import java.util.ArrayList;
import java.util.Scanner;
public class exercicioAula_1_paresEImpares {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		Integer somaPar = 0, multImpar = 1;
		
		ArrayList <Integer> par = new ArrayList <Integer> ();
		ArrayList <Integer> impar = new ArrayList <Integer> ();
		
		for (int i = 1; i > 0; i++) {
			
			System.out.printf("Digite o %dº número: ", i);
			Integer num = entrada.nextInt();
			
			if (num == 0) {
				break;
			} else if ((num % 2) == 0) {
				par.add(num);
			} else if ((num % 2) != 0) {
				impar.add(num);
			}
		}
		
		for (int i = 0 ; i < par.size() ; i++) {
			
		somaPar += par.get(i);
		
		}
		for (int i = 0 ; i < impar.size() ; i++) {
			
			multImpar *= impar.get(i);
			
		}
		
		System.out.printf("\nA soma dos números Pares é: [%d]\n", somaPar);
		System.out.printf("\nA multiplicação dos números Ímpares é: [%d]", multImpar);
		
		entrada.close();
	}

}

//02) Crie um algoritmo que o usuário entre com vários números inteiros e positivos e imprima a multiplicação dos números ímpares e a soma dos números pares. 
//O algoritmo finaliza quando o usuário digita o número 0.