package t5.b.ej15;

public class MainConFigurasGeometricas { // EJERCICIO h

	public static void main(String[] args) {
		System.out.println("CON FIGURAS GEOMÉTRICA MEZCLADAS");

		FiguraGeometrica[] figura = 	new FiguraGeometrica[args.length/2];
			
		for (int i=0;i<args.length;i+=2) {
			FiguraGeometrica f = null;
			
			if (args[i].equals("cu")) {
				f = new Cuadrado(Float.parseFloat(args[i+1]));
			}
			if (args[i].equals("ci")) {
				f = new Circulo(Float.parseFloat(args[i+1]));
			}
			if (args[i].equals("tr")) {
				f = new TrianguloEquilatero(Float.parseFloat(args[i+1]));
			}
			
			
			figura[ i/2 ] = f;
		}
		
		float areaTotal 	= 0;
		float precioTotal 	= 0;
		
		for (int i=0;i<figura.length;i++) {
			areaTotal 	+=  figura[i].area();
			precioTotal +=  figura[i].precio();
		}
		
		System.out.println("Area total: " 	+ areaTotal 	+ " cm2");
		System.out.println("Precio total: " + precioTotal 	+ " €");
	}
}
