package t11._pruebas;

@FunctionalInterface
 interface Operacion2 {
	public int operar(int operando1, int operando2);
}

//=============================

 class Suma2 implements Operacion2 {
	public int operar(int operando1, int operando2) {
		return operando1 + operando2;
	}
}

//=============================

 class Multiplicacion2 implements Operacion2 {
	public int operar(int operando1, int operando2) {
		return operando1 * operando2;
	}
}

//=============================

public class Main2 {
	public static void main(String[] args) {
		new Main2();
	}

	public Main2() {
		Operacion2 o;

		o = new Suma2();
		System.out.println(o.operar(5, 4)); // Sale 9

		o = new Multiplicacion2();
		System.out.println(o.operar(5, 4)); // Sale 20
	}
}
