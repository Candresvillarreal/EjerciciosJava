package Condicionales;

import java.util.*;

public class Multiplo10 {

	public static void main(String[] args) {
		
		int num;
		
		System.out.println("Introduzca un n�mero");
		
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		if(num%10==0) {
			System.out.println("El n�mero es m�ltiplo de 10");
		}else {
			System.out.println("El n�mero no es m�ltiplo de 10");
		}
		
		sc.close();
	}

}
