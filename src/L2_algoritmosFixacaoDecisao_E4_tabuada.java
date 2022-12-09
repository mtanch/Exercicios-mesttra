import java.util.Scanner;
public class L2_algoritmosFixacaoDecisao_E4_tabuada {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double numero;
		char tipoOperacao;
		System.out.print("Digite um n�mero: ");
		numero = entrada.nextInt();
		if (numero < 0) {
			System.err.print("\nDigite um n�mero positivo.");
			System.exit(0);
		}
		System.out.print("Informe o tipo da opera��o: \n"
				+ "\n[+] - Soma"
				+ "\n[-] - Subtra��o"
				+ "\n[*] - Multiplica��o"
				+ "\n[/] - Divis�o"
				+ "\n\n-> ");
		tipoOperacao = entrada.next().charAt(0);
		System.out.println();
		
		if (tipoOperacao == '+' || tipoOperacao == '-' || tipoOperacao == '*' || tipoOperacao == '/') {
			
		} else {
			System.err.printf("A opera��o digitada [%c] � inv�lida.", tipoOperacao);
			System.exit(0);
		}
		tabuada(numero, tipoOperacao);
		
		entrada.close();
	}
	
	public static void tabuada (double num, char op) {
		if (op == '+') {
			System.out.printf("Tabuada de [%c] para o n�mero [%.0f]:", op, num);
			System.out.printf("\n%.0f %c 0 = %.0f", num, op, (num+0));
			System.out.printf("\n%.0f %c 1 = %.0f", num, op, (num+1));
			System.out.printf("\n%.0f %c 2 = %.0f", num, op, (num+2));
			System.out.printf("\n%.0f %c 3 = %.0f", num, op, (num+3));
			System.out.printf("\n%.0f %c 4 = %.0f", num, op, (num+4));
			System.out.printf("\n%.0f %c 5 = %.0f", num, op, (num+5));
			System.out.printf("\n%.0f %c 6 = %.0f", num, op, (num+6));
			System.out.printf("\n%.0f %c 7 = %.0f", num, op, (num+7));
			System.out.printf("\n%.0f %c 8 = %.0f", num, op, (num+8));
			System.out.printf("\n%.0f %c 9 = %.0f", num, op, (num+9));
		} else if (op == '-') {
			System.out.printf("Tabuada de [%c] para o n�mero [%.0f]:", op, num);
			System.out.printf("\n%.0f %c 0 = %.0f", num, op, (num-0));
			System.out.printf("\n%.0f %c 1 = %.0f", num, op, (num-1));
			System.out.printf("\n%.0f %c 2 = %.0f", num, op, (num-2));
			System.out.printf("\n%.0f %c 3 = %.0f", num, op, (num-3));
			System.out.printf("\n%.0f %c 4 = %.0f", num, op, (num-4));
			System.out.printf("\n%.0f %c 5 = %.0f", num, op, (num-5));
			System.out.printf("\n%.0f %c 6 = %.0f", num, op, (num-6));
			System.out.printf("\n%.0f %c 7 = %.0f", num, op, (num-7));
			System.out.printf("\n%.0f %c 8 = %.0f", num, op, (num-8));
			System.out.printf("\n%.0f %c 9 = %.0f", num, op, (num-9));
		} else if (op == '*') {
			System.out.printf("Tabuada de [%c] para o n�mero [%.0f]:", op, num);
			System.out.printf("\n%.0f %c 0 = %.0f", num, op, (num*0));
			System.out.printf("\n%.0f %c 1 = %.0f", num, op, (num*1));
			System.out.printf("\n%.0f %c 2 = %.0f", num, op, (num*2));
			System.out.printf("\n%.0f %c 3 = %.0f", num, op, (num*3));
			System.out.printf("\n%.0f %c 4 = %.0f", num, op, (num*4));
			System.out.printf("\n%.0f %c 5 = %.0f", num, op, (num*5));
			System.out.printf("\n%.0f %c 6 = %.0f", num, op, (num*6));
			System.out.printf("\n%.0f %c 7 = %.0f", num, op, (num*7));
			System.out.printf("\n%.0f %c 8 = %.0f", num, op, (num*8));
			System.out.printf("\n%.0f %c 9 = %.0f", num, op, (num*9));
		} else if (op == '/') {
			System.out.printf("Tabuada de [%c] para o n�mero [%.0f]:", op, num);
			System.out.printf("\n%.0f %c 0 = [N�o pode dividir por Zero]", num, op);
			System.out.printf("\n%.0f %c 1 = %.0f", num, op, (num/1));
			System.out.printf("\n%.0f %c 2 = %.0f", num, op, (num/2));
			System.out.printf("\n%.0f %c 3 = %.0f", num, op, (num/3));
			System.out.printf("\n%.0f %c 4 = %.0f", num, op, (num/4));
			System.out.printf("\n%.0f %c 5 = %.0f", num, op, (num/5));
			System.out.printf("\n%.0f %c 6 = %.0f", num, op, (num/6));
			System.out.printf("\n%.0f %c 7 = %.0f", num, op, (num/7));
			System.out.printf("\n%.0f %c 8 = %.0f", num, op, (num/8));
			System.out.printf("\n%.0f %c 9 = %.0f", num, op, (num/9));
		}
		
	}

}
//		Fa�a um algoritmo que calcule e mostre a tabuada de uma opera��o matem�tica que dever� ser informada pelo usu�rio (+, -, * e /)
//		al�m do n�mero digitado pelo usu�rio para o calculo da opera��o.
