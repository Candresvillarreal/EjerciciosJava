package ClasesObjetos;

public class Mamifero extends Animal {
	
	public Mamifero (String nombre, int numpatas, String tamano) {
		super(nombre, numpatas, tamano);
	}
	
	public void rugir() {
		System.out.println("Aaaaaaarrrrrggggggggggg");
	}
	
	public void dormir() {
		System.out.println("Duermo como un mamífero");
	}
	
	public void comer() {
		System.out.println("Como como un mamífero");
	}
	
	
}
