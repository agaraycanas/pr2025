package t5.b.ej15;

public class MainConObjetos {

	public static void main(String[] args) {
		ejC(args);
	}

	private static void ejA(String[] args) {
		System.out.println("EJERCICIO A");
		float lado = 1.5f;
		Cuadrado cuadrado = new Cuadrado(lado);
		System.out.println("Area total:\t" + cuadrado.area() + " cm2");
		System.out.println("Precio total:\t" + cuadrado.precio() + " €");
		
	}
	
	private static void ejB(String[] args) {
		System.out.println("EJERCICIO B");
		float lado = Float.parseFloat( args[0] );
		Cuadrado cuadrado = new Cuadrado(lado);
		System.out.println("Longitud lado:\t" + lado + " cm");
		System.out.println("Area total:\t" + cuadrado.area() + " cm2");
		System.out.println("Precio total:\t" + cuadrado.precio() + " €");
	}
	
	private static void ejC(String[] args) {
		System.out.println("EJERCICIO C");
		Cuadrado[] cuadrado = new Cuadrado[args.length];
		for (int i=0;i<cuadrado.length;i++) {
			/*
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
