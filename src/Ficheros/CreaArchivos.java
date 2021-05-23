package Ficheros;

import java.io.*;  //importo el paquete java.io
import javax.swing.*;

public class CreaArchivos {
	
	//Aplicación que crea un directorio y tres archivos

	public static void main(String[] args) {
		
		// Creando el directorio EjerciciosStreams
		
		File directorio= new File("C:/EjerciciosStream");
		
		
			if (!directorio.exists()) {
				directorio.mkdirs();
				JOptionPane.showMessageDialog(null, "Se ha creado el directorio");
			
			} else {
				JOptionPane.showMessageDialog(null, "No se ha podido crear el directorio porque ya existe");
						
			}
			
		// Creando los tres archivos		
		
			File uno = new File("C:/EjerciciosStream/uno.java");
			File dos = new File("C:/EjerciciosStream/dos.java");
			File tres = new File("C:/EjerciciosStream/tres.java");
			
		try {
			if(uno.createNewFile()) {
				JOptionPane.showMessageDialog(null, "El fichero " + uno + " se ha creado correctamente");
				
			}else {
				JOptionPane.showMessageDialog(null, "El archivo  " + uno + " no se ha creado porque ya existe");
			}
		}catch (IOException e) {
				e.printStackTrace();
				
		}
		try {
			if(dos.createNewFile()) {
				JOptionPane.showMessageDialog(null, "El fichero " + dos + " se ha creado correctamente");
				
			}else {
				JOptionPane.showMessageDialog(null, "El fichero " + dos + " no se ha creado porque ya existe");
			}
		}catch (IOException e) {
				e.printStackTrace();
				
		}
		try {
			if(tres.createNewFile()) {
				JOptionPane.showMessageDialog(null, "El fichero " + tres + " se ha creado correctamente");
				
			}else {
				JOptionPane.showMessageDialog(null, "El fichero  " + tres + " no se ha creado porque ya existe");
			}
		}catch (IOException e) {
				e.printStackTrace();
				
		}
			
		//Comprobando la creación del directorio y los archivos
		
		File comprobacion = new File("C:/Users/pc/eclipse-workspace/Programacion/EjerciciosStream");
		
		System.out.println("La ruta del directorio creado es: " + comprobacion.getAbsolutePath());
		System.out.println("Los archivos creados dentro de EjerciciosStream son: ");
		String[] archivos_creados=comprobacion.list();
		
		for(int i=0; i<archivos_creados.length; i++){
			System.out.println(archivos_creados[i]);
		}
				
	}

}
