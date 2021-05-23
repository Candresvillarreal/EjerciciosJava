package ConexionBBDD;

import java.sql.*;

public class ConexionMySQL {

	public static void main(String[] args) {
		
		try {
			
			Connection mySQLConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306", "tu_usuario", "tu_contraseña");
			
			System.out.println("Conexión establecida");
			
		}catch(Exception e){
			
			System.out.println("No se ha podido establecer conexión");
			
			e.printStackTrace();
		}
	
	}

}
