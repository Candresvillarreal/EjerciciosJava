package Condicionales;

import java.util.*;

public class FormatoHora {

	public static void main(String[] args) {
		
		int H;
		int M;
		int S;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca la hora:");
		H = sc.nextInt();
		System.out.println("Introduzca los minutos:");
		M = sc.nextInt();
		System.out.println("Introduzca los segundos: ");
		S = sc.nextInt();
		
		if(H>=0 && H<=24 && M>=0 && M<=60 && S>=0 && S<=60) {
			System.out.println("La hora introducida es correcta");
		}else {
			System.out.println("La hora introducida es incorrecta");
		}

		sc.close();
	}

}
