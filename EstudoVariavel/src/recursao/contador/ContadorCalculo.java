package recursao.contador;

public class ContadorCalculo {
	/*Faça um programa que conte até um valor estipulado, usando recursividade*/
	
	public static int contar(int minimo, int maximo) {
		System.out.println(minimo);
		
		if(minimo==maximo) {
			return 0;
		}
		return contar(minimo +1, maximo);
	}
	
	
	
	
}