package ClasesObjetos;

public class ClienteBanco {
	
	private String nombre;
	private String apellido;
	private String DNI;
	
	public ClienteBanco(String nombre, String apellido, String DNI) {
		this.nombre=nombre;
		this.apellido=apellido;
		this.DNI=DNI;
	}
	
	public String getnombre() {
		return nombre;
	}
	
	public void setnombre(String nombre) {
		this.nombre=nombre;
	}
	
	public String getapellido() {
		return apellido;
	}
	
	public void setapellido(String apellido) {
		this.apellido=apellido;
	}
	
	public String getDNI() {
		return DNI;
	}
	
	public void setDNI(String DNI) {
		this.DNI=DNI;
	}

}
