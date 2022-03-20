package fundamentos;

public class ConversaoNumericos {

	public static void main(String[] args) {
		
		double a = 1;
		System.out.println(a);
		
		float b = (float) 1.23456788889; //(CAST)
		System.out.println(b);
		
		int c = 4;
		byte d = (byte) c; // Explicita (CAST)
		System.out.println(d);
		
		double e = 1.99999;
		int f = (int) e;// Explicita (CAST)
		System.out.println(f);
		
	}
}
