package Iterativos;

import java.util.*;

public class Positivo {

	public static void main(String[] args) {
		
		int num;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca un n�mero");
		
		num = sc.nextInt();
		
		//Mientras el n�mero sea menor que cero, pido que se introduzca un n�mero positivo
		
		while(num<0) {
			
			System.out.println("Debe introducir un n�mero positivo");
			num = sc.nextInt();
			
		}
		
		sc.close();

	}

}
