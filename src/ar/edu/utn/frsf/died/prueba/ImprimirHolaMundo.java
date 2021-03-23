package ar.edu.utn.frsf.died.prueba;

public class ImprimirHolaMundo {
	public static void main (String[] args) {
		
		System.out.println("Hola mundo");
		
		Persona uno = new Persona(18,"Carlos",12.6); 
		
		System.out.println(uno.nombre);
	}
}
