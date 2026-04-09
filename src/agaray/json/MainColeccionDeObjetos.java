package agaray.json;

import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

//=========================================
public class MainColeccionDeObjetos {

	public static void main(String[] args) throws IOException {
		//String[] datosDeEntrada = {"Ana","180", "Pepe", "165", "Juana", "200"};
		guardar(args);
		recuperarYMostrar();
	}

	private static void recuperarYMostrar() throws IOException {
		String datosJSON = Files.readString(Path.of("src/ej01/datos.json"));
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		
		Type tipoLista = 
				new TypeToken<List<Persona>>(){}.getType();
		
		List<Persona> personas = gson.fromJson(datosJSON, tipoLista);
		System.out.println(personas);
		
		System.out.println(
			personas
				.stream()
				//.filter( p -> p.getEstatura() < 160)
				.sorted( Comparator.reverseOrder())
				.collect(Collectors.toList())
		);
	}

	private static void guardar(String[] datos) throws IOException {
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		List<Persona> personas = new ArrayList<>();
		for (int i=0;i<datos.length;i+=2) {
			personas.add(
					new Persona( datos[i], Integer.parseInt(datos[i+1]) )
			);
		}
		String cadenaJSON = gson.toJson(personas);
		Files.writeString(Path.of("src/ej01/datos.json"), cadenaJSON);
	}

}
