package ClasesObjetos;

public class Producto {

		public static void main(String[] args) {
			//Instanciando objetos de la clase Coche
			
			Coche c1 = new Coche();
			Coche c2 = new Coche("1594JKL", "Azul", "Audi A4");
			
			//Establecer y mostrar datos del objeto coche C1
			
			c1.setMatricula("FWF9727");
			c1.setColor("Negro");
			c1.setModelo("Volkswagen Passat");
			c1.getDatosCoche();
			
			//Mostrar datos del objeto coche C2 (instanciado con el constructor con parámetros)
			
			c2.getDatosCoche();
			
			//Instancio dos objetos de la clase Nuevo:
			
			Nuevo c3 = new Nuevo();
			Nuevo c4 = new Nuevo("0000LAL", "Negro", "Seat Tarraco");
			
			//Establecer y mostrar datos del objeto coche C3
			
			c3.setMatricula("5196FRT");
			c3.setColor("Azul");
			c3.setModelo("Renault Clio");
			c3.getDatosCoche();
			
			//Mostrar datos del objeto coche C4 (instanciado con el constructor con parámetros)
			
			c4.getDatosCoche();
			
			//Instancio dos objetos de la clase Km0:
			
			Km0 c5 = new Km0();
			Km0 c6 = new Km0("9876HHZ", "Blanco", "Volkswagen Polo", 82500);
			
			//Establecer y mostrar datos del objeto coche C5
			
			c5.setMatricula("4152LBC");
			c5.setColor("Burdeos");
			c5.setModelo("Ford Focus");
			c5.setkm(560);
			c5.getDatosCoche();
			//Mostrar datos del objeto coche C6 (instanciado con el constructor con parámetros)
			
			c6.getDatosCoche();
			
			//Instancio dos objetos de la clase SegundaMano:
			
			SegundaMano c7 = new SegundaMano();
			SegundaMano c8 = new SegundaMano("12345ABC", "Gris", "Ford Fiesta", 142000, "Antonio Fernández");
			
			//Establecer y mostrar datos del objeto coche C7
			
			c7.setMatricula("6431FAS");
			c7.setColor("Rojo");
			c7.setModelo("Seat León");
			c7.setkm(156324);
			c7.setNombre("José Martínez");
			c7.getDatosCoche();
			
			//Mostrar datos del objeto coche C8 (instanciado con el constructor con parámetros)
			
			c8.getDatosCoche();
		}
	}
		
	class Coche {
			public String matricula;
			public String color;
			public String modelo;
			
			/*Constructor por defecto*/
			public Coche() {
				
			}
			/*Constructor con parámetros*/
			
			public Coche(String matricula, String color, String modelo) {
				this.matricula=matricula;
				this.color=color;
				this.modelo=modelo;	
			}
			
			//Métodos get
			
			public String getMatricula() {
				return matricula;
			}
			public String getColor() {
				return color;
			}
			public String getModelo() {
				return modelo;
			}
			
			//Método get que muestra todos los datos de Coche
			
			public void getDatosCoche() {
				System.out.println("----------------------------------- Los datos del Coche son: -------------------------------------------------------------------"+"\n");
				System.out.println("Matrícula: " + matricula + " -- Color: " + color + " -- Modelo: " + modelo+ "\n");
			}
			
			//Métodos set
			
			public void setMatricula(String matricula) {
				this.matricula=matricula;
			}
			public void setColor(String color) {
				this.color=color;
			}
			public void setModelo(String modelo) {
				this.modelo=modelo;
			}	
	}

	class Nuevo extends Coche {
		
		//Sus atributos son los mismos que los de la clase Coche
		
		//Método constructor por defecto
		
		public Nuevo() {
			super();
			
		}
		
		//Método constructor con parámetros {
		
		public Nuevo(String matricula, String color, String modelo) {
			super(matricula, color, modelo);
		}
		
		// Métodos get y set: utiliza los de la clase Coche
		
		
		
	}

	class Km0 extends Coche {
		
		//declaro la variable km
		
		protected int km;
		
		//Constructor por defecto
		
		public Km0() {
			super();
		}
		
		//constructor con parámetros
		
		public Km0(String matricula, String color, String modelo, int km) {
			super(matricula, color, modelo);
			this.km=km;
		}
		
		//métodos getter y setter
		
		public int getkm() {
			return km;
		}
		
		public void setkm(int km) {
			this.km=km;
		}
		
		//Sobreescribo el método que muestra todos los datos
		
		@Override
		public void getDatosCoche() {
			System.out.println("----------------------------------- Los datos del Coche son: -------------------------------------------------------------------"+"\n");
			System.out.println("Matrícula: " + matricula + " -- Color: " + color + " -- Modelo: " + modelo + " -- Kilometros: " + km + "\n");
		}
		
	}

	class SegundaMano extends Km0 {
		private String nombre;
		
		//constructor sin parámetros
		
		public SegundaMano() {
			super();
		}
		
		//constructor con parámetros
		
		public SegundaMano(String matricula, String color, String modelo, int km, String nombre) {
			super(matricula, color, modelo, km);
			this.nombre=nombre;
		}
		
		//método get y set
		
		public String getNombre() {
			return nombre;
		}
		
		public void setNombre(String nombre) {
			this.nombre=nombre;
		}
		
		//Sobreescribo el método que muestra todos los datos
		
		@Override
		public void getDatosCoche() {
			System.out.println("----------------------------------- Los datos del Coche son: -------------------------------------------------------------------"+"\n");
			System.out.println("Matrícula: " + matricula + " -- Color: " + color + " -- Modelo: " + modelo
					+ " -- Kilometros: " + km + " -- Antiguo Propietario: " + nombre + "\n");
		}
}





