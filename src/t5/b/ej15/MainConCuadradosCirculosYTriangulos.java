package t5.b.ej15;

public class MainConCuadradosCirculosYTriangulos { // EJERCICIO g

	public static void main(String[] args) {
		System.out.println("CON CUADRADOS, TRIÁNGULOS EQ. Y CÍRCULOS MEZCLADOS");

		Cuadrado[] 				cuadrado 	= 	new Cuadrado				[args.length/2];
		Circulo[] 				circulo 	= 	new Circulo					[args.length/2];
		TrianguloEquilatero[] triangulo 	= 	new TrianguloEquilatero		[args.length/2];
		
		int sigCuadrado 	= 0;
		int sigCirculo 		= 0;
		int sigTriangulo 	= 0;
		
		for (int i=0;i<args.length;i+=2) {
			if (args[i].equals("cu")) {
				cuadrado[ sigCuadrado ] = new Cuadrado(Float.parseFloat(args[i+1]));
				sigCuadrado++;
			}
			if (args[i].equals("ci")) {
				circulo[ sigCirculo ] = new Circulo(Float.parseFloat(args[i+1]));
				sigCirculo++;
			}
			if (args[i].equals("tr")) {
				triangulo[ sigTriangulo] = new TrianguloEquilatero(Float.parseFloat(args[i+1]));
				sigTriangulo++;
			}
		}
		
		float areaTotal 	= 0;
		float precioTotal 	= 0;
		
		for (int i=0;i<cuadrado.length;i++) {
			if (cuadrado[i]!=null) {
				areaTotal 	+=  cuadrado[i].area();
				precioTotal +=  cuadrado[i].precio();
			}
		}
		
		for (int i=0;i<circulo.length;i++) {
			if (circulo[i]!=null) {
				areaTotal 	+=  circulo[i].area();
				precioTotal +=  circulo[i].precio();
			}
		}

		for (int i=0;i<triangulo.length;i++) {
			if (triangulo[i]!=null) {
				areaTotal 	+=  triangulo[i].area();
				precioTotal +=  triangulo[i].precio();
			}
		}
		
		
		System.out.println("Area total: " 	+ areaTotal 	+ " cm2");
		System.out.println("Precio total: " + precioTotal 	+ " €");
	}
}
