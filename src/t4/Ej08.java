package t4;

public class Ej08 {
	public static void main(String[] args) {
		String operacion;
		int operando1;
		int operando2;
		int solucion=-1;
		operacion = args[0];
		operando1 = Integer.parseInt( args[1] );
		operando2 = Integer.parseInt( args[2] );
		//  “suma” “resta” “mul” y “div” 
		switch (operacion) {
			case "suma":	solucion = operando1 + operando2  ;break;
			case "resta":	solucion = operando1 - operando2   ;break;
			case "mul":		solucion = operando1 * operando2   ;break;
			case "div":		solucion = operando1 / operando2   ;break;
		}
		System.out.println("Operacion: "+operacion);
		System.out.println("op1 = "+operando1+", op2 = "+operando2);
		System.out.println(solucion);
		System.out.println("FIN");
	}
}
