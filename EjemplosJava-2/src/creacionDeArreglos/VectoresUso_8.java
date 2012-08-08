package creacionDeArreglos;

import java.util.Random;

public class VectoresUso_8 {
	   public static void main( String args[] )
	   {
	      Random randomnum = new Random(); // instanciamos la clase random
	      int frecuencia[] = new int[ 7 ]; // declaración e instancia del vector
	      // arroja el dado 6000 veces, el valor del dado es el indice de frecuencia
	      for ( int roll = 1; roll <= 6000; roll++ ) 
	         ++frecuencia[ 1 + randomnum.nextInt( 6 ) ];  

	      System.out.printf( "%s%15s\n", "Nro Dado", "Frecuencia" );
	   
	      // muestra el valor de cada elemento del vecotr
	      for ( int nroDado = 1; nroDado < frecuencia.length; nroDado++ )
	         System.out.printf( "%4d%15d\n", nroDado, frecuencia[ nroDado ] );
	      
	   } // end main
} // end clase
