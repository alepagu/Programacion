package programa4_0;

public class Clientes extends Concesionario //SubClase de Concesionario

//El extends permite herdar los datos que incorpora la SuperClase.
{
	//Creamos los atributos de la clase Clientes.
	
	//He utilizado el protected para aplicar el ENCAPSULAMIENTO, ya que facilita la HERENCIA.
	protected int edad;
	protected String nombreCliente;
	protected String DNI;
	protected int AñoCarnet;
	
	//A continuación se crea el Constructor de la clase.
	public Clientes(String nombre, String nombreCliente)
	{   //Llamamos al método del cobnstructor y recogemos el atributo nombre para volver a usarlo.
		super(nombre);
		//Volvemos a hacer uso del this, para de esta forma referenciar al atributo.
		this.nombreCliente = nombreCliente;
	}
	
	//Métodos de la clase Clientes.
	
	//Primero voy ha llamar con el super. a un método de la SuperClase.
	
	@Override
	public void informacion()
	{
		//Con el super obtenemos el método de la SuperClase al completo.
		super.informacion();
		//Añadimos otro mensaje impreso, añadiendo información sobre el cliente.
		System.out.println("El Cliente " + nombreCliente + " forma parte de este concesionario.");
	}
}
