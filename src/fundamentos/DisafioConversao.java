package fundamentos;

import java.util.Locale;
import java.util.Scanner;

public class DisafioConversao {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Locale.setDefault(new Locale("pt", "BR"));
		Locale.setDefault(new Locale("en", "US"));
		
		System.out.println("Digite o primeiro salario: ");
		String salario1 = entrada.nextLine().replace(",", ".");
		
		System.out.println("Digite o segundo salario: ");
		String salario2 = entrada.nextLine().replace(",", ".");
		
		System.out.println("Digite o terceiro salario: ");
		String salario3 = entrada.nextLine().replace(",", ".");
		
		double sal1 =(float) Double.parseDouble(salario1);
		double sal2 = (float) Double.parseDouble(salario2);
		double sal3 = (float) Double.parseDouble(salario3);
		
		double soma = sal1 + sal2 + sal3;
		double media = soma/3;
		
		System.out.printf("A soma do salario é R$ %.2f \n"
				+ "A média do salario é R$ %.2f" ,soma, media);	
		
		entrada.close();
		
	}

}
