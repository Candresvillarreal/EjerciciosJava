package Iterativos;

import java.util.*;

public class Division {

	public static void main(String[] args) {
		
		int num1;
		int num2;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número");
		num1 = sc.nextInt();
		do {
		System.out.println("Introduzca un número distinto de cero");
		num2= sc.nextInt();
		}while(num2==0);
		
		System.out.println("El resultado de dividir " + num1 + " entre " + num2 + " es: " + (num1/num2));
		
		sc.close();
	}

}
