package Selectivos;

import java.util.*;

public class Grados {
	
	//Programa que pasa de �C y �F

	public static void main(String[] args) {

		int grados;
		int fahrenheit;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca los grados cent�grados que quiera convertir a Fahrenheit");
		grados = sc.nextInt();
		fahrenheit = (32+(9*(grados/5)));
		
		//F�rmula de conversi�n -> F = 32 + (9 * GradosC/5)
		
		System.out.println(grados + " �C son " + fahrenheit + " Fahrenheit");
		
		sc.close();

	}

}
