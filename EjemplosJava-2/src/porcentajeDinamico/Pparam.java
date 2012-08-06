package porcentajeDinamico;
import java.util.Scanner;



public class Pparam {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float n1,n2;
		int quehacer;
		Scanner ingresar = new Scanner(System.in);
		Pmetodos saberPorcentaje = new Pmetodos();
		System.out.println("Importe: ");
		n1 = ingresar.nextFloat();
		System.out.println("Porcentaje: ");
		n2 = ingresar.nextFloat();
		System.out.println("1. Incrementar 2.Decrementar: ");
		quehacer = ingresar.nextInt();
		
		System.out.println("Resultado: " + 
				saberPorcentaje.calculoPorcentaje(n1,n2,quehacer));
		
	}

}
