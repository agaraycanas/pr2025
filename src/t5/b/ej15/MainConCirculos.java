package t5.b.ej15;

public class MainConCirculos {

	public static void main(String[] args) {
		System.out.println("CON CÍRCULOS");
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
		float radio = 1.5f;
		Circulo circulo = new Circulo(radio);
		System.out.println("Longitud radio:\t" + radio + " cm");
		System.out.println("Area total:\t" + circulo.area() + " cm2");
		System.out.println("Precio total:\t" + circulo.precio() + " €");
		
	}
	
	private static void ejB(String[] args) {
		System.out.println("EJERCICIO B");
		float radio = args.length>0 ? Float.parseFloat( args[0] ) : 0;
		Circulo circulo = new Circulo(radio);
		System.out.println("Longitud radio:\t" + radio + " cm");
		System.out.println("Area total:\t" + circulo.area() + " cm2");
		System.out.println("Precio total:\t" + circulo.precio() + " €");
	}
	
	private static void ejC(String[] args) {
		System.out.println("EJERCICIO C");
		Circulo[] circulo = new Circulo[args.length];
		for (int i=0;i<circulo.length;i++) {
			circulo[i] = new Circulo(Float.parseFloat(args[i]));
		}
		float areaTotal = 0;
		float precioTotal = 0;
		for (int i=0;i<circulo.length;i++) {
			areaTotal 	+=  circulo[i].area();
			precioTotal +=  circulo[i].precio();
		}
		System.out.println("Area total: " 	+ areaTotal 	+ " cm2");
		System.out.println("Precio total: " + precioTotal 	+ " €");
	}
	

}
