package pruebas.interfacesfuncionales;

@FunctionalInterface
interface MiInterface { public void f(); }

public class Main {
	public static void main(String[] args) {
		MiInterface i;
		i = () -> System.out.println("UNO");
		
		i = new MiInterface() {
			public void f() {System.out.println("DOS");}
		};
		i.f();
		System.out.println("FIN");
	}
}
