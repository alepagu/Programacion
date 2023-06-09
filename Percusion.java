package proyecto;

public class Percusion extends Instrumento{//HERENCIA y subclase Instrumento
	
	//ATRIBUTOS DE LA CLASE
	
	//CONSTRUCTOR DE LA CLASE.
		public Percusion(String nombre, String tipo, int serie)
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
			System.out.println("Estos instrumentos requieren concentración, y cordinación de brazos y piernas en la mayoría de ellos.");
		}
}