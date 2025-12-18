package t5.b.ej12;

public class Letras {
	
	private String cadena;

	public Letras(String cadena) {
		this.cadena = cadena;
	}

	public void setCadena(String cadena) {
		this.cadena = cadena;
	}

	public void p(String cadena) {
		System.out.print(this.cadena + "A" + cadena);
	}

	public static void q() {
		System.out.print(" es ");
	}
}
