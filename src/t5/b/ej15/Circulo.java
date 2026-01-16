package t5.b.ej15;

public class Circulo extends FiguraGeometrica {
	// ATRIBUTOS
		private final int PRECIO_POR_CM_CUADRADO = 150;
		private final float PI = 3.141592f;
		private float radio; // Longitud del radio en cm. 

		//MÉTODOS
	public Circulo(float radio) {
		this.radio= radio;
	}
	public float getRadio() {
		return this.radio;
	}
	public float area() {
		return  this.PI * this.radio * this.radio;
	}
	public float precio() {
		return this.PRECIO_POR_CM_CUADRADO * this.area();
	}
}
