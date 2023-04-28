package programa4_0;

public class Motos extends Vehiculos //Es otra SubClase de la SuperClase Vehiculos, con el extends tenemos acceso a los datos de la SuperClase
{
	//Creación de Atributos de la Clase Motos.
	
	//Se usa un modificador de acceso, que nos permite
	
	private String nueva; //Cdena de carácteres para indicar si la moto es nueva, de segunda mano o está averiada y es vendida para usar las piezas.
	public String carnetNecesario;
	private double altura;
	
	//Constructor de la clase Motos.
	public Motos(String nombre, String marca, String carnetNecesario)
	{
		//Hacemos uso del super para poder acceder a los atributos pertenecientes a las SuperClases.
		super(nombre, marca);
		//Hacemos uso del this, y de esta forma diferenciamos el atributo del atributo del constructor.
		//El this siempre referencia al atributo que se encuentra en la clase
		this.carnetNecesario = carnetNecesario;
		
		//Imprimos una salida por consola, para que lo vea el usuario.
		System.out.println("El Concesionario " + nombre + " trabaja con la marca " + marca + " y las motos de esta casa suelen tener " + altura +  " metros de altura");
	}
	
	//Métodos de la Clase Motos.
	
	
}
