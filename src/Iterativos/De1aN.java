package Iterativos;

import java.util.*;

public class De1aN {
	
	//Pedimos un número y se muestran los números entre el 1 y el número introducido

	public static void main(String[] args) {
		
		int N;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca un número: ");
		
		N = sc.nextInt();
		
		for(int i=1; i<=N; i++) {
			System.out.println(i);
		}
		
		sc.close();
	}

}
