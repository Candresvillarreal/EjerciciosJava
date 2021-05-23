package Iterativos;

import java.util.*;

public class MayorMenor {
	
	//Introducir tres números e indicar cuál es el mayor y el menor

	public static void main(String[] args) {
		
		int n1;
		int n2;
		int n3;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca el primer número");
		n1 = sc.nextInt();
		System.out.println("Introduzca el segundo número");
		n2 = sc.nextInt();
		System.out.println("Introduzca el tercer número");
		n3 = sc.nextInt();
		
		if(n1>n2 && n1>n3) {
			System.out.println("El número mayor es: " + n1);
			if(n1<n2 && n1<n3) {
				System.out.println("El número menor es: " + n1);
			}
		}else if(n2>n3){
			System.out.println("El número mayor es: " + n2);
			System.out.println("El número menor es: " + n3);
		}else {
			System.out.println("El número mayor es: " + n3);
			System.out.println("El número menor es: " + n2);
		}
		
		sc.close();
		

	}

}
