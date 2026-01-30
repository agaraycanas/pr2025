package t7.pruebas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;

public class PruebasOrdenamiento {

	public static void main(String[] args) {
		ArrayList<String> palabras = new ArrayList<String>();
		palabras.add("Una");
		palabras.add("dola");
		palabras.add("tela");
		palabras.add("catola");
		palabras.add("Quila");
		palabras.add("quilete");
		
		
		System.out.println(palabras);
		Collections.sort(palabras,String.CASE_INSENSITIVE_ORDER);
		System.out.println(palabras);
		Collections.reverse(palabras);
		System.out.println(palabras);
		
	}

}
