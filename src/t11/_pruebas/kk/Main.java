package t11._pruebas.kk;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Producto {
	private String nombre;
	private float precio;
	private String categoria;
	
	public Producto(String nombre, float precio, String categoria) {
		this.nombre = nombre;
		this.precio = precio;
		this.categoria = categoria;
	}
	public String getNombre() {
		return nombre;
	}
	public float getPrecio() {
		return precio;
	}
	public String getCategoria() {
		return categoria;
	}
	@Override
	public String toString() {
		return this.nombre + "(" + this.precio + ") [" + this.categoria +"]";
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
}

public class Main {

	public static void main(String[] args) {
		String categoria = "atomica"; 
		List<Producto> datos = new ArrayList<>();
		rellenarDatos(args,datos);
		System.out.println(datos);
		
		System.out.println(
				datos
				.stream()
				.filter(p -> p.getCategoria().equals(categoria))
				//.reduce( 1 , ( a,b )-> a*b )
			);
	}

	private static void rellenarDatos(String[] args,List<Producto> datos) {
		for ( int i=0; i<args.length; i += 3) {
			datos.add( new Producto ( args[i],  Float.parseFloat( args[i+1]) , args[i+2]) );
		}
	}

}
