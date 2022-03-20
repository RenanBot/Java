package Controle;

import java.util.Scanner;

public class DesafioWhile {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		double nota = 0,total = 0,media=0;
		
		while(nota != -1) {
			System.out.println("Digite a nota do aluno");
			nota = entrada.nextDouble();
			if(nota >=0 && nota <=10) {
				total += nota;
				media++;
			}else if (nota != -1){
				System.out.println("Digite uma nota válida");
			}
		}
		media = total/media;
		
		System.out.printf("Valor total da nota %.2f \n" +
				"Valor da média %.2f", total, media);
		entrada.close();
	}

}
