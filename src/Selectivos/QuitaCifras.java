package Selectivos;

import java.util.*;

public class QuitaCifras {
	
	//Se piden dos números, N y m.  A N se le quitan tantas cifras como indique el número m
	//P.Ej. Si N=123456 y m=2, N debe mostrarse como 1234

	public static void main(String[] args) {
		
		int N;
		int m;
		int resultado;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número");
		N = sc.nextInt();
		System.out.println("Introduzca el segundo número");
		m = sc.nextInt();
		
		resultado = N / (int)Math.pow(10, m);
		
		System.out.println("Al número " + N + " se le han restado " + m + " cifras.");
		System.out.println("Este el es el número resultante: " + resultado);
		
		
		sc.close();
	

	}

}
