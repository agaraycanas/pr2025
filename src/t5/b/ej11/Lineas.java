package t5.b.ej11;

public class Lineas {
	private String c;
	
	public Lineas(String  c) {
		this.c = c;
	}
	
	public void linea(int n) {
		for (int i=0;i<n;i++) {
			System.out.print(this.c);
		}
		System.out.println();
	}
	public void linea(int e, int a) {
		for (int i=0;i<e;i++) {
			System.out.print(" ");
		}
		for (int i=0;i<a;i++) {
			System.out.print(this.c);
		}
		System.out.println();
	}
}
