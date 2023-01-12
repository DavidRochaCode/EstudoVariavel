package recursao.fibonacci;

public class FibonacciCalcular {
	
	/*Escreva um método recursivo que calcule e retorne o N-ésimo
	 * termo da sequência Fibonacci. Alguns número desta sequência
	 * são: 0,1,1,2,3,5,8,13,21,34,55,89*/
	
	private static int[]armazenaNumeros = new int[20];
	
	public static void finobacciSemRecursao() {
		armazenaNumeros[0] = 1;
		armazenaNumeros[1] = 1;
		for(int i = 0; i < (armazenaNumeros.length)-2; i++) {
			armazenaNumeros[2+i] = armazenaNumeros[i] + armazenaNumeros[i+1];
			System.out.println(armazenaNumeros[i]);
	}
		
}
	
	
	public static void fibonacciComRecursao() {
		
	}
	
}
