package fundamentos;

public class NotacaoPonto {
	
	public static void main(String[] args) {
		
		int a = 23;
		String s = "Bom dia X";
		s = s.replace("X" , "Senhora" );
		s = s.concat("!!!!");
		s = s.toUpperCase();
		
		System.out.printf("%s %d",s,a);
	}

}
