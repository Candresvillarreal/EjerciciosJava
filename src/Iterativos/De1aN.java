package Iterativos;

import java.util.*;

public class De1aN {
	
	//Pedimos un n�mero y se muestran los n�meros entre el 1 y el n�mero introducido

	public static void main(String[] args) {
		
		int N;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca un n�mero: ");
		
		N = sc.nextInt();
		
		for(int i=1; i<=N; i++) {
			System.out.println(i);
		}
		
		sc.close();
	}

}
