package t5.b.ej11;

public class Prueba {
	/* Conseguir esta figura

			**
			****
			******
			    **
			  ****
			******

	 */
	public static void main(String[] args) {
		Lineas l = new Lineas(".");
		l.linea(2);
		l.linea(4);
		l.linea(6);
		l.linea(4, 2);
		l.linea(2, 4);
		l.linea(0, 6);
	}
}
