package proyecto;

import java.util.Arrays;

public class Viento_Madera extends Viento{//HERENCIA y SUBCLASE de VIENTO.
	
	//CREACIÓN DE ATRIBUTOS.
	private double cañas;
	private String arnes;
	
	//CONSTRUCTOR DE LA CLASE
	public Viento_Madera(String nombre, String tipo, int serie)
	{
		//CON EL SUPER() HEREDAMOS LOS ELEMENTOS DEL MÉTODO PADRE.
		super(nombre, tipo, serie);
	}
	
	//MÉTODO HEREDADO
	@Override
	public void datos()
	{
		//CON SÚPER. HEREDAMOS AL COMPLETO LO QUE TENEMOS DENTRO DEL MÉTODO.
		super.datos();
		System.out.println("Es importante elegir una boquilla y una caña que te haga sentirte cómodo para disfrutar con el instrumento.");
	}
	
	//MÉTODOS DE LA CLASE.
	public void numCañas(double cañas)//SETTER
	{
		//CON EL THIS REFERENCIAMOS AL ATRIBUTO DE LA CLASE.
		this.cañas = cañas;
	}
	
	public double obtenerCañas()//GETTER
	{
		return cañas;
	}
	
	public void tipoArnes(String arnes)
	{
		this.arnes = arnes;
	}
	
	public String arneses()
	{
		return arnes;
	}
	
	//MÉTODO HEREDADO.
	@Override
	public void informacion()
	{
		System.out.println("Dentro de este grupo los instrumentos más usuales son Clarinetes y Saxofones.");
		System.out.println("La familia de Clarinetes, se compone por:");
		String [] clarinete = {"Requinto", "Sib", "Altos", "La", "Bajo"};//ARRAY UNIDIMENSIONAL
		System.out.println(Arrays.toString(clarinete));
		System.out.println();
		System.out.println();//SALTO DE LÍNEA
		System.out.println("La familia de Saxofones, se compone por:");
		String [] saxo = {"Sopraninos", "Sopranos", "Altos", "Tenores", "Barítonos"};//ARRAY UNIDIMENSIONAL
		System.out.println(Arrays.toString(saxo));
}
}
