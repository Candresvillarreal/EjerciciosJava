package ArraysUnidimensionales;

public class BusquedaLineal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=0;
		
		int buscado=31;
		
		boolean encontrado=false;
		
		int[] x = new int []{10, 12, 15, -25, 456, 72, 30};
		
		//Mientras no se encuentre el n�mero buscado se ejecuta el if (empezando por el cero)
		
		while(!encontrado && i<x.length) {
			if (x[i] == buscado) {
				System.out.println("Encontrado:" + x[i]);
				encontrado=true;
				
				
				
			}
			
			//Cada vez que se comprueba un n�mero, sumamos uno para comprobar el siguiente
			
			i++;
		}
		
		//Si el n�mero no se encuentra, se ejecuta este if
		
		if(!encontrado) {
			System.out.println("No se ha encontrado el numero");
		}
		

	}

}
