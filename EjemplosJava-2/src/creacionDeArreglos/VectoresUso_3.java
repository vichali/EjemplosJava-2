package creacionDeArreglos;
/**
 * 
 * @author Victor
 * Generado el Aug 2, 2012
 * Descripción: Aplicaciones
 * Proyecto: EjemplosJava-2
 * Clase: VectoresUso_2.java
 */

public class VectoresUso_3 {

	public void listarAulas() {
		
		int aulas[] = {23,45,33,56,78,99,123,43};
		
		System.out.printf("%s %8s \n", "Indice", "Valor");
		for (int x=0; x<aulas.length ;x++) {
			System.out.printf("%6d %8d \n", x, aulas[x]);
		}
		

		
	}
	
}





