package t05.b.ej15;

public class Cuadrado  extends FiguraGeometrica {
	// ATRIBUTOS
	private final int PRECIO_POR_CM_CUADRADO = 150;
	private float lado; // Longitud del lado en cm. 
	
	//MÉTODOS
	public Cuadrado(float lado) {
		this.lado = lado;
	}
	public float getLado() {
		return this.lado;
	}
	
	public float area() {
		return this.lado*this.lado;
	}
	
	public float precio() {
		return this.PRECIO_POR_CM_CUADRADO * this.area();
	}
	public void cosasDeCuadrados() {
		
	}
}
