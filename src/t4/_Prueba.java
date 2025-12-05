package t4;

public class _Prueba {
	public static void main(String[] args) {
		final int NUMVECES = 20;
		final int NUM_CARAS = 4;
		
		for (int i = 0; i < NUMVECES; i++) {
			double miDouble = Math.random();
			miDouble = miDouble*NUM_CARAS;
			int miEntero = (int)miDouble;
			miEntero = miEntero +1;
			System.out.println(miEntero);
		}
		
	}
}
