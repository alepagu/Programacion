package programa4_0;

public class Cliente_Vip extends Clientes //SubClase de Clientes, con el extends podemos acceder a los datos que se requieran de la SuperClase. 
{
	//Creamos los Atributos para este tipo de Clientes.
	private int tiempo;//Nos referimos al tiempo como a los años que lleva en el concesionario.
	private int vehiculosAlquilados;
	private int vehiculosComprados;
	
	//Constructor de la Clase Cliente_Vip
	public Cliente_Vip(String nombre, String nombreCliente, int tiempo)
	{
		//Para completar el constructor, hagi uso del super() que nos permite coger los valores del Contructor de la SuperClase.
		super(nombre, nombreCliente);
		//Ahora empleamos el uso del this, para distinguir enter el atributo de la Clase y el atributo del Constructor.
		//El this, siempre referencia al atributo de la clase.
		this.tiempo = tiempo;
		
		//Imprimos un mensaje para el cliente.
		System.out.println("El Concesionario " + nombre + " tiene trato con el cliente " + nombreCliente + " desde hace " + tiempo + " años.");
	}
	
	//Métodos de la Clase.
}
