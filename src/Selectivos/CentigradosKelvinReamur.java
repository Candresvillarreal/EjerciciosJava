package Selectivos;

import java.util.*;

public class CentigradosKelvinReamur {
	
	//Aplicaci�n que pasa de �C a �R a �K

	public static void main(String[] args) {
		
		// �C/100 = �R/80 = �k-273/100
		
		
		double gradosC;
		double gradosR;
		double gradosK;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca los grados cent�grados que quiera convertir");
		gradosC = sc.nextInt();
		
		gradosR = ((gradosC*80)/100);
		gradosK = (gradosC + 273);
		
		System.out.printf("\n%.2f �C equivalen a %.2f �R y a %.2f �K \n", gradosC, gradosR, gradosK);
		
		sc.close();
	}

}
