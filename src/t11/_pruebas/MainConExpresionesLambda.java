package t11._pruebas;

public class MainConExpresionesLambda {
	@FunctionalInterface
	 interface Operacion {
		public int operar(int operando1, int operando2);
	}
	
	public static void main(String[] args) {
		new MainConExpresionesLambda();
	}

	public MainConExpresionesLambda() {
		Operacion o;

		/*
		o = new Operacion() {
			public int operar(int operando1, int operando2) {
				return operando1 + operando2;
			}
		};
		*/
		o = (operando1,operando2) -> operando1 + operando2;
		System.out.println(o.operar(5, 4)); // Sale 9

		o = (m1,m2) -> m1*m2;
		System.out.println(o.operar(5, 4)); // Sale 20
		
		o = (m1,m2) -> m1/m2;
		System.out.println(o.operar(20, 4)); // Sale 5
	}
}
