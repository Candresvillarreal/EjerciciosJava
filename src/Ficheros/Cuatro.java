package Ficheros;

import java.io.*;

public class Cuatro {
	
	//

	public static void main(String[] args) throws IOException {
		
		String frases;
		int contador=0;
		int datos_entrada[]=new int[1025];  
		
		RandomAccessFile resultado = new RandomAccessFile("C:/Users/pc/eclipse-workspace/Programacion/EjerciciosStream/datosAleatorio.txt", "rw");
		
		File texto = new File("C:/EjerciciosStream/datos4.txt");
		
		// Leo e imprimo en consola el contenido de datos4.txt filereader y filewriter
		try {
			FileReader parrafo = new FileReader(texto);
			BufferedReader origen = new BufferedReader(parrafo);
			while((frases=origen.readLine())!=null){
				System.out.println(frases);
			}
		}catch (IOException e){
			
		}
		
		try {
			FileInputStream archivo_lectura = new FileInputStream(texto);
			boolean final_archivo=false;
			
			while(!final_archivo) {
				
				int byte_entrada=archivo_lectura.read();
				
				if(byte_entrada!=-1)
					datos_entrada[contador]=byte_entrada;
				else
					final_archivo=true;
				
				contador ++;
			}
			archivo_lectura.close();
		}catch (IOException e){
			System.out.println("Error al acceder al archivo");
		}
		
		System.out.println("\n" + "El numero de bytes de archivo "+ texto + " es " +  contador);
		
		creando_fichero(datos_entrada);
			
	}
	
	
	static void creando_fichero(int datos_nuevo_archivo[]) {
		try {
			FileOutputStream fichero_nuevo = new FileOutputStream("C:/Users/pc/eclipse-workspace/Programacion/EjerciciosStream/datosAleatorio.txt");
			for(int i=0; i<datos_nuevo_archivo.length; i++) {
				fichero_nuevo.write(datos_nuevo_archivo[i]);
			}
			fichero_nuevo.close();
			
		}catch (IOException e) {
			System.out.println("Error al crear el archivo");
			
		}
	
	}
}
		

			


