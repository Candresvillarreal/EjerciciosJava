package Ficheros;

import java.io.*;

public class CopiaBytes {
	
	//Programa que copia el contenido de un archivo en otro

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		FileInputStream in=null;
		FileOutputStream out=null;
		
		try {
		
		//creamos los flujos de entrada y salida
			
			in= new FileInputStream("C:/Users/pc/eclipse-workspace/ArchivosPruebas/Archivo.txt");  
			out=new FileOutputStream("C:/Users/pc/eclipse-workspace/ArchivosPruebas/CopiaBytes.txt");
			
			//guardo cada byte en una variable tipo int que llamo c
			
			int c; 
			
			//Los archivos terminan en -1, por tanto mientras es distinto de -1 seguimos leyendo y copiando
			
			while((c=in.read())!=-1) {
				out.write(c);
			}
			
		}finally {
			
			if(in!=null) {
				in.close();  //cerramos el flujo de entrada
			}
			
			if(out!=null) {
				out.close();  //cerramos el flujo de salida
			}
				
		}

	}

}
