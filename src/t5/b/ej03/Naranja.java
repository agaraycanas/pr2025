package t5.b.ej03;

public class Naranja {
	private int peso;
	//===============================
	public Naranja( int peso ) {
		this.peso = peso;
	}
	public void comer() {
		System.out.println("mmm..qué rica naranja");
	}
	
	// Añadido desde el Ej09
	public int getPeso() {
		return this.peso;
	}
}