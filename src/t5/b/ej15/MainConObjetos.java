package t5.b.ej15;

public class MainConObjetos {

	public static void main(String[] args) {
		Cuadrado[] arrayDeCuadrados = new Cuadrado[args.length];
		rellenarDatos(arrayDeCuadrados,args);
		
	}

	private static void rellenarDatos(Cuadrado[] arrayDeCuadrados, String[] args) {
		for (int i =0;i<args.length;i++) {
			arrayDeCuadrados[i] =  new Cuadrado( Float.parseFloat( args[i] ) );
		}	
	}

}
