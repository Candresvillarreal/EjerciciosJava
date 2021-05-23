package Iterativos;

import java.util.*;
import java.io.*;

public class CuentaCifras {
	
	//Se pide un número y se muestra cuántas cifras tiene

	public static void main(String[] args) throws IOException {
		
		int num;
		char car;
		
		//Inicializo el contador que almacenará las cifras que tiene el número
		
		int cifras=0;
		
		//Creamos el objeto Scanner
		
		Scanner sc = new Scanner(System.in);
		
		//Estructura do - while para que repita las instrucciones mientras se quiera comprobar las cifras de otro número
		
		do {
			System.out.println("Introduzca un número: ");
			num = sc.nextInt();
			
			//Mientras el resultado de dividir sucesivamente el número entre 10 sea distinto de cero, sumamos una cifra
			
			while(num!=0) {
				num = num/10;
				cifras ++;
			}
			
			System.out.println("El número introducido tiene " + cifras + " cifras");
			System.out.println("Quiere comprobar otro número");
			car = (char)System.in.read();
			
			// Inicializo de nuevo el contador por si se comprueba otro número
			
			cifras = 0;
			
			//Se seguirá comprobando números a menos que se introduzca n o N:
			
		}while(car!='n' && car!='N');
		
		sc.close();
		

	}

}
