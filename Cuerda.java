package proyecto;

public class Cuerda extends Instrumento{//HERENCIA y subclase de Instrumento.
	
	//ATRIBUTOS DE LA CLASE.
	
	//CONSTRUCTOR DE LA CLASE
		public Cuerda(String nombre, String tipo, int serie)
		{
			//Con el SUPER(), obtenemos el mismo CONSTRUCTOR que la clase padre.
			super(nombre, tipo, serie);
		}
		
		//MÉTODO HEREDADO.
		@Override
		public void datos()
		{
			//CON EL SUPER. HEREDAMOS LOS DATOS QUE SE TIENEN EN EL MÉTODO DE LA CLASE PADRE.
			super.datos();
			System.out.println("Para poder empezar a tocar este tipo de instrumentos tienes que fortalecer la muñeca y los dedos.");
		}
}
