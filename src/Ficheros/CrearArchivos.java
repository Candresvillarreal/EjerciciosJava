package Ficheros;

import java.io.File;
import java.io.IOException;

import javax.swing.JOptionPane;

public class CrearArchivos {

	public static void main(String[] args) {
		
		//Creo un nuevo directorio 
		
		File directorio = new File("C:/Users/pc/eclipse-workspace/Repeticiones");
		if(!directorio.exists()) {
			directorio.mkdir();
			JOptionPane.showMessageDialog(null, "Se ha creado el directorio");
		}else {
			JOptionPane.showMessageDialog(null, "Error, el directorio ya existe");
		}
		
		//Creo tres archivo en el directorio que acabo de crear
		
		File uno = new File("C:/Users/pc/eclipse-workspace/Repeticiones/uno.java");
		File dos = new File("C:/Users/pc/eclipse-workspace/Repeticiones/dos.java");
		File tres = new File("C:/Users/pc/eclipse-workspace/Repeticiones/tres.java");
		
		try {
			if(uno.createNewFile()) {
				System.out.println("El archivo " + uno + " se ha creado correctamente");
			}else {
				System.out.println("¡¡ERROR!! El archivo " + uno + " no se ha podido crear");
			}
		}catch (IOException e){
			e.printStackTrace();
			
		}
		
		try {
			if(dos.createNewFile()) {
				System.out.println("El archivo " + dos + " se ha creado correctamente");
			}else {
				System.out.println("¡¡ERROR!! El archivo " + dos + " no se ha podido crear");
			}
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			if(tres.createNewFile()) {
				System.out.println("El archivo " + tres + " se ha creado correctamente");
			}else {
				System.out.println("¡¡ERROR!! El archivo " + tres + " no se ha podido crear");
			}
		}catch (IOException e){
			e.printStackTrace();
		}
	}

}
