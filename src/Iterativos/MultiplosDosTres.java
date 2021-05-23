package Iterativos;

import java.util.*;

public class MultiplosDosTres {
	
	//Se introduce un número y se muestran todos los múltiplos de 2 y 3 entre el 1 y ese número

	public static void main(String[] args) {
		
		int par=0;
		int impar=0;
		int num;
		int contadorPar = 0;
		int contadorImpar = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca un número");
		num = sc.nextInt();
		
		//Con un bucle for recorro los números que hay entre 0 y el número introducido e imprimo y cuento cuáles son pares y cuáles impares
		
		//Opción 1
		
		for(int i=1; i<=num; i++) {
			
			
			//Si es par:
			if(i%2 == 0) {
				par=i;
				contadorPar++;	
				System.out.println(par + " es un número par");
			}
			
			else {
				impar = i;
				contadorImpar++;
				System.out.println(impar + " es un número impar");
			}
			
			
		}
		
		System.out.println("Entre " + num + " y cero hay " + contadorPar + " números pares");
		System.out.println("Entre " + num + " y cero hay " + contadorImpar + " números impares");
		
		sc.close();

	}

}
