package t7.pruebas;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		Set<String> 	conjunto	= new TreeSet<String>();

		conjunto.add("burro");
		conjunto.add("a");
		conjunto.add("disco");
		
		System.out.println(conjunto);
		
		System.out.println("===============");
		conjunto.add("carro");
		conjunto.add("amigo");
		System.out.println(conjunto);
		
		
		
	}

}
