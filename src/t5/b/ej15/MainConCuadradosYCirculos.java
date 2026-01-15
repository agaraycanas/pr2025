package t5.b.ej15;

public class MainConCuadradosYCirculos { // EJERCICIO f

	public static void main(String[] args) {
		System.out.println("CON CUADRADOS Y CIRCULOS MEZCLADOS");

		Cuadrado[] 	cuadrado = new Cuadrado[args.length/2];
		Circulo[] 	circulo = new Circulo[args.length/2];
		int sigCuadrado = 0;
		int sigCirculo = 0;
		
		for (int i=0;i<args.length;i+=2) {
			if (args[i].equals("cu")) {
				cuadrado[ sigCuadrado ] = new Cuadrado(Float.parseFloat(args[i+1]));
				sigCuadrado++;
			}
			if (args[i].equals("ci")) {
				circulo[ sigCirculo ] = new Circulo(Float.parseFloat(args[i+1]));
				sigCirculo++;
			}
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
