package Ficheros;

import java.io.*;
import java.util.*;

public class EscribirDos {
	
	/*Programa que pide que se introduzcan la base y la altura de un triángulo para calcular su área
	 * y a continuación escribir los datos introducidos y el resultado en el archivo dos.java
	 */

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce la base del triángulo:");
		int base = entrada.nextInt();
		
		System.out.println("Introduce la altura del triángulo:");
		int altura = entrada.nextInt();
		
		System.out.println("La base introducida es "+ base + " y la altura es " + altura);
		
		int area =  (base * altura) / 2;
		
		System.out.println("El área del triángulo es: " + area);
		
		//Escribo el resultado en dos.java
		File dos = new File("C:/Users/pc/eclipse-workspace/Programacion/EjerciciosStream/dos.java");
		BufferedWriter data=null;
		if(dos.exists()) {
			try {
				data = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(dos)));
				data.write(String.valueOf("Base introducida: " + base + "\n"));
				data.write(String.valueOf("Altura introducida: " + altura + "\n"));
				data.write(String.valueOf("El área del triángulo con base " + base + " y altura "
					+ altura + " es: " + area));
				data.close();
				System.out.println("Los datos se han escrito correctamente en: " + "\n" + dos);
			}catch (IOException e) {
				System.out.println("Error: " + e.getMessage());
			}
		}else {
			System.out.print("Error: No pueden escribirse los datos. El archivo indicado no existe");
		}
		entrada.close();
	}

}
