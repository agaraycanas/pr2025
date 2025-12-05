package t5.b.ej02;

public class Prueba {

	public static void main(String[] args) {
		int azar = (int)(Math.random()*100)+1;
		for (int i=0;i<azar;i++) {
			new A();
		}
		System.out.println("Num.objetos: " + A.numeroDeObjetos());
		System.out.println("azar: "+azar);
	}
}
