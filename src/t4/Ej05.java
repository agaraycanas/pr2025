package t4;

public class Ej05 {
	public static boolean esImpar(int numero) {
		return numero%2==1;
	}

	public static void main(String[] args) {
		String[] a = { "A", "B", "C", "D" };
		
		for (int i=1;i<a.length;i++) {
			if (esImpar(i) ) {
				System.out.print(a[i] + " ");
			}
		}
	}

}
