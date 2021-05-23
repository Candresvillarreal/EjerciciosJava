package Iterativos;

import java.util.*;

public class TablaMultiplicar {
	
	//Se pide un número y se muestra su tabla de multiplicar utilizando una estructura for

	public static void main(String[] args) {
		
		int N;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca un número entero");
		
		N = sc.nextInt();
		
		System.out.println("Esta es la tabla de multiplicar del número " + N);
		
		for(int i=1; i<=10; i++) {
			System.out.println(N + " * " + i + " = " + (N*i));
		}
		
		sc.close();
	}
}
