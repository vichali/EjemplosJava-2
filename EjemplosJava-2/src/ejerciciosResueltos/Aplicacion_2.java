package ejerciciosResueltos;
import java.util.Scanner;
public class Aplicacion_2 {
	
	private Scanner teclado;
    private int[] sueldos;
	
    public void cargar()
    {
        teclado=new Scanner(System.in);
        System.out.print("Cuantos sueldos cargar�:");
        int cant;
        cant=teclado.nextInt();
        sueldos=new int[cant];
        for(int f=0;f<sueldos.length;f++) {
            System.out.print("Ingrese sueldo:");
            sueldos[f]=teclado.nextInt();
        }	
    }
	
    public void imprimir() {
        for(int f=0;f<sueldos.length;f++) {
            System.out.println(sueldos[f]);
        }
    }

}
