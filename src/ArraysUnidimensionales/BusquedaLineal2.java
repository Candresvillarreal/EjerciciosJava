package ArraysUnidimensionales;

import java.util.*;

public class BusquedaLineal2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=0;
		
		int buscado;
		
		boolean encontrado=false;
		
		int contador=0;
		
		int[] x = {10, 12, 15, -25, 456, 72, 30};
		
		//Solicito que se introduzca un número por consola, que asocio a buscado:
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduzca un número: ");
		buscado = entrada.nextInt();
		
		// Recorro la matriz con el for, empezando por i=0 y sumando 1 sino encuentro el número
		for(i=0;i<x.length;i++) {
			
			//Añado un contador para saber cuantos intentos necesito para localizar el número
			
			contador++;
			
			if(x[i]==buscado) {
				System.out.println("Encontrado: " + buscado);
				encontrado=true;
				
				
				System.out.println("se han realizado " + contador + " búsquedas.");
			}
			
			entrada.close();
			
		}
		
		if(!encontrado) {
			System.out.println("No se ha encontrado el número: " + buscado + ". Se han realizado "+ contador + " búsquedas");
		}
		

	}

}
