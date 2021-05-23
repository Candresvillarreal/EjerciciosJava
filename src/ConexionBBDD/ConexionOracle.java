package ConexionBBDD;

import java.sql.*;
import javax.swing.*;

public class ConexionOracle {
	
	public static void main(String[] args) {
		
			try {
				
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection conexion = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:tu_basededatos", "tu_usuario", "tu_contraseña");
				System.out.println("Conexión realizada");
				
			}catch(Exception e){
				
				System.out.println("Conexión realizada");
				e.printStackTrace();
			}
	}
	
}
