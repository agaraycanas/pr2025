package t5.b.ej15;

public class Main {

	private static float areaTotal(float longitudDelLadoDelCuadrado) {
		return (float)Math.pow(longitudDelLadoDelCuadrado, 2);
	}
	
	private static float precioTotal(float areaTotal) {
		final int  	PRECIO_POR_CM_CUADRADO= 150;
		return areaTotal * PRECIO_POR_CM_CUADRADO;
	}
	
	public static void main(String[] args) {
		if (args.length == 1) {
			float 		longitudDelLadoDelCuadrado = Float.parseFloat( args[0] );
			System.out.println("Area total: " + areaTotal(longitudDelLadoDelCuadrado) + " cm2");
			System.out.println("Precio total: " + precioTotal(areaTotal(longitudDelLadoDelCuadrado)) + "€");
		} 
		else {
			System.out.println("Debes introducir UN argumento de entrada");
		}
	}

	

}
