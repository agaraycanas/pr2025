package pruebas.abstractas;

public class Main {
	public static void main(String[] args) {
		ClaseAbstracta ca = new ClaseConcreta();
		ca.metodoConcreto();
		ca.metodoAbstracto();
	}
}
