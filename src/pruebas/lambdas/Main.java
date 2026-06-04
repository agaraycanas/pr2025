package pruebas.lambdas;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
	public static void main(String[] args) {
		ArrayList<Producto> productos = new ArrayList<Producto>();
		productos.add(new Producto("portátil",	"informática",	950));
		productos.add(new Producto("ratón",		"informática",	25));
		productos.add(new Producto("mesa",		"muebles",		180));
		productos.add(new Producto("silla",		"muebles",		120));
		productos.add(new Producto("monitor",	"informática",	300));
		productos.add(new Producto("lámpara",	"decoración",	40));

		productos.stream()
			.forEach(System.out::println);
		System.out.println("============");
		
		// Comparador de productos (de más barato a más caro)
		Comparator<Producto> deMasBaratoAMasCaro = 
				(p1,p2) -> Double.compare(p1.getPrecio(), p2.getPrecio());
		
		// Comparador de productos. Alfabéticamente por categoría y a igualdad de ellas
		// de más barato a más caro
		Comparator<Producto> gangasPorCategoria = (p1,p2) -> {
			int sol = 0;
			if (! p1.getCategoria().equals(p2.getCategoria()) ) {
				sol =  p1.getCategoria().compareTo(p2.getCategoria());
			}
			else {
				sol = Double.compare(p1.getPrecio(), p2.getPrecio());
			}
			return sol;
		};
		
		Comparator<Producto> gangasPorCategoriaConTernario = (p1,p2) -> 
			! p1.getCategoria().equals(p2.getCategoria())
			?
			p1.getCategoria().compareTo(p2.getCategoria())
			:
			Double.compare(p1.getPrecio(), p2.getPrecio())
			;

		
		System.out.println("Número de productos (de informática): "+
		productos.stream()
			//.filter(p -> p.getPrecio() > 100)
			//.map(p -> p.getNombre()) //.map(Producto::getNombre)
			//.sorted(deMasBaratoAMasCaro.reversed())
			//.sorted(gangasPorCategoria)
			.filter(p -> p.getCategoria().equals("informática"))
			.count()
			//.forEach(System.out::println);
			);
	}

}
