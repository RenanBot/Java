package fundamentos;

public class TipoString {
	
	public static void main(String[] args) {
		System.out.println("Ola, pessoal".charAt(5));
		
		String s = "Boa tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.startsWith("boa"));
		
		var nome = "Gabriel";
		var sobrenome = "Perao Souza";
		var idade = 1;
		var salario = 12345.88;
		System.out.printf("\nNome: %s %s %d Mês R$ %.2f", nome, sobrenome, idade, salario);
		String frase = String.format("\nNome: %s %s %d Mês R$ %.2f",
				nome, sobrenome, idade, salario);
		
		System.out.println(frase);	
	}

}
