package pruebas.musicos;

public class Triangulo implements IInstrumento {
	public void accionar() {
		this.percutir();
	}
	public void percutir() {
		System.out.println("TIN TIN");
	}
}
