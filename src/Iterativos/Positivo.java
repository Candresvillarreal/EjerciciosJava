package Iterativos;

import java.util.*;

public class Positivo {

	public static void main(String[] args) {
		
		int num;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca un número");
		
		num = sc.nextInt();
		
		//Mientras el número sea menor que cero, pido que se introduzca un número positivo
		
		while(num<0) {
			
			System.out.println("Debe introducir un número positivo");
			num = sc.nextInt();
			
		}
		
		sc.close();

	}

}
