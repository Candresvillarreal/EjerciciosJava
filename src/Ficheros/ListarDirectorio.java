package Ficheros;

import java.io.*;

public class ListarDirectorio {
	
	//Programa que muestra el contenido de un directorio y, si tiene carpetas, su contenido

	public static void main(String[] args) {
		
		System.out.println("Este es el contenido del directorio indicado: ");
		System.out.println(" ");
		
		File ficheros=new File("C:/Users/pc/eclipse-workspace");
		
		String[] archivos=ficheros.list();
		
		for(int i=0; i<archivos.length; i++) {
			
			System.out.println(archivos[i]);
		
		/*si quiero ver lo que hay dentro de alguna de las carpetas listadas 
		 * el metodo Boolean isDirectory nos dice si un archivo es o no una carpeta con un bucle for. 
		 * Si es carpeta, le diremos que entre y liste lo que hay con el metodo list si no es una carpeta, pasa al siguiente archivo*/
		
		//Indicamos las rutas del directorio, y de las carpetas del directorio
		
			File f=new File(ficheros.getAbsolutePath(), archivos[i]);
			
			// con el if, discriminamos entre archivos y directorios
			if (f.isDirectory()) {
				System.out.println("---------------- ");
				
				// si es directorio, le decimos que liste los nombre
				
				String[] archivos_subcarpeta=f.list();
				
				// con el for entramos en cada subcarpeta y listamos sus archivos
				
				System.out.println(" ");
				for(int j=0;j<archivos_subcarpeta.length; j++) {
					
					System.out.println(archivos_subcarpeta[j]);
					
				}
				System.out.println("---------------- ");
			}
		}

	}

}
