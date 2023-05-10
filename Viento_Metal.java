package proyecto;

public class Viento_Metal extends Viento{//HERENCIA y SUBCLASE de VIENTO.
	
	//ATRIBUTOS DE LA CLASE.
	private int boquillas;
	private String tiempo;
	
	//CONSTRUCTOR DE LA CLASE.
	public Viento_Metal(String nombre, String tipo, int serie)
	{
		//HEREDAMOS CON EL SUPER(), LOS DATOS DEL CONSTRUCTO DE LA CLASE PADRE.
		super(nombre, tipo,serie);
	}
	
	//MÉTODOS DE LA CLASE.
	public void boquilla(int boquillas) //SETTER
	{
		//CON EL THIS REFERENCIAMOS AL ATRIBUTO DE LA CLASE.
		this.boquillas = boquillas;
	}
	
	public int numBoquilllas()//GETTER
	{
		return boquillas;
	}
	
	public void tiempos(String tiempo)
	{
		//REFERENCIAMOS EL ATRIBUTO DE LA CLASE MEDIANTE EL THIS.
		this.tiempo = tiempo;
	}
	
	public String tiempoInvertido()
	{
		return tiempo;
	}
	
	//MÉTODO HEREDADO.
	@Override
	public void datos()
	{
		//CON EL SUPER. HEREDAMOS TODO EL CONTENIDO DEL MÉTODO.
		super.datos();
		//AMPLIAMOS LA INFORMACIÓN CON UN MENSAJE QUE SE MUESTRA POR PANTALLA.
		System.out.println();
	}
	
}
