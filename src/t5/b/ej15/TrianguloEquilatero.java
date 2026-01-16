package t5.b.ej15;

public class TrianguloEquilatero  extends FiguraGeometrica  {
	// ATRIBUTOS
	private final int PRECIO_POR_CM_CUADRADO = 150;
	private float lado; // Longitud del lado en cm. 
	
	//MÉTODOS
	public TrianguloEquilatero(float lado) {
		this.lado = lado;
	}
	public float getLado() {
		return this.lado;
	}
	public float area() {
		return 0.43f * this.lado * this.lado;
	}
	public float precio() {
		return this.PRECIO_POR_CM_CUADRADO * this.area();
	}
}
