package Ficheros;

import java.io.*;

public class EntradaEstandar {
	
	//Programa que pide que se introduzcan caracteres por teclado y los muestra por pantalla

	public static void main(String[] args) throws IOException {
		
		BufferedReader stdin=null;
		stdin=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Introduzca caracteres y pulse Intro: ");
		
		String linea=stdin.readLine();
		System.out.println("Ha escrito: " + linea);
		
		stdin.close();

	}

}
