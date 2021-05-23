package Selectivos;

import java.util.*;

public class CincoCifrasInversa {
	
	//Se pide un número de 5 cifras y se muestra la primera y se va añadiendo y mostrando otra cifra 

	public static void main(String[] args) {
		
		int num;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número de 5 cifras");
		num = sc.nextInt();
		
		System.out.println(num%10);
		System.out.println(num%100);
		System.out.println(num%1000);
		System.out.println(num%10000);
		System.out.println(num);
		
		sc.close();

	}

}
