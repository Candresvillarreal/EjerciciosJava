package Iterativos;

import java.util.*;

public class MayorMenor {
	
	//Introducir tres n�meros e indicar cu�l es el mayor y el menor

	public static void main(String[] args) {
		
		int n1;
		int n2;
		int n3;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca el primer n�mero");
		n1 = sc.nextInt();
		System.out.println("Introduzca el segundo n�mero");
		n2 = sc.nextInt();
		System.out.println("Introduzca el tercer n�mero");
		n3 = sc.nextInt();
		
		if(n1>n2 && n1>n3) {
			System.out.println("El n�mero mayor es: " + n1);
			if(n1<n2 && n1<n3) {
				System.out.println("El n�mero menor es: " + n1);
			}
		}else if(n2>n3){
			System.out.println("El n�mero mayor es: " + n2);
			System.out.println("El n�mero menor es: " + n3);
		}else {
			System.out.println("El n�mero mayor es: " + n3);
			System.out.println("El n�mero menor es: " + n2);
		}
		
		sc.close();
		

	}

}
