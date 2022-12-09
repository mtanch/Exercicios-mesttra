import java.util.Scanner;

public class exercicioAula_1_fahrenheitParaCelcius {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
        
		double celcius;
		
		System.out.println("Fahrenheit\tCelcius\n");
		
		for (int fahrenheit = 32; fahrenheit < 201; fahrenheit++) {
			celcius = ((fahrenheit -32)/1.8);
			
			System.out.printf("%d\t%.2f\n", fahrenheit, celcius);
			
		}
	    entrada.close();
	}
	
}
//01) Construa um algoritmo que imprima a tabela de equivalência de graus Fahrenheit para centígrados. Os limites são de 32 a 200 graus Fahrenheit com intervalo de 1 grau.
//
//Fórmula de Fahrenheit para Celcius é: (5 / 9 * (Fahrenheit -32))
//
//Exemplo:
//
//Fahrenheit     Celcius 
//32              0.00 
//33              0.56 
//34              1.11
//...
//200             93.33 


