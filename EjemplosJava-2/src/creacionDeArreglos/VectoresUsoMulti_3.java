package creacionDeArreglos;

public class VectoresUsoMulti_3 {

	
	   public static void main( String args[] )
	   {
	      int vector1[][] = { { 1, 2, 3 }, { 4, 5, 6 } };        
	      int vector2[][] = { { 1, 2 }, { 3 }, { 4, 5, 6 } }; 

	System.out.println( "Los valores del vector1 por filas son: " );
	      recorrerVector( vector1 ); // muestra vector1 por filas
	   
	System.out.println( "\nLos valores del vector2 por filas son: " );
	      recorrerVector( vector2 ); // muestra vector2 por filas
	   } // endmain

	   // imprime filas y columnas del vector bidimensional
	   public static void recorrerVector( int vector[][] )
	   {
	      // itera a través de las filas del arreglo
	      for ( int fila = 0; fila < vector.length; fila++ ) 
	      {
	         // itera a través de las columnas de la fila actual
	         for ( int col = 0; col < vector[ fila ].length; col++ )
	            System.out.printf( "%d  ", vector[ fila ][ col ] );

	         System.out.println(); // nueva línea
	      } // endFor externo
	   } // endMetodo recorrerVector

	   
}






