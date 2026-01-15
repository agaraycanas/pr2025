package t5.b.ej15;

public class MainConCuadrados {

	public static void main(String[] args) {
		System.out.println("CON CUADRADO");
		System.out.println("================");
		ejA(args);
		System.out.println("================");
		ejB(args);
		System.out.println("================");
		ejC(args);
		System.out.println("================");
	}

	private static void ejA(String[] args) {
		System.out.println("EJERCICIO A");
		float lado = 1.5f;
		Cuadrado cuadrado = new Cuadrado(lado);
		System.out.println("Longitud lado:\t" + lado + " cm");
		System.out.println("Area total:\t" + cuadrado.area() + " cm2");
		System.out.println("Precio total:\t" + cuadrado.precio() + " €");
		
	}
	
	private static void ejB(String[] args) {
		System.out.println("EJERCICIO B");
		float lado = args.length>0 ? Float.parseFloat( args[0] ) : 0;
		Cuadrado cuadrado = new Cuadrado(lado);
		System.out.println("Longitud lado:\t" + lado + " cm");
		System.out.println("Area total:\t" + cuadrado.area() + " cm2");
		System.out.println("Precio total:\t" + cuadrado.precio() + " €");
	}
	
	private static void ejC(String[] args) {
		System.out.println("EJERCICIO C");
		Cuadrado[] cuadrado = new Cuadrado[args.length];
		for (int i=0;i<cuadrado.length;i++) {
			/* ESTE BLOQUE ES IDÉNTICO A lA LINEA ÚNICA DEL BUCLE
			String ladoString = args[i];
			float ladoFloat = Float.parseFloat(ladoString);
			Cuadrado c = new Cuadrado(ladoFloat);
			cuadrado[i] = c;
			*/
			cuadrado[i] = new Cuadrado(Float.parseFloat(args[i]));
		}
		float areaTotal = 0;
		float precioTotal = 0;
		for (int i=0;i<cuadrado.length;i++) {
			areaTotal 	+=  cuadrado[i].area();
			precioTotal +=  cuadrado[i].precio();
		}
		System.out.println("Area total: " 	+ areaTotal 	+ " cm2");
		System.out.println("Precio total: " + precioTotal 	+ " €");
	}
	

}
