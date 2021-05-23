package Iterativos;

import java.util.*;

public class DesdeMenoraMayor {
	
	/*Se piden dos n�meros y se comprueba que uno es mayor que otro (en caso contrario se siguen pidiendo dos n�meros y se muestran
	 * los n�meros que hay entre el menor y el mayor
	 */

	public static void main(String[] args) {
		
		int n1;
		int n2;
		
		Scanner sc = new Scanner(System.in);
		
		//Pedimos los dos n�meros y comprobamos que el segundo es mayor y, sino, volvemos a pedir los n�meros hasta que se cumpla la condici�n
		
		do {
		
		System.out.println("Introduzca un n�mero");
		n1 = sc.nextInt();
		System.out.println("Introduzca otro n�mero (debe ser mayor que el anterior");
		n2 = sc.nextInt();
			if(n1>=n2) {
				System.out.println("El segundo n�mero debe ser mayor que el primero");
			}
			
		}while(n1>=n2);
		
		
		//Mostramos los n�meros entre el menor (n1) y el mayor (n2)
		
		for(int i=n1; i<=n2; i++) {
			System.out.println(i);
		}
		
		sc.close();
		

	}

}
