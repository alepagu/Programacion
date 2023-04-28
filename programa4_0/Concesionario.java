package programa4_0;

public class Concesionario //SuperClase.
//ADOLFO, YO ESTUVE EL DÍA QUE HUBO MUSICOTE.

{
	//Se crean los atributos de la SuperClase.
	
	//He utilizado el protected para aplicar el ENCAPSULAMIENTO, ya que facilita la HERENCIA.
	protected String nombre;
	protected int limiteVehiculos;
	protected int edadNecesaria;
	
	//Creamos el constructor de la SuperClase
	public Concesionario(String nombre)
	{   //Con el this referenciamos al atributo de la clase y el otro pertenece al constructor.
		this.nombre = nombre;
		System.out.println("El Concesionario se llama: " + nombre);
	}
	
	//Método de la SuperClase.
	
	//Utilizo el método presentar para la introducción al programa.
	public void presentar()
	{
		System.out.println("Hola soy del concesionario " + nombre);
		System.out.println("¿Necesita ayuda?, Le dejo el menú del programa:");
	}
	
	//Creo un método pequeño para hacer uso del super.
	
	public void informacion()
	{
		System.out.println("El concesionario " + nombre );
	}
	
}
