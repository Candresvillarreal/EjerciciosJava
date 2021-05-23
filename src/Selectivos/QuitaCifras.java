package Selectivos;

import java.util.*;

public class QuitaCifras {
	
	//Se piden dos n�meros, N y m.  A N se le quitan tantas cifras como indique el n�mero m
	//P.Ej. Si N=123456 y m=2, N debe mostrarse como 1234

	public static void main(String[] args) {
		
		int N;
		int m;
		int resultado;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un n�mero");
		N = sc.nextInt();
		System.out.println("Introduzca el segundo n�mero");
		m = sc.nextInt();
		
		resultado = N / (int)Math.pow(10, m);
		
		System.out.println("Al n�mero " + N + " se le han restado " + m + " cifras.");
		System.out.println("Este el es el n�mero resultante: " + resultado);
		
		
		sc.close();
	

	}

}
