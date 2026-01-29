package t7.pruebas;

public class PruebaArrays {
	public static void main(String[] args) {
		int[] a = { 10, 20, 30, 40 , 50 };

		int suma = 0;
		for ( int numero : a ) {
			System.out.println(numero);
			suma += numero;
		}
		System.out.println("Total: "+suma);
	}
}
