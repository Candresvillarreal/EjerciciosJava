package Iterativos;

import java.util.*;

public class ParImpar {
	
	//Se introduce un n�mero y se indica si es par o impar

	public static void main(String[] args) {
		
		int num;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introducen un n�mero: ");
		num = sc.nextInt();
		
		if(num%2==0) {
			System.out.println("El n�mero es par");
		}
		else {
			System.out.println("El n�mero es impar");
		}
		
		sc.close();
		
		

	}

}
