package ArraysUnidimensionales;

public class MesesArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] meses = new String[] {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto" ,"Septiembre", 
				"Octubre", "Noviembre", "Diciembre"};
		//Para imprimir el primer mes
		System.out.println(meses[0]);
		//Para imprimir el último mes
		System.out.println(meses[11]);
		
		//El array empieza a contar desde 0, por tanto el mes 12 es el 11 y el mes 1 es el 0
		
		//Para saber la longitud total del array
		System.out.println(meses.length);
		
		//System.out.println(meses[meses.length]); Genera un error porque le digo que imprima la posición 12 y no existe
		
		//Para imprimir el último elemento del array
		System.out.println(meses.length-1);
		//Para imrpimir el último mes
		System.out.println(meses [meses.length-1]);
		
		//para imprimir el array completo necesito un FOR
		int i;
		for(i=0; i<meses.length; i++) {
			System.out.println(meses[i]);
		}

	}

}
