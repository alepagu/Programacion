package proyecto;

public class Instrumento {//SuperClase para realizar la Herencia.
	
	//Comenzamos a crear los ATRIBUTOS PROTEGIDOS DE LA CLASE ENCAPSULAMIENTO.
	//Uso de ABSTRACIÓN en forma de GENERALIZACIÓN.
	protected String nombre;
	protected String tipo;
	protected int serie;
	
	//CONSTRUCTOR DE LA CLASE.
	public Instrumento(String nombre, String tipo, int serie)
	{
		//EL THIS es usado para REFERENCIAR EL ATRIBUTO DE LA CLASE, NO EL DEL CONSTRUCTOR.
		this.nombre = nombre;
		this.tipo = tipo;
		this.serie = serie;
	}
	
	//Métodos de la clase.
	public String datos()
	{
		return ("El instrumento que tienes es de " + nombre + " del tipo " + tipo + " y la serie de fabricación " + serie);
	}
	
}
