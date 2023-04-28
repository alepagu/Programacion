package programa4_0;

public class Vehiculos extends Concesionario //SubClase de la Clase Concesionario.
//El extends nos permite heredar datos de la SuperClase a la que referenciamos tras poner el extends.
{
	//Creamos los atributos que vamos a darle a la Clase Vehiculos
	
	//He utilizado el protected para aplicar el ENCAPSULAMIENTO, ya que facilita la HERENCIA.
	protected int ruedas;
	protected double CV;
	protected String marca;
	protected String matricula;
	protected int plazas;
	
	//Generamos el Constructor de la clase.
	public Vehiculos(String nombre, String marca)
	{
		//Utilizamos el super(), para accerder a los datos del Constructor de la SuperClase.
		super(nombre);
		//Usamos el this, para referenciar el atributo y no el nombre del constructor que en este caso es el mismo.
		this.marca = marca;
		//Mostramos un mensaje por pantalla.
		System.out.println("El Concesionario " + nombre + " tiene vehículos de la marca" + marca);
	}
	
	//Métodos de la clase Vehiculos.
	
}
