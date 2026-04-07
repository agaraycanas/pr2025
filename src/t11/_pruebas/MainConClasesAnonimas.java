package t11._pruebas;

public class MainConClasesAnonimas {
	@FunctionalInterface
	 interface Operacion {
		public int operar(int operando1, int operando2);
	}
	
	public static void main(String[] args) {
		new MainConClasesAnonimas();
	}

	public MainConClasesAnonimas() {
		Operacion o;

		o = new Operacion() {
			public int operar(int operando1, int operando2) {
				return operando1 + operando2;
			}
		};
		
		System.out.println(o.operar(5, 4)); // Sale 9

		o = new Operacion() {
			public int operar(int operando1, int operando2) {
				return operando1 * operando2;
			}
		};
		System.out.println(o.operar(5, 4)); // Sale 20
	}
}
