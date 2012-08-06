package porcentajeDinamico;

public class Pmetodos {

	public float calculoPorcentaje(float valor1, float porcentaje,int accion) {
		float resultado;
		
		if (accion == 1) {
			resultado = valor1 +((valor1 * porcentaje) / 100);
		} else {
			resultado = valor1 -((valor1 * porcentaje) / 100);
		}

		return resultado;
	}
	
}
