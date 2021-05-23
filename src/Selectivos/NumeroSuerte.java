package Selectivos;

import java.util.*;

public class NumeroSuerte {
	
	/*Ejemplo número de la suerte:
	 * fecha nacimiento: 14/11/1978
	 * 14+11+1978=2003
	 * 2+0+0+3=5
	 */

	public static void main(String[] args) {
		
		int dia;
		int mes;
		int año;
		int pasoUno;
		int cifra1;
		int cifra2;
		int cifra3;
		int cifra4;
		String respuesta;
		
		Scanner sc = new Scanner(System.in);
		
		do {
		
		System.out.println("Introduzca el día que nació");
		dia = sc.nextInt();
		
		System.out.println("Introduzca el mes de su nacimiento");
		mes = sc.nextInt();
		
		System.out.println("Introduza el año en que nació");
		año = sc.nextInt();
		
		System.out.println("Su fecha de nacimiento es: " + dia + "/" + mes + "/" + año);
		System.out.println("¿Es correcto? Indique S o N");
		respuesta = sc.next();
		}while(respuesta.equalsIgnoreCase("n"));
		
		
		if(respuesta.equalsIgnoreCase("s")){
			
			//Sumo dia + mes + año
			
			pasoUno = dia + mes + año;
			
			//desgloso el resultado cifra a cifra
			
			cifra1 = pasoUno/1000;
			cifra2 = (pasoUno/100)%10;
			cifra3 = (pasoUno/10)%10;
			cifra4 = pasoUno%10;
			
			System.out.println("Su número de la suerte es: " + cifra1 + cifra2 + cifra3 + cifra4);
			
		}
		
		sc.close();
	
	}

}
