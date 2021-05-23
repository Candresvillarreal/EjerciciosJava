package ClasesObjetos;

public class Animal {
	
	private String nombre;
	private int numpatas;
	private String tamano;
	
	//Constructor de la Clase Animal
	
	public Animal(String nombre, int numpatas, String tamano) {
		this.nombre = nombre;
		this.numpatas = numpatas;
		this.tamano= tamano;
		}
	
	public String getnombre () {
		return nombre;
	}
	
	public void setnombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getnumpatas () {
		return numpatas;
	}
	
	public void setnumpatas(int numpatas) {
		this.numpatas = numpatas;
	}
	
	public String gettamano () {
		return tamano;
	}
	
	public void settamano (String tamano) {
		this.tamano=tamano;
	}

}
