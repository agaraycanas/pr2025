package pruebas.musicos;

public class Guitarra implements IInstrumento{
	public void rasgar() {
		System.out.println("TRIANG");
	}
	
	public void accionar() {
		this.rasgar();
	}
	
}
