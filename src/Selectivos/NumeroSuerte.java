package Selectivos;

import java.util.*;

public class NumeroSuerte {
	
	/*Ejemplo n�mero de la suerte:
	 * fecha nacimiento: 14/11/1978
	 * 14+11+1978=2003
	 * 2+0+0+3=5
	 */

	public static void main(String[] args) {
		
		int dia;
		int mes;
		int a�o;
		int pasoUno;
		int cifra1;
		int cifra2;
		int cifra3;
		int cifra4;
		String respuesta;
		
		Scanner sc = new Scanner(System.in);
		
		do {
		
		System.out.println("Introduzca el d�a que naci�");
		dia = sc.nextInt();
		
		System.out.println("Introduzca el mes de su nacimiento");
		mes = sc.nextInt();
		
		System.out.println("Introduza el a�o en que naci�");
		a�o = sc.nextInt();
		
		System.out.println("Su fecha de nacimiento es: " + dia + "/" + mes + "/" + a�o);
		System.out.println("�Es correcto? Indique S o N");
		respuesta = sc.next();
		}while(respuesta.equalsIgnoreCase("n"));
		
		
		if(respuesta.equalsIgnoreCase("s")){
			
			//Sumo dia + mes + a�o
			
			pasoUno = dia + mes + a�o;
			
			//desgloso el resultado cifra a cifra
			
			cifra1 = pasoUno/1000;
			cifra2 = (pasoUno/100)%10;
			cifra3 = (pasoUno/10)%10;
			cifra4 = pasoUno%10;
			
			System.out.println("Su n�mero de la suerte es: " + cifra1 + cifra2 + cifra3 + cifra4);
			
		}
		
		sc.close();
	
	}

}
