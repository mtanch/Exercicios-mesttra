import java.util.ArrayList;
import java.util.Scanner;
public class exercicioAula_1_paresEImpares {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		Integer somaPar = 0, multImpar = 1;
		
		ArrayList <Integer> par = new ArrayList <Integer> ();
		ArrayList <Integer> impar = new ArrayList <Integer> ();
		
		for (int i = 1; i > 0; i++) {
			
			System.out.printf("Digite o %d� n�mero: ", i);
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
		
		System.out.printf("\nA soma dos n�meros Pares �: [%d]\n", somaPar);
		System.out.printf("\nA multiplica��o dos n�meros �mpares �: [%d]", multImpar);
		
		entrada.close();
	}

}

//02) Crie um algoritmo que o usu�rio entre com v�rios n�meros inteiros e positivos e imprima a multiplica��o dos n�meros �mpares e a soma dos n�meros pares. 
//O algoritmo finaliza quando o usu�rio digita o n�mero 0.