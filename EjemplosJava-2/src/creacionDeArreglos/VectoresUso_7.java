package creacionDeArreglos;

public class VectoresUso_7 {

	public static void main( String args[] )
   {

      // se establen rangos de calificaciones que van desde
      // 00-09 10-19 20-29 y así sucesivamente hasta 100
      System.out.println( "Distribución de las calificaciones:" ); 

      // por cada elemento del vector va a imprimir un *
      int vec[] = { 8, 0, 6 , 9, 0, 7, 2, 4, 2, 1, 1 };
      for ( int contador = 0; contador < vec.length; contador++ ) 
      {
         // muestra el texto que representa el rango a evaluar
         if ( contador == 10 )
            System.out.printf( "%5d: ", 100 ); 
         else
            System.out.printf( "%02d-%02d: ", 
               contador * 10, contador * 10 + 9  ); 
 
         // imprime los asteriscos
         for ( int stars = 0; stars < vec[ contador ]; stars++ )
            System.out.print( "*" );

         System.out.println(); // linea en blanco
      } // end For
   } // end Main
} // end class 
