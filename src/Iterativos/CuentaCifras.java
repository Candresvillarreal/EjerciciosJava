package Iterativos;

import java.util.*;
import java.io.*;

public class CuentaCifras {
	
	//Se pide un n�mero y se muestra cu�ntas cifras tiene

	public static void main(String[] args) throws IOException {
		
		int num;
		char car;
		
		//Inicializo el contador que almacenar� las cifras que tiene el n�mero
		
		int cifras=0;
		
		//Creamos el objeto Scanner
		
		Scanner sc = new Scanner(System.in);
		
		//Estructura do - while para que repita las instrucciones mientras se quiera comprobar las cifras de otro n�mero
		
		do {
			System.out.println("Introduzca un n�mero: ");
			num = sc.nextInt();
			
			//Mientras el resultado de dividir sucesivamente el n�mero entre 10 sea distinto de cero, sumamos una cifra
			
			while(num!=0) {
				num = num/10;
				cifras ++;
			}
			
			System.out.println("El n�mero introducido tiene " + cifras + " cifras");
			System.out.println("Quiere comprobar otro n�mero");
			car = (char)System.in.read();
			
			// Inicializo de nuevo el contador por si se comprueba otro n�mero
			
			cifras = 0;
			
			//Se seguir� comprobando n�meros a menos que se introduzca n o N:
			
		}while(car!='n' && car!='N');
		
		sc.close();
		

	}

}
