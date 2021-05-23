package Iterativos;

import java.util.*;

public class DeNa1 {
	
	//Se pide un número y se muestran todos los números entre ese número y el 1

	public static void main(String[] args) {
		
		int N;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca un número:");
		
		N = sc.nextInt();
		
		for(int i=N; i>=1; i--) {
			System.out.println(i);
		}
		
		sc.close();
		

	}

}
