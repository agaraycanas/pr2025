package t11._pruebas;

public class Main3 {
	public static void main(String[] args) {
		new Main3();
	}
	public Main3() {
		Operacion3 o;
		o = new Suma3();
		System.out.println(o.operar(5, 4)); // Sale 9
		
		o = new Multiplicacion3();
		System.out.println(o.operar(5, 4)); // Sale 20
	}
}
