package t11._pruebas;

import java.util.function.BiFunction;

public class MainConExpresionesLambdaEInterfacesFuncionalesPredefinidas {

	public static void main(String[] args) {
		new MainConExpresionesLambdaEInterfacesFuncionalesPredefinidas();
	}

	public MainConExpresionesLambdaEInterfacesFuncionalesPredefinidas() {
		BiFunction<Integer, Integer, Integer> o;
		o = (s1, s2) -> s1 + s2;
		System.out.println(o.apply(20, 4)); // Sale 24

		o = (m1, m2) -> m1 * m2;
		System.out.println(o.apply(20, 4)); // Sale 80

		o = (m1, m2) -> m1 / m2;
		System.out.println(o.apply(20, 4)); // Sale 5
	}
}
