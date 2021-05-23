package Iterativos;

import java.util.*;

public class NumerosPares {
	
	/*Se piden dos n�meros, donde el segundo debe ser mayor que el primero y se comprueba que es as� utilizando un do - while
	 * A continuaci�n, con un bucle for, recorremos los n�meros que hay entre ambos valores introducidos y se muestran los n�meros pares
	 * Se incluye un contador para indicar cu�ntos n�meros pares se encuentran
	 */

	public static void main(String[] args) {
		
		int a;
		int b;
		int contador = 0;
		
		Scanner sc = new Scanner(System.in);
		
		do{
			System.out.println("Introduzca un n�mero: ");
			a = sc.nextInt();
			System.out.println("Introduza otro n�mero (debe ser mayor que el anterior");
			b = sc.nextInt();
			
			if(a >= b) {
				System.out.println("El segundo n�mero debe ser mayor que el primero");
			}
			
		}while(a >= b);
		
		System.out.println("Los n�meros pares que hay entre "+ a + " y " + b + " son: ");
		
		for(int i=a; i<=b; i++) {
			if(i%2 == 0) {
				System.out.println(i);
				contador++;
			}
		}
		System.out.println("Hay " + contador + " n�meros pares");
		
		sc.close();
		

	}

}
