package Iterativos;

import java.util.*;

public class DeMenoraMayor {
	
	/*Se piden dos n�meros y se comprueba que no sean iguales.  Luego se comprueba c�al es el menor y el mayor
	 * y se muestran los n�meros desde el menor al mayor
	 */

	public static void main(String[] args) {
		
		int n1;
		int n2;
		int mayor=0;
		int menor=0;
		boolean distintos=false;
		
		Scanner sc = new Scanner(System.in);
		
		//Pedimos los dos n�meros y comprobamos que son distintos
		
		while(!distintos) {
		System.out.println("Introduce un n�mero: ");
		n1 = sc.nextInt();
		System.out.println("Introduce un n�mero distinto al anterior: ");
		n2 = sc.nextInt();
			if(n1==n2) {
				System.out.println("Debe introducir dos n�meros distitnos");
			}else {
				distintos=true;
			}
		
		
			//Determinamos el menor y el mayor
		
			if(n1>n2) {
			mayor = n1;
			menor = n2;
			}else {
				mayor = n2;
				menor = n1;
			}
			
			//Mostramos los n�meros entre el menor y el mayor
			
			for(int i=menor; i<=mayor; i++) {
				System.out.println(i);
			}
		
		}
	}

}
