package Ficheros;

import java.io.*;
import javax.swing.*;

public class CreoArchivos {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		// Creando el directorio EjerciciosStreams
		
		File directorio= new File("C:/EjerciciosStream");
		if (!directorio.exists()) {
			directorio.mkdirs();
			JOptionPane.showMessageDialog(null, "Se ha creado el directorio");
		} else {
			JOptionPane.showMessageDialog(null, "Error, el directorio ya existe");
		}
		// Creando los tres archivos  OJO CON LA DIRECCION		
		File uno = new File("C:/Users/pc/eclipse-workspace/Programacion/EjerciciosStream/uno.java");
		File dos = new File("C:/Users/pc/eclipse-workspace/Programacion/EjerciciosStream/dos.java");
		File tres = new File("C:/Users/pc/eclipse-workspace/Programacion/EjerciciosStream/tres.java");
		File cuatro = new File("C:/Users/pc/eclipse-workspace/Programacion/EjerciciosStream1/cuatro.java");
		File datos1 = new File("C:/Users/pc/eclipse-workspace/Programacion/EjerciciosStream/datos1.txt");
	
		try {
			if(uno.createNewFile()) {
				System.out.println("El archivo" + uno + " se ha creado correctamente." );
			} else {
				System.out.println("¡¡ERROR!! El archivo "+ dos + " no se ha creado porque ya existe");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			if(dos.createNewFile()) {
				System.out.println("El archivo" + dos + " se ha creado correctamente." );
			} else {
				System.out.println("¡¡ERROR!! El archivo  " + dos + " no se ha creado porque ya existe");
			}
		}catch (IOException e) {
			e.printStackTrace();
		}
		try {
			if(tres.createNewFile()) {
				System.out.println("El archivo" + tres + " se ha creado correctamente." );
			} else {
				System.out.println("¡¡ERROR!! El fichero  " + tres + " no se ha creado porque ya existe");
			}
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		cuatro.createNewFile();
	}
}
		
		

