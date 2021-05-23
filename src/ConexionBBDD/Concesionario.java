package ConexionBBDD;

import java.sql.*;
import java.io.*;

public class Concesionario {
	
	//Ejemplo de acceso a BBDD y realización de distintas operaciones sobre BBDD y tablas

	public static void main(String[] args) throws SQLException, IOException {
		
		//Ejecución de los métodos:
		
		//Creación base de datos. Linea:
		creaBBDD();
		
		//Creación tablas. Linea:
		creaTablas();
		
		//Inserción datos de clientes. Linea:
		insertaCliente();
		
		//Inserción datos de empleados.  Linea:
		insertaEmpleado();
		
		//Inserción datos de coches. Linea:
		insertaCoche();
		
		//Inserción datos de coches desde fichero txt. Linea:
		insertaCocheFichero();
		
		//Ejecución consulta sobre empleados.  Linea:
		consultaEmpleados();
		
		//Ejecución consulta sobre coches. Linea:
		consultaCoches();
		
		//Ejecución consulta sueldos y actualización.  Linea:
		//actualizaSueldos();
		
		//Ejecución consulta sueldos y actualizacion opcion2:
		actualizaSueldo2();
		
	}

		//Método para crear la BBDD Concesionario
		
		public static void creaBBDD() {
		
		//Establezco la conexion con MySQL
		
			try {
			
				Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "");
				
				System.out.println("--------------------------------------------------");
				System.out.println("\n");
				System.out.println("Conexión establecida" + "\n");
			
				//Creo un objeto Statement
			
				Statement miStatement = miConexion.createStatement();
			
				//Creo la base de datos Concesionario
				
				String CreoBD="CREATE DATABASE CONCESIONARIO";
			
				miStatement.executeUpdate(CreoBD);
			
				System.out.println("Se ha creado la base de datos Concesionario" + "\n");
				System.out.println("\n");
				
				//Cierro la conexion
				
				miConexion.close();
			
			}catch(SQLException e) {
			
				System.out.println("No se ha podido establecer la conexión solicitada");
				e.printStackTrace();	
			}	
		}
			
		//Método para crear las tablas de la BBDD Concesionario
		
		public static void creaTablas() {
	
			try {
				
				//Establezco una nueva conexión con la base de datos Concesionario
				
				Connection concesionario = DriverManager.getConnection("jdbc:mysql://localhost:3306/CONCESIONARIO", "root", "");
				
				System.out.println("--------------------------------------------------");
				System.out.println("\n");
				System.out.println("Conexión establecida con la BBDD Concesionario" + "\n");
				
				//Creo un objeto Statement
			
				Statement creaTabla = concesionario.createStatement();
						
				//Creo las tablas
			
				//Sentencias para crear las diferentes tablas, con sus campos y tipos
			
				String empleados = ("CREATE TABLE EMPLEADOS(NIF VARCHAR(9) PRIMARY KEY, NOMBRE VARCHAR(20), APELLIDO1 VARCHAR(20), "
						+ "APELLIDO2 VARCHAR(20), "
					+ "DIRECCION VARCHAR(50), TELEFONO VARCHAR(9), EMAIL VARCHAR(100), SUELDO INT)");
			
				String clientes = ("CREATE TABLE CLIENTES(NIF VARCHAR(9) PRIMARY KEY, NOMBRE VARCHAR(20), APELLIDO1 VARCHAR(20), "
						+ "APELLIDO2 VARCHAR(20), "
					+ "DIRECCION VARCHAR(50), TELEFONO VARCHAR(9), EMAIL VARCHAR(100))");
			
				String coches = ("CREATE TABLE COCHES(MARCA VARCHAR(20), MODELO VARCHAR(20), TIPO_VEHICULO VARCHAR(20), "
						+ "MATRICULA VARCHAR(9) PRIMARY KEY)");
			
				//Ejecuta la creación de las tablas
			
				creaTabla.executeUpdate(empleados);
				System.out.println("Se ha creado la tabla Empleados" + "\n");
				creaTabla.executeUpdate(clientes);
				System.out.println("Se ha creado la tabla Clientes" + "\n");
				creaTabla.executeUpdate(coches);
				System.out.println("Se ha creado la tabla Coches");
				System.out.println("\n");
				
				//Cierro la conexion
				
				concesionario.close();
			
			}catch(SQLException e) {
			
				System.out.println("No se ha podido ejecutar la conexión");
				e.printStackTrace();
			}
		}
		
		//Método para insertar Clientes
		
		
		public static void insertaCliente() {
			
		//Establezco conexion con la BBDD concesionario
			
			try {
			
				Connection tablaClientes = DriverManager.getConnection("jdbc:mysql://localhost:3306/CONCESIONARIO", "root", "");
				
				System.out.println("--------------------------------------------------");
				System.out.println("\n");
				System.out.println("Conexión establecida con la BBDD Concesionario" + "\n");
		
				//Inserto datos en las tabla clientes desde fichero
		
				//Creo el objeto Statement
			
				Statement clientes = tablaClientes.createStatement();
			
				String cliente1 = "INSERT INTO CLIENTES VALUES('69871233F','SANTIAGO','FERNANDEZ','RAMOS','ARAGON 46 BARCELONA',"
						+ "'645775599','SFERNANDEZ@CLIENTES.ES')";
				String cliente2 = "INSERT INTO CLIENTES VALUES('47583617H','JESUS','TRIGO','MARCOS','ESCULTOR 56 ALMERIA',"
						+ "'654789543','JTRIGO@CLIENTES.ES')";
				String cliente3 = "INSERT INTO CLIENTES VALUES('44567891D','ANTONIO','IGLESIAS','PEREZ','CENTRO 124 MADRID',"
						+ "'698457896','AIGLESIAS@CLIENTES.ES')";
			
				//Inserto los datos
				//Creo las variables de tipo int para almacenar el número de filas actualizadas
			
				int c1 = clientes.executeUpdate(cliente1);
				int c2 = clientes.executeUpdate(cliente2);
				int c3 = clientes.executeUpdate(cliente3);
				
				System.out.println("Se han insertado " + (c1+c2+c3) +  " filas en la tabla Clientes");
				System.out.println("\n");
				
				//Cierro la conexion
				
				tablaClientes.close();
		
			}catch(SQLException e) {
				System.out.println("No se han podido insertar los datos");
			}
		}
		
		//Método para insertar Empleados
		
		public static void insertaEmpleado() {
			
			try {
				
				Connection tablaEmpleados = DriverManager.getConnection("jdbc:mysql://localhost:3306/CONCESIONARIO", "root", "");
				
				System.out.println("--------------------------------------------------");
				System.out.println("\n");
				System.out.println("Conexión establecida con la BBDD Concesionario" + "\n");
		
				//Inserto datos en las tabla empleados mediante sentencia SQL
		
				//Creo el objeto Statement
			
				Statement empleados = tablaEmpleados.createStatement();
				
				String empleado1 = "INSERT INTO EMPLEADOS VALUES('12345678A','JUAN','MARTINEZ','RODRIGUEZ','SIERRA 2 SEVILLA','666112233',"
						+ "'JMARTINEZ@TALLER.ES',1200)";
				String empleado2 = "INSERT INTO EMPLEADOS VALUES('87654321Z','MARIA','MARTOS','MARTIN','MEDITERRANEO 148 ALMERIA','677557766',"
						+ "'MMARTIN@TALLER.ES', 1300)";
				String empleado3 = "INSERT INTO EMPLEADOS VALUES('45612378D','JAVIER','PLAZA','ORTIZ','ESTADIO 5 MADRID','654499755',"
						+ "'JPLAZA@TALLER.ES',1000)";
			
				//Inserto los datos
			
				int e1 = empleados.executeUpdate(empleado1);
				int e2 = empleados.executeUpdate(empleado2);
				int e3 = empleados.executeUpdate(empleado3);
				
				System.out.println("Se han insertado " + (e1+e2+e3) + " filas en la tabla Empleados");
				System.out.println("\n");
				
				//Cierro la conexion
				
				tablaEmpleados.close();
		
			}catch(SQLException e) {
				System.out.println("No se han podido insertar los datos");
			}
		}
		
		//Método que inserta Coches
		
		public static void insertaCoche() {
			
				try {
				
				Connection tablaCoches = DriverManager.getConnection("jdbc:mysql://localhost:3306/CONCESIONARIO", "root", "");
				
				System.out.println("--------------------------------------------------");
				System.out.println("\n");
				System.out.println("Conexión establecida con la BBDD Concesionario" + "\n");
		
				//Inserto datos en las tabla coches mediante sentencia SQL
		
				//Creo el objeto Statement
			
				Statement coches = tablaCoches.createStatement();
				
				String coche1 = "INSERT INTO COCHES VALUES('AUDI','A6','TURISMO','1234ABC')";
				String coche2 = "INSERT INTO COCHES VALUES('VOLKSWAGEN','PASSAT','TURISMO','4321CBA')";
				String coche3 = "INSERT INTO COCHES VALUES('SEAT','TARRACO','SUV','6789XYZ')";
			
				//Inserto los datos
			
				int c1 = coches.executeUpdate(coche1);
				int c2 = coches.executeUpdate(coche2);
				int c3 = coches.executeUpdate(coche3);
				
				System.out.println("Se han introducido " + (c1+c2+c3) + " filas en la tabla Coches");
				System.out.println("\n");
				
				//Cierro la conexion
				
				tablaCoches.close();
				
			}catch(SQLException e) {
				System.out.println("No se han podido insertar los datos");
				e.printStackTrace();
			}
		}
		
		public static void insertaCocheFichero() throws SQLException, IOException{
			
			String marca, modelo, tipo_vehiculo, matricula;
			
			BufferedReader bf = new BufferedReader(new FileReader("C:/Users/pc/eclipse-workspace/ConexionesBBDD/src/ConectaBD/DatosBBDD.txt"));
			
			try {
				
				Connection cocheFichero = DriverManager.getConnection("jdbc:mysql://localhost:3306/CONCESIONARIO", "root", "");
				
				System.out.println("--------------------------------------------------");
				System.out.println("\n");
				System.out.println("Conexión establecida con la BBDD Concesionario" + "\n");
		
				//Inserto datos en las tabla coches desde un archivo txt
		
				//Creo el objeto Statement
			
				Statement sentencia = cocheFichero.createStatement();
				
				do {
					marca = bf.readLine();
					modelo = bf.readLine();
					tipo_vehiculo = bf.readLine();
					matricula = bf.readLine();
					
					String sentenciaSQL = "INSERT INTO COCHES VALUES('" + marca + "' , '" + modelo +  "' , '" + 
							tipo_vehiculo + "' , '" + matricula + "')";
					
					sentencia.executeUpdate(sentenciaSQL);
									
				}while(bf.readLine() !=null);
				
				System.out.println("Datos copiados correctamente en la tabla coches");
				System.out.println("\n");
				
				//Cierro la conexion
				
				cocheFichero.close();
		
			}catch(SQLException e) {
				
				System.out.println("No se han podido insertar los datos");
				e.printStackTrace();
			}
			
		}
		
		public static void consultaEmpleados() {
			
			try {
				
				//Abro una nueva conexión:
				
				Connection consultas = DriverManager.getConnection("jdbc:mysql://localhost:3306/CONCESIONARIO", "root", "");
				
				//Creo el Statement
				
				Statement consultaEmp = consultas.createStatement();
				
				//Creo el ResultSet de consulta
				
				ResultSet resultado = consultaEmp.executeQuery("SELECT NOMBRE, APELLIDO1, APELLIDO2, DIRECCION FROM EMPLEADOS "
						+ "WHERE DIRECCION LIKE '%ALMERIA'");
				
				
				//Recorro el ResultSet de la consulta
				
				System.out.println("--------------------------------------------------");
				System.out.println("\n");
				System.out.println("Los datos del empleado solicitado son: " + "\n");
				
				while(resultado.next()) {
					System.out.println(resultado.getString("NOMBRE") + "\t " + resultado.getString("APELLIDO1") + "\t " + 
							resultado.getString("APELLIDO2") + "\t" + resultado.getString("DIRECCION") + "\n");
				}
				
				//Cierro la conexion
				
				consultas.close();		
			}catch(SQLException e){
				System.out.println("No se ha podido establecer conexión");
				e.printStackTrace();
			}	
		}
		
		public static void consultaCoches() {
			
			//Creo una consulta preparada de forma que si cambio la matrícula a consultar, sirve la misma consulta
			
			try {
				
				//Abro una nueva conexión:
				
				Connection consultaPrep = DriverManager.getConnection("jdbc:mysql://localhost:3306/CONCESIONARIO", "root", "");
				
				//Creo el Statement
				
				PreparedStatement consultaCoches = consultaPrep.prepareStatement("SELECT MARCA, MODELO, TIPO_VEHICULO, MATRICULA"
						+ " FROM COCHES WHERE MATRICULA=?");
				
				//Establezco la matrícula de la consulta
				
				consultaCoches.setString(1, "6789XYZ");
				
				//Creo el ResultSet
				
				ResultSet resultado = consultaCoches.executeQuery();
				
				//Recorro el ResultSet de la primera consulta
				
				System.out.println("--------------------------------------------------");
				System.out.println("\n");
				System.out.println("Los datos del coche solicitado son: " + "\n");
				
				while(resultado.next()) {
					System.out.println(resultado.getString("MARCA") + "\t" + resultado.getString("MODELO") + "\t " + 
							resultado.getString("TIPO_VEHICULO") + " \t" + resultado.getString("MATRICULA") + "\n");
				}
				
				resultado.close();
				
				//Establezco una segunda matrícula a consultar
				
				consultaCoches.setString(1, "4321CBA");
				
				//Ejecuto la consulta
				
				resultado = consultaCoches.executeQuery();
				
				//Recorro el ResulSet de la consulta reutilizada
				
				System.out.println("--------------------------------------------------");
				System.out.println("\n");
				System.out.println("Este es el resultado de la consulta reutilizada" + "\n");
				System.out.println("Los datos del coche solicitado son: " + "\n");
				
				while(resultado.next()) {
					System.out.println(resultado.getString("MARCA") + "\t" + resultado.getString("MODELO") + "\t " + 
							resultado.getString("TIPO_VEHICULO") + " \t" + resultado.getString("MATRICULA") + "\n");
				}
				
				resultado.close();
				
				//Cierro la conexion
				
				consultaCoches.close();
					
			}catch(SQLException e){
				
				System.out.println("No se ha podido establecer conexión");
				e.printStackTrace();
			}
			
		}
		
		public static void actualizaSueldos() {
			
			//Establezco conexión con la BBDD Concesionario
			
			try {
				
				Connection actualiza = DriverManager.getConnection("jdbc:mysql://localhost:3306/CONCESIONARIO", "root", "");
				
				//Creo un Statement que puede moverse en todas direcciones (type_scroll_sensitive) y puede actualizarse (concur_updatable)
				
				Statement especial = actualiza.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
				
				//Realizo la consulta sobre empleados mostrando sus sueldos
				
				String sueldos = "SELECT NOMBRE, APELLIDO1, SUELDO FROM EMPLEADOS";
				
				especial.executeQuery(sueldos);
				
				ResultSet muestro = especial.executeQuery("SELECT NOMBRE, APELLIDO1, SUELDO FROM EMPLEADOS");
				
				//Muestro nombre, apellido1 y el sueldo actualizado de todos los empleados:
				
				System.out.println("Los sueldos de los empleados son: " + "\n");
				
				while(muestro.next()) {
					
					System.out.println(muestro.getString("NOMBRE") + "\t" + muestro.getString("APELLIDO1") + "\t" + 
							muestro.getString("SUELDO") + "\t");
					
				}
				System.out.println("\n");
				
				//Ejecuto la actualización de los sueldos
				
				int as = especial.executeUpdate("UPDATE EMPLEADOS SET SUELDO=SUELDO+(SUELDO*0.05)");
				
				System.out.println("--------------------------------------------------");
				System.out.println("\n");
				System.out.println("Se han actualizado los sueldos de " + (as) + " empleados" + "\n");
				
				//Creo el ResultSet para consultar los sueldos de todos los empleados
				
				ResultSet muestro1 = especial.executeQuery("SELECT NOMBRE, APELLIDO1, SUELDO FROM EMPLEADOS");
				
				//Muestro nombre, apellido1 y el sueldo actualizado de todos los empleados:
				
				System.out.println("Los sueldos de los empleados son: " + "\n");
				
				while(muestro1.next()) {
					
					System.out.println(muestro1.getString("NOMBRE") + "\t" + muestro1.getString("APELLIDO1") + "\t" + 
							muestro1.getString("SUELDO") + "\t");
					
				}
				System.out.println("\n");
				System.out.println("--------------------------------------------------");
				
				actualiza.close();
				
			}catch(SQLException e){
				System.out.println("No se ha podido establecer la conexión con la BBDD solicitada");
				e.printStackTrace();	
			}	
		}
		
		public static void actualizaSueldo2() {
			
			//Establezco la conexion
			
			System.out.println("--------------------------------------------------");
			System.out.println("Actualización de sueldos del 5%");
			System.out.println("");
			
			try {
				
				Connection actualiza = DriverManager.getConnection("jdbc:mysql://localhost:3306/CONCESIONARIO", "root", "");
				
				//Creo el statement
				
				Statement sentencia = actualiza.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
				
				String consultaE = "select * from empleados";
				
				//Creo el resultSet
				
				ResultSet datosA = sentencia.executeQuery(consultaE);
				
				//Leo el resultado y actualizo los sueldos un 5%
				
				String NIFe;
				int sueldoe;
				int sueldoi;
				
				while(datosA.next()) {
					NIFe = datosA.getString("nif");
					sueldoe = datosA.getInt("sueldo");
					sueldoi = sueldoe + ((sueldoe * 5) / 100 );
					
					System.out.println("Nombre: " + datosA.getString("nombre") +  " " + datosA.getString("apellido1") + " " + datosA.getString("apellido2"));
					System.out.println("NIF: " + datosA.getString("nif"));
					System.out.println("Sueldo actual: " + datosA.getInt("sueldo"));
					System.out.println("Nuevo sueldo: " + sueldoi);
					System.out.println("");
					
					String actualizacion = "update empleados set sueldo='"+sueldoi+"' where nif='"+NIFe+"'";
					//Hay que crear un statemente nuevo para ejecutar la actualización de sueldos en la BBDD
					Statement sentence = actualiza.createStatement();
					sentence.executeUpdate(actualizacion);
						
				}
				
				actualiza.close();
				
				
				
			}catch(SQLException e) {
				System.out.println("No se ha podido establecer la conexión");
				e.printStackTrace();
			}
			
		}
		
	
}
		

		
		
		