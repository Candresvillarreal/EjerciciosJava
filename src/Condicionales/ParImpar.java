package Condicionales;

import java.util.*;

public class ParImpar {

	public static void main(String[] args) {
		
		int num;
		int par;
		int impar;
		
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		if(num%2==0) {
			System.out.println("El número es par");
		}
		
		else {
			System.out.println("El número es impar");
		}
		
		

	}

}
