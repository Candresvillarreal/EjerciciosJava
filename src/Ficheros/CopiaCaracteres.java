package Ficheros;

import java.io.*;

public class CopiaCaracteres {
	
	//Programa que lee caracteres y los copia en otro archivo

	public static void main(String[] args) throws IOException{
		
		
		FileReader in=null;
		FileWriter out=null;
		
		try {
			
			in=new FileReader("C:/Users/pc/eclipse-workspace/ArchivosPruebas/Archivo.txt");
			out=new FileWriter("C:/Users/pc/eclipse-workspace/ArchivosPruebas/CopiaCaracteres.txt");
			
			int d;
			
			//Los ficheros terminan en -1
			
			while((d=in.read())!=-1){
				out.write(d);
			}
		}finally {
			if(in!=null) {
				in.close();
			}
			
			if(out!=null) {
				out.close();
			}
		}

	}

}
