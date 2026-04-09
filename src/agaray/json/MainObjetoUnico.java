package agaray.json;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

//=========================================
public class MainObjetoUnico {
	public static void main(String[] args) throws IOException {
		guardar("Ana",180);
		recuperarYMostrar();
	}
	private static void recuperarYMostrar() throws IOException {
		String datosJSON = Files.readString(Path.of("datos.json"));
		Gson gson = new Gson();
		Persona p1 = gson.fromJson(datosJSON, Persona.class);
		System.out.println(p1);
	}

	private static void guardar(String nombre, int estatura) throws IOException {
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		Persona p1 = new Persona(nombre,estatura);
		//System.out.println(p1);
		//System.out.println(gson.toJson(p1));
		Files.writeString(Path.of("datos.json"), gson.toJson(p1));
	}

}
