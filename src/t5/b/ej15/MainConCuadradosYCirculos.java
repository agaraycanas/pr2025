package t5.b.ej15;

public class MainConCuadradosYCirculos { // EJERCICIO f

	public static void main(String[] args) {
		System.out.println("CON CUADRADOS Y CIRCULOS MEZCLADOS");

		Cuadrado[] cuadrado = new Cuadrado[args.length/2];
		for (int i=0;i<args.length;i+=2) {
			if (args[i].equals("cu")) {
				cuadrado[i/2] = new Cuadrado(Float.parseFloat(args[i+1]));
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
