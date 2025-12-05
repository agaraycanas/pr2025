package t5.a.ej10;

import java.util.Random;

public class Ej10 {
	public static void main(String[] args) {
		Random r = new Random();
		int azar = r.nextInt(1, 7);
		System.out.println("Resultado: " + azar);
	}
}
