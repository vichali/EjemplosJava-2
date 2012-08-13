package creacionDeArreglos;

public class VectoresUsoMulti_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int vector_1[][] = {{1,2},{3},{4,5,6}};
		
			for (int fila=0; fila<vector_1.length; fila++) {
				for(int col=0; col<vector_1[fila].length; col++) {
					System.out.print(vector_1[fila][col]+"\t");
				}
				System.out.println();
			}
		}

}
