package ClasesObjetos;

public class PlazaAparcamiento {
	
	private String numero;
	private double tamano;
	
	public PlazaAparcamiento(String numero, double tamano) {
		this.numero=numero;
		this.tamano=tamano;
	}
	
	public String getnumero() {
		return numero;
	}
	
	public void setnumero(String numero) {
		this.numero=numero;
	}
	
	public double gettamano() {
		return tamano;
	}
	
	public void settamano(double tamano) {
		this.tamano=tamano;
	}

}
