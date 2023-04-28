package programa4_0;

public class Coche extends Vehiculos //Es la SubClase de Vehiculos, gracias al extends podemos acceder a los atributos de la SuperClase.
{
	//Creamos los atributos de la Clase Coche.
	
	//Realizo uso del private para un mejor encapsulamiento y hacer que los elemento no puedan ser modificados.
	private int kilometraje;
	private double precio;
	private int añosGarantia;
	
	// Creamos el CONSTRUCTOR de la Clase Coche.
	public Coche(String nombre, String marca, int añosGarantia)
	{
		//Hacemos uso del super(), para acceder a los elementos del Constructor de la clase Vehiculos.
		super(nombre, marca);
		//Usamos el this para referenciar al atributo de la clase y diferenciarlo del atributo del constructor.
		this.añosGarantia = añosGarantia;
		
		//Mostramos un mensaje al usuario.
		System.out.println("El Concesionario " + nombre + " trabaja con la marca " + marca + " y suele dar " + añosGarantia + " años de garantía");	
	}
	
	//Métodos de la Clase.
	
}
