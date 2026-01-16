package t5.b.ej15;

public abstract class FiguraGeometrica {
	public abstract float area();
	public abstract float precio();
	public void cosasDeFiguras() {}
}

/*
 * Si todos los métodos de esta clase fueran abstractos
 * sería mejor utilizar una interface así..
 * 
 * public interface FiguraGeometrica {
 * 	public  float area();
	public  float precio();
 * }
 */
