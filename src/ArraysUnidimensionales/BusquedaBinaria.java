package ArraysUnidimensionales;

public class BusquedaBinaria {

	public static void main(String[] args) {
		
		//Creo una cadena ordenada de números
		
		int[] numeros = new int[] {5, 12, 21, 33, 46, 65, 87, 98, 135, 205};
		
		int buscado = 12;
		boolean encontrado = false;
		int inferior = 0;
		int medio;
		int superior = numeros.length-1;
		int contador = 0;
		
		while((inferior<=superior) && (!encontrado)) {
			medio = (inferior + superior) / 2;
			
			if(buscado > numeros[medio]) {
				inferior = medio+1;
			}
			else if (buscado < numeros[medio]){
				superior = medio-1;
			}
			else {
				encontrado = true;
			}
			
			contador++;
		}
		
		if(inferior > superior) {
			System.out.println("No se ha encontrado el número");
			System.out.println("Se han realizado " + contador + " búsquedas");
		}
		else {
			System.out.println("Número encontrado. Se han realizado " + contador + " búsquedas. ");
		}
		

	}

}
