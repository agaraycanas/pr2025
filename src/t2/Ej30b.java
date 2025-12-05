package t2;

public class Ej30b {
	public static long factorial(long n) {
		long solucion = 1;
		for (long i=2;i<=n;i++) {
			solucion = solucion * i;
		}
		return solucion;
	}

	public static void main(String[] args) {
		for (long i=10;i<=30;i++) {
			System.out.println(i +"! = " + factorial(i));
		}
	}

}
