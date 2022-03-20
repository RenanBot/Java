package fundamentos.operadores;

public class DesafioAritimetico {

	public static void main(String[] args) {
		
		int part1 = 6*(3+2);
		double part2 = Math.pow(part1, 2);
		double part3 = part2/(3*2);
		System.out.println(part3);
		
		double part4 = (1-5)*(2-7);
		double part5 = part4/2;
		double part6 = Math.pow(part5,2);
		System.out.println(part6);
		
		System.out.printf("(%.1f - %.1f)³\n", part3, part6);
		System.out.println("      10³");
		
		double part7 = (part3 - part6);
		double part8 = Math.pow(part7, 3);
		double part9 = Math.pow(10,3);
		double part10 = part8/part9;
		System.out.println(part10);

			
		
	}
}
