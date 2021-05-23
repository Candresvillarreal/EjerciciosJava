package Ficheros;

import java.io.*;

public class EscribirUno {
	
	//Programa que copia el contenido de una fichero(cuatro.java) en otro (uno.java)

	public static void main(String[] args) throws IOException{
		
		//Comprobar que el fichero uno.java existe y si tiene permisos de escritura
		
		String uno="C:/Users/pc/eclipse-workspace/Programacion/EjerciciosStream/cuatro.java";
		File fichero = new File(uno);
		
		if (fichero.exists()) {
			System.out.println("El fichero " + uno + " existe.");
			if (fichero.canWrite()) {
				System.out.println("El archivo tiene permiso de escritura");
					String num;
					FileWriter escribir=null;
					try {
						escribir = new FileWriter(fichero);
						for (int i=0; i<=10; i++) {
							num= String.valueOf(i);
							escribir.write(i+"\n");
						}
						escribir.close();
						System.out.println("El archivo se ha escrito correctamente");
					}catch (IOException e) {
					System.out.println("Error: " + e.getMessage());
					}	
			}else {
				System.out.println("El archivo no tiene permisos de escritura");
			}
		}else {
			System.out.println("El fichero " + uno + " no existe.");
			System.out.print("No se ha podido realizar la operación");
		}
	}
}


		
/*opcion 2
String[] lineas= {"0, ", "1, ", "2, ", "3, ", "4, ", "5, ", "6, ", "7, ", "8, ", "9, ", "10 "};
FileWriter escribir= null;

try {
	
	escribir = new FileWriter(fichero);
	
	for (String linea: lineas) {
		escribir.write(linea+"\n");
	}
	
	escribir.close();
}catch (IOException e) {
	System.out.println("Error: " + e.getMessage());
}*/
