package t2;

public class Ej26 {

	public static boolean primo(int n) {
		boolean solucion = true;
		for (int i=2; i<n; i++) {
			if (n % i == 0) {
				solucion = false;
			}
		}
		return solucion;
	}
	
	public static void main(String[] args) {
		for (int i=2;i<=100;i++) {
			if (primo(i)) {
				System.out.print( i+" ");
			}
		}
	}

}
