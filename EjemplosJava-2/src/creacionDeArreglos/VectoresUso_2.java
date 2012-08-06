package creacionDeArreglos;

public class VectoresUso_2 {

	public void asignando() {
		
		int[] n = {10,20,30,40,50};
		
		System.out.println("El valor del vector n, en pos 1 es: " + n[1] + "\n");

		n[1] = n[4];
		
	        System.out.println("Ahora su valor es: " + n[1] + "\n"); 
	
		int largo;
		largo = n.length;
		System.out.println("El largo del vector es : " + largo + "\n");

		//imprime los elementos del vector
		int i;
		System.out.print("El contenido del vector es: ");
		for (i = 0 ; i < n.length; i++)
			System.out.print(n[i] + "  ");

	}
}
