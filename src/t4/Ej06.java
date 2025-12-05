package t4;

public class Ej06 {
	public static void main(String[] args) {
		String[] a = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K"};
		int incremento = 4;

		for (int i = 0; i < a.length; i+=incremento) {
			System.out.print(a[i] + " ");
		}
	}

}
