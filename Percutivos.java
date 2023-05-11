package proyecto;

public class Percutivos extends Percusion{//HERENCIA DE LA CLASE PERCUSION
	
	//CREAMOS LOS ATRIBUTOS QUE SE VAN A UTILIZAR EN LA CLASE.
	private int Años = 2;
	
	//CONSTRUCTOR DE LA CLASE.
	public Percutivos(String nombre, String tipo, int serie)
	{
		//USAMOS EL SUPER(), PARA HERDAR LOS ELEMENTOS DEL CONSTRUCTOR PADRE
		super(nombre, tipo, serie);
	}
	
	//MÉTODO HEREDADO.
	@Override
	public void datos()
	{
		//USAMOS EL SUPER. PARA HEREDAR LO QUE CONTIENE EL MÉTODO.
		super.datos();
		System.out.println("De estos instrumentos solo hay que cuidar los parches y baquetas o palillos");
	}
	
	//MÉTODO DE LA CLASE
	public void luthier()
	{
		System.out.println("Es importante no exceder de " + Años + " el paso por el experto en el mantenimiento.");
	}

}
