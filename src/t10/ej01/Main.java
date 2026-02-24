package t10.ej01;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {

	public static void main(String[] args) {
		String carpeta = "src/t10/ej01/";
		Path ruta = Path.of(carpeta+"prueba.txt");
		String contenido = "";
		for (  String dato : args ) {
			contenido += (dato + " ");
		}
		try {
			Files.writeString(ruta, contenido);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("HECHO");
	}

}
