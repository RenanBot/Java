package fundamentos;

public class Temperatura {

	public static void main(String[] args) {
		final double ajuste = 32;
		final double mult = 5.0/9;
		double F;
		double C;
		F = 150;
		C = (F - ajuste) * mult;
		System.out.println( F +"° Fahrenheit é = " + C + "° Celsius");
	}
}
