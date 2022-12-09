import java.util.Scanner;
public class L2_algoritmosFixacaoDecisao_E10_calculoAreaFormasGeometricas {
	public static void main(String[] args) {
		
	    float trapezio, quadrado, retangulo, circulo, triangulo;
	    float maior = 0;
	    String nomeMaior = "";
	    
	    System.out.println("CALCULO DE ÁREA: ");
	    
	    trapezio = trapezio();
	    quadrado = quadrado();
	    retangulo = retangulo();
	    circulo = circulo();
	    triangulo = triangulo();

	    if (trapezio > maior) {
	      maior = trapezio;
	      nomeMaior = "trapezio";
	    } if (quadrado > maior){
	      maior = quadrado;
	      nomeMaior = "quadrado";
	    } if (retangulo > maior){
	      maior = retangulo;
	      nomeMaior = "retangulo";
	    } if (circulo > maior){
	      maior = circulo;
	      nomeMaior = "circulo";
	    } if (triangulo > maior) {
	      maior = triangulo;
	      nomeMaior = "triangulo";
	    }    
	    
	    System.out.printf("O objeto com a maior área é o %s com %.2f de área.", nomeMaior, maior);
	    
	  }
	
	public static float trapezio () {
		Scanner entrada = new Scanner(System.in);
		System.out.println("\n[Calcular área do Trapézio]\n");
		System.out.print("Digite o valor da Base Maior: ");
		float baseMaior = entrada.nextFloat();
		System.out.print("Digite o valor da Base Menor: ");
		float baseMenor = entrada.nextFloat();			
		System.out.print("Digite o valor da Altura: ");
		float altura = entrada.nextFloat();
		
		float calculo = (baseMaior + baseMenor) * altura;
		
		System.out.println("\nA área do Trapézio é: [" + calculo + "]\n");
		
		entrada.close();
		return calculo;
	}
	public static float quadrado () {
		Scanner entrada = new Scanner(System.in);
	
		System.out.println("\n[Calcular área do Quadrado]\n");
		System.out.print("Digite um dos lados do Quadrado: ");
		float ladoQuadrado = entrada.nextFloat();
		
		float calculo = ladoQuadrado * ladoQuadrado;
		
		System.out.println("\nA área do Quadrado é: [" + calculo + "]\n");
		
		entrada.close();
		return calculo;
	}
	public static float retangulo () {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("\n[Calcular área do Retângulo]\n");
		System.out.print("Digite a largura do Retângulo: ");
		float largura = entrada.nextFloat();
		System.out.print("Digite a altura do Retângulo: ");
		float altura = entrada.nextFloat();
		
		float calculo = largura * altura;
		
		System.out.println("\nA área do Retângulo é: [" + calculo + "]\n");
		
		entrada.close();
		return calculo;
	}
	public static float circulo () {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("\n[Calcular área do Círculo]\n");	
		System.out.print("Digite o raio do Círculo: ");
		Integer raio = entrada.nextInt();
		
		float calculo = 3.14f * (raio * raio);
		
		System.out.println("\nA área do Círculo é: [" + calculo + "]\n");
		
		entrada.close();
		return calculo;
	}
	public static float triangulo () {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("\n[Calcular área do Triângulo]\n");
		System.out.print("Digite a base do Triângulo: ");
		float base = entrada.nextFloat();
		System.out.print("Digite a altura do Triângulo: ");
		float altura = entrada.nextFloat();
		
		float calculo = base * altura;
		
		System.out.println("\nA área do Triângulo é: [" + calculo + "]");
		
		entrada.close();
		return calculo;
	}
}
//		O seu algoritmo deve apresentar ao final da execução qual foi o nome do Objeto com a maior área bem como bem como a área deste objeto.
