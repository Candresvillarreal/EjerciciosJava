package Iterativos;

import java.util.*;

public class NumerosPares {
	
	/*Se piden dos números, donde el segundo debe ser mayor que el primero y se comprueba que es así utilizando un do - while
	 * A continuación, con un bucle for, recorremos los números que hay entre ambos valores introducidos y se muestran los números pares
	 * Se incluye un contador para indicar cuántos números pares se encuentran
	 */

	public static void main(String[] args) {
		
		int a;
		int b;
		int contador = 0;
		
		Scanner sc = new Scanner(System.in);
		
		do{
			System.out.println("Introduzca un número: ");
			a = sc.nextInt();
			System.out.println("Introduza otro número (debe ser mayor que el anterior");
			b = sc.nextInt();
			
			if(a >= b) {
				System.out.println("El segundo número debe ser mayor que el primero");
			}
			
		}while(a >= b);
		
		System.out.println("Los números pares que hay entre "+ a + " y " + b + " son: ");
		
		for(int i=a; i<=b; i++) {
			if(i%2 == 0) {
				System.out.println(i);
				contador++;
			}
		}
		System.out.println("Hay " + contador + " números pares");
		
		sc.close();
		

	}

}
