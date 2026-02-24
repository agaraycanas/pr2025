package t10.ej03;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {

	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("Debes introducir al menos un argumento de entrada");
		} else {
			String carpeta = 		"src/t10/ej03/";
			String nombreArchivo = 	"prueba";
			String extension = 		".txt";
			String contenido = 		"TEST";
			Path ruta = Path.of(carpeta + nombreArchivo + extension);
			try {
				Files.writeString(ruta, contenido);
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("HECHO");
		}
	}

}
