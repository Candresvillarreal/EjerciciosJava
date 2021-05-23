package Iterativos;

import java.util.*;

public class ParImpar {
	
	//Se introduce un número y se indica si es par o impar

	public static void main(String[] args) {
		
		int num;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introducen un número: ");
		num = sc.nextInt();
		
		if(num%2==0) {
			System.out.println("El número es par");
		}
		else {
			System.out.println("El número es impar");
		}
		
		sc.close();
		
		

	}

}
