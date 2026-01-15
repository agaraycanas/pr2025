package t5.b.ej15;

public class MainSinObjetos {

	public static void main(String[] args) {
		System.out.println("SIN OBJETOS");
		System.out.println("================");
		ejA(args);
		System.out.println("================");
		ejB(args);
		System.out.println("================");
		ejC(args);
	}
	
	public static void ejA(String[] args) {
		System.out.println("EJERCICIO A");
		float lado = 1.5f;
		final float PRECIO_POR_CM2 = 150;
		System.out.println("Longitud lado:\t" 	+ lado 						+ " cm");
		System.out.println("Area total:\t" 		+ lado*lado 				+ " cm2");
		System.out.println("Precio total:\t" 	+ lado*lado*PRECIO_POR_CM2 	+ " €");
	}
	public static void ejB(String[] args) {
		System.out.println("EJERCICIO B");
		float lado = args.length>0 ? Float.parseFloat( args[0] ) : 0;
		final float PRECIO_POR_CM2 = 150;
		System.out.println("Longitud lado:\t" 	+ lado 						+ " cm");
		System.out.println("Area total:\t" 		+ lado*lado 				+ " cm2");
		System.out.println("Precio total:\t" 	+ lado*lado*PRECIO_POR_CM2 	+ " €");
	}
	public static void ejC(String[] args) {
		System.out.println("EJERCICIO C");
		final float PRECIO_POR_CM2 = 150;
		float[] ladosCuadrado = new float[args.length];
		for (int i=0;i<ladosCuadrado.length;i++) {
			ladosCuadrado[i] = Float.parseFloat(args[i]);
		}
		float areaTotal = 0;
		float precioTotal = 0;
		for (int i=0;i<ladosCuadrado.length;i++) {
			areaTotal 	+=  ladosCuadrado[i] * ladosCuadrado[i];
			precioTotal +=  ladosCuadrado[i] * ladosCuadrado[i] * PRECIO_POR_CM2;
		}
		System.out.println("Area total:\t" 	+ areaTotal 	+ " cm2");
		System.out.println("Precio total:\t" + precioTotal 	+ " €");	
	}
}
