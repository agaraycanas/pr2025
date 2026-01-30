package t7.pruebas;

public class EjemplosPrintf {
	public static void main(String[] args) {
		int a=1;
		float b = 2.3f;
		String moneda = "€";
		
		System.out.println("números "+a+" y el "+b+". Qué bien");
		System.out.printf( "números %3$d y el %2$.2f. Qué bien. Cuántos %1$s tengo%n",moneda,b,a);
		System.out.printf( "números %d y el %.2f. Qué bien. Cuántos %s tengo",a,b,moneda);
	}
}
