package creacionDeArreglos;

public class VectoresUso_9 {
	
	/*
	 *  Se pidió a cuarenta estudiantes que calificaran la calidad de las viandas
	 *  en una escala del 1 al 10 (donde 1 significa pésimo y 10 excelente.
	 *  Se debe conocer el resultado de la encuesta, mostrando los valores para 
	 *  cada puntuación.
	 */
	
public static void main( String args[] )
{
   // vector con las respuestas
   int respuestas[] = { 2, 2, 6, 4, 8, 5, 9, 7, 8, 10, 1, 6, 3, 8, 6, 
      10, 3, 8, 2, 7, 6, 5, 7, 6, 8, 6, 7, 5, 6, 6, 5, 6, 7, 5, 6, 
      4, 8, 6, 8, 10 };
   int frecuencia[] = new int[ 11 ]; // vector que contará las frecuencias

   // para cada respuesta, selecciona el elemento de respuetas y usa ese valor
   // como indice de frecuencia para determinar el elemento a incrementar
   for ( int answer = 0; answer < respuestas.length; answer++ )
	   	++frecuencia[ respuestas[ answer ]];

   System.out.printf( "%s %15s %n", "Calificacion", "Frecuencia" );
   System.out.printf("%s %n","----------------------------");

   // muestra el valor de cada elemento del vector frecuencia
   for ( int calificacion = 1; calificacion < frecuencia.length; calificacion++ )
      System.out.printf( "%6d %17d \n", calificacion, frecuencia[ calificacion ] );
} // end main
} // end class 
