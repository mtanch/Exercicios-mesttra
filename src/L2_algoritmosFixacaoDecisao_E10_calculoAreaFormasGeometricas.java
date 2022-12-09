import java.util.Scanner;
public class L2_algoritmosFixacaoDecisao_E10_calculoAreaFormasGeometricas {
	public static void main(String[] args) {
		
	    float trapezio, quadrado, retangulo, circulo, triangulo;
	    float maior = 0;
	    String nomeMaior = "";
	    
	    System.out.println("CALCULO DE �REA: ");
	    
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
	    
	    System.out.printf("O objeto com a maior �rea � o %s com %.2f de �rea.", nomeMaior, maior);
	    
	  }
	
	public static float trapezio () {
		Scanner entrada = new Scanner(System.in);
		System.out.println("\n[Calcular �rea do Trap�zio]\n");
		System.out.print("Digite o valor da Base Maior: ");
		float baseMaior = entrada.nextFloat();
		System.out.print("Digite o valor da Base Menor: ");
		float baseMenor = entrada.nextFloat();			
		System.out.print("Digite o valor da Altura: ");
		float altura = entrada.nextFloat();
		
		float calculo = (baseMaior + baseMenor) * altura;
		
		System.out.println("\nA �rea do Trap�zio �: [" + calculo + "]\n");
		
		entrada.close();
		return calculo;
	}
	public static float quadrado () {
		Scanner entrada = new Scanner(System.in);
	
		System.out.println("\n[Calcular �rea do Quadrado]\n");
		System.out.print("Digite um dos lados do Quadrado: ");
		float ladoQuadrado = entrada.nextFloat();
		
		float calculo = ladoQuadrado * ladoQuadrado;
		
		System.out.println("\nA �rea do Quadrado �: [" + calculo + "]\n");
		
		entrada.close();
		return calculo;
	}
	public static float retangulo () {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("\n[Calcular �rea do Ret�ngulo]\n");
		System.out.print("Digite a largura do Ret�ngulo: ");
		float largura = entrada.nextFloat();
		System.out.print("Digite a altura do Ret�ngulo: ");
		float altura = entrada.nextFloat();
		
		float calculo = largura * altura;
		
		System.out.println("\nA �rea do Ret�ngulo �: [" + calculo + "]\n");
		
		entrada.close();
		return calculo;
	}
	public static float circulo () {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("\n[Calcular �rea do C�rculo]\n");	
		System.out.print("Digite o raio do C�rculo: ");
		Integer raio = entrada.nextInt();
		
		float calculo = 3.14f * (raio * raio);
		
		System.out.println("\nA �rea do C�rculo �: [" + calculo + "]\n");
		
		entrada.close();
		return calculo;
	}
	public static float triangulo () {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("\n[Calcular �rea do Tri�ngulo]\n");
		System.out.print("Digite a base do Tri�ngulo: ");
		float base = entrada.nextFloat();
		System.out.print("Digite a altura do Tri�ngulo: ");
		float altura = entrada.nextFloat();
		
		float calculo = base * altura;
		
		System.out.println("\nA �rea do Tri�ngulo �: [" + calculo + "]");
		
		entrada.close();
		return calculo;
	}
}
//		O seu algoritmo deve apresentar ao final da execu��o qual foi o nome do Objeto com a maior �rea bem como bem como a �rea deste objeto.
