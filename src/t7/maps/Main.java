package t7.maps;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;

public class Main {

	public static void main(String[] args) {
		HashMap<String, String> cantantesFavoritos = new HashMap<>();

		cantantesFavoritos.put("Ana", "Joselito");
		cantantesFavoritos.put("Pepe", "Pimpinela");
		cantantesFavoritos.put("Juan", "J.L.Perales");
		cantantesFavoritos.put("Amalia", "La Pantoja");
		System.out.println(cantantesFavoritos);

		// Listar el contenido del Map poniendo un mensaje del estilo...
		// El cantante favorito de <Nombre_persona> es <Cantante_favorito> (uno por
		// linea)

		System.out.println("===================================");
		for (String nombreCantante : cantantesFavoritos.values()) {
			System.out.println("A alguien le gusta " + nombreCantante);
		}

		System.out.println("===================================");

		for (String nombrePersona : cantantesFavoritos.keySet()) {
			System.out.println(
					"El cantante favorito de " + 
					nombrePersona + 
					" es " + 
					cantantesFavoritos.get(nombrePersona)
				);
		}
			System.out.println("===================================");
		
			for (Entry<String, String> personaCantante : cantantesFavoritos.entrySet()) {
				System.out.println(
					"El cantante favorito de " + 
					personaCantante.getKey() +  
				    " es " +
					personaCantante.getValue()
				);
			}
	}
}
