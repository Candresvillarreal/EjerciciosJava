package ConexionBBDD;

import java.sql.*;
import javax.swing.*;

public class ConexionOracle {
	
	public static void main(String[] args) {
		
			try {
				
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection conexion = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:tu_basededatos", "tu_usuario", "tu_contrase�a");
				System.out.println("Conexi�n realizada");
				
			}catch(Exception e){
				
				System.out.println("Conexi�n realizada");
				e.printStackTrace();
			}
	}
	
}
