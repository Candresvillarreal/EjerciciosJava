package Selectivos;

import java.util.*;

public class CentigradosKelvinReamur {
	
	//Aplicación que pasa de ºC a ºR a ºK

	public static void main(String[] args) {
		
		// ºC/100 = ºR/80 = ºk-273/100
		
		
		double gradosC;
		double gradosR;
		double gradosK;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca los grados centígrados que quiera convertir");
		gradosC = sc.nextInt();
		
		gradosR = ((gradosC*80)/100);
		gradosK = (gradosC + 273);
		
		System.out.printf("\n%.2f ºC equivalen a %.2f ºR y a %.2f ºK \n", gradosC, gradosR, gradosK);
		
		sc.close();
	}

}
