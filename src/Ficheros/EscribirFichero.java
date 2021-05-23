package Ficheros;

import java.io.*;

public class EscribirFichero {
	
	//Comprueba que un archivo existe y si tiene permisos de escritura
	
	public static void main(String[] args) throws IOException{
		
		//Comprobar que el fichero datos1.txt existe y si tiene permisos de escritura
		
		String datos1=("C:/Users/pc/eclipse-workspace/Programacion/EjerciciosStream/datos1.txt");
		File fichero = new File(datos1);
		
		if (fichero.exists()) {
			System.out.println("El fichero " + datos1 + " existe.");
			if (fichero.canWrite()) {
				System.out.println("El archivo tiene permiso de escritura");
					FileWriter escribir=null;
					try {
						escribir = new FileWriter(fichero);
						for (int i=0; i<=10; i++) {
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
			System.out.println("El fichero " + datos1 + " no existe.");
			System.out.print("No se ha podido realizar la operación");
		}
	}

}
	


