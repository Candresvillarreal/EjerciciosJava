package ArraysBidimensionales;

import java.util.*;

public class MultiplicoMatrizElaborado {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Defino las dos matrices que quiero multiplicar
		
		int[][] a = {{7,1,3}, {5,6,8}, {4,2,5}};
		int[][] b = {{7,10,2}, {3,5,1}, {6,2,4,}};
		
		if(a[0].length!=b.length) {
			System.out.println("Las matrices no pueden multiplicarse");
		}
		else {
			System.out.println("Las matrices pueden multiplicarse");
			System.out.println("Quiere multiplicarlas? S/N");
			Scanner sc = new Scanner(System.in);
			String opcion=sc.nextLine();
			if(opcion.equalsIgnoreCase("S")) {
				int[][] resultado = new int[a.length][b[0].length];
				for(int i=0; i<a.length; i++) {
					for(int j=0; j<b.length; j++) {
						for(int k=0; k<a[0].length; k++) {
							resultado[i][j] += a[i][k] * b[k][j];
						}
					}
				}
				sc.close();
				
				for(int i=0; i<resultado.length; i++) {
					System.out.println("\n");
					for(int j=0; j<resultado.length; j++) {
						System.out.print(" ");
						System.out.print(resultado[i][j]);
					}
				}
			}
			else {
				System.out.println("Ejecución terminada. Muchas gracias");
			}
		}	
		
	}
}
