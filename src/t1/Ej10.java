package t1;


public class Ej10 {
	public static void f(int dato) {
		dato = dato +10;
		System.out.println(dato);
	}
	
	public static void main(String[] args) {
		int dato = 100;
		System.out.println(dato);
		f(dato);
		System.out.println(dato);
	}
	
}
