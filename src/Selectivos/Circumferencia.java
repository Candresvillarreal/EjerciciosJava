package Selectivos;

import java.util.*;
import java.math.*;

public class Circumferencia {
	
	//Se pide el radio de una circunferencia y se muestra el diámetro y su área

	public static void main(String[] args) {
		
		double radio;
		double longitud;
		double area;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el radio de la circunferencia");
		radio = sc.nextInt();
		
		//Longitud de la circunferencia -> 2*PI*Radio
		//Area de la circunferencia -> PI * Radio exp 2
		
		longitud = 2 * Math.PI * radio;
		area = Math.PI * Math.pow(radio, 2);
		
		System.out.println("Para un radio de " + radio + " : ");
		System.out.println("Longitud = " + longitud);
		System.out.println("Area = " + area);
		
		sc.close();
		

	}

}
