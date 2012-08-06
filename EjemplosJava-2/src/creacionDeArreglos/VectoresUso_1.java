package creacionDeArreglos;
/**
 * 
 * @author Victor
 * Generado el Aug 2, 2012
 * Descripción: uso básico del vector. Declaración, tamaño, alcance.
 * Proyecto: EjemplosJava-2
 * Clase: VectoresUso_1.java
 */

public class VectoresUso_1 {

	/* un vector es un conjunto o agrupamiento de datos del MISMO tipo
	 * En java un vector es un objeto. Todo vector, igual que una variable
	 * tiene un nombre de referencia. Para acceder a su contenido, es necesario hacer
	 * referencia a su nombre y a su número de posición dentro del vector o arreglo.
	 * El número de posición que ocupa un dato se conoce como índice. 
	 */
	public void iniciar() {
	// Ejemplos de declaración de un vector
	float[] sueldos;
	int bonificaciones[];
	String[] colores, marcas, version;
	double totales[], parciales[], impuestos[];
	
	// Creamos e inicializamos un vector indicando en este caso 20 elementos y 4 respectivamente
	sueldos = new float[5];
	bonificaciones = new int[8];
	
	// una forma resumida puede ser. Donde se declara y se crea el vector
	String codigos[] = new String[5];	
	// una forma cargando valores y no requiere un new para crear el objeto lo establece la JVM
	int aulas[] = {23,45,33,56,78,99,123,43};
	
	// cargamos valores en el vector
	int basico = 3450; float porcentaje = 1.20f;
	
	// recorremos el vector
	for(int inicio=0; inicio<sueldos.length; inicio++) {
		sueldos[inicio] = basico * porcentaje;
		System.out.println(sueldos[inicio]);
	}
	

	} // finIniciar
	
}


