package proyecto;

public class Cuerda_Punteada extends Cuerda{//HERENCIA y SUBCLASE DE CUERDA
	
	//ATRIBUTOS DE LA CLASE.
	private int cuerdas;
	private int puas;
	
	//CONSTRUCTOR DE LA CLASE
	public Cuerda_Punteada(String nombre, String tipo, int serie)
	{
		//CON EL SUPER() HEREDAMOS LO QUE CONTIENE EL CONSTRUCTOR DE LA CLASE PADRE.
		super(nombre, tipo, serie);
	}
	
	//MÉTODO HEREDADO
	@Override
	public void datos()
	{
		//CON EL SUPER. HEREDAMOS EL MÉTODO COMPLETO DE LA CLASE PADRE.
		super.datos();
		System.out.println("Es recomendable hacerle mantenimiento cada dos meses y no usar muchos las púas");
	}
	
	//MÉTODOS DE LA CLASE
	public void numCuerdas(int cuerdas)
	{
		//CON EL THIS REFERENCIAMOS AL ATRIBUTO DE LA CLASE.
		this.cuerdas = cuerdas;
	}
	
	public int obtenerCuerdas()
	{
		return cuerdas;
	}
	
	public void numPuas(int puas)
	{
		this.puas = puas;
	}
	
	public int obtenerPuas()
	{
		return puas;
	}
}
