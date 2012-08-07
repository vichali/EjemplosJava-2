package creacionDeArreglos;
/**
 * @author Victor
 * Generado el Aug 3, 2012
 * Descripción: mas ejemplos de aplicación
 * Proyecto: EjemplosJava-2
 * Clase: VectoresUso_3.java
 */

public class VectoresUso_4 {

	public void listarImpuestos() {
		
		double impuestos[], totales[], calcporc[];
		totales = new double[5];
		calcporc = new double[5];
		double parciales[] = {1000, 2340, 4321, 2312, 3211};
		impuestos = new double[5];
		impuestos[0] = 12.50;
		impuestos[1] = 16.70;
		impuestos[2] = 11.30;
		impuestos[3] = 7.20;
		impuestos[4] = 9.30;
		
		System.out.printf("%s %12s %10s %13s\n", "Parcial", "Impuesto", "% Inc", "Total");
		System.out.println("----------------------------------------------");
		
		for (int x=0; x<parciales.length ;x++) {
     	 calcporc[x] = ((parciales[x] * impuestos[x]) / 100);
     	 totales[x] = parciales[x] + calcporc[x];
		 System.out.printf("%6.2f %12.2f %11.2f %12.2f\n", parciales[x],impuestos[x],calcporc[x],totales[x]);
		}
	}
}















