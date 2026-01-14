package t5.b.ej15;

public class MainSinObjetos {

	private static float areaTotal(float[] arrayLados) {
		float areaAcumulada = 0f;
		for (int i=0;i<arrayLados.length;i++) {
			float areaCuadrado = (float)Math.pow( arrayLados[i] , 2);
			areaAcumulada += areaCuadrado;
		}
		return areaAcumulada;
	}

	private static float precioTotal(float areaTotal) {
		final int PRECIO_POR_CM_CUADRADO = 150;
		return areaTotal * PRECIO_POR_CM_CUADRADO;
	}
	
	private static void rellenarDatos(float[] arrayDelongitudesDelLadosDelCuadrado,String[] args) {
		for (int i =0;i<args.length;i++) {
			arrayDelongitudesDelLadosDelCuadrado[i] = Float.parseFloat( args[i] );
		}		
	}

	public static void main(String[] args) {
		float arrayDelongitudesDelLadosDelCuadrado[] = new float[args.length];
		rellenarDatos(arrayDelongitudesDelLadosDelCuadrado,args);
		
		System.out.println("Area total: " + areaTotal(arrayDelongitudesDelLadosDelCuadrado) + " cm2");
		System.out.println("Precio total: " + precioTotal(areaTotal(arrayDelongitudesDelLadosDelCuadrado)) + "€");
	}



}
