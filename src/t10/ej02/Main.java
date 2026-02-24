package t10.ej02;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {

	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("Debes introducir al menos un argumento de entrada");
		} else {
			String carpeta = "src/t10/ej02/";
			String nombreArchivo = args[0] + ".txt";
			Path ruta = Path.of(carpeta + nombreArchivo);
			String contenido = "";
			for (String dato : args) {
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

}
