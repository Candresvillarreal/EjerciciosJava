package ConexionBBDD;

import java.sql.*;

public class ConexionMySQL {

	public static void main(String[] args) {
		
		try {
			
			Connection mySQLConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306", "tu_usuario", "tu_contrase�a");
			
			System.out.println("Conexi�n establecida");
			
		}catch(Exception e){
			
			System.out.println("No se ha podido establecer conexi�n");
			
			e.printStackTrace();
		}
	
	}

}
