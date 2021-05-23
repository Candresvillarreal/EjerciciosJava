package Iterativos;

import java.util.*;
import java.io.*;

public class ParImparPositivoNegativo {
	
	/*Se pide un número y se indica si es positivo o negativo, par o impar.  Además se pregunta si se quiere comprobar otro
	 * número
	 */

	public static void main(String[] args) throws IOException {
		
		int N;
		char car;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Introduce un número: ");
			N = sc.nextInt();
			
			System.out.println("El número introducido es: ");
			
			// Comprobamos si es par o impar
			
			if(N%2==0) {
				System.out.print("Es par y ");
			}else {
				System.out.print("Es impar y ");
			}
			
			//Comprobamos si es positivo o negativo
			
			if(N>=0) {
				System.out.println("positivo.");
			}else {
				System.out.println("negativo.");
			}
			
			//Pregunto si quiere comprobar otro número
			
			System.out.println("Quiere comprobar otro número? S / N ");
			car = (char)System.in.read();
			
			//Establecemos la condición para comprobar o no otro número (repetimos si el caracter introducido es distinto de n o N
			
		}while(car!='n' || car!='N');
	

	}

}
