package Controle;

import java.util.Scanner;

public class IfElseIf {

	public static void main(String[] args) {
		
		Scanner  entrada = new Scanner (System.in);
		
		System.out.println("Digite a nota: ");
		double nota = entrada.nextDouble();
		
		if(nota > 10 || nota < 0) {
			System.out.println("Nota Invalida");
		}else if (nota >= 8.1) {
			System.out.println("Concieto A");
		}else if (nota >= 6.1) {
			System.out.println("Concieto B");
		}else if (nota >= 4.1) {
			System.out.println("Concieto C");
		}else if (nota >= 2.1) {
			System.out.println("Concieto D");
		}else {
			System.out.println("Concieto E");
		}
		
		entrada.close();
	}
}
