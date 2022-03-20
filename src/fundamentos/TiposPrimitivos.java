package fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		// informações de funcionarios
		
		// tipos numericos de inteiros
		byte anosDeEmpresa = 23;
		short numerosDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_134_845_223L;
		
		//Tipos numericos reais
		
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		// tipo booleano
		boolean estaDeFerias = false; // true
		
		// Tipo caractere
		
		char status  = 'A'; // Atuivo
				
		System.out.println(anosDeEmpresa * 365);
		System.out.println(numerosDeVoos/2);
		System.out.println(pontosAcumulados/vendasAcumuladas);
		System.out.println(id + ": Ganha -->" +salario);
		System.out.println("Ferias? " + estaDeFerias);
		System.out.println("Status: " + status);
		
		
		
				
				
				
		
		
		
		
	}
}
