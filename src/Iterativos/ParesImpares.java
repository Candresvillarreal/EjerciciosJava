package Iterativos;

import java.util.*;

public class ParesImpares {
	
	//Se piden dos números, el segundo es menor que el primero, y se muestran y cuentan los números pares e impares que hay entre ambos

	public static void main(String[] args) {
		
		int n1, n2, par, impar;
		int contadorPar=0;
		int contadorImpar=0;
		
		Scanner sc = new Scanner(System.in);
		
		//Pedimos los números y comprobamos que el primero es menor que el segundo
		
		do {
		System.out.println("Introduzca un número: ");
		n1 = sc.nextInt();
		System.out.println("Introduzca otro número (mayor que el anterior)");
		n2 = sc.nextInt();
		}while(n1>=n2);
		
		//Recorremos los números que hay entre n1 y n2

		for(int i=n1; i<=n2; i++) {
			
			//Vemos si es par
			
			if(i%2==0) {
				
				System.out.println(i + " es un número par");
				contadorPar++;
				
			//O impar
			
			} else {
				
				System.out.println(i + " es un número impar");
				contadorImpar++;
			}
			
		}
		
		sc.close();

	}

}
