package Iterativos;

import java.util.*;

public class DesdeMenoraMayor {
	
	/*Se piden dos números y se comprueba que uno es mayor que otro (en caso contrario se siguen pidiendo dos números y se muestran
	 * los números que hay entre el menor y el mayor
	 */

	public static void main(String[] args) {
		
		int n1;
		int n2;
		
		Scanner sc = new Scanner(System.in);
		
		//Pedimos los dos números y comprobamos que el segundo es mayor y, sino, volvemos a pedir los números hasta que se cumpla la condición
		
		do {
		
		System.out.println("Introduzca un número");
		n1 = sc.nextInt();
		System.out.println("Introduzca otro número (debe ser mayor que el anterior");
		n2 = sc.nextInt();
			if(n1>=n2) {
				System.out.println("El segundo número debe ser mayor que el primero");
			}
			
		}while(n1>=n2);
		
		
		//Mostramos los números entre el menor (n1) y el mayor (n2)
		
		for(int i=n1; i<=n2; i++) {
			System.out.println(i);
		}
		
		sc.close();
		

	}

}
