package Selectivos;

import java.util.*;

public class Grados {
	
	//Programa que pasa de ºC y ºF

	public static void main(String[] args) {

		int grados;
		int fahrenheit;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca los grados centígrados que quiera convertir a Fahrenheit");
		grados = sc.nextInt();
		fahrenheit = (32+(9*(grados/5)));
		
		//Fórmula de conversión -> F = 32 + (9 * GradosC/5)
		
		System.out.println(grados + " ºC son " + fahrenheit + " Fahrenheit");
		
		sc.close();

	}

}
