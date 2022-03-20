package fundamentos;

import java.util.Scanner;

public class console {

	public static void main(String[] args) {
		
		// System.out.print(); imprime na mesma linha
		//System.out.println(); imprime na linha e quebra a prox
		//System.out.printf(); imprime fortado %s,%d,%f
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.println("Digite o seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		System.out.println("Digite o sua idade: ");
		int idade = entrada.nextInt();
		
		System.out.println("Digite o seu peso: ");
		int peso = entrada.nextInt();
		
		System.out.printf("Seu nome é %s %s sua idade é %d anos\nSeu Peso %d",
				nome,sobrenome,idade, peso);
		
		entrada.close();
	}
}
