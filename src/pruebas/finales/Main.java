package pruebas.finales;

import java.util.ArrayList;
import java.util.Comparator;

class Producto implements Comparable<Producto> {
	private int id;
	private String nombre;
	public Producto(int id, String nombre) { this.id = id; this.nombre = nombre;}
	public String toString() {	return "["+id+"]"+nombre; }
	public int compareTo(Producto otro) {return nombre.compareTo(otro.nombre);}
	public int getId() { return this.id;}
}
public class Main {
	public static void main(String[] args) {
		ArrayList<Producto> productos = new ArrayList<>();
		productos.add(new Producto(10,"a"));
		productos.add(new Producto(5,"b"));
		productos.add(new Producto(-1,"c"));
		productos.add(new Producto(23,"d"));
		productos.add(new Producto(10,"e"));
		System.out.println(productos);
		
		System.out.println("============");
		
		Comparator<Producto> ordenAscendenteDeId  = new Comparator<Producto>() {
			@Override
			public int compare(Producto p1, Producto p2) {
				if (p1.getId() > p2.getId()) { return 1;}
				if (p1.getId() < p2.getId()) { return -1;}
				return 0;
			}
		};
		
		Comparator<Producto> ordenDescendenteDeId =
				(p1,p2) -> {
					if (p1.getId() < p2.getId()) { return 1;}
					if (p1.getId() > p2.getId()) { return -1;}
					return 0;
				};
				
		productos.stream()
			.sorted(ordenDescendenteDeId )
			.forEach(e -> {System.out.println(e);})
		;
		
	}
}
