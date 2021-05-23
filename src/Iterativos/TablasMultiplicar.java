package Iterativos;

public class TablasMultiplicar {
	
	//Se muestran las tablas de multiplicar del 1 hasta el 10

	public static void main(String[] args) {
		
		//Con un bucle for recorremos del 1 al 10 (tabla del 1, tabla del 2...)
		
		for(int i=1; i<=10; i++) {
			System.out.println("");
			System.out.println("Tabla de multiplicar del número " + i);
			System.out.println("");
			
			//Con otro bucle for recorremos los 10 números que forman la tabla de multiplicar
			
			for(int j=1; j<=10; j++) {
				System.out.println(i + " * " + j + " = " + (i*j));
			}
		}
		

	}

}
