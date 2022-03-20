package Controle;

public class BreakContinue {

	public static void main(String[] args) {	
		// pode rotular o brak e o continue dando nome
		//ao laço por exemplo 
		//Externo: for()... break externo.
		
		
		for(int i = 1; i <=10; i++) {
			if(i ==5) continue;
			System.out.println(i);
		}
	}
}
