package pruebas;

public class Prueba {
public static void main(String[] args) {

Abuelo ab =new Abuelo();
ab.abuelo();
ab.saludar();
//ab.padre();
//ab.hijo();

System.out.println("=========");
Abuelo pa = new Padre();
pa.abuelo();
//pa.padre();
pa.saludar();
//pa.hijo();

System.out.println("=========");
Abuelo hi = new Hijo();
hi.abuelo();
//hi.padre();
//hi.hijo();
hi.saludar();
}
}
