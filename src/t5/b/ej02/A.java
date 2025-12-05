package t5.b.ej02;

public class A {
	public static int n;
	public A() {
		A.n = A.n + 1;
	}
	public static int numeroDeObjetos() {
		return A.n;
	}

}
