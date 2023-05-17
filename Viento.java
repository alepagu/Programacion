package proyecto;

public class Viento extends Instrumento{//HERENCIA y subclase de Instrumento
	
	//Atributos de la clase.
	
	//CONSTRUCTOR de la CLASE.
	public Viento(String nombre, String tipo, int serie)
	{
		//Con el SUPER(), obtenemos el mismo CONSTRUCTOR que la clase padre.
		super(nombre, tipo, serie);
	}
	
	//MÉTODO HEREDADO
	@Override
	public void datos()
	{
		//CON EL SUPER. HEREDAMOS LOS DATOS QUE SE TIENEN EN EL MÉTODO DE LA CLASE PADRE.
		super.datos();
		System.out.println("Con estos instrumentos vas a tener que entrenar la capacidad pulmonar antes de tocar.");
	}
	
	//MÉTODO DE LA CLASE.
	public void informacion()
	{
	}
	
}