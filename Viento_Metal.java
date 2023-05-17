package proyecto;

import java.util.Arrays;

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
	public void informacion()
	{
		System.out.println("Dentro de este grupo los instrumentos más usuales son Trompetas y Cornetas.");
		System.out.println("La familia de Trompetas, se compone por:");
		String [] trompeta = {"Tuba", "Trombón", "Trompa"};//ARRAY UNIDIMENSIONAL
		System.out.println(Arrays.toString(trompeta));
		System.out.println();//SALTO DE LÍNEA
		System.out.println("La familia de Cornetas, se compone por:");
		String [] corneta = {"Corneta C-Bb", "Cornetas C"};//ARRAY UNIDIMENSIONAL
		System.out.println(Arrays.toString(corneta));
	}
	
}