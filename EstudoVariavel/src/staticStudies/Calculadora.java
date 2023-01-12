package staticStudies;

public class Calculadora {
	/*Escreva uma classe Calculadora que tenha os seguintes métodos:
	 * soma,subtrair,multiplicar, dividir(dois números), elevar à potencia n.
	 * Desenvolva um programa para testar essa classe*/

	;
	public static int somar(int numero1, int numero2) {
		return numero1+numero2;
	} 
	
	public static int subtrair(int numero1, int numero2) {
		return numero1-numero2;
	} 
	
	public static int multiplicar(int numero1, int numero2) {
		return numero1*numero2;
	} 
	
	public static int dividir(int numero1, int numero2) {
		return numero1/numero2;
	} 
	
	public static int elevarPotencia(int numero1, int numero2) {
		int potencia = 1;
		while(numero2>0) {
			potencia = potencia*numero1;
			numero2--;
		}
		return potencia;
	} 
}
