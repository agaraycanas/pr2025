package t11._pruebas;

public class MainConClasesInternas {
	@FunctionalInterface
	 interface Operacion {
		public int operar(int operando1, int operando2);
	}
	 class Suma implements Operacion {
			public int operar(int operando1, int operando2) {
				return operando1 + operando2;
			}
		}
	
	 class Multiplicacion implements Operacion {
			public int operar(int operando1, int operando2) {
				return operando1 * operando2;
			}
		}
	
	public static void main(String[] args) {
		new MainConClasesInternas();
	}

	public MainConClasesInternas() {
		Operacion o;

		o = new Suma();
		System.out.println(o.operar(5, 4)); // Sale 9

		o = new Multiplicacion();
		System.out.println(o.operar(5, 4)); // Sale 20
	}
}
