package Ficheros;

import java.io.*;

public class CreandoArchivo {
	
	//Programa que copia el contenido de un String en un archivo indicado

	public static void main(String[] args) throws IOException {
		
		
		try {
			//Establecemos el archivo en el que se copiar�n los datos
			
			String ubicacion ="C:/EjerciciosStream/datos4.txt";
			
			//String con el texto a copiar
			
			String texto = "Cualquier programa que se desarrolle en Java y que tenga la necesidad de recibir" +"\n"
					+ "o enviar datos lo har� a trav�s de lo que se ha definido como un flujo (stream)." + "\n"
					+ "La vinculaci�n de un stream a con un dispositivo f�sico concreto la va a realizar Java. "+"\n"
					+ "Por lo tanto, las clases y los m�todos que utilicemos van a ser las mismas sin tener en " +"\n"
					+ "cuenta el dispositivo con el cual vamos a interactuar. Java se va a encargar de realizar"+"\n"
					+ "esa tarea y ser� el que se comunique con el teclado, el monitor o cualquier otro dispositivo."+"\n"
					+ "En esta unidad se ha comenzado analizando el concepto de flujo de entrada/salida."+"\n"
					+ "Posteriormente se han clasificado los flujos dependiendo de si est�n orientados a bytes, " +"\n"
					+ "a caracteres o a l�neas. Se ha visto c�mo se realiza la entrada y la salida desde la l�nea "+"\n"
					+ "de comandos. M�s adelante se ha centrado la atenci�n en los flujos de datos y los flujos de " + "\n"
					+ "datos, analizando el concepto de serializaci�n. Despu�s se ha conocido qu� es el objeto"+"\n"
					+ "File para finalizar con los archivos de acceso aleatorio";
			
			//Creamos el objeto tipo File
			
			File resumen = new File(ubicacion);
			if(!resumen.exists()) {
				resumen.createNewFile();
				System.out.println("El archivo se creado correctamente");
			}
			
			//Escribimos en el archivo el contenido del String
			
			FileWriter escribir = new FileWriter(resumen);
			BufferedWriter out = new BufferedWriter(escribir);
			out.write(texto);
			out.close();
		}catch (IOException e) {
			e.printStackTrace();	
		}
	}
}
