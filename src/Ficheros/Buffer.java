package Ficheros;

import java.io.*;

public class Buffer {
	
	//Leemos los datos del archivo datos.txt y los mostramos por consola

	public static void main(String[] args) throws IOException {
		
		File origen = new File("C:/Users/pc/eclipse-workspace/Programacion/EjerciciosStream/datos.txt");
		String cadena;
		
		FileReader datos = new FileReader(origen);
		BufferedReader out = new BufferedReader(datos);
		
		try {
			while((cadena=out.readLine())!=null) {
				System.out.println(cadena);
			}

		}catch (IOException e) {
			e.printStackTrace();
		}

	}

}
