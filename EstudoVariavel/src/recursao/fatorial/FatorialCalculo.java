package recursao.fatorial;

public class FatorialCalculo {
	
	public static int calculo(int num) {
		
		if(num == 1 || num == 0) {
			return 1;	
		}	
		return num*(calculo(num-1));
	}
	
}
