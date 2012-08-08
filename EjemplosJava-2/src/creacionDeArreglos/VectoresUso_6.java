package creacionDeArreglos;
/**
 * 
 * @author Victor
 * Generado el Aug 4, 2012
 * Descripción: Forma resumida del uso del For en vectores
 * Proyecto: EjemplosJava-2
 * Clase: VectoresUso_6.java
 */
public class VectoresUso_6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int vector[] = {12,21,22,334,566,3,1,223,55};
		int total = 0;
		
		// for(parametro : nombreVector}
		// instrucciones
		for (int numero : vector) {
			total += numero;
			System.out.printf("total+numero: %d (%d)\n ",numero, total);
		}
	}
}







