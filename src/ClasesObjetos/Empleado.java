package ClasesObjetos;

public class Empleado {
	
		protected String IdEmpleado;
		protected String nombre;
		protected String apellidos;
		protected String DNI;
		protected String telefono;
		protected String categoria;
		protected double sueldo;
		
		//contructor por defecto	
		
		public Empleado() {		
		}
		
		//constructor con parámetros
		
		public Empleado(String IdEmpleado, String nombre, String apellidos, String DNI, String telefono, 
				String categoria, double sueldo) {
			this.IdEmpleado=IdEmpleado;
			this.nombre=nombre;
			this.apellidos=apellidos;
			this.DNI=DNI;
			this.telefono=telefono;
			this.categoria=categoria;
			this.sueldo=sueldo;
		}
		
		//métodos (getters y setters para cada atributo)	
		
		public String getIdEmpleado(){
			return IdEmpleado;
		}	
		public void setIdEmpleado(String IdEmpleado) {
			this.IdEmpleado=IdEmpleado;
		}
		
		public String getnombre() {
			return nombre;
		}
		
		public void setnombre (String nombre) {
			this.nombre=nombre;
		}
		
		public String getapellidos() {
			return apellidos;
		}
		
		public void setapellidos(String apellidos) {
			this.apellidos=apellidos;
		}
		
		public String getDNI() {
			return DNI;
		}
		
		public void setDNI(String DNI) {
			this.DNI=DNI;
		}
		
		public String gettelefono() {
			return telefono;
		}
		
		public void settelefono(String telefono) {
			this.telefono=telefono;
		}
		
		public String getcategoria() {
			return categoria;
		}
		
		public void setcategoria(String categoria) {
			this.categoria=categoria;
		}
		
		public double getsueldo() {
			return sueldo;
		}
		
		public void setsueldo(double sueldo) {
			this.sueldo=sueldo;
		}
		
		//Método que muestra todos los datos de un empleado
		
		public void mostrartodoslosdatos() {
			System.out.println("Los datos de " + nombre + " , " + apellidos + " son: ");
			System.out.println("Código Empleado: " + IdEmpleado);
			System.out.println("DNI: " + DNI);
			System.out.println("Teléfono: " + telefono);
			System.out.println("Categoría: " + categoria);
			System.out.println("Sueldo: " + sueldo);
		}
		
		
		
	}




