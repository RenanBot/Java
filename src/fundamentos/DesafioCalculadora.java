package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	
	public static void main(String[] args) {
		//ler num 1
		//ler num 2
		// + - * /
		//Mostrar a resposta
		
		Scanner entrada = new Scanner(System.in);
				
		System.out.println("Digite o primeiro numero");
		double num1 = entrada.nextDouble();
		
		System.out.println("Digite o Segundo numero");
		double num2 = entrada.nextDouble();
		
		System.out.println("Digite a opeação: ");
		String operacao =  entrada.next();
		
		
		double resposta = "+".equals(operacao) ? num1 + num2: 0;
		resposta = "-".equals(operacao) ? num1 - num2: resposta;
		resposta = "*".equals(operacao) ? num1 * num2: resposta;
		resposta = "/".equals(operacao) ? num1 / num2: resposta;
		resposta = "%".equals(operacao) ? num1 % num2: resposta;
		
		
		System.out.printf("%.2f %s %f = %.2f", num1, operacao, num2, resposta);
		
		entrada.close();
	}

}
