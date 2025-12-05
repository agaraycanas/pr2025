package t4;

public class Ej18 {
	public static void mostrar(String[][] personas, String filtro) {
		if (filtro.equals("todo")) {
			for (int i = 0; i < personas.length; i++) {
				System.out.println(personas[i][2] + ", " + personas[i][1] + " (" + personas[i][0] + ")");
			}
		} else if (filtro.equals("nombre")) {
			for (int i = 0; i < personas.length; i++) {
				System.out.println(personas[i][1]);
			}
		}
		else if (filtro.equals("apellido")) {
			for (int i = 0; i < personas.length; i++) {
				System.out.println(personas[i][2]);
			}
		}
		else if (filtro.equals("dni")) {
			for (int i = 0; i < personas.length; i++) {
				System.out.println(personas[i][0]);
			}
		}
		else {
			System.out.println("FILTRO INCORRECTO");
		}
	}

	public static void main(String[] args) {
		String[][] personas = { 
				{"1","Pepe","Sánchez"}, 
				{"2","Ana","García"}, 
				{"3","Juan","Palomo"} 
				};
		
		mostrar(personas, "todo");
		mostrar(personas, "nombre");
		mostrar(personas, "apellido");
		mostrar(personas, "dni");
		mostrar(personas, "algo");

	}
}
