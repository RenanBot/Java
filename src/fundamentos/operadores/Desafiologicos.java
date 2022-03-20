package fundamentos.operadores;

public class Desafiologicos {
	
	public static void main(String[] args) {
		
		//trabalho na terça (V ou F)
		//trabalho na quinta(V ou F)
		// Se os 2 forem V compra TV 50 + Sorvete
		// Se 1 for V compra TV 32 + Sorvete
		// Se 2 for F fica em case e não toma sorvete (saudavel)
		
		boolean trabalho1 = false;
		boolean trabalho2 = false;
		
		if(trabalho1 && trabalho2) {
			System.out.println("Compramos TV 50, e tomamos sorvete");
		};
		if(trabalho1 ^ trabalho2) {
			System.out.println("Compramos TV 32 e tomamos sorvete");
		};
		if(!trabalho1 && !trabalho2) {
			System.out.println("Ficamos saudavéis por não tomar sorvete!");
		};
		
	}

}
