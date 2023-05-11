package proyecto;

public class Cuerda_Friccion extends Cuerda{//HERENCIA y SUBCLASE de la CLASE CUERDA.
	
	//ATRIBUTOS DE LA CLASE. Y ENCAPSULAMIENTO
	private double arco;
	private int cuerdas;
	
	//CONSTRUCTOR DE LA CLASE.
	public Cuerda_Friccion(String nombre, String tipo, int serie)
	{
		//CON EL SUPER() OBTENEMOS LOS ATRIBUTOS PERTENECIENTES AL CONSTRUCTOR DE LA CLASE PADRE.
		super(nombre, tipo, serie);
	}
	
	//MÉTODO HEREDADO
	@Override
	public void datos()
	{
		//EL SUPER. NOS PERMITE HEREDAR LO QUE CONTIENE EL MÉTODO DE LA CLASE PADRE
		super.datos();
		System.out.println("Recuerda que estos instrumentos necesitan mantenimiento del arco de forma trimestral");
	}
	
	//MÉTODOS DE LA CLASE.
	public void medidaArco(double arco)//SETTER
	{
		//CON EL THIS REFERENCIAMOS AL ATRIBUTO DE LA CLASE NO DEL MÉTODO.
		this.arco = arco;
	}
	
	public double obtenerMedida()//GETTER
	{
		return arco;//El RETURN NOS DEVUELVE UN VALOR CUANDO LLAMAS AL MÉTODO.
	}
	
	public void numCuerdas(int cuerdas)
	{
		this.cuerdas = cuerdas;
	}
	
	public int obtenerCuerdas()
	{
		return cuerdas;
	}
	
	
	
}
