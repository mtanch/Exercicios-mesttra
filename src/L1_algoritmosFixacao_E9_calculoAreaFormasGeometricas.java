import java.util.Scanner;

public class L1_algoritmosFixacao_E9_calculoAreaFormasGeometricas {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Área do trapézio:");
		System.out.print("Informe o valor da base maior: ");
		Integer baseMaiorTrapezio = entrada.nextInt();
		System.out.print("Informe o valor da base menor: ");
		Integer baseMenorTrapezio = entrada.nextInt();
		System.out.print("Informe o valor da altura: ");
		Integer alturaTrapezio = entrada.nextInt();
		Double calculoAreaTrapezio = ((baseMaiorTrapezio + (double)baseMenorTrapezio) * alturaTrapezio) / 2;
		System.out.printf("A área do trapézio é: %.2f\n", calculoAreaTrapezio);
		
		
		System.out.println("\nÁrea do quadrado: ");
		System.out.print("Informe o valor de um dos lados: ");
		Integer ladoQuadrado = entrada.nextInt();
		Double calculoAreaQuadrado = (double)ladoQuadrado * ladoQuadrado;
		System.out.printf("A área do quadrado é: %.2f\n", calculoAreaQuadrado);
		
		
		System.out.println("\nÁrea do retângulo:");
		System.out.print("Informe o valor da largura: ");
		Integer larguraRetangulo = entrada.nextInt();
		System.out.print("Informe o valor da altura: ");
		Integer alturaRetangulo = entrada.nextInt();
		Double calculoAreaRetangulo = larguraRetangulo * (double)alturaRetangulo;
		System.out.printf("A área do quadrado é: %.2f\n", calculoAreaRetangulo);
		
		
		System.out.println("\nÁrea do círculo: ");
		System.out.print("Informe o valor do raio: ");
		Integer raioCirculo = entrada.nextInt();
		Double calculoAreaCirculo = 3.14 * (raioCirculo * raioCirculo);
		System.out.printf("A área do círculo é: %.2f\n", calculoAreaCirculo);
		
		
		System.out.println("\nÁrea do triângulo:");
		System.out.print("Informe o valor da base: ");
		Integer baseTriangulo = entrada.nextInt();
		System.out.print("Informe o valor da altura: ");
		Integer alturaTriangulo = entrada.nextInt();
		Double calculoAreaTriangulo = ((double)baseTriangulo * alturaTriangulo) / 2;
		System.out.printf("A área do triângulo é: %.2f", calculoAreaTriangulo);
		
		entrada.close();
	}

}
//		09. Faça um algoritmo que leia os dados necessários para calcular e exibir a área:
//			a) de um trapézio. 
//			b) de um quadrado. 
//			c) de um retangulo. 
//			d) de um círculo. 
//			e) de um triangulo