package Iterativos;

import java.util.*;

public class MultiplosDosTres {
	
	//Se introduce un n�mero y se muestran todos los m�ltiplos de 2 y 3 entre el 1 y ese n�mero

	public static void main(String[] args) {
		
		int par=0;
		int impar=0;
		int num;
		int contadorPar = 0;
		int contadorImpar = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca un n�mero");
		num = sc.nextInt();
		
		//Con un bucle for recorro los n�meros que hay entre 0 y el n�mero introducido e imprimo y cuento cu�les son pares y cu�les impares
		
		//Opci�n 1
		
		for(int i=1; i<=num; i++) {
			
			
			//Si es par:
			if(i%2 == 0) {
				par=i;
				contadorPar++;	
				System.out.println(par + " es un n�mero par");
			}
			
			else {
				impar = i;
				contadorImpar++;
				System.out.println(impar + " es un n�mero impar");
			}
			
			
		}
		
		System.out.println("Entre " + num + " y cero hay " + contadorPar + " n�meros pares");
		System.out.println("Entre " + num + " y cero hay " + contadorImpar + " n�meros impares");
		
		sc.close();

	}

}
