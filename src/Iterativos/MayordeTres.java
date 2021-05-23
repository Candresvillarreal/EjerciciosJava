package Iterativos;

import java.util.*;

public class MayordeTres {
	
	//Programa que lee tres números e indica cuál es mayor

	public static void main(String[] args) {
		
		int n1;
		int n2;
		int n3;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número: ");
		n1 = sc.nextInt();
		System.out.println("Introduzca el segundo número: ");
		n2 = sc.nextInt();
		System.out.println("Introduzca el tercer número: ");
		n3 = sc.nextInt();
		
		if(n1>n2) {
			if(n1>n3) {
				System.out.println("El número mayor es: " + n1);
			}
		}else if(n2>n3) {
				System.out.println("El número mayor es: " + n2);
		}else {
				System.out.println("El número mayor es: " + n3);
					
		}
		
		sc.close();
			
	}

}
