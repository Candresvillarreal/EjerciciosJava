package Iterativos;

import java.util.*;

public class DeNa1 {
	
	//Se pide un n�mero y se muestran todos los n�meros entre ese n�mero y el 1

	public static void main(String[] args) {
		
		int N;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca un n�mero:");
		
		N = sc.nextInt();
		
		for(int i=N; i>=1; i--) {
			System.out.println(i);
		}
		
		sc.close();
		

	}

}
