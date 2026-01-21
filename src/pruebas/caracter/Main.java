package pruebas.caracter;

public class Main {
	public static void main(String[] args) {
		String[] palabra = { "pneumonoultramicroscopicsilicovolcanoconiosis","supercalifragilisticioexpialidoso","gato", "patito", "perrito", "perro", "prestidigitador", "esternocleidomastoideo" };
		int limite = 1;
		for ( int i=0 ; i<palabra.length ; i++) {
			if ( palabra[i].length()  > limite ) {
				System.out.println(  palabra[i] + "(" + palabra[i].length()  + ")");
			}
		}
	}
}
