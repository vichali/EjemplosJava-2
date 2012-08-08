package creacionDeArreglos;

public class VectoresUso_10 {

	   // main / creacion del vector y llamada a los metodos
	   public static void main( String args[] )
	   {
	      int vector[] = { 1, 2, 3, 4, 5 };
	      
	      System.out.println( 
	         "Efectos de pasar una referencia de un vector completo:\n" +
	         "Los valores del vector original son:" );

	      // muestra los valores originales del vector 
	      for ( int valor : vector )
	         System.out.printf( "   %d", valor );
	   
	      modificarVector( vector ); // pasa la referencia al vector
	      System.out.println( "\n\nLos valores del vector modificado son:" );

	      //  muestra los elementos modificados del vector
	      for ( int value : vector )
	         System.out.printf( "   %d", value );
	   
	      System.out.printf( 
	         "\n\nEfectos de pasar el valor de un elemento del vector:\n" +
	         "vector[3] antes de modificarElemento: %d\n", vector[ 3 ] );
	   
	      modificarElemento( vector[ 3 ] ); // se intenta modificar el vector[ 3 ]
	      System.out.printf( 
	         "vector[3] después de modificarElemento: %d\n", vector[ 3 ] );
	      
	   } // end main
	   
	   
	   
	   // multiplico cada elemento del vector por 2 
	   public static void modificarVector( int vector_2[] )
	   {
	      for ( int contador = 0; contador < vector_2.length; contador++ )
	         vector_2[ contador ] *= 2;
	   } // end metodo modificarVector
	   
	   // multiplico el argumento por 2
	   public static void modificarElemento( int elemento )
	   {
	      elemento *= 2;
	      System.out.printf( 
	         "Valor del elemento en modificarElemento: %d\n", elemento );
	   } // end modificarElemento
	} // end class PassArray

