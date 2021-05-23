package Ficheros;

import java.io.*;

public class Aleatorio {
	
	//Creación de objetos tipo RandomAccessFile sobre los que se realizan distintas operaciones

	public static void main(String[] args) {
		
		RandomAccessFile rf=null;
		
		try {
			rf= new RandomAccessFile("aleatorio.dat", "rw");
			for (int i=0; i<10; i++) {
				rf.writeDouble(Math.sqrt(i));  //Math.sqrt calcula la raiz cuadrada de i
			}
			rf.close();
		}catch (IOException e) {
			System.out.println("Error de E/S parte 1:\n" + e.getMessage());
		}
		
		try {
			rf= new RandomAccessFile("aleatorio.dat", "rw");
			rf.seek(5*8); // Avanza el puntero 40 bytes, 5 double de 8 bytes
			System.out.println("\nPuntero antes de lectura: " + rf.getFilePointer());
			System.out.println(" Valor: " + rf.readDouble());
			System.out.println("\nPuntero después de la lectura: " + rf.getFilePointer());
			rf.seek(rf.getFilePointer()-8); // Restaura el puntero al registro 6
			System.out.println("\nPuntero restaurado: " + rf.getFilePointer() + "\n");
			rf.writeDouble(333.0003); // Cambia el registro
			rf.close();
		}catch (IOException e) {
			System.out.println("Error de E/S parte 2:\n" + e.getMessage());
		}
		
		try {
			rf= new RandomAccessFile("aleatorio.dat", "r");
			for(int i=0; i<10; i++) {
				System.out.print("\nPuntero en: " + rf.getFilePointer() + " ");
				System.out.println("valor: " + rf.readDouble());
			}
			rf.writeDouble(1.1111);  // Intento escribir en un archivo de solo lectura
			rf.close();
		}catch (IOException e) {
			System.out.println("Error de E/S parte 3:\n" + e.getMessage());
	}

}
}
