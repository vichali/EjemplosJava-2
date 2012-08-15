package ejerciciosResueltos;
import java.util.Scanner;
public class AvionMetodos {

 private int valor=0, opcViaje;
 private boolean primera[] = {true,true,true,true,true};
 private boolean economica[] = {true,true,true,true,true};
 private boolean vector[];
 final String T_PRIMERA = "Primera Clase";
 final String T_ECONOMICA = "Económica";
 Scanner ing = new Scanner(System.in);
 
	public void ctrl(int val) {
		switch (val) {
		case 1:
			menu();
			break;
		default:
			break;
		}
	}

	public void menu() {
		System.out.println("1 - " + T_PRIMERA);
		System.out.println("2 - " + T_ECONOMICA);
		System.out.println("Seleccione su opción: ");
		opcViaje = ing.nextInt();
		boolean vector[] = (opcViaje==1) ? primera : economica;
		asignar(opcViaje, vector);
	}

	public void asignar(int valor, boolean vector[]) {
		boolean encontrado = false; int x=0,completo=1;
		while (!encontrado && x<vector.length) {
			encontrado = vector[x];
			 if (encontrado) { 
				 vector[x] = false;
				 encontrado = true;
			 } else { completo++; }
			 x++;
		}
			if (valor==1) { primera = vector; } else { economica = vector; }
			System.out.println("Completo: " + completo);
			if (completo>vector.length)cambioCategoria(valor); 
			control();
	} //endmetodo
	
	public void cambioCategoria(int valor) {
		
		String txt = (valor==1) ? T_PRIMERA : T_ECONOMICA;
		String txt2 = (txt.equals(T_PRIMERA)) ? T_ECONOMICA : T_PRIMERA;
		System.out.println("No hay más lugares en " + txt + "\n");

		System.out.println("Desea cambiar a " + txt2 + " (s/n)");
		String opc = ing.next();
		if (opc.toLowerCase().equals("s")) {
			valor = (valor==1) ? 2 : 1;
			vector = (valor==1) ? primera : economica;
			asignar(valor, vector);
		} else { 
			System.out.println("El próximo vuelo sale en tres horas");
		}
	}
	
	public void control() {
		for (boolean v1:primera)
		System.out.println(v1);
		System.out.println();
		for (boolean v2:economica)
			System.out.println(v2);
		menu();
	}
}
